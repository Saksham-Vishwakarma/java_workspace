class Parent
{
    void show()
    {
        System.out.println("this is child class");
    }
}
class Child extends Parent
{
    void show()
    {
        System.out.println("this is parent class");
    }
}

public class Inheritance extends Child{
    static void main() {
        Parent objp = new Parent();
        Child objc = new Child();
        objp.show();
        objc.show();
    }

}
