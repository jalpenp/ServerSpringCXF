package com.spring.client;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;
import org.springframework.stereotype.Service;

@Service("clientService")
public class ClientPasswordCallback implements CallbackHandler{

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
	
		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];


		// for CxfClient.java use below
		pc.setPassword("abc");

		
			// for CxfClientISG.java use below
			//pc.setPassword("@dmin5");
	}	

	}
