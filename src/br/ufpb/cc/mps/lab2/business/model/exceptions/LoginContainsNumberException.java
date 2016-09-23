package br.ufpb.cc.mps.lab2.business.model.exceptions;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class LoginContainsNumberException extends UserValidationException {

    public LoginContainsNumberException() {
        super("Login cannot contain number");
    }

    public LoginContainsNumberException(String msg) {
        super(msg);
    }

}
