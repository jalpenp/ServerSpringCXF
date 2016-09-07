package com.spring.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.isg.de.ws.server.soap.NativeEventProviderSOAPWS;

import demo.spring.service.HelloWorld;

public class CxfClientISG {

	public static void main(String[] args) {
		
	FileSystemXmlApplicationContext	 ctx=new FileSystemXmlApplicationContext("/WebContent/WEB-INF/cxf-client_isg.xml");
	
	// hello=(HelloWorld) ctx.getBean("client");
	
	//To Test ISGG web servie
	NativeEventProviderSOAPWS event=(NativeEventProviderSOAPWS) ctx.getBean("client");
		
	String s=event.getNativeEventsByState("NJ");
		
		System.out.println(s);
		
		ctx.close();
	
	}
	
	// https://stagingde.xcmdata.org/ISGDE/soap/NativeEventProvider?wsdl
}
