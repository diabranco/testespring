package com.Controles;

import com.Modelos.ClasseNaturezaJuridica;
import com.Repositorios.ClasseNaturezaJuridicaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClasseNaturezaJuridicaControler {
	
	@Autowired 
	private ClasseNaturezaJuridicaRep CNJRep;

	@GetMapping(path="/add")
	public @ResponseBody String addNewCNJ (@RequestParam("name") String name) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		ClasseNaturezaJuridica CNJ = new ClasseNaturezaJuridica();
		CNJ.setClasseNaturezaJuridica(name);
		CNJRep.save(CNJ);
		return "Incluído";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<ClasseNaturezaJuridica> getAllCNJ() {
		// This returns a JSON or XML with the users
		return CNJRep.findAll();
	}

}
