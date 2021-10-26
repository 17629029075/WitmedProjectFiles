package cn.ekgc.witmed.system.info.transport.impl;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.base.pojo.vo.QueryPageVO;
import cn.ekgc.witmed.system.info.pojo.vo.IdentityVO;
import cn.ekgc.witmed.system.info.service.IdentityService;
import cn.ekgc.witmed.system.info.transport.IdentityTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>智慧医疗平台 - 系统用户身份信息传输层接口实现类</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("identityTransport")
@RequestMapping("/system/info/identity/trans")
public class IdentityTransportImpl implements IdentityTransport {
	@Autowired
	private IdentityService service;
	
	/**
	 * <b>根据查询对象分页查询</b>
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<IdentityVO> getPage(@RequestBody QueryPageVO<IdentityVO> queryPageVO) throws Exception {
		// 分别将 QueryPageVO 中的数据进行获取
		IdentityVO queryVO = queryPageVO.getQueryVO();
		PageVO<IdentityVO> pageVO = queryPageVO.getPageVO();
		return service.getPage(queryVO, pageVO);
	}
}
