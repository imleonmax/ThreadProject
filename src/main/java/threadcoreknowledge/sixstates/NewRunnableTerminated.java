package threadcoreknowledge.sixstates;

/**
 * @Description : 展示线程的NEW、RUNNABLE、TERMINATED.即使是正在运行也是Runnable状态，而不是Running
 * @Author : LiuXinyu
 * @Date: 2020-05-23 19:32
 */
public class NewRunnableTerminated implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new NewRunnableTerminated());
        System.out.println(thread.getState());//NEW
        thread.start();
        System.out.println(thread.getState());//RUNNABLE
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打印出RUNNABLE的状态，即使是正在运行，也是RUNNABLE，而不是RUNNING
        System.out.println(thread.getState());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());//TERMINATED
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
