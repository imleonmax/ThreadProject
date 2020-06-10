package threadcoreknowledge.createthreads;


/**
 * @Description : 同时使用Runnable和Thread
 * @Author : LiuXinyu
 * @Date: 2020-05-22 22:22
 */
public class BothRunnableThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我来自Runnable。");
            }
        }) {
            @Override
            public void run() {
                System.out.println("我来自Thread类。");
            }
        }.start();
    }
}
