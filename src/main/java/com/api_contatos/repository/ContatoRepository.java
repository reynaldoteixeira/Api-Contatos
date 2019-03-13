package com.api_contatos.repository;

import org.springframework.data.repository.CrudRepository;

import com.api_contatos.model.Contato;

public interface ContatoRepository extends CrudRepository<Contato,String>{

}
