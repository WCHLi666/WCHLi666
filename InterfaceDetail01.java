public class InterfaceDetail01 {
    public static void main(String[] args) {
    }
}
interface IA {
    void say();//修饰符 public protected 默认 private
    void hi();
}
class Cat implements IA{
    @Override
    public void say() {
    }
    @Override
    public void hi() {
    }
}
abstract class Tiger implements IA {

}
