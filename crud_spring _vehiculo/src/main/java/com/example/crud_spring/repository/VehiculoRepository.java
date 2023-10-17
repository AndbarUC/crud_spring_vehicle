package com.example.crud_spring.repository;

import com.example.crud_spring.entity.Vehiculo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo , Long>{
  public List<Vehiculo> findAll();
  Vehiculo findByPlaca(String placa);
}
