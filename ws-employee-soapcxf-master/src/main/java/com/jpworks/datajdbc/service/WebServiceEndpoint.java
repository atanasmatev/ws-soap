package com.jpworks.datajdbc.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.BindingProvider;

import org.apache.cxf.feature.Features;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import soapt.webservice1_2_tws.WebService12;
import soapt.webservice1_2_tws.WebService12PortType;

@Service
@Slf4j
@Features(features = "org.apache.cxf.ext.logging.LoggingFeature")
public class WebServiceEndpoint implements WebService12PortType {

    @Override
    @WebMethod(action = "operation")
    public String operation(String user) {
        log.info("in operation");
        String response;
        try {
            WebService12 webService12 = new WebService12();
            WebService12PortType webService12PortType = webService12.getSoap12WebService12Soap();

            BindingProvider bindingProvider = (BindingProvider)webService12PortType;
            bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "cp4ba-admin");
            bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "P@ssw0rd.2022!");

            response = webService12PortType.operation(user);
        }
        catch (Exception e) {
            response = e.getStackTrace().toString();
            throw new UnsupportedOperationException("Unimplemented method 'operation'");
        }

        return response;        
    }
}
