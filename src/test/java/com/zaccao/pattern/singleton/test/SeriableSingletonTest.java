package com.zaccao.pattern.singleton.test;

import com.zaccao.pattern.singleton.serialization.SerializationSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SeriableSingletonTest {
    public static void main(String[] args) {

        SerializationSingleton s1 = null;
        SerializationSingleton s2 = SerializationSingleton.getInstance();

        FileOutputStream fos = null;
        try {

            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializationSingleton)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
