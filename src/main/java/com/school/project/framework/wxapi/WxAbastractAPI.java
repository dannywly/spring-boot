package com.school.project.framework.wxapi;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

public abstract class WxAbastractAPI implements WxAPI{

	private String uri;
	
	public WxAbastractAPI() {
	 
	}
	
	public WxAbastractAPI(String uri) {
		 this.uri = uri;
	}

	@Override
	public String sendRquest(int method, int timeout, int retry) {
		String str = null;
		try {
			str = sendRequest(method, timeout);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	private String sendRequest(int method, int timeout) throws ClientProtocolException, IOException {
		
		Request request = null;
		if (METHOD_GET == method) {
			request = Request.Get(uri).connectTimeout(timeout);
			
			return request.execute().returnContent().toString();
		} else {
			request = Request.Post(uri).connectTimeout(timeout);
			return request.execute().returnContent().toString();
		}
	}
	
}
