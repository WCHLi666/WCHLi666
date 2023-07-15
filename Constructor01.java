public class Constructor01 {
    public static void main(String[] args) {
        Person p1 = new Person("smith", 80);
        System.out.println("p1 的信息如下");
        System.out.println("p1 对象 name=" + p1.name);//smith
        System.out.println("p1 对象 age=" + p1.age);//80
    }
}
class Person {
    String name;
    int age;
    public Person(String pName, int pAge) {
        System.out.println("构造器被调用~~ 完成对象的属性初始化");
        name = pName;
        age = pAge;
    }
}