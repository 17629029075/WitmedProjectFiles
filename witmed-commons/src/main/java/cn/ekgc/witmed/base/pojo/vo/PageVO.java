package cn.ekgc.witmed.base.pojo.vo;

import cn.ekgc.witmed.base.util.BaseConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <b>系统基础信息类 - 分页视图信息类</b>
 * <p>
 *     分页视图信息包含以下属性：<br/>
 *     1、当前页码：pageNum <br/>
 *     2、每页显示数量：pageSize <br/>
 *     3、分页列表：list <br/>
 *     4、总条数：totalSize <br/>
 *     5、总页数：totalpage <br/>
 *     所有功能的分页视图信息<b>都必须继承于本分页视图类</b>
 * </p>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -702200217463073198L;
	@ApiModelProperty(name = "当前页码" ,example = "1")
	private Integer pageNum;                //当前页码
	@ApiModelProperty(name = "每页显示数量" ,example = "10")
	private Integer pageSize;               //每页显示数量
	@ApiModelProperty(name = "分页列表" )
	private List<E> list;                   //分页列表
	@ApiModelProperty(name = "总条数" ,example = "100")
	private Integer totalSize;              //总条数
	@ApiModelProperty(name = "总页数" ,example = "10")
	private Integer totalPage;              //总页数
	
	public PageVO() {}
	
	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum !=null && pageNum >0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = BaseConstants.PAGE_NUM;
		}if (pageSize !=null && pageSize >0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = BaseConstants.PAGE_SIZE;
		}
		
		
	}
	
	public Integer getPageNum() {
		return pageNum;
	}
	
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public List<E> getList() {
		return list;
	}
	
	public void setList(List<E> list) {
		this.list = list;
	}
	
	public Integer getTotalSize() {
		return totalSize;
	}
	
	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}
	
	public Integer getTotalPage() {
		return totalPage;
	}
	
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}