package threadcoreknowledge.createthreads;

/**
 * @Description : 继承Thread类实现线程
 * @Author : LiuXinyu
 * @Date: 2020-05-22 22:11
 */
public class ThreadStyle extends Thread {
    public static void main(String[] args) {
        new ThreadStyle().start();
    }

    @Override
    public void run() {
        System.out.println("Thread类创建线程。");
    }
}
