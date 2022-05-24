package agenda.spring.boot.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import agenda.spring.boot.crud.entity.Tarea;
@Repository
public interface RepoTarea extends CrudRepository<Tarea, Integer>{

}
