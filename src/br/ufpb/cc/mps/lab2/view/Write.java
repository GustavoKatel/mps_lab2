package br.ufpb.cc.mps.lab2.view;

import br.ufpb.cc.mps.lab2.business.control.UserController;
import br.ufpb.cc.mps.lab2.business.model.User;
import br.ufpb.cc.mps.lab2.business.model.exceptions.UserValidationException;
import br.ufpb.cc.mps.lab2.infra.PersistenceException;

public class Write {

    public static void main(String args[]) {

        UserController controller = new UserController();

        try {
            controller.saveUser(new User("abc", "a987654321"));
        } catch (PersistenceException pe) {
            pe.printStackTrace();
        } catch (UserValidationException e) {
            e.printStackTrace();
        }

    }

}
