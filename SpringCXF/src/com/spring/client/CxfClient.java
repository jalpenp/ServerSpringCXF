package com.spring.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import demo.spring.service.HelloWorld;

public class CxfClient {

	public static void main(String[] args) {
		
	FileSystemXmlApplicationContext	 ctx=new FileSystemXmlApplicationContext("/WebContent/WEB-INF/cxf-client.xml");
	
		HelloWorld hello=(HelloWorld) ctx.getBean("client");
		
		
		System.out.println(hello.sayHello("Hi you doing!"));
		ctx.close();
	
	}
	
	// https://stagingde.xcmdata.org/ISGDE/soap/NativeEventProvider?wsdl
}
