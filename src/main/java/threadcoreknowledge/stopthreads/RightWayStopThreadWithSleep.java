package threadcoreknowledge.stopthreads;

/**
 * @Description : run方法带有有sleep和wait方法时停止线程
 * @Author : LiuXinyu
 * @Date: 2020-05-23 15:13
 */
public class RightWayStopThreadWithSleep{


    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            int num = 0;
            try {
                while (!Thread.currentThread().isInterrupted() && num < 300) {
                    if (num % 100 == 0) {
                        System.out.println(num + "是100的倍数");
                    }
                    num++;
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }
}
