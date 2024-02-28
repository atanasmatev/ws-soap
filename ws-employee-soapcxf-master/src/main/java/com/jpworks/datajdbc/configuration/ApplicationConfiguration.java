package com.jpworks.datajdbc.configuration;

import com.jpworks.datajdbc.service.WebServiceEndpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class ApplicationConfiguration {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint(WebServiceEndpoint webServiceEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(bus, webServiceEndpoint);
        endpoint.publish("/service/webservice");
        return endpoint;
    }

}
