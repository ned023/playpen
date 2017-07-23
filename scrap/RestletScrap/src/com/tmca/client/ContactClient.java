package com.tmca.client;

import org.restlet.Context;
import org.restlet.data.MediaType;
import org.restlet.resource.ClientResource;

import com.tmca.client.ContactClientProxy.ContactResourceProxy;
import com.tmca.impl.Contact;
import com.tmca.interfaces.ContactResource;

public class ContactClient {
	
	public static void main(String[] args) throws Exception{
		Context context = new Context();
		ClientResource cr = new ClientResource(context, "http://localhost:8182/restlet/contacts");
		// Get the Contact object
		//cr.setRequestEntityBuffering(true);
		//cr.accept(MediaType.APPLICATION_JSON);

		ContactResourceProxy resource = cr.wrap(ContactResourceProxy.class);
		cr.getContext().getParameters().add("tracing", "true");

		Contact contact = (Contact)resource.retrieve();
		System.out.println(resource.getClientResource().getResponse());
		System.out.println(cr.getResponse().getEntityAsText());
		if (contact != null) {
		    System.out.println("firstname: " + contact.getFirstName());
		    System.out.println(" lastname: " + contact.getLastName());
		    System.out.println("     nage: " + contact.getAge());
		}
	}
}
