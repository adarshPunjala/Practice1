/**
 * BankPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.TestCase1;

public interface BankPort extends javax.xml.rpc.Service {
    public java.lang.String getTestCase1SOAPAddress();

    public org.example.www.TestCase1.BankPortType getTestCase1SOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.TestCase1.BankPortType getTestCase1SOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
