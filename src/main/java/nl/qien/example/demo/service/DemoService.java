package nl.qien.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.example.demo.entity.Demo;
import nl.qien.example.demo.repository.DemoRepository;

@Service
public class DemoService {

	@Autowired
	private DemoRepository demoRepository;
	
	public Iterable<Demo> getDemos() {
		return demoRepository.findAll();
	}

	public void save(final Demo demo) {
		demoRepository.save(demo);
	}
	
}
