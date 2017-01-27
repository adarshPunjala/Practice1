/**
 * WebS1SoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webServices1;

public class WebS1SoapBindingSkeleton implements webServices1.WebS1, org.apache.axis.wsdl.Skeleton {
    private webServices1.WebS1 impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webServices1", "i"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webServices1", "j"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("add", _params, new javax.xml.namespace.QName("http://webServices1", "addReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webServices1", "add"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("add") == null) {
            _myOperations.put("add", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("add")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webServices1", "i"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webServices1", "j"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sub", _params, new javax.xml.namespace.QName("http://webServices1", "subReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webServices1", "sub"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sub") == null) {
            _myOperations.put("sub", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sub")).add(_oper);
    }

    public WebS1SoapBindingSkeleton() {
        this.impl = new webServices1.WebS1SoapBindingImpl();
    }

    public WebS1SoapBindingSkeleton(webServices1.WebS1 impl) {
        this.impl = impl;
    }
    public int add(int i, int j) throws java.rmi.RemoteException
    {
        int ret = impl.add(i, j);
        return ret;
    }

    public int sub(int i, int j) throws java.rmi.RemoteException
    {
        int ret = impl.sub(i, j);
        return ret;
    }

}
