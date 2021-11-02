package cn.ekgc.witmed.system.datacode.transport;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.base.pojo.vo.QueryPageVO;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeCategoryVO;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <b>系统功能 - 数据编码功能 - 数据代码类别信息传输层接口</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "witmed-system-provider")
@RequestMapping("/system/datacode/category/trans")
public interface DataCodeCategoryTransport {
	/**
	 * <b>>根据查询对象进行分页查询</b>
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<DataCodeCategoryVO> getByPage(@RequestBody QueryPageVO<DataCodeCategoryVO> queryPageVO) throws Exception;
	
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<DataCodeCategoryVO> getByList(@RequestBody DataCodeCategoryVO queryVO) throws Exception;
	
	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	DataCodeCategoryVO getByCode(@RequestParam String code) throws Exception;
	
	/**
	 * <b>保存对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody DataCodeCategoryVO vo) throws Exception;
	
	/**
	 * <b>修改对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody DataCodeCategoryVO vo) throws Exception;
	
	/**
	 * <b>根据主键获得视图对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	DataCodeCategoryVO getById(@RequestParam String id) throws Exception;
}
