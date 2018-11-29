package com.Repositorios;

import com.Modelos.ClasseNaturezaJuridica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseNaturezaJuridicaRep extends CrudRepository<ClasseNaturezaJuridica, Integer> {

}
