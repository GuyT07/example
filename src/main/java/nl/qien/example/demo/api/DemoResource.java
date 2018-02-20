package nl.qien.example.demo.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import nl.qien.example.demo.entity.Demo;
import nl.qien.example.demo.service.DemoService;

@Path("demos")
@Controller
public class DemoResource {
	
	@Autowired
	private DemoService demoService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public Response helloWorld() {
		Iterable<Demo> results = demoService.getDemos();
		return Response.ok(results).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON_VALUE)
	public Response saveDemo(final Demo demo) {
		demoService.save(demo);
		return Response.status(Status.CREATED).build();
	}

}
