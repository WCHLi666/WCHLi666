public class Override_ {
    public static void main(String[] args) {
    }
}
class Father{//父类
    public void fly(){
        System.out.println("Father fly...");
    }
    public void say(){}
}
class Son extends Father {//子类
    @Override
    public void fly() {
        System.out.println("Son fly....");
    }
    @Override
    public void say() {}
}
