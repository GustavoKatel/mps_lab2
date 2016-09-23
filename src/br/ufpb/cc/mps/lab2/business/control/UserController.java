package br.ufpb.cc.mps.lab2.business.control;

import br.ufpb.cc.mps.lab2.business.control.validators.DefaultUserValidator;
import br.ufpb.cc.mps.lab2.business.model.User;
import br.ufpb.cc.mps.lab2.business.model.exceptions.UserValidationException;

import java.util.ArrayList;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class UserController {

    private ArrayList<User> users;

    private UserValidator validator;

    public UserController()
    {

        users = new ArrayList<User>();
        validator = new DefaultUserValidator();

    }

    public void setValidator(UserValidator validator) {
        this.validator = validator;
    }

    // create and update
    public void saveUser(User user) throws UserValidationException {

        validator.validate(user);

    }

    // retrieve
    public User findUser(String login) {

        users.forEach(user -> {
            if(user.getLogin().equals(login)) {
                return; user
            }
        });

    }

}
