package br.ufpb.cc.mps.lab2.business.control;

import br.ufpb.cc.mps.lab2.business.model.User;
import br.ufpb.cc.mps.lab2.business.model.exceptions.UserValidationException;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public interface UserValidator {

    public boolean validate(User user) throws UserValidationException;

}
