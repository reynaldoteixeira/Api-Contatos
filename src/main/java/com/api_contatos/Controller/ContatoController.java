package com.api_contatos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api_contatos.repository.ContatoRepository;

@Controller
@RequestMapping(path="contatos")
public class ContatoController {
	
	@Autowired
	private ContatoRepository cr;
}
