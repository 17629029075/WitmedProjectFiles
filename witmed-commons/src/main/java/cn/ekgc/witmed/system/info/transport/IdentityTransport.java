package cn.ekgc.witmed.system.info.transport;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.base.pojo.vo.QueryPageVO;
import cn.ekgc.witmed.system.info.pojo.vo.IdentityVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>智慧医疗平台 - 系统用户身份信息传输层接口</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "witmed-system-provider")
@RequestMapping("/system/info/identity/trans")
public interface IdentityTransport {
	/**
	 * <b>根据查询对象分页查询</b>
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<IdentityVO> getPage(@RequestBody QueryPageVO<IdentityVO> queryPageVO) throws Exception;
}
