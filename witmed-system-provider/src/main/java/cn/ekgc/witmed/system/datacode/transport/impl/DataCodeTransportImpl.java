package cn.ekgc.witmed.system.datacode.transport.impl;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.base.pojo.vo.QueryPageVO;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeVO;
import cn.ekgc.witmed.system.datacode.service.DataCodeService;
import cn.ekgc.witmed.system.datacode.transport.DataCodeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("dataCodeTransport")
@RequestMapping("/system/datacode/trans")
public class DataCodeTransportImpl implements DataCodeTransport {
	@Autowired
	private DataCodeService service;
	/**
	 * <b>根据查询分页视图查询分页信息</b>
	 * @param queryPageVO
	 * @return Exception
	 */
	@PostMapping("/page")
	public PageVO<DataCodeVO> getByPage(@RequestBody QueryPageVO<DataCodeVO> queryPageVO) throws Exception {
		// 提取 QueryPageVO 数据 ，获得相应的查询视图和分页视图
		DataCodeVO queryVO = queryPageVO.getQueryVO();
		PageVO<DataCodeVO> pageVO = queryPageVO.getPageVO();
		return service.getByPage(queryVO, pageVO);
	}
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	public List<DataCodeVO> getByList(@RequestBody DataCodeVO queryVO) throws Exception {
		return service.getByList(queryVO);
	}
	
	/**
	 * <b>根据编码查询视图对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	public DataCodeVO getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
	/**
	 * <b>保存对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(@RequestBody DataCodeVO vo) throws Exception {
		return service.save(vo);
	}
	/**
	 * <b>修改对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(@RequestBody DataCodeVO vo) throws Exception {
		return service.update(vo);
	}
	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public DataCodeVO getById(@RequestParam String id) throws Exception {
		return service.getById(id);
	}
}
