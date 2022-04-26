package edu.academy.aeroh_manufacturers_api.services;

import edu.academy.aeroh_manufacturers_api.dao.IManufacturerDao;
import edu.academy.aeroh_manufacturers_api.models.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService implements IManufacturerService{

    @Autowired // Dependency Injection
    private IManufacturerDao manufacturerDao;

    @Override
    public List<Manufacturer> findAll() {
        return (List<Manufacturer>) manufacturerDao.findAll();
    }

    @Override
    public Manufacturer findById(Long id) {
        return manufacturerDao.findById(id).orElse(null);
    }

    @Override
    public Manufacturer save(Manufacturer manufacturer) {
        return manufacturerDao.save(manufacturer);
    }

    @Override
    public void delete(Long id) {
        manufacturerDao.deleteById(id);
    }
}
