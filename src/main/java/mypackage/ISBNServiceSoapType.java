/**
 * ISBNServiceSoapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface ISBNServiceSoapType extends java.rmi.Remote {

    /**
     * The test is done by calculation on the first 12 digits and
     * compare the result with the checksum number at the end. You have to
     * pass a 13 digits number.
     */
    public boolean isValidISBN13(java.lang.String sISBN) throws java.rmi.RemoteException;

    /**
     * The test is done by calculation on the first 9 digits and compare
     * the result with the checksum number at the end. You have to pass a
     * 10 digits number or 8 digits and an X.
     */
    public boolean isValidISBN10(java.lang.String sISBN) throws java.rmi.RemoteException;
}
