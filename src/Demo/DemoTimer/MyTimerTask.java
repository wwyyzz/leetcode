package Demo.DemoTimer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

/**
 * @program: leetcode
 * @description: DemoTimer
 * @author: Jun Wang
 * @create: 2018-12-27 14:00
 */
public class MyTimerTask extends TimerTask {
    private String name;
    private Integer count = 0;

    public MyTimerTask(String inputName){
        name = inputName;
    }

    @Override
    public void run() {
        if (count < 3) {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            System.out.println("Current exec time is:" + sf.format(calendar.getTime()));
            System.out.println("Current exec name is :" + name);
            count++;
        }else {
            cancel();
            System.out.println("Task cancel!");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
