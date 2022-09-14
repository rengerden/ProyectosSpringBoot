package com.java.servicios;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		
		//Primer paso: crear un contexto para anotaciones
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
		
		//Segundo paso: registrar los ficheros de anotaciones que son de configuracion con component scan
		contexto.register(SpringConfigurador.class);
		
		// refresh el contexto
		contexto.refresh();
		
		//Tercer paso: invocar el bean
		
		Servicio miservicio = contexto.getBean(Servicio.class);
		System.out.println(miservicio.mensaje());
		contexto.close();
	}

}
