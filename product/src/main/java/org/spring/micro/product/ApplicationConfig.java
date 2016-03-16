package org.spring.micro.product;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration Spring annotation to indicate to the framework 
 * that it is a resource configuration class, we set the Jersey, 
 * which is our ResourceManager responsible for exposing REST services for the consumers.
 * 
 * Identical in customers and products related projects.
 * 
 * @author s
 */
@Configuration
public class ApplicationConfig {

	@Named
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig() {
			this.packages("org.spring.micro.product.rest");
		}
	}
}