package cn.ekgc.witmed.system.datacode.pojo.entity;

import cn.ekgc.witmed.base.pojo.entity.BaseEntity;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>系统功能 - 数据编码功能 - 数据代码信息实体</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
public class DataCode extends BaseEntity {
	private static final long serialVersionUID = -3130840546064667005L;
	private String id;                          // 数据代码主键
	private DataCodeCategory dataCategory;      // 所属代码类别
	private String name;                        // 数据代码名称
	private String code;                        // 数据代码编码
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public DataCodeCategory getDataCodeCategory() {
		return dataCategory;
	}
	
	public void setDataCodeCategory(DataCodeCategory dataCodeCategory) {
		this.dataCategory = dataCodeCategory;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * <b>根据视图对象获得实体对象</b>
	 * @param vo
	 * @return
	 */
	public static DataCode getEntityFromVO(DataCodeVO vo) {
		// 创建实体对象
		DataCode entity = new DataCode();
		if (vo != null){
			BeanUtils.copyProperties(vo, entity);
			if (vo.getDataCodeCategoryVO() !=null){
				DataCodeCategory parentEntity = DataCodeCategory.getEntityfromVO(vo.getDataCodeCategoryVO());
				entity.setDataCodeCategory(parentEntity);
			}
			//切换所有的继承数据
			entity.setStatus(vo.getStatus());
			entity.setCreateUser(vo.getCreateUser());
			entity.setCreateTime(vo.getCreateTime());
			entity.setUpdateUser(vo.getUpdateUser());
			entity.setUpdateTime(vo.getUpdateTime());
		}
		return entity;
	}
}
