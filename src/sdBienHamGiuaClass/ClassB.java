package sdBienHamGiuaClass;

public class ClassB {
    // Non static
    //// cách 1
    public void  test (){
        ClassA a = new ClassA();
        System.out.println(a.y);
        a.hi();
    }

    //// cách 2
    public void test1 (ClassA a){
        System.out.println(a.y+2);
        a.hi();
    }

    //Static
    public void test2(){
        System.out.println(ClassA.x);
        ClassA.hello();
    }
    // ClassA.hello();
}
