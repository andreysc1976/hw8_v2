package obstacle;

import athletes.Athlete;

import java.util.Random;

public class Treadmill implements Obstacle{
    private int length;

    public Treadmill() {
        Random random = new Random();
        length = 2+random.nextInt(7);
    }

    @Override
    public boolean overcome(Athlete athlete) {
        athlete.Run(length);
        return (athlete.getRunLength()>=length);
    }

    @Override
    public String toString() {
        String suf;
        if (length==1){
            suf = "метр";
        } else if (length==2||length==3||length==4){
            suf = "метра";
        } else {
            suf = "метров";
        }
        return "беговую дорожку длиной "+length+" "+suf;
    }
}
