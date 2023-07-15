public class DeadLock {
    public static void main(String[] args) {
        DeadLockDemo A = new DeadLockDemo(true);
        A.setName("A 线程");
        DeadLockDemo B = new DeadLockDemo(false);
        B.setName("B 线程");
        A.start();
        B.start();
    }
}
class DeadLockDemo extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;
    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }
    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + " 进入 1");
                synchronized (o2) { // 这里获得 li 对象的监视权
                    System.out.println(Thread.currentThread().getName() + " 进入 2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " 进入 3");
                synchronized (o1) { // 这里获得 li 对象的监视权
                    System.out.println(Thread.currentThread().getName() + " 进入 4");
                }
            }
        }
    }
}
