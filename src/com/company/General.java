package com.company;

import java.io.*;
import java.util.Base64;

public class General implements Serializable {

    public <T> T copy() {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStrm = new ObjectOutputStream(outputStream);
            outputStrm.writeObject((T) this);
            outputStrm.close();
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
            return (T) objInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String serialize() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
        return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
    }

    public static <T> T deserialize(String s) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data));
        T o = (T) objectInputStream.readObject();
        objectInputStream.close();
        return o;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public boolean checkType(Class<?> cls) {
        return this.getType() == cls;
    }

    public Class<?> getType() {
        return super.getClass();
    }

    public<T, S> void assignmentAttempt(T target, S source) {
        if(target.getClass() == source.getClass()) {
            target = (T) source;
        } else {
            target = null;
        }
    }
}

class Any extends General {
    public<T, S> void assignmentAttempt(T target, S source) {
        if(target.getClass() == source.getClass()) {
            target = (T) source;
        } else {
            target = null;
        }
    }
}

