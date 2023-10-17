package com.example.crud_spring.mock;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.crud_spring.entity.Vehiculo;
import com.example.crud_spring.service.VehiculoService;

public class Datos {

    @Autowired
    VehiculoService vehicleService;
    //StudentService studentService = new StudentService();

    public List<Vehiculo> vehiculosList;
    public String response = "";

    public Datos(){

        this.response = "Respuesta de Clase Datos" ;
    }


    public List<Vehiculo> getVehicles()
    {
        return vehicleService.getVehicles();
    }


}
