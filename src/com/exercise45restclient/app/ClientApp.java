package com.exercise45restclient.app;

import javax.json.JsonArray;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ClientApp {

	public static void main(String[] args) {
		Client client =  ClientBuilder.newClient();
		WebTarget target = client.target(
		"http://localhost:8080/Exercise45RESTJson/rest/products"		
		);
		
		JsonArray response = target.request(MediaType.APPLICATION_JSON).get(JsonArray.class);
		System.out.println(response);
	}

}
