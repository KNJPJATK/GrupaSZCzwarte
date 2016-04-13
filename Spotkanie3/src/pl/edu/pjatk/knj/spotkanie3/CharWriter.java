package pl.edu.pjatk.knj.spotkanie3;

/**
 * Created by andrew on 07.04.2016.
 */
public class CharWriter implements Runnable{

    private char charToWrite;

    public CharWriter(char charToWrite) {
        this.charToWrite = charToWrite;
    }

    @Override
    public void run() {
        System.out.print(charToWrite);
    }
    
}
