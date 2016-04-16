package com.epam.ws;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Created by Almas_Doskozhin
 * on 4/10/2016.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RandomNumberGenerator {
    @WebMethod
    int randomNumber(@WebParam(name="lowerBound")int lowerBound, @WebParam(name="upperBound")int upperBound);
}
