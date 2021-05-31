package obstacle;

import athletes.Athlete;

import java.util.Random;

public class Wall implements Obstacle{
    private int height;

    public Wall() {
        Random random = new Random();
        height = 2+random.nextInt(5);
    }

    @Override
    public boolean overcome(Athlete athlete) {
        athlete.Jump(height);
        return (athlete.getJumpHeiht()>=height);
    }

    @Override
    public String toString() {
        String suf;
        if (height==1){
            suf = "метр";
        } else if (height==2||height==3||height==4){
            suf = "метра";
        } else {
            suf = "метров";
        }
        return "стену высотой "+height+" "+suf;
    }
}
