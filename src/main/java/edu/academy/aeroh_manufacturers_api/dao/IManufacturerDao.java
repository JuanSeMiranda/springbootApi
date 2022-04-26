package edu.academy.aeroh_manufacturers_api.dao;

import edu.academy.aeroh_manufacturers_api.models.Manufacturer;
import org.springframework.data.repository.CrudRepository;

public interface IManufacturerDao extends CrudRepository<Manufacturer, Long> {
}
