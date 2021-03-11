package com.company;

import java.io.*;
import java.util.Base64;

public class General implements Serializable {
    private static final long serialVersionUID = 64338523774886977L;

    final String name;
    final int age;

    public General(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        oos.close();
        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }

    public static <T> T deserialize(String s) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
        T o = (T) ois.readObject();
        ois.close();
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
}

//class Any extends General {
//
//}

