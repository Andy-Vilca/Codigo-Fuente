package com.proyect1.prueba.apis;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyect1.prueba.domain.Info_Castellano;
import com.proyect1.prueba.repository.InfoRepository;

@RestController
@RequestMapping("/apis")
public class InfoController {
	@Autowired
	InfoRepository inforepository;
	
	@GetMapping("/infos")
	public List<Info_Castellano> findall() {
		return inforepository.findAll();
	}
	@PostMapping("/infos")
	public Info_Castellano guardar(@RequestBody Info_Castellano info) {
		return inforepository.save(info);
	}

	@GetMapping("/infos/{id}")
	public Optional<Info_Castellano> buscarid(@PathVariable int id) {
		return inforepository.findById(id);
	}
	@DeleteMapping("/infos/{id}")
	void eliminar(@PathVariable int id) {
		inforepository.deleteById(id);
	}
}
