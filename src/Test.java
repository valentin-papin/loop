import org.fusesource.jansi.Ansi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import static org.fusesource.jansi.Ansi.ansi;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Date start = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");

//        while(true){
//            Thread.sleep(2000);
//            System.out.print(ansi().saveCursorPosition());
//            Thread.sleep(2000);
//            System.out.print(ansi().restoreCursorPosition());
//        }
        System.out.println("Lancement");

        while(true){

            //get current date time with Date()
            Date now = new Date();
            long diff = now.getTime() - start.getTime();
            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;

            Out.println(String.format("[%s] : %02dh%02dm%02ds de fonctionnement", dateFormat.format(now), diffHours, diffMinutes, diffSeconds), Ansi.Color.GREEN);

            //System.out.println(dateFormat.format(date));

            Thread.sleep(2000);
        }
    }
}
