/**
 * WebS1ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webServices1;

public class WebS1ServiceLocator extends org.apache.axis.client.Service implements webServices1.WebS1Service {

    public WebS1ServiceLocator() {
    }


    public WebS1ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebS1ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebS1
    private java.lang.String WebS1_address = "http://localhost:8080/WebApplication1/services/WebS1";

    public java.lang.String getWebS1Address() {
        return WebS1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebS1WSDDServiceName = "WebS1";

    public java.lang.String getWebS1WSDDServiceName() {
        return WebS1WSDDServiceName;
    }

    public void setWebS1WSDDServiceName(java.lang.String name) {
        WebS1WSDDServiceName = name;
    }

    public webServices1.WebS1 getWebS1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebS1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebS1(endpoint);
    }

    public webServices1.WebS1 getWebS1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webServices1.WebS1SoapBindingStub _stub = new webServices1.WebS1SoapBindingStub(portAddress, this);
            _stub.setPortName(getWebS1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebS1EndpointAddress(java.lang.String address) {
        WebS1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webServices1.WebS1.class.isAssignableFrom(serviceEndpointInterface)) {
                webServices1.WebS1SoapBindingStub _stub = new webServices1.WebS1SoapBindingStub(new java.net.URL(WebS1_address), this);
                _stub.setPortName(getWebS1WSDDServiceName());
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
        if ("WebS1".equals(inputPortName)) {
            return getWebS1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webServices1", "WebS1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webServices1", "WebS1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebS1".equals(portName)) {
            setWebS1EndpointAddress(address);
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
