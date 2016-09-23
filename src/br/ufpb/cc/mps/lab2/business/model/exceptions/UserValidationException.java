package br.ufpb.cc.mps.lab2.business.model.exceptions;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class UserValidationException extends Exception {

    public UserValidationException() {
        super("Invalid user");
    }

    public UserValidationException(String msg) {
        super(msg);
    }

}
