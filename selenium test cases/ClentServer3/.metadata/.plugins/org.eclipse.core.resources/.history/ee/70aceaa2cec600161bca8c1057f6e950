/**
 * ASMDClassServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Practise;

public class ASMDClassServiceLocator extends org.apache.axis.client.Service implements Practise.ASMDClassService {

    public ASMDClassServiceLocator() {
    }


    public ASMDClassServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ASMDClassServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ASMDClass
    private java.lang.String ASMDClass_address = "http://localhost:8080/ASMDProject/services/ASMDClass";

    public java.lang.String getASMDClassAddress() {
        return ASMDClass_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ASMDClassWSDDServiceName = "ASMDClass";

    public java.lang.String getASMDClassWSDDServiceName() {
        return ASMDClassWSDDServiceName;
    }

    public void setASMDClassWSDDServiceName(java.lang.String name) {
        ASMDClassWSDDServiceName = name;
    }

    public Practise.ASMDClass getASMDClass() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ASMDClass_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getASMDClass(endpoint);
    }

    public Practise.ASMDClass getASMDClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Practise.ASMDClassSoapBindingStub _stub = new Practise.ASMDClassSoapBindingStub(portAddress, this);
            _stub.setPortName(getASMDClassWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setASMDClassEndpointAddress(java.lang.String address) {
        ASMDClass_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Practise.ASMDClass.class.isAssignableFrom(serviceEndpointInterface)) {
                Practise.ASMDClassSoapBindingStub _stub = new Practise.ASMDClassSoapBindingStub(new java.net.URL(ASMDClass_address), this);
                _stub.setPortName(getASMDClassWSDDServiceName());
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
        if ("ASMDClass".equals(inputPortName)) {
            return getASMDClass();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Practise", "ASMDClassService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Practise", "ASMDClass"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ASMDClass".equals(portName)) {
            setASMDClassEndpointAddress(address);
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
