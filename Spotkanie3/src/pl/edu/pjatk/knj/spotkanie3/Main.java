package pl.edu.pjatk.knj.spotkanie3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main extends Thread {

    int sleepTime;//ms
    CharWriter charWriter;

    public Main(CharWriter target) {
        super(target);
        charWriter = target;
        sleepTime = new Random().nextInt((1000 - 500) + 1) + 500;//ms
    }

    @Override
    public void run() {
        int counter = 0;
        while(isAlive()){
            charWriter.run();
            System.out.println(counter);
            counter++;
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        charWriter.run();
        System.out.println(" thread finished.");
    }

    public static void main(String[] args) {

        CharWriter cw1 = new CharWriter('A'),
                cw2 = new CharWriter('B'),
                cw3 = new CharWriter('C');

        Main m1 = new Main(cw1),
                m2 = new Main(cw2),
                m3 = new Main(cw3);

        Main [] threadArray = {m1, m2, m3};

        LinkedList<Main> threadList = new LinkedList<>(Arrays.asList(threadArray));

        m1.start();
        m2.start();
        m3.start();

        int mainSleepTime = 3000;//ms

        while(true){
            
        }

    }
}
