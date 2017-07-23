package com.tmca.interfaces;

import java.io.Serializable;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;

import com.tmca.impl.Contact;

public interface ContactResource extends Serializable {

	@Get("xml") 
	public Contact retrieve();
	
	@Put
	public void store(Contact contact);
	
    @Delete
    public void remove();
}
