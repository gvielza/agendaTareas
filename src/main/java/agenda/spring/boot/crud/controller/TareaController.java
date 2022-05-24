package agenda.spring.boot.crud.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import agenda.spring.boot.crud.entity.Tarea;
import agenda.spring.boot.crud.repository.RepoTarea;

@Controller
@RequestMapping("/api")
public class TareaController {
  @Autowired
private RepoTarea repo;
	
  @GetMapping("/tareas")
  public @ResponseBody Iterable<Tarea> buscarTodas() {
	 return repo.findAll();
  }
  @PostMapping
    public void agregarTarea(@RequestParam Tarea tarea) {
	repo.save(tarea);
  }
	
}
