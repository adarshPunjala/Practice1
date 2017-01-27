/**
 * WebS1SoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webServices1;

public class WebS1SoapBindingImpl implements webServices1.WebS1{
    public int add(int i, int j) throws java.rmi.RemoteException {
        int k = i+j;
        return k;
    }

    public int sub(int i, int j) throws java.rmi.RemoteException {
        return -3;
    }

}
