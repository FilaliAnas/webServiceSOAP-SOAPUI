package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Calculatrice {

    public int sum(@WebParam int a , @WebParam int b){
        return a+b;
    }

    @WebMethod
    public int inversion(@WebParam int a){
        return -a;
    }

}
