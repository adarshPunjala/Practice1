/**
 * BankBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.TestCase1;

public class BankBindingSkeleton implements org.example.www.TestCase1.BankPortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.TestCase1.BankPortType impl;
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
        _oper = new org.apache.axis.description.OperationDesc("eligibility", _params, new javax.xml.namespace.QName("", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/TestCase1/", "Eligibility"));
        _oper.setSoapAction("http://www.example.org/TestCase1/NewOperation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("eligibility") == null) {
            _myOperations.put("eligibility", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("eligibility")).add(_oper);
    }

    public BankBindingSkeleton() {
        this.impl = new org.example.www.TestCase1.BankBindingImpl();
    }

    public BankBindingSkeleton(org.example.www.TestCase1.BankPortType impl) {
        this.impl = impl;
    }
    public java.lang.String eligibility(java.lang.String in) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.eligibility(in);
        return ret;
    }

}
