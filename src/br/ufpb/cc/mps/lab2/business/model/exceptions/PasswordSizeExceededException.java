package br.ufpb.cc.mps.lab2.business.model.exceptions;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class PasswordSizeExceededException extends UserValidationException {

    public PasswordSizeExceededException() {
        super("Maximum password size exceeded");
    }

    public PasswordSizeExceededException(String msg) {
        super(msg);
    }

}
