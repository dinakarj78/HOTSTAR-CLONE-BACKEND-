package backend.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] { WebConfig.class, JpaConfig.class };

	}

	@Override
	protected Class<?>[] getServletConfigClasses() {	
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/api/*" };
	}

}
