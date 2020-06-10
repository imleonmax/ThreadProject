package threadcoreknowledge.createthreads.wrongways;

/**
 * @Description : 匿名内部类创建线程
 * @Author : LiuXinyu
 * @Date: 2020-05-22 23:32
 */
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程。" + Thread.currentThread().getName());
            }
        }).start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程。" + Thread.currentThread().getName());
            }
        }.start();
    }
}
