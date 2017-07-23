package com.tmca.client;


public class RestletClient {

	
	public static void main(String[] args) throws Exception{
		org.restlet.resource.ClientResource resource = new org.restlet.resource.ClientResource("http://localhost:8182");
		resource.setReferrerRef("www.fake.org");
		resource.get().write(System.out);
	}
}
