package com.tmca.client;

import org.restlet.resource.ClientProxy;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;

import com.tmca.impl.Contact;

public interface ContactClientProxy extends ClientProxy {

	public interface ContactResourceProxy extends ClientProxy {
	    @Get
	    public Contact retrieve();

	   @Put
	    public void store(Contact contact);

	    @Delete
	    public void remove(Contact callback);
	}
}
