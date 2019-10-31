package br.com.MarcacaodeConsulta.MarcaConsultas.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsultaController {
	
	@RequestMapping("/cadastrarConsulta")
	public String form() {
	return "Consultas/formConsulta";
		
		
		
	}

}
