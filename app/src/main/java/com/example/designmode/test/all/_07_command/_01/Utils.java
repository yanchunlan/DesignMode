package com.example.designmode.test.all._07_command._01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Utils {
    /**
     * 序列化订单对象
     */
    public static void serializable(String name,
                                    List<ICommand> commandList) {
        // 序列化对象的流
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(
                    new File("C:\\Users\\Public\\Desktop\\" + name + ".txt")));
            outputStream.writeObject(commandList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static List<ICommand> deserialize(String name) {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(
                    new File("C:\\Users\\Public\\Desktop\\"
                            + name + ".txt")));
            Object readObject = objectInputStream.readObject();
            return (List<ICommand>) readObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}