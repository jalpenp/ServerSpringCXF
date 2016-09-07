package demo.spring.service;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	
	public String sayHello(String msg);
	
}
