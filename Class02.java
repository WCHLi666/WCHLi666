import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchFieldException {
        String classAllPath = "com.hspedu.Car";
        Class<?> cls = Class.forName(classAllPath);
        System.out.println(cls);
        System.out.println(cls.getClass());//输出 cls 运行类型 java.lang.Class
        System.out.println(cls.getPackage().getName());//包名
        System.out.println(cls.getName());
        Car car = (Car) cls.newInstance();
        System.out.println(car);//car.toString()
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));//宝马
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));//奔驰
        System.out.println("=======所有的字段属性====");
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());//名称
        }
    }
}
