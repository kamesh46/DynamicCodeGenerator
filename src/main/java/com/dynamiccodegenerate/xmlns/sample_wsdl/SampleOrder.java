package com.dynamiccodegenerate.xmlns.sample_wsdl;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2.redhat-620103
 * 2015-04-03T17:44:33.966+05:30
 * Generated source version: 3.0.2.redhat-620103
 * 
 */
@WebService(targetNamespace = "http://xmlns.dynamicCodeGenerate.com/Sample.wsdl", name = "SampleOrder")
@XmlSeeAlso({com.dynamiccodegenerate.xmlns.sample.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SampleOrder {

    @Oneway
    @WebMethod(operationName = "SampleOrder", action = "SampleOrder")
    public void sampleOrder(
        @WebParam(partName = "parameters", name = "OrderDetails", targetNamespace = "http://xmlns.dynamicCodeGenerate.com/Sample.xsd")
        com.dynamiccodegenerate.xmlns.sample.OrderDetails parameters
    );
}
