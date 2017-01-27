/**
 * WebS1Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webServices1;

public interface WebS1Service extends javax.xml.rpc.Service {
    public java.lang.String getWebS1Address();

    public webServices1.WebS1 getWebS1() throws javax.xml.rpc.ServiceException;

    public webServices1.WebS1 getWebS1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
