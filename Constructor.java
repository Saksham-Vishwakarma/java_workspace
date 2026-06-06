public class Constructor {
    Constructor()
    {
        System.out.println("no arg");
    }
    Constructor(int age)
    {
        System.out.println("arg passed, age:" + age);
    }
    Constructor(int age, String name)
    {
        System.out.println("args passed, age:" + age + ", name:" + name);
    }

    static void main() {
        new Constructor();
        new Constructor(17);
        new Constructor(17, "saksahm");
    }
}
