/**
 * ASMDClassSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Practise;

public class ASMDClassSoapBindingSkeleton implements Practise.ASMDClass, org.apache.axis.wsdl.Skeleton {
    private Practise.ASMDClass impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://Practise", "i"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://Practise", "j"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("add", _params, new javax.xml.namespace.QName("http://Practise", "addReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://Practise", "add"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("add") == null) {
            _myOperations.put("add", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("add")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://Practise", "i"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://Practise", "j"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mul", _params, new javax.xml.namespace.QName("http://Practise", "mulReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://Practise", "mul"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mul") == null) {
            _myOperations.put("mul", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mul")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://Practise", "i"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://Practise", "j"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sub", _params, new javax.xml.namespace.QName("http://Practise", "subReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://Practise", "sub"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sub") == null) {
            _myOperations.put("sub", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sub")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://Practise", "i"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://Practise", "j"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("div", _params, new javax.xml.namespace.QName("http://Practise", "divReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://Practise", "div"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("div") == null) {
            _myOperations.put("div", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("div")).add(_oper);
    }

    public ASMDClassSoapBindingSkeleton() {
        this.impl = new Practise.ASMDClassSoapBindingImpl();
    }

    public ASMDClassSoapBindingSkeleton(Practise.ASMDClass impl) {
        this.impl = impl;
    }
    public int add(int i, int j) throws java.rmi.RemoteException
    {
        int ret = impl.add(i, j);
        return ret;
    }

    public int mul(int i, int j) throws java.rmi.RemoteException
    {
        int ret = impl.mul(i, j);
        return ret;
    }

    public int sub(int i, int j) throws java.rmi.RemoteException
    {
        int ret = impl.sub(i, j);
        return ret;
    }

    public int div(int i, int j) throws java.rmi.RemoteException
    {
        int ret = impl.div(i, j);
        return ret;
    }

}
