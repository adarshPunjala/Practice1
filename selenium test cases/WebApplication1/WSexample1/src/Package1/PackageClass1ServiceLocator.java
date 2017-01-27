/**
 * PackageClass1ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Package1;

public class PackageClass1ServiceLocator extends org.apache.axis.client.Service implements Package1.PackageClass1Service {

    public PackageClass1ServiceLocator() {
    }


    public PackageClass1ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PackageClass1ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for packageClass1
    private java.lang.String packageClass1_address = "http://tempuri.org/WSexample1/services/packageClass1";

    public java.lang.String getpackageClass1Address() {
        return packageClass1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String packageClass1WSDDServiceName = "packageClass1";

    public java.lang.String getpackageClass1WSDDServiceName() {
        return packageClass1WSDDServiceName;
    }

    public void setpackageClass1WSDDServiceName(java.lang.String name) {
        packageClass1WSDDServiceName = name;
    }

    public Package1.PackageClass1 getpackageClass1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(packageClass1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getpackageClass1(endpoint);
    }

    public Package1.PackageClass1 getpackageClass1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Package1.PackageClass1SoapBindingStub _stub = new Package1.PackageClass1SoapBindingStub(portAddress, this);
            _stub.setPortName(getpackageClass1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setpackageClass1EndpointAddress(java.lang.String address) {
        packageClass1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Package1.PackageClass1.class.isAssignableFrom(serviceEndpointInterface)) {
                Package1.PackageClass1SoapBindingStub _stub = new Package1.PackageClass1SoapBindingStub(new java.net.URL(packageClass1_address), this);
                _stub.setPortName(getpackageClass1WSDDServiceName());
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
        if ("packageClass1".equals(inputPortName)) {
            return getpackageClass1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Package1", "packageClass1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Package1", "packageClass1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("packageClass1".equals(portName)) {
            setpackageClass1EndpointAddress(address);
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
