package br.com.unipac.projeto1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteResources {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "Olá";
	}

}
