package org.example2;


import org.example2.annotations.MyClass2;
import org.example2.annotations.MyClass2Builder;

public class Main {
    public static void main(String[] args) {

        MyClass2Builder myClass2Builder = null;
        System.out.println(myClass2Builder);

        MyClass2 myClass2 = MyClass2Builder.builder().build();
        System.out.println(myClass2);
    }

}
