public class Final01 {
    public static void main(String[] args) {
        E e = new E();
    }
}
final class A { }
class C {
    public final void hi() {}
}
class D extends C {
}
class E {
    public final double TAX_RATE = 0.08;
}
class F {
    public void cry() {
        final double NUM = 0.01;
        System.out.println("NUM=" + NUM);
    }
}
