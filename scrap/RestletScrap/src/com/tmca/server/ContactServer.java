package com.tmca.server;


import java.util.ArrayList;
import java.util.List;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.engine.Engine;
import org.restlet.engine.converter.ConverterHelper;
import org.restlet.ext.jackson.JacksonConverter;

public class ContactServer {
	
	public static void main(String[] args) throws Exception{
		//Create HTTP Server and listen on port 8182
		System.setProperty("java.util.logging.config.file", "/Users/graeme/eclipse-workspace/Restlet Example/resources/logging.properties");
		Server server = new Server(Protocol.HTTP, 8182);
		Component c = new Component();
		c.getServers().add(server);
		c.getDefaultHost().attach("/restlet",  new ContactApplication());  
		Application app = new SOSApplication();
		c.getDefaultHost().attach("/dcm",  app);
		c.getLogService().setResponseLogFormat("{ciua} {cri} {ra} {m} {rp} {rq} {S} {ES} {es} {hh} {cig} {fi}");
		//Engine.getInstance().getRegisteredConverters().add(0, new JacksonConverter());
		List<ConverterHelper> newList = new ArrayList<ConverterHelper>();
		newList.add(new JacksonConverter());
		Engine.getInstance().setRegisteredConverters(newList);
		Engine.getInstance().getRegisteredConverters();
		c.start();
	}
}
