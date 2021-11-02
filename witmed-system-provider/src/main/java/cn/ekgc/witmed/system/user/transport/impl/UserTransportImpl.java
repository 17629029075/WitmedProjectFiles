package cn.ekgc.witmed.system.user.transport.impl;

import cn.ekgc.witmed.system.user.pojo.vo.UserVO;
import cn.ekgc.witmed.system.user.service.UserService;
import cn.ekgc.witmed.system.user.transport.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>系统功能模块 - 基础用户传输层接口实现类</b>
 * @author Administrator
 * @version 1.0.0
 */
@RestController("userTransport")
@RequestMapping("/system/user/trans")
public class UserTransportImpl implements UserTransport {
	@Autowired
	private UserService service;
	
	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@Override
	@PostMapping("/cellphone")
	public UserVO getUserByCellphone(@RequestParam String cellphone) throws Exception {
		return service.getUserByCellphone(cellphone);
	}
}
