/**
 * WebS1_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.WebS1;

public interface WebS1_Service extends javax.xml.rpc.Service {
    public java.lang.String getWebS1SOAPAddress();

    public org.example.www.WebS1.WebS1_PortType getWebS1SOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.WebS1.WebS1_PortType getWebS1SOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
