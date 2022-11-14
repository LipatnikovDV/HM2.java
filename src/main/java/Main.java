import animals.Cat;
import animals.Dog;
import animals.Mouse;
import obstacles.*;

public class Main {

    public static void main(String[] args) {

        Course c = new Course(
                new Stadium(1000),
                new Wall(3),
                new Pool(250));

        Team team1 = new Team("Кикимора",
                new Cat("Бисквит", 2000, 3, 300),
                new Dog("Бес", 3000, 4, 500),
                new Cat("Чарлик", 2000, 2, 0),
                new Mouse("Джинглс", 50, 1, 100));
        System.out.println();
        team1.getTeamInfo();
        System.out.println();

        c.doIt(team1);
        team1.showResults();
        System.out.println();

        Team team2 = new Team("БЯда",
                new Cat("Жук", 1500, 5, 0),
                new Dog("Хрючево", 3000, 4, 600),
                new Cat("Пушок", 1300, 2, 400),
                new Mouse("Кароста", 1000, 2, 70));
        System.out.println();
        team2.getTeamInfo();
        System.out.println();

        c.doIt(team2);
        team2.showResults();



    }
}
