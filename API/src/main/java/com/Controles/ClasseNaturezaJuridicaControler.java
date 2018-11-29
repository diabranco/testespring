package Controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import Modelos.ClasseNaturezaJuridica;
import Repositorios.ClasseNaturezaJuridicaRep;

public class ClasseNaturezaJuridicaControler {
	
	@Autowired 
	private ClasseNaturezaJuridicaRep CNJRep;

	@GetMapping(path="/add")
	public @ResponseBody String addNewCNJ (@RequestParam String name) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Modelos.ClasseNaturezaJuridica CNJ = new Modelos.ClasseNaturezaJuridica();
		CNJ.setClasseNaturezaJuridica(name);
		CNJRep.save(CNJ);
		return "Incluído";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Modelos.ClasseNaturezaJuridica> getAllCNJ() {
		// This returns a JSON or XML with the users
		return CNJRep.findAll();
	}

}
