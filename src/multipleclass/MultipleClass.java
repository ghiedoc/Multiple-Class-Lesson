package multipleclass;

import henyo.Eat;
import henyo.Henyo;

public class MultipleClass {

    public static void main(String[] args) {
        //instantiation
        MultipleClass oneClass = new MultipleClass();
        oneClass.method2();
        
        //method with static
        method1();
        MultipleClass.method1();
        
        //from other class
        Plant hello = new Plant();
        hello.HelloPlant();
        
        System.out.println("Henyo Class:");
        Henyo henyo = new Henyo();
        henyo.method1();
        
        Eat eat = new Eat();
        eat.method3();
    }
    
    public static void method1(){
        
        System.out.println("Method 1 here!");
    }
    
    public void method2(){
        System.out.println("Method 2 here!");
    }
    
}
