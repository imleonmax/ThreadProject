package threadcoreknowledge.createthreads;

/**
 * @Description : 用Runnable方式创建线程
 * @Author : LiuXinyu
 * @Date: 2020-05-22 22:02
 */
public class RunnableStyle implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Runnable方法创建线程。");
    }
}
