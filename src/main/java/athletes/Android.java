package athletes;

import java.util.Random;

public class Android implements Athlete {

    private int runLength;
    private int jumpHeight;
    private String name;


    public Android(String name) {
        Random random = new Random();
        runLength = 5+random.nextInt(5);
        jumpHeight = 5+random.nextInt(5);
        this.name = name;
    }

    public Android(String name,int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        this.name = name;
    }

    @Override
    public void Run(int length) {
        System.out.println(name+" бежит "+length + " метров");
    }

    @Override
    public void Jump(int height) {
        System.out.println(name+" прыгает "+height + " метров");
    }

    @Override
    public int getJumpHeiht() {
        return jumpHeight;
    }

    @Override
    public int getRunLength() {
        return runLength;
    }

    @Override
    public String toString() {
        return "Робот ("+runLength+","+jumpHeight+") "+name;
    }
}
