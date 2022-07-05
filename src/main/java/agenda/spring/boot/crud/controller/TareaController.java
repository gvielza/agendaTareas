package agenda.spring.boot.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import agenda.spring.boot.crud.entity.Tarea;
import agenda.spring.boot.crud.repository.RepoTarea;

@RestController
@RequestMapping("/api")
public class TareaController {
	@Autowired
	private RepoTarea repo;

	@GetMapping("/tareas")
	public @ResponseBody Iterable<Tarea> buscarTodas() {
		return repo.findAll();
	}
	@PostMapping("/new")
	public ResponseEntity<?> agregarTarea(@RequestBody Tarea task) {
		Tarea t=repo.save(task);
		return ResponseEntity.status(HttpStatus.CREATED).body(t);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarTarea(@PathVariable Integer id){
		repo.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
