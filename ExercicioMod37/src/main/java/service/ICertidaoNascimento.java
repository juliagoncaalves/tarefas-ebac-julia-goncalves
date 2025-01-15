package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

// Service Endpoint Interface (SEI)
@WebService
@SOAPBinding(style = Style.RPC)
public interface ICertidaoNascimento {

    @WebMethod
    int calcularIdade(String idade);

    @WebMethod
    String diaSemanaNascimento(String idade);

}
