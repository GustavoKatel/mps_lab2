package br.ufpb.cc.mps.lab2.infra;

import java.io.*;

import static java.lang.System.out;

public class BasicFilePersistence<Serializable> implements PersistenceInterface<Serializable> {

    private String filename;

    public BasicFilePersistence(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public void save(Serializable obj) throws PersistenceException {

        ObjectOutputStream out;

        if(filename.equals("")) {
            throw new PersistenceException("Invalid filename");
        }

        try {
            out = new ObjectOutputStream(new FileOutputStream(filename));
        } catch (IOException e) {
            throw new PersistenceException("Error trying to open file: " + e.getMessage());
        }

        try {
            out.writeObject(obj);
        } catch (IOException e) {
            throw new PersistenceException("Error trying to write object: " + e.getMessage());
        }

        try {
            out.close();
        } catch (IOException e) {
            throw new PersistenceException("Error trying to close file: " + e.getMessage());
        }

    }

    @Override
    public Serializable load() throws PersistenceException {
        ObjectInputStream in;
        Serializable obj;

        if(filename.equals("")) {
            throw new PersistenceException("Invalid filename");
        }

        if(!(new File(filename)).exists()) {
            throw new PersistenceException("File does not exist");
        }

        try {
            in = new ObjectInputStream(new FileInputStream(filename));
        } catch (IOException e) {
            throw new PersistenceException("Error trying to open file: " + e.getMessage());
        }

        try {
            obj = (Serializable)  in.readObject();
        } catch (ClassNotFoundException e) {
            throw new PersistenceException("Can't load object from file. Conversion error");
        } catch (IOException e) {
            throw new PersistenceException("Error trying to read file: " + e.getMessage());
        }

        try {
            in.close();
        } catch (IOException e) {
            throw new PersistenceException("Error trying to close file: " + e.getMessage());
        }

        return obj;

    }
}
