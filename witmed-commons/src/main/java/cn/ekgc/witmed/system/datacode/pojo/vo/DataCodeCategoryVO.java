package cn.ekgc.witmed.system.datacode.pojo.vo;

import cn.ekgc.witmed.base.pojo.vo.BaseVO;
import cn.ekgc.witmed.system.datacode.pojo.entity.DataCodeCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

import javax.swing.text.html.parser.Entity;

/**
 * <b>系统功能 - 数据编码功能 - 数据代码类别信息视图</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("数据代码类别信息视图")
public class DataCodeCategoryVO extends BaseVO {
	private static final long serialVersionUID = 8273981891575487605L;
	@ApiModelProperty(name = "数据代码类别主键")
	private String id;              // 数据代码类别主键
	@ApiModelProperty(name = "数据代码类别名称")
	private String name;            // 数据代码类别名称
	@ApiModelProperty(name = "数据代码类别编码")
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
	 * <b>根据实体对象获得视图对象</b>
	 * @param entity
	 * @return
	 */
	public static DataCodeCategoryVO getVOfromEntity(DataCodeCategory entity) {
		// 创建视图对象
		DataCodeCategoryVO vo = new DataCodeCategoryVO();
		if (entity != null){
			BeanUtils.copyProperties(entity, vo);
			vo.setStatus(entity.getStatus());
			vo.setCreateUser(entity.getCreateUser());
			vo.setCreateTime(entity.getCreateTime());
			vo.setUpdateUser(entity.getUpdateUser());
			vo.setUpdateTime(entity.getUpdateTime());
		}
		return vo;
	}
}
