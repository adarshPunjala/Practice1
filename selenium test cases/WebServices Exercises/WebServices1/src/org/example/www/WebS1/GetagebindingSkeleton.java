/**
 * GetagebindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.WebS1;

public class GetagebindingSkeleton implements org.example.www.WebS1.WebS1_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.WebS1.WebS1_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAge", _params, new javax.xml.namespace.QName("", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/WebS1/", "get age"));
        _oper.setSoapAction("http://www.example.org/WebS1/get age");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAge") == null) {
            _myOperations.put("getAge", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAge")).add(_oper);
    }

    public GetagebindingSkeleton() {
        this.impl = new org.example.www.WebS1.GetagebindingImpl();
    }

    public GetagebindingSkeleton(org.example.www.WebS1.WebS1_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String getAge(java.lang.String in) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getAge(in);
        return ret;
    }

}
