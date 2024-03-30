package org.example2;


//import org.example.MyClassBuilder;

import org.example.builder.Builder;

public class Main {
    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();

        org.example.MyClass myClass1 = null;
        System.out.println(myClass1);

        Builder generator = null;
        System.out.println(generator);

        MyClass2Builder myClass2Builder = null;
        System.out.println(myClass2Builder);


//        MyClassBuilder my = new MyClassBuilder();
//        System.out.println(my);

//        MyClass myClass1 = new MyClass();
//        System.out.println(myClass1.getA());
    }

}
