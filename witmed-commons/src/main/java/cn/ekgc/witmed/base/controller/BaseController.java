package cn.ekgc.witmed.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>系统基础信息类 - 控制层基础类</b>
 * <p>
 *      控制层基础类依赖注入以下信息：
 *      1、HttpServletRequest
 *      2、HttpServletResponse
 *      3、HttpSession
 *      其余所有功能控制类<b>都必须继承于本基础类</b>
 * </p>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private HttpServletResponse response;
	@Autowired
	private HttpSession session;
}
