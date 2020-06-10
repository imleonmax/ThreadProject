package threadcoreknowledge.startthreads;

/**
 * @Description : start和run启动线程方式比较
 * @Author : LiuXinyu
 * @Date: 2020-05-23 14:00
 */
public class StartAndRunMethod {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName()+"-"+Thread.currentThread().getId());
        };
        runnable.run();

        new Thread(runnable).start();
    }

}
