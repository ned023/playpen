package com.tmca.server;


import org.restlet.resource.ServerResource;

import com.tmca.impl.EML;
import com.tmca.interfaces.EMLResource;

public class EMLServerResource extends ServerResource implements EMLResource {


	
	private static volatile EML eml = EML.createExampleEML();
	
	@Override
	public EML retrieve() {
		// TODO Auto-generated method stub
		return eml;
	}
	
	@Override public void update(EML anEml) {
		eml = eml;
	}
	
	
}
