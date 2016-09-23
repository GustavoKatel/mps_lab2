package br.ufpb.cc.mps.lab2.business.model.exceptions;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class LoginSizeExceededException extends UserValidationException {

    public LoginSizeExceededException() {
        super("Maximum login size exceeded");
    }

    public LoginSizeExceededException(String msg) {
        super(msg);
    }

}
