package cn.ekgc.witmed.system.datacode.service.impl;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.base.util.IdGenerator;
import cn.ekgc.witmed.system.datacode.dao.DataCodeCategoryDao;
import cn.ekgc.witmed.system.datacode.pojo.entity.DataCode;
import cn.ekgc.witmed.system.datacode.pojo.entity.DataCodeCategory;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeCategoryVO;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeVO;
import cn.ekgc.witmed.system.datacode.service.DataCodeCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>系统功能 - 数据编码功能 - 数据代码类别信息业务层接口实现类</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("dataCodeCategoryService")
@Transactional
public class DataCodeCategoryServiceImpl implements DataCodeCategoryService {
	@Autowired
	private DataCodeCategoryDao dao;
	@Autowired
	private IdGenerator idGenerator;
	
	/**
	 * <b>>根据查询对象进行分页查询</b>
	 * @param queryVO
	 * @param pageVO
	 * @return
	 */
	@Override
	public PageVO<DataCodeCategoryVO> getByPage(DataCodeCategoryVO queryVO, PageVO<DataCodeCategoryVO> pageVO) throws Exception {
		// 将查询视图对象切换成查询实体对象
		DataCodeCategory query = DataCodeCategory.getEntityfromVO(queryVO);
		// 开启 PageHelper 分页查询过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		// 进行列表查询
		List<DataCodeCategory> list = dao.findListByQuery(query);
		// 根据列表创建 PageInfo 对象
		PageInfo<DataCodeCategory> pageInfo = new PageInfo<DataCodeCategory>(list);
		// 提取数据
		List<DataCodeCategory> entityList = pageInfo.getList();
		// 将实体列表切换成视图列表
		List<DataCodeCategoryVO> voList = new ArrayList<DataCodeCategoryVO>();
		if (entityList !=null ){
			for (DataCodeCategory entity:entityList) {
				//切换数据
				voList.add(DataCodeCategoryVO.getVOfromEntity(entity));
			}
		}
		pageVO.setList(voList);
		pageVO.setTotalSize(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());
		return pageVO;
	}
	
	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@Override
	public DataCodeCategoryVO getByCode(String code) throws Exception {
		// 创建查询对象
		DataCodeCategory query = new DataCodeCategory();
		query.setCode(code);
		//进行列表查询
		List<DataCodeCategory> list = dao.findListByQuery(query);
		if (list !=null && !list.isEmpty()) {
			return DataCodeCategoryVO.getVOfromEntity(list.get(0));
		}
		return null;
	}
	
	/**
	 * <b>保存对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(DataCodeCategoryVO vo) throws Exception {
		// 将视图对象切换为实体对象
		DataCodeCategory entity = DataCodeCategory.getEntityfromVO(vo);
		//设定主键
		entity.setId(idGenerator.createId());
		// 进行保存
		if (dao.save(entity) >0) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean update(DataCodeCategoryVO vo) throws Exception {
		return false;
	}
	
	/**
	 * <b>根据主键获得视图对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public DataCodeCategoryVO getById(String id) throws Exception{
		// 创建查询对象
		DataCodeCategory query = new DataCodeCategory();
		query.setId(id);
		// 进行列表查询
		List<DataCodeCategory> list = dao.findListByQuery(query);
		if (list !=null && !list.isEmpty()) {
			return DataCodeCategoryVO.getVOfromEntity(list.get(0));
		}
		return null;
	}
	
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	public List<DataCodeCategoryVO> getByList(DataCodeCategoryVO queryVO) throws Exception {
		// 将查询视图切换成查询实体
		DataCodeCategory query = DataCodeCategory.getEntityfromVO(queryVO);
		// 进行列表查询
		List<DataCodeCategory> entityList = dao.findListByQuery(query);
		// 创建视图列表，并且进行数据切换
		List<DataCodeCategoryVO> voList = new ArrayList<DataCodeCategoryVO>();
		if (entityList !=null && !entityList.isEmpty()) {
			for (DataCodeCategory entity:entityList) {
				DataCodeCategoryVO vo =DataCodeCategoryVO.getVOfromEntity(entity);
				voList.add(vo);
			}
		}
		return voList;
	}
}
