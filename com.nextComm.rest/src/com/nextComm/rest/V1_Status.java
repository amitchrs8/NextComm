package com.nextComm.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/status/")	
public class V1_Status {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTitle(){
		return "Hello World, Text format";
	}
	
	@GET
	@Path("/testHtml")
	@Produces(MediaType.TEXT_HTML)
	public String getTitleHtml(){
		return "<p>Hello World, HTML Format <p>";
	}
	
}
