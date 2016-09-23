package br.ufpb.cc.mps.lab2.business.model.exceptions;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class EmptyLoginException extends UserValidationException {

    public EmptyLoginException() {
        super("Empty login was supplied");
    }

    public EmptyLoginException(String msg) {
        super(msg);
    }

}
