package cn.ekgc.witmed.system.user.controller;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import cn.ekgc.witmed.base.controller.BaseController;
import cn.ekgc.witmed.base.pojo.enums.StatusEnum;
import cn.ekgc.witmed.base.pojo.vo.ResponseVO;
import cn.ekgc.witmed.base.util.BaseConstants;
import cn.ekgc.witmed.base.util.MD5EncryptUtil;
import cn.ekgc.witmed.base.util.RedisUtil;
import cn.ekgc.witmed.base.util.TokenUtil;
import cn.ekgc.witmed.system.user.pojo.vo.LoginUserVO;
import cn.ekgc.witmed.system.user.pojo.vo.UserVO;
import cn.ekgc.witmed.system.user.transport.UserTransport;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * <b>系统功能模块 - 基础用户控制层</b>
 * @author Administrator
 * @version 1.0.0
 */
@RestController("userController")
@RequestMapping("/system/user")
@Api(value = "系统功能模块 - 基础用户控制层",tags = "系统功能模块 - 基础用户控制层")
public class UserController extends BaseController {
	@Autowired
	private UserTransport transport;
	@Autowired
	private RedisUtil redisUtil;
	
	/**
	 * <b>使用登录用户视图对象进行系统登录</b>
	 * @param loginUserVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/login")
	public ResponseVO loginUser(@RequestBody LoginUserVO loginUserVO) throws Exception{
		try {
			if (StrUtil.isBlank(loginUserVO.getCellphone()) && StrUtil.isBlank(loginUserVO.getPassword())) {
				// 对于登录密码进行 MD5 加密
				loginUserVO.setCellphone(MD5EncryptUtil.encrypt(loginUserVO.getCellphone()));
				// 使用手机号码查询用户信息
				UserVO userVO = transport.getUserByCellphone(loginUserVO.getCellphone());
				// 比较用户的登陆密码是否正确
				if (userVO !=null && userVO.getPassword().equals(loginUserVO.getPassword())) {
					// 判断用户状态是否启用
					if (StatusEnum.STATUS_ENABLE.getCode().equals(userVO.getStatus())) {
					// 用户登录成功，生成 Token 信息
						String token = TokenUtil.createToken(
								MapUtil.builder(new HashMap<String, Object>()).put("id", userVO.getId()).build(),
								BaseConstants.EXPIRE_SECOND);
							// 将 token 作为 key ，登录对象作为 value ，存储到 Redis 中
							redisUtil.setToRedis(token, userVO, BaseConstants.EXPIRE_SECOND);
							// 将 token 携带在响应对象 header 中
							response.setHeader("Authorization", token);
							return ResponseVO.getSuccessResponseVO(userVO);
					}
					return ResponseVO.getErrorResponseVO("用户禁止登陆");
				}
				return ResponseVO.getErrorResponseVO("登录信息错误");
			}
			return ResponseVO.getErrorResponseVO("未填写有效的登录信息");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseVO.getExceptionResponseVO(e);
		}
	}
}
