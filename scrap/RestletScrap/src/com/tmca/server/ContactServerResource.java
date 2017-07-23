package com.tmca.server;

import org.restlet.Restlet;
import org.restlet.resource.Directory;
import org.restlet.resource.ServerResource;
import org.restlet.routing.Router;

import com.tmca.impl.Address;
import com.tmca.impl.Contact;
import com.tmca.interfaces.ContactResource;

public class ContactServerResource extends ServerResource implements ContactResource {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4023159558406420556L;

	
	
	private static volatile Contact contact = new Contact("Scott", "Tiger", new Address("10 bd Google", null, "20010", "Mountain View",
            "USA"), 40);
	
	@Override
	public Contact retrieve() {
		return contact;
	}

	@Override
	public void store(Contact contact) {
		ContactServerResource.contact = contact;
	}

	@Override
	public void remove() {
		contact = null;

	}


}
