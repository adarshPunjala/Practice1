/**
 * BankPortLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.TestCase1;

public class BankPortLocator extends org.apache.axis.client.Service implements org.example.www.TestCase1.BankPort {

    public BankPortLocator() {
    }


    public BankPortLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BankPortLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TestCase1SOAP
    private java.lang.String TestCase1SOAP_address = "http://www.example.org/";

    public java.lang.String getTestCase1SOAPAddress() {
        return TestCase1SOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TestCase1SOAPWSDDServiceName = "TestCase1SOAP";

    public java.lang.String getTestCase1SOAPWSDDServiceName() {
        return TestCase1SOAPWSDDServiceName;
    }

    public void setTestCase1SOAPWSDDServiceName(java.lang.String name) {
        TestCase1SOAPWSDDServiceName = name;
    }

    public org.example.www.TestCase1.BankPortType getTestCase1SOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TestCase1SOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTestCase1SOAP(endpoint);
    }

    public org.example.www.TestCase1.BankPortType getTestCase1SOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.TestCase1.BankBindingStub _stub = new org.example.www.TestCase1.BankBindingStub(portAddress, this);
            _stub.setPortName(getTestCase1SOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTestCase1SOAPEndpointAddress(java.lang.String address) {
        TestCase1SOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.TestCase1.BankPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.TestCase1.BankBindingStub _stub = new org.example.www.TestCase1.BankBindingStub(new java.net.URL(TestCase1SOAP_address), this);
                _stub.setPortName(getTestCase1SOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TestCase1SOAP".equals(inputPortName)) {
            return getTestCase1SOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/TestCase1/", "BankPort");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/TestCase1/", "TestCase1SOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TestCase1SOAP".equals(portName)) {
            setTestCase1SOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
