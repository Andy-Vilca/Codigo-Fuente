package com.proyect1.prueba.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyect1.prueba.domain.Respondidas;

@Repository
public interface RespondidasRepository extends JpaRepository<Respondidas,Integer>{

}
