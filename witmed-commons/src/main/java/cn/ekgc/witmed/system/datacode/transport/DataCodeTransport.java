package cn.ekgc.witmed.system.datacode.transport;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.base.pojo.vo.QueryPageVO;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <b>系统功能 - 数据编码功能 - 数据代码信息传输层接口</b>
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "witmed-system-provider")
@RequestMapping("/system/datacode/trans")
public interface DataCodeTransport {
	/**
	 * <b>根据查询分页视图查询分页信息</b>
	 * @param queryPageVO
	 * @return
	 */
	@PostMapping("/page")
	PageVO<DataCodeVO> getByPage(@RequestBody QueryPageVO<DataCodeVO> queryPageVO) throws Exception;
	
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<DataCodeVO> getByList(@RequestBody DataCodeVO queryVO) throws Exception;
	
	/**
	 * <b>根据编码查询视图对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	DataCodeVO getByCode(@RequestParam String code) throws Exception;
	
	/**
	 * <b>保存对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody DataCodeVO vo) throws Exception;
	
	/**
	 * <b>修改对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody DataCodeVO vo) throws Exception;
	
	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	DataCodeVO getById(@RequestParam String id) throws Exception;
}
