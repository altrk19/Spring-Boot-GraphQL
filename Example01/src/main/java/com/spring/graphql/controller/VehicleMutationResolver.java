package com.spring.graphql.controller;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.spring.graphql.dto.VehicleDto;
import com.spring.graphql.entity.Vehicle;
import com.spring.graphql.repo.VehicleRepository;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;

    public VehicleMutationResolver(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle createVehicle(VehicleDto vehicleDto) {
        return vehicleRepository.save(dtoToEntity(vehicleDto));
    }

    private Vehicle dtoToEntity(VehicleDto vehicleDto) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrandName(vehicleDto.getBrandName());
        vehicle.setLaunchDate(new Date());
        vehicle.setModelCode(vehicleDto.getModelCode());
        vehicle.setType(vehicleDto.getType());
        return vehicle;
    }
}