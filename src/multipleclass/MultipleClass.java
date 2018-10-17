package multipleclass;

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
    }
    
    public static void method1(){
        
        System.out.println("Method 1 here!");
    }
    
    public void method2(){
        System.out.println("Method 2 here!");
    }
    
}
