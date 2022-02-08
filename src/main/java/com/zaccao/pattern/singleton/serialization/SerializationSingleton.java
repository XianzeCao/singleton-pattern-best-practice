package com.zaccao.pattern.singleton.serialization;

import java.io.Serializable;



public class SerializationSingleton implements Serializable {


    //序列化
    //把内存中对象的状态转换为字节码的形式
    //把字节码通过IO输出流，写到磁盘上
    //永久保存下来，持久化

    //反序列化
    //将持久化的字节码内容，通过IO输入流读到内存中来
    //转化成一个Java对象


    public  final static SerializationSingleton INSTANCE = new SerializationSingleton();
    private SerializationSingleton(){}

    public static SerializationSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){ return INSTANCE;}

}
