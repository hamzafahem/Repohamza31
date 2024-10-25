package com.example.jeeg3webservice.webService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class CalculWebService {
    @WebMethod
    public Integer somme(Integer a, Integer b) {
        return a + b;
    }
    @WebMethod
    public Double produit(Double a, Double b) {
        return a * b;
    }
    @WebMethod
    public Integer multiplication(Integer a, Integer b) {
        return a * b;
    }
    @WebMethod
    public Double soustraction(Double a, Double b) {
        return a - b;
    }
    @WebMethod
    public Double division(Double a, Double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("La division par zéro n'est pas permise.");
        }
    }
}
