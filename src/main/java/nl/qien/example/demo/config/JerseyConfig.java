package nl.qien.example.demo.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;


@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		// scan the resources package for our resources
        packages(getClass().getPackage().getName().replace("config", "api"));

	}
}

