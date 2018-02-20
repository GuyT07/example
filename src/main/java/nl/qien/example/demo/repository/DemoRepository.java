package nl.qien.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nl.qien.example.demo.entity.Demo;

@Repository
public interface DemoRepository extends CrudRepository<Demo, Long>{
	
}
