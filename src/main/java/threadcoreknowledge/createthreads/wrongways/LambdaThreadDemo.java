package threadcoreknowledge.createthreads.wrongways;

/**
 * @Description : lambda表达式创建线程
 * @Author : LiuXinyu
 * @Date: 2020-05-22 23:36
 */
public class LambdaThreadDemo {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
