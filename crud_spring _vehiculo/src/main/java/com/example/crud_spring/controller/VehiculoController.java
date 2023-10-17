package com.example.crud_spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud_spring.entity.Vehiculo;
import com.example.crud_spring.service.VehiculoService;

@RestController
@RequestMapping(path = "api/v1/vehicle")
public class VehiculoController {

    @Autowired
    private VehiculoService vehicleService;

    @GetMapping
    public List<Vehiculo> getAll()
    {
        return vehicleService.getVehicles();
    }

    @GetMapping("/{vehicleId}")
    public Optional<Vehiculo> getById(@PathVariable("vehicleId") Long vehicleId )
    {
        return vehicleService.getVehicle(vehicleId);
    }

    @PostMapping
    public Vehiculo saveUpdate(@RequestBody Vehiculo student)
    {
        vehicleService.saveOrUpdate(student);
        return student;
    }

    @DeleteMapping("/{vehicleId}")
    public void delete(@PathVariable("vehicleId") Long vehicleId)
    {
        vehicleService.delete(vehicleId);
    }


    @GetMapping("/placa/{placa}")
    public Vehiculo getByPlaca(@PathVariable("placa") String placa )
    {
        return vehicleService.getVehicleByPlate(placa);
    }

    @GetMapping("/soat/{placa}")
    public Integer getByPlacaSoat(@PathVariable("placa") String placa )
    {
        return vehicleService.getSoat(placa);
    }
    
    
    

}
