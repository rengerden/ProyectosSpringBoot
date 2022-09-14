package com.java.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.java.servicios.SpringConfigurador;

public class SpringWebInicializador implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		// Registramos un concepto vía Web dentro de Spring framework
		AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		contexto.register(SpringConfigurador.class);
		contexto.setServletContext(servletContext);

		// Necesitamos un Servlet que haga de controlador frontal y ejecute las
		// peticiones hacia las vistas y controladores
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(contexto));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
