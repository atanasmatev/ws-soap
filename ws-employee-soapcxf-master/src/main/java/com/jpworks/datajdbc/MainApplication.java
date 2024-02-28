package com.jpworks.datajdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import soapt.webservice1_2_tws.WebService12;
import soapt.webservice1_2_tws.WebService12PortType;

import javax.xml.ws.BindingProvider;

@SpringBootApplication()
@EnableAutoConfiguration
public class MainApplication {

	public static void main(String[] args) {
		// new SpringApplicationBuilder(MainApplication.class).build().run(args);
		SpringApplication.run(MainApplication.class, args);

//		 String response;
		// WebService11 webService11 = new WebService11();
		// WebService11PortType webService11PortType = webService11.getWebService11Soap();

		// BindingProvider bindingProvider = (BindingProvider)webService11PortType;
		// bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cp4ba-admin");
		// bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "P@ssw0rd.2022!");

		// response = webService11PortType.operation("123");

//		 WebService12 webService12 = new WebService12();
//		 WebService12PortType webService12PortType = webService12.getSoap12WebService12Soap();
//
//		 BindingProvider bindingProvider = (BindingProvider)webService12PortType;
//		 bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cp4ba-admin");
//		 bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "P@ssw0rd.2022!");
//
//		 response = webService12PortType.operation("123");
//
//		 System.out.println(response);
	}

	// @Override
	// protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	// 	return application.sources(MainApplication.class);
	// }

}
