package com.example.crudPrueba.controller;

import com.example.crudPrueba.entity.nuevaConsola;
import com.example.crudPrueba.services.consoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping(path ="api/v1/console")
public class consoleController {

    @Autowired(required=true)
    private consoleServices consoleServices;

    @GetMapping
    public List<nuevaConsola> getAll(){
    return consoleServices.getConsole();
    }

    @GetMapping("/{consoleId}")
    public Optional<nuevaConsola> getById(@PathVariable("consoleId") Long consoleId){
        return consoleServices.getConsole(consoleId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody nuevaConsola consola){
         consoleServices.saveOrUpdate(consola);
    }

    @DeleteMapping(value = "/{consoleId}")
    public void delete(@PathVariable("consoleId") Long consoleId){
        consoleServices.delete(consoleId);
    }
}
