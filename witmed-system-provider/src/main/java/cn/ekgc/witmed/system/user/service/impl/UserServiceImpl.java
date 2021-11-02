package cn.ekgc.witmed.system.user.service.impl;

import cn.ekgc.witmed.system.user.dao.UserDao;
import cn.ekgc.witmed.system.user.pojo.entity.User;
import cn.ekgc.witmed.system.user.pojo.vo.UserVO;
import cn.ekgc.witmed.system.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>系统功能模块 - 基础用户业务层接口实现类</b>
 * @author Administrator
 * @version 1.0.0
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	
	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@Override
	public UserVO getUserByCellphone(String cellphone) throws Exception {
		// 创建查询对象
		User query = new User();
		// 设置电话号码
		query.setCellphone(cellphone);
		// 进行列表查询
		List<User> userList = dao.findListByQuery(query);
		if (userList !=null && !userList.isEmpty()) {
			return UserVO.getVOFromEntity(userList.get(0));
		}
		return null;
	}
}
