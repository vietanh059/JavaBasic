package sdBienHamGiuaClass;

public class MainTest {
    public static void main(String[] args) {
        // Non static
        ClassB b = new ClassB();
        ////c1
        b.test();

        ////c2
        ClassA a = new ClassA();
        b.test1(a);

        // static

        b.test2();

        System.out.println(ClassA.x);
        ClassA.hello();

    }
}
