package cn.ekgc.witmed.base.pojo.vo;

import cn.ekgc.witmed.base.pojo.enums.ResponseCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <b>系统基础信息类 - 系统响应视图信息类</b>
 * <p>
 *     分页视图信息包含以下属性：<br/>
 *     1、系统响应编码：code <br/>
 *     2、系统响应数据：data <br/>
 *     返回前端的所有数据<b>都必须以本系统响应视图返回</b>
 * </p>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("系统基础信息类 - 系统响应视图信息类")
public class ResponseVO<E> implements Serializable {
	
	private static final long serialVersionUID = -8727308959795367090L;
	@ApiModelProperty(name = "系统响应编码",example = "2000")
	private Integer code;                   //系统响应编码
	@ApiModelProperty(name = "系统响应数据")
	private E data;                         //系统响应数据
	
	private ResponseVO(Integer code, E data) {
		this.code = code;
		this.data = data;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public E getData() {
		return data;
	}
	
	public void setData(E data) {
		this.data = data;
	}
	
	/**
	 *<b>获得系统响应成功视图信息</b>
	 * @return
	 */
	public static ResponseVO getSuccessResponseVO(){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getCode(),
				ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getRemark());
	}
	
	/**
	 *<b>获得系统响应成功视图信息</b>
	 * @param data
	 * @return
	 */
	public static ResponseVO getSuccessResponseVO(Object data){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getCode(),data);
	}
	
	/**
	 * <b>获得用户未认证视图信息</b>
	 * @return
	 */
	public static ResponseVO getUnauthResponseVO(){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_UNAUTH.getCode(),
				ResponseCodeEnum.RESPONSE_CODE_UNAUTH.getRemark());
	}
	
	/**
	 *<b>获得系统业务处理错误视图信息</b>
	 * @return
	 */
	public static ResponseVO getErrorResponseVO(Object data){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_ERROR.getCode(),data);
	}
	
	/**
	 * <b>获得系统响应异常视图信息</b>
	 * @param e
	 * @return
	 */
	public static ResponseVO getExceptionResponseVO(Exception e){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_EXCEPTION.getCode(), e.getMessage());
	}
}
