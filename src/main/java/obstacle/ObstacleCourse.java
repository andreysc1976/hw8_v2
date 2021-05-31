package obstacle;

import athletes.Athlete;

import java.util.Random;

public class ObstacleCourse {
    private Obstacle[] obstacles;

    public ObstacleCourse() {
        Random random = new Random();
        int count = 3+random.nextInt(5);
        obstacles = new Obstacle[count];
        for (int i = 0; i <count ; i++) {
            if (random.nextInt(2)==1){
                obstacles[i] = new Wall();
            } else {
                obstacles[i] = new Treadmill();
            }
        }
    }

    public boolean comeTo(Athlete athlete){
        for (int i = 0; i <obstacles.length ; i++) {
            boolean result = obstacles[i].overcome(athlete);
            if (!result) {
                System.out.print(athlete+" ");
                System.out.println("не смог преодалеть "+obstacles[i]);
                return false;
            } else {
                System.out.print(athlete+" ");
                System.out.println("успешно преодалел "+obstacles[i]);
            }
        }
        return true;
    }
}
