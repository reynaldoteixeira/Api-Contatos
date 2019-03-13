package com.api_contatos.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api_contatos.model.Contato;
import com.api_contatos.repository.ContatoRepository;




@Controller
@RequestMapping(path="contatos")
public class ContatoController {
	
	@Autowired
	private ContatoRepository cr;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Contato> listaContatos() {
		Iterable<Contato> listaContatos = cr.findAll();
		return listaContatos;
	}
	
	@PostMapping()
	public Contato cadastroContato(@RequestBody @Valid Contato contato) {
		return cr.save(contato);
	}
	
	@DeleteMapping()
	public Contato deletaContato(@RequestBody Contato contato) {
		cr.delete(contato);
		return contato;
	}
}
