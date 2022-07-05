package agenda.spring.boot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import agenda.spring.boot.crud.entity.Tarea;

public interface RepoTarea extends JpaRepository<Tarea, Integer>{

}
