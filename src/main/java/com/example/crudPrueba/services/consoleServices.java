package com.example.crudPrueba.services;

import com.example.crudPrueba.entity.nuevaConsola;
import com.example.crudPrueba.repository.consoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class consoleServices {
    @Autowired(required=true)
    consoleRepository consoleRepository;

    public List<nuevaConsola> getConsole(){
        return  consoleRepository.findAll();
    }
    public Optional<nuevaConsola> getConsole(Long id){
        return  consoleRepository.findById(id);
    }
    public  void saveOrUpdate(nuevaConsola consola){
        consoleRepository.save(consola);
    }
    public  void delete(Long id){
        consoleRepository.deleteById(id);
    }

}
