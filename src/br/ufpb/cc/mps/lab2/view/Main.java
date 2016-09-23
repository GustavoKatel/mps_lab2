package br.ufpb.cc.mps.lab2.view;

import br.ufpb.cc.mps.lab2.business.control.UserController;
import br.ufpb.cc.mps.lab2.business.model.User;
import br.ufpb.cc.mps.lab2.business.model.exceptions.UserValidationException;
import br.ufpb.cc.mps.lab2.infra.PersistenceException;

public class Main {

    public static void main(String args[]) {

        UserController controller = new UserController();

        try {
            controller.loadUsers();
        } catch (PersistenceException e) {
            e.printStackTrace();
        }

        try {
            controller.saveUser(new User("123", "321"));
        } catch (PersistenceException pe) {
            pe.printStackTrace();
        } catch (UserValidationException e) {
            e.printStackTrace();
        }

    }

}
