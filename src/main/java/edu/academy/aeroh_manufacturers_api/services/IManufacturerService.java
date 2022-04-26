package edu.academy.aeroh_manufacturers_api.services;

import edu.academy.aeroh_manufacturers_api.models.Manufacturer;

import java.util.List;

public interface IManufacturerService {

    public List<Manufacturer> findAll();

    public Manufacturer findById(Long id);

    public Manufacturer save(Manufacturer manufacturer);

    public void delete(Long id);

}
