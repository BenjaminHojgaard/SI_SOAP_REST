package com.example.demo.service;

import mypackage.ISBNServiceLocator;
import mypackage.ISBNServiceSoapType;
import org.springframework.hateoas.EntityModel;

import java.util.Arrays;

public  class SOAPISBNService {

    public static boolean isValid(String isbn) {

        boolean success = false;

        try {

            ISBNServiceLocator locator = new ISBNServiceLocator();
            ISBNServiceSoapType serviceSoapType = locator.getISBNServiceSoap();

            success = serviceSoapType.isValidISBN13(isbn);

            System.out.println(success);


        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        return success;
    }



}
