import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class CglibProxyDemo {
    static class Target{
        public void foo(){
            System.out.println("target foo");
        }
    }

    public static void main(String[] args) {
        Object proxy = Enhancer.create(Target.class, (MethodInterceptor)(p, method, args, methodProxy) ->{
            System.out.println("before...");
            Object result = method.invoke(target, args);
            System.out.println("after...");
        });

        proxy.foo();
    }
}
