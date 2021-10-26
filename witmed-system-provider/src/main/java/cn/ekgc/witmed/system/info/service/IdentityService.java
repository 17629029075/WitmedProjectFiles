package cn.ekgc.witmed.system.info.service;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.system.info.pojo.vo.IdentityVO;

/**
 * <b>智慧医疗平台 - 系统用户身份信息业务层接口</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IdentityService {
	/**
	 * <b>根据查询对象分页查询</b>
	 * @param queryVO
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	PageVO<IdentityVO> getPage(IdentityVO queryVO, PageVO<IdentityVO> pageVO) throws Exception;
}
