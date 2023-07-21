import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        System.out.println("o 的运行类型=" + o.getClass()); //运行类型
        Method method1 = cls.getMethod(methodName);
        System.out.println("=============================");
        method1.invoke(o);
        Field nameField = cls.getField("age"); //
        System.out.println(nameField.get(o));
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);//Cat()
        Constructor constructor2 = cls.getConstructor(String.class);
        System.out.println(constructor2);//Cat(String name)
    }
}
