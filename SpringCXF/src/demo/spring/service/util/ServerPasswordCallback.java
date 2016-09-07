package demo.spring.service.util;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;
import org.springframework.stereotype.Service;

@Service("sampleService")
public class ServerPasswordCallback implements CallbackHandler{

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
	
		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

		 System.out.println(pc.getIdentifier()+"  "+pc.getPassword());
		
		if ("SampleTest".equals(pc.getIdentifier()))
			
			pc.setPassword("abc");
		else
			throw new IOException(
					"The security token could not be authenticated");	
	}
	

	}
