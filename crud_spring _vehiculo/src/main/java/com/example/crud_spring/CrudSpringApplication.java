package com.example.crud_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.xml.ws.Endpoint;
import com.example.crud_spring.service.SOAPImplementacion;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
		System.out.println("Iniciando servicio SOAP");
		String address="http://0.0.0.0:8081/";
		Endpoint.publish(address, new SOAPImplementacion());
	}

}
