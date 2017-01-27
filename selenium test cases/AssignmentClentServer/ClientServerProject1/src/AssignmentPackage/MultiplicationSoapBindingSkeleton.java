/**
 * MultiplicationSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AssignmentPackage;

public class MultiplicationSoapBindingSkeleton implements AssignmentPackage.Multiplication, org.apache.axis.wsdl.Skeleton {
    private AssignmentPackage.Multiplication impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://AssignmentPackage", "i"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://AssignmentPackage", "j"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mul", _params, new javax.xml.namespace.QName("http://AssignmentPackage", "mulReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://AssignmentPackage", "mul"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mul") == null) {
            _myOperations.put("mul", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mul")).add(_oper);
    }

    public MultiplicationSoapBindingSkeleton() {
        this.impl = new AssignmentPackage.MultiplicationSoapBindingImpl();
    }

    public MultiplicationSoapBindingSkeleton(AssignmentPackage.Multiplication impl) {
        this.impl = impl;
    }
    public int mul(int i, int j) throws java.rmi.RemoteException
    {
        int ret = impl.mul(i, j);
        return ret;
    }

}
