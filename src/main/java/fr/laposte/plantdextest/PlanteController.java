package fr.laposte.plantdextest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;


@RestController
@RequestMapping("/plante")
@Log4j2
public class PlanteController {
	
	@Autowired
	private List<Plante> plantes;

	@GetMapping
	List<Plante> getAll(){
		return plantes;
	}
	
	@GetMapping("{id}")
	public Plante getOne(@PathVariable String id) {
		return findById(id);
	}
	
	
	@PostMapping
	public void addPlante(@RequestBody Plante plante){
		plantes.add(plante);
		log.info(plante);
	}
	
	@DeleteMapping("{id}")
	public void deleteOnePlante(@PathVariable String id){
		plantes.remove(findById(id));
	}
	
	private Plante findById(String id) {
		return plantes.stream().filter(p -> p.getId().equals(id)).findFirst().get();
	}
	
	
}
