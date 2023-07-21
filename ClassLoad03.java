public class ClassLoad03 {
    public static void main(String[] args) throws ClassNotFoundException {

clinit() {
System.out.println("B 静态代码块被执行");
num = 100;
}

protected Class<?> loadClass(String name, boolean resolve)
throws ClassNotFoundException
{
synchronized (getClassLoadingLock(name)) {
}
}

        B b = new B();
    }
}
class B {
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }
    static int num = 100;
    public B() {//构造器
        System.out.println("B() 构造器被执行");
    }
}
