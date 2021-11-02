package cn.ekgc.witmed.system.datacode.pojo.entity;

import cn.ekgc.witmed.base.pojo.entity.BaseEntity;
import cn.ekgc.witmed.system.datacode.pojo.vo.DataCodeCategoryVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>系统功能 - 数据编码功能 - 数据代码类别信息实体</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
public class DataCodeCategory extends BaseEntity {
	private static final long serialVersionUID = -8437797081049495742L;
	private String id;              // 数据代码类别主键
	private String name;            // 数据代码类别名称
	private String code;            // 数据代码类别编码
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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
	public static DataCodeCategory getEntityfromVO(DataCodeCategoryVO vo) {
		// 创建实体对象
		DataCodeCategory entity = new DataCodeCategory();
		if (vo != null){
			BeanUtils.copyProperties(vo, entity);
			entity.setStatus(vo.getStatus());
			entity.setCreateUser(vo.getCreateUser());
			entity.setCreateTime(vo.getCreateTime());
			entity.setUpdateUser(vo.getUpdateUser());
			entity.setUpdateTime(vo.getUpdateTime());
		}
		return entity;
	}
}
