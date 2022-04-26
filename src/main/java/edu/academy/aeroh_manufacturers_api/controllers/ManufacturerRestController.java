package edu.academy.aeroh_manufacturers_api.controllers;

import edu.academy.aeroh_manufacturers_api.models.Manufacturer;
import edu.academy.aeroh_manufacturers_api.services.IManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = {"url_cross_origin"})  --> para habilitar consumo desde fuera (React - Angular...)
@RestController
@RequestMapping("/api")
public class ManufacturerRestController {

    @Autowired //DI
    private IManufacturerService manufacturerService;

    @GetMapping("/manufacturers")
    public List<Manufacturer> index(){
        return manufacturerService.findAll();
    }

    @GetMapping("/manufacturers/{id}")
    public Manufacturer selected(@PathVariable Long id){
        return manufacturerService.findById(id);
    }

    @PostMapping("/manufacturers")
    @ResponseStatus(HttpStatus.CREATED) //Response Status manejos los codigos de respuesta HTTP, en este caso seria 201
    public Manufacturer create(@RequestBody Manufacturer manufacturer){
        return manufacturerService.save(manufacturer);
    }

    @PutMapping("/manufacturers/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Manufacturer update(@RequestBody Manufacturer manufacturer, @PathVariable Long id){
        Manufacturer actual = manufacturerService.findById(id);
        actual.setName(manufacturer.getName());
        actual.setDescription(manufacturer.getDescription());
        actual.setFounded(manufacturer.getFounded());
        actual.setFate(manufacturer.getFate());

        return manufacturerService.save(actual);
    }

    @DeleteMapping("/manufacturers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        manufacturerService.delete(id);
    }
}
