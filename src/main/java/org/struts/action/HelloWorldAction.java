package org.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{

	private static final long serialVersionUID = 2316938428913136L;
	
	@Override
	public String execute() throws Exception {
		
		  System.out.println("执行了Action方法");
	      
		  return SUCCESS;
	}

}
