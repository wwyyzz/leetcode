package Demo.DemoTimer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * @program: leetcode
 * @description: DemoTimer
 * @author: Jun Wang
 * @create: 2018-12-27 14:03
 */
public class MyTimer {

    public static void main(String[] args) {
        Timer timer = new Timer();

        MyTimerTask myTimerTask = new MyTimerTask("No.1");

//        timer.schedule(myTimerTask, 2000L, 1000L);
//      1.  schedule(task, time)       具体的时间time执行一次
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(calendar.getTime()));

        calendar.add(Calendar.SECOND, 3);
//        timer.schedule(myTimerTask, calendar.getTime());

//      2.  schedule(task, time，period)   时间到time时首次执行task，之后每隔period重复执行
        myTimerTask.setName("schedule2");
//        timer.schedule(myTimerTask,calendar.getTime(),2000);

//      3.  等待delay时间执行一次tas
        myTimerTask.setName("schedule3");
//        timer.schedule(myTimerTask,2000);

//      4.  schedule(task, delay, peroid)   等待delay时间执行一次task ,  之后每隔period重复执行
        myTimerTask.setName("schedule4");
//        timer.schedule(myTimerTask,3000,2000);

//      1.  schduleAtFixedRate(task, time, period)    等待delay时间执行一次task ,  之后每隔period重复执行

        myTimerTask.setName("scheduleAtFixedRate1");
//        timer.scheduleAtFixedRate(myTimerTask, calendar.getTime(), 2000);

//      2.  schduleAtFixedRate(task, delay, period)    等待delay时间执行一次task ,  之后每隔period重复执行

        myTimerTask.setName("scheduleAtFixedRate2");
        timer.schedule(myTimerTask, 3000);

        System.out.println("schedule time is:" + sf.format(myTimerTask.scheduledExecutionTime()));
    }



}
