package cn.ekgc.witmed.system.datacode.service.impl;

import cn.ekgc.witmed.base.pojo.vo.PageVO;
import cn.ekgc.witmed.base.util.IdGenerator;
import cn.ekgc.witmed.system.datacode.dao.DataCodeDao;
import cn.ekgc.witmed.system.datacode.pojo.entity.DataCode;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeVO;
import cn.ekgc.witmed.system.datacode.service.DataCodeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>系统功能 - 数据编码功能 - 数据代码信息业务层接口实现类</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("dataCodeService")
@Transactional
public class DataCodeServiceImpl implements DataCodeService {
	@Autowired
	private DataCodeDao dao;
	@Autowired
	private IdGenerator idGenerator;
	
	/**
	 * <b>根据查询分页视图查询分页信息</b>
	 * @param queryVO
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<DataCodeVO> getByPage(DataCodeVO queryVO, PageVO<DataCodeVO> pageVO) throws Exception {
		// 将查询视图切换为查询实体
		DataCode query = DataCode.getEntityFromVO(queryVO);
		// 开启 PageHelper 分页查询过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		// 进行列表查询
		List<DataCode> list = dao.findListByQuery(query);
		// 创建 pageinfo 对象
		PageInfo<DataCode> pageInfo = new PageInfo<DataCode>(list);
		// 获得分页查询的列表
		List<DataCode> entityList = pageInfo.getList();
		// 创建试图列表，并且进行数据切换
		List<DataCodeVO> voList = new ArrayList<DataCodeVO>();
		if (list != null && !list.isEmpty()) {
			for (DataCode entity:list) {
				DataCodeVO vo = DataCodeVO.getVOfromEntity(entity);
				voList.add(vo);
			}
		}
		pageVO.setList(voList);
		pageVO.setTotalPage(pageInfo.getPages());
		pageVO.setTotalSize(pageInfo.getTotal());
		return pageVO;
	}
	
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<DataCodeVO> getByList(DataCodeVO queryVO) throws Exception {
		// 将查询视图切换成查询实体
		DataCode query = DataCode.getEntityFromVO(queryVO);
		// 进行列表查询
		List<DataCode> entityList = dao.findListByQuery(query);
		// 创建视图列表，并且进行数据切换
		List<DataCodeVO> voList = new ArrayList<DataCodeVO>();
		if (entityList !=null && !entityList.isEmpty()) {
			for (DataCode entity:entityList) {
				DataCodeVO vo =DataCodeVO.getVOfromEntity(entity);
				voList.add(vo);
			}
		}
		return voList;
	}
	/**
	 * <b>根据编码查询视图对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@Override
	public DataCodeVO getByCode(String code) throws Exception {
		// 创建查询对象
		DataCode query = new DataCode();
		// 设定对应大的查询数据
		query.setCode(code);
		//进行列表查询
		List<DataCode> list = dao.findListByQuery(query);
		if (list !=null && !list.isEmpty()) {
			return DataCodeVO.getVOfromEntity(list.get(0));
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
	public boolean save(DataCodeVO vo) throws Exception {
		// 将视图对象切换成实体对象
		DataCode entity = DataCode.getEntityFromVO(vo);
		// 设定主键
		entity.setId(idGenerator.createId());
		if (dao.save(entity) >0) {
			return true;
		}
		return false;
	}
	/**
	 * <b>修改对象</b>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(DataCodeVO vo) throws Exception {
		// 将视图对象切换成实体对象
		DataCode entity = DataCode.getEntityFromVO(vo);
		if (dao.update(entity) >0) {
			return true;
		}
		return false;
	}
	
	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public DataCodeVO getById(String id) throws Exception {
		// 创建查询对象
		DataCode query = new DataCode();
		// 设定对应的查询数据
		query.setId(id);
		// 进行列表查询
		List<DataCode> list = dao.findListByQuery(query);
		if (list !=null && !list.isEmpty()){
			return DataCodeVO.getVOfromEntity(list.get(0));
		}
		return null;
	}
}
