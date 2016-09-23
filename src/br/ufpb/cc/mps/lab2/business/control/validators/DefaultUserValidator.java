package br.ufpb.cc.mps.lab2.business.control.validators;

import br.ufpb.cc.mps.lab2.business.control.UserValidator;
import br.ufpb.cc.mps.lab2.business.model.User;
import br.ufpb.cc.mps.lab2.business.model.exceptions.*;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class DefaultUserValidator implements UserValidator {

    public boolean validate(User user) throws UserValidationException {

        if(user.getLogin().isEmpty()) {
            throw new EmptyLoginException();
        }

        if(user.getLogin().length() > 20) {
            throw new LoginSizeExceededException();
        }

        if(user.getLogin().matches(".*\\d.*")) {
            throw new LoginContainsNumberException();
        }

        if(user.getSenha().length() > 12) {
            throw new PasswordSizeExceededException();
        }

        if(user.getSenha().length() < 8) {
            throw new PasswordSizeUnderLimitException();
        }

        if(!user.getSenha().matches(".*[a-zA-Z].*") ||
                user.getSenha().matches(".*\\d.*") // numbers
                )
        {
            throw new InvalidPasswordFormatException();
        }

        return true;
    }

}
