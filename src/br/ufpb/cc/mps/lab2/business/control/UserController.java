package br.ufpb.cc.mps.lab2.business.control;

import br.ufpb.cc.mps.lab2.business.control.validators.DefaultUserValidator;
import br.ufpb.cc.mps.lab2.business.model.User;
import br.ufpb.cc.mps.lab2.business.model.exceptions.UserValidationException;
import br.ufpb.cc.mps.lab2.infra.BasicFilePersistence;
import br.ufpb.cc.mps.lab2.infra.PersistenceException;
import br.ufpb.cc.mps.lab2.infra.PersistenceInterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class UserController {

    private ArrayList<User> users;

    private UserValidator validator;

    private PersistenceInterface<ArrayList<User>> persistence;

    public UserController() {

        users = new ArrayList<User>();
        validator = new DefaultUserValidator();

        persistence = new BasicFilePersistence<>("data.bin");

    }

    public void setValidator(UserValidator validator) {
        this.validator = validator;
    }

    public void loadUsers() throws PersistenceException {
        users = (ArrayList<User>) persistence.load();
    }

    // create and update
    public void saveUser(User user) throws UserValidationException, PersistenceException {

        validator.validate(user);

        Iterator<User> it = users.iterator();
        User userAux = null;
        int index=0;
        while(it.hasNext()) {
            userAux = it.next();
            if(userAux.getLogin().equals(user.getLogin())) {
                users.set(index, user);
                break;
            }
            index++;
        }

        if(index == users.size()) {
            users.add(user);
        }

        persistence.save(users);

    }

    public PersistenceInterface<ArrayList<User>> getPersistence() {
        return persistence;
    }

    public void setPersistence(PersistenceInterface<ArrayList<User>> persistence) {
        this.persistence = persistence;
    }

    // retrieve
    public User findUser(String login) {

        Iterator<User> it = users.iterator();
        User user = null;
        while(it.hasNext()) {
            user = it.next();
            if(user.getLogin().equals(login)) {
                return user;
            }
        }

        return null;

    }

    // delete
    public boolean deleteUser(String login) throws PersistenceException {

        Iterator<User> it = users.iterator();
        User user = null;
        while(it.hasNext()) {
            user = it.next();
            if(user.getLogin().equals(login)) {
                it.remove();
                persistence.save(users);
                return true;
            }
        }

        persistence.save(users);
        return false;

    }

}
