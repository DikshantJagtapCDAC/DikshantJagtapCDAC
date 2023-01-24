package FirstwebMVCapp.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext ();
		
		context.register(AppConfiguration.class);
		context.setServletContext(servletContext);
		
		ServletRegistration.Dynamic controller = servletContext.addServlet("Controller", new DispatcherServlet(context));
		
		controller.setLoadOnStartup(10);
		controller.addMapping("/spring/*");

	}

}
