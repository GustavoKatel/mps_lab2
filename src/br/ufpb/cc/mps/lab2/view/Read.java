package br.ufpb.cc.mps.lab2.view;

import br.ufpb.cc.mps.lab2.business.control.UserController;
import br.ufpb.cc.mps.lab2.business.model.User;
import br.ufpb.cc.mps.lab2.business.model.exceptions.UserValidationException;
import br.ufpb.cc.mps.lab2.infra.PersistenceException;

public class Read {

    public static void main(String args[]) {

        UserController controller = new UserController();

        try {
            controller.loadUsers();
            System.out.println(controller.findUser("abc"));
        } catch (PersistenceException e) {
            e.printStackTrace();
        }

    }

}
