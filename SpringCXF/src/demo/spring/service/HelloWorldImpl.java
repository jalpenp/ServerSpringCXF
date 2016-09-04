package demo.spring.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class HelloWorldImpl implements HelloWorld {

	@WebMethod
	public String sayHello(String msg) {
		// TODO Auto-generated method stub
		return "say Hello!"+msg;
	}
}
