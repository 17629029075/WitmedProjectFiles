package cn.ekgc.witmed.system.datacode.pojo.vo;

import cn.ekgc.witmed.base.pojo.vo.BaseVO;
import cn.ekgc.witmed.system.datacode.pojo.entity.DataCode;
import cn.ekgc.witmed.system.datacode.pojo.entity.DataCodeCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>系统功能 - 数据编码功能 - 数据代码信息视图</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("数据代码信息视图")
public class DataCodeVO extends BaseVO {
	private static final long serialVersionUID = 8930058357348121894L;
	@ApiModelProperty(value = "数据代码主键")
	private String id;                                  // 数据代码主键
	@ApiModelProperty(value = "所属代码类别")
	private DataCodeCategoryVO dataCategoryVO;      // 所属代码类别
	@ApiModelProperty(value = "数据代码名称")
	private String name;                                // 数据代码名称
	@ApiModelProperty(value = "数据代码编码")
	private String code;                                // 数据代码编码
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public DataCodeCategoryVO getDataCodeCategoryVO() {
		return dataCategoryVO;
	}
	
	public void setDataCodeCategoryVO(DataCodeCategoryVO dataCodeCategoryVO) {
		this.dataCategoryVO = dataCodeCategoryVO;
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
	 * @param entity
	 * @return
	 */
	public static DataCodeVO getVOfromEntity(DataCode entity) {
		// 创建实体对象
		DataCodeVO vo = new DataCodeVO() ;
		if (entity != null){
			BeanUtils.copyProperties(entity, vo);
			if (entity.getDataCodeCategory() !=null){
				DataCodeCategoryVO parentVO = DataCodeCategoryVO.getVOfromEntity(entity.getDataCodeCategory());
				vo.setDataCodeCategoryVO(parentVO);
			}
			//切换所有的继承数据
			vo.setStatus(entity.getStatus());
			vo.setCreateUser(entity.getCreateUser());
			vo.setCreateTime(entity.getCreateTime());
			vo.setUpdateUser(entity.getUpdateUser());
			vo.setUpdateTime(entity.getUpdateTime());
		}
		return vo;
	}
}
