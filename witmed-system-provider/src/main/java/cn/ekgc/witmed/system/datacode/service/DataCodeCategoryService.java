package cn.ekgc.witmed.system.datacode.service;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeCategoryVO;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeVO;

import java.util.List;

/**
 * <b>系统功能 - 数据编码功能 - 数据代码类别信息业务层接口</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
public interface DataCodeCategoryService {
	/**
	 * <b>>根据查询对象进行分页查询</b>
	 * @param queryVO
	 * @param pageVO
	 * @return
	 */
	PageVO<DataCodeCategoryVO> getByPage(DataCodeCategoryVO queryVO, PageVO<DataCodeCategoryVO> pageVO) throws Exception;
	
	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	DataCodeCategoryVO getByCode(String code) throws Exception;
	
	/**
	 * <b>保存对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(DataCodeCategoryVO vo) throws Exception;
	/**
	 * <b>修改对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(DataCodeCategoryVO vo) throws Exception;
	/**
	 * <b>根据主键获得视图对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	DataCodeCategoryVO getById(String id) throws Exception;
	
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	List<DataCodeCategoryVO> getByList(DataCodeCategoryVO queryVO)throws Exception;
}
