import athletes.Android;
import athletes.Athlete;
import athletes.Cat;
import athletes.Human;
import obstacle.ObstacleCourse;

public class Main
{
    public static void main(String[] args) {
        Athlete[] athletes = {
                new Cat("Васька"),
                new Cat("Мурзик",5,4),
                new Human("Петя"),
                new Human("Иван"),
                new Android("Вертер"),
                new Android("Т-1000",5,7)
        };
        ObstacleCourse obstacleCourse = new ObstacleCourse();//создадим полосу предпятствий
        for (int i = 0; i <athletes.length ; i++) {
            if (obstacleCourse.comeTo(athletes[i])) {
                System.out.println(athletes[i]+" справился");
            } else {
                System.out.println(athletes[i]+" не справился");
            }
        }
    }
}
