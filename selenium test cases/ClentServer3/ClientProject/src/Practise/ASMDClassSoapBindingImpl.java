/**
 * ASMDClassSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Practise;

public class ASMDClassSoapBindingImpl implements Practise.ASMDClass{
    public int add(int i, int j) throws java.rmi.RemoteException {
        int result = i+j;
    	return result;
    }

    public int mul(int i, int j) throws java.rmi.RemoteException {
    	int result = i-j;
    	return result;
    }

    public int sub(int i, int j) throws java.rmi.RemoteException {
    	int result = i*j;
    	return result;
    }

    public int div(int i, int j) throws java.rmi.RemoteException {
    	int result = i/j;
    	return result;
    }

}