package com.exercise45restclient.app;

import javax.json.JsonArray;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.exercise45restclient.model.Product;

public class ClientApp2 {

	public static void main(String[] args) {
		Client client =  ClientBuilder.newClient();
		WebTarget target = client.target(
		"http://localhost:8080/Exercise45RESTJson/rest/"		
		).path("products");
		Product product = new Product();
		product.setNombreProducto("Mariguana artesanal");
		product.setPrecioProducto(35.7);
		
		Invocation.Builder invoBuilder = target.request(MediaType.APPLICATION_JSON);
		
		Response response = invoBuilder.post(Entity.entity(product, MediaType.APPLICATION_JSON));
		

		System.out.println(response);

	}

}
