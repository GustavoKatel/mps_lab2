package br.ufpb.cc.mps.lab2.infra;

public class PersistenceException extends Exception {

    public PersistenceException() {
        super("Error trying to create persistence");
    }

    public PersistenceException(String s) {
        super(s);
    }

}
