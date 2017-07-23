package com.tmca.interfaces;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

import com.tmca.impl.EML;

public interface EMLResource {
	@Get("xml")
	public EML retrieve();
	
	@Post("xml")
	public void update(EML anEml);
}
