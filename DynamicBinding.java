public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();//向上转型
        System.out.println(a.sum());//?40 -> 30
        System.out.println(a.sum1());//?30-> 20
    }
}
class A {//父类
    public int i = 10;
    //动态绑定机制:
    public int sum() {//父类 sum()
        return getI() + 10;//20 + 10
    }
    public int sum1() {//父类 sum1()
        return i + 10;//10 + 10
    }
    public int getI() {//父类 getI
        return i;
    }
}
class B extends A {//子类
    public int i = 20;
    public int getI() {//子类 getI()
        return i;
    }
}
