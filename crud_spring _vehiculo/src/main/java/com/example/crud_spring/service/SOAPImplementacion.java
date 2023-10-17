package com.example.crud_spring.service;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.jws.WebMethod;
//import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import com.example.crud_spring.entity.Vehiculo;
import com.example.crud_spring.mock.Datos;

@RequestMapping(path = "vehicles")
@WebService(serviceName = "vehicles")
public class SOAPImplementacion {

    private Datos datos = new Datos();

    @WebMethod(operationName = "testResponse")
    public String getStudents() {
        
        return this.datos.response;
    }

    @WebMethod(operationName = "datosVehiculos")
    public List<Vehiculo> getAll()
    {
        return this.datos.getVehicles();
    }

}
