package br.ufpb.cc.mps.lab2.business.model.exceptions;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class PasswordSizeUnderLimitException extends UserValidationException {

    public PasswordSizeUnderLimitException() {
        super("Minimum password size was not satisfied");
    }

    public PasswordSizeUnderLimitException(String msg) {
        super(msg);
    }

}
