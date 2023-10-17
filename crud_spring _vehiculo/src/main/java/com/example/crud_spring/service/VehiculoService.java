package com.example.crud_spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_spring.repository.VehiculoRepository;
import com.example.crud_spring.entity.Vehiculo;

@Service
public class VehiculoService {
    
    @Autowired
    VehiculoRepository vehicleRepository;

    public List<Vehiculo> getVehicles()
    {
        return vehicleRepository.findAll();
    }

    public Optional<Vehiculo> getVehicle(Long id)
    {
        return vehicleRepository.findById(id);
    }

    public void saveOrUpdate(Vehiculo vehicle)
    {
        vehicleRepository.save(vehicle);
    }

    public void delete(Long id)
    {
        vehicleRepository.deleteById(id);
    }

    public Vehiculo getVehicleByPlate(String plate)
    {
        return vehicleRepository.findByPlaca(plate);
    } 

    public Integer getSoat(String plate)
    {
        Vehiculo data = vehicleRepository.findByPlaca(plate);
        return data.getValor_soat();
    } 
    
}
