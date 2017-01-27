/**
 * SummasionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Bottom.Up.Package;

public class SummasionServiceLocator extends org.apache.axis.client.Service implements Bottom.Up.Package.SummasionService {

    public SummasionServiceLocator() {
    }


    public SummasionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SummasionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Summasion
    private java.lang.String Summasion_address = "http://localhost:8080/BotomUpApproach/services/Summasion";

    public java.lang.String getSummasionAddress() {
        return Summasion_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SummasionWSDDServiceName = "Summasion";

    public java.lang.String getSummasionWSDDServiceName() {
        return SummasionWSDDServiceName;
    }

    public void setSummasionWSDDServiceName(java.lang.String name) {
        SummasionWSDDServiceName = name;
    }

    public Bottom.Up.Package.Summasion getSummasion() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Summasion_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSummasion(endpoint);
    }

    public Bottom.Up.Package.Summasion getSummasion(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Bottom.Up.Package.SummasionSoapBindingStub _stub = new Bottom.Up.Package.SummasionSoapBindingStub(portAddress, this);
            _stub.setPortName(getSummasionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSummasionEndpointAddress(java.lang.String address) {
        Summasion_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Bottom.Up.Package.Summasion.class.isAssignableFrom(serviceEndpointInterface)) {
                Bottom.Up.Package.SummasionSoapBindingStub _stub = new Bottom.Up.Package.SummasionSoapBindingStub(new java.net.URL(Summasion_address), this);
                _stub.setPortName(getSummasionWSDDServiceName());
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
        if ("Summasion".equals(inputPortName)) {
            return getSummasion();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Package.Up.Bottom", "SummasionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Package.Up.Bottom", "Summasion"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Summasion".equals(portName)) {
            setSummasionEndpointAddress(address);
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
