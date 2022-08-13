package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import entity.Cadastro;
import repository.CadastroRepository;

@Controller
public class CadastroController {

	@Autowired
	private CadastroRepository repo;

	@GetMapping("/cadastro")
	public ResponseEntity<List<Cadastro>> teste() {

		return new ResponseEntity<List<Cadastro>>(repo.findAll(), HttpStatus.OK);
	}

}
