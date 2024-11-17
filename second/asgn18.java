package Assgn.second;

interface Interface1 {
    void method1A();
    void method1B();
}

interface Interface2 {
    void method2A();
    void method2B();
}

interface Interface3 {
    void method3A();
    void method3B();
}

interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

class ConcreteClass {
    void concreteClassMethod() {
        System.out.println("Method from the concrete class.");
    }
}

class MyClass extends ConcreteClass implements CombinedInterface {
    public void method1A() { System.out.println("method1A"); }
    public void method1B() { System.out.println("method1B"); }
    public void method2A() { System.out.println("method2A"); }
    public void method2B() { System.out.println("method2B"); }
    public void method3A() { System.out.println("method3A"); }
    public void method3B() { System.out.println("method3B"); }
    public void newMethod() { System.out.println("newMethod"); }
}
public class asgn18 {
    public static void methodTakingInterface1(Interface1 i) { i.method1A(); i.method1B(); }
    public static void methodTakingInterface2(Interface2 i) { i.method2A(); i.method2B(); }
    public static void methodTakingInterface3(Interface3 i) { i.method3A(); i.method3B(); }
    public static void methodTakingCombinedInterface(CombinedInterface i) { i.newMethod(); }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        methodTakingInterface1(myObject);
        methodTakingInterface2(myObject);
        methodTakingInterface3(myObject);
        methodTakingCombinedInterface(myObject);
        myObject.concreteClassMethod();
    }
}

