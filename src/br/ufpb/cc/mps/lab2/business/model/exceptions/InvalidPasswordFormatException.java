package br.ufpb.cc.mps.lab2.business.model.exceptions;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class InvalidPasswordFormatException extends UserValidationException {

    public InvalidPasswordFormatException() {
        super("Invalid password format");
    }

    public InvalidPasswordFormatException(String msg) {
        super(msg);
    }

}
