package cn.sp;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 2YSP on 2019/5/10.
 */
@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message){
        System.out.println("Receive <"+ message+">");
        latch.countDown();
    }

    public CountDownLatch getLatch(){
        return latch;
    }
}
