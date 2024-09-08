package com.example.crudPrueba.repository;
import com.example.crudPrueba.entity.nuevaConsola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface consoleRepository extends  JpaRepository<nuevaConsola, Long>{
}
