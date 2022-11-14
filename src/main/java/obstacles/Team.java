package obstacles;

import animals.Cat;
import animals.Dog;
import animals.Mouse;
import animals.Participant;

public class Team {
    private String teamName;
    private Participant participants[] ;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, Participant ... participantsGiven ) {
        this.teamName = teamName;
        this.participants = participantsGiven;
    }

    public void getTeamInfo() {
        System.out.println("Команда: " + this.teamName);
        for (Participant participant : participants) {
            if (participant instanceof Dog) {
                System.out.println("Собака " + participant.getNameOfParticipant());
            }
            if (participant instanceof Cat) {
                System.out.println("Кот " + participant.getNameOfParticipant());
            }
            if (participant instanceof Mouse) {
                System.out.println("Мыш " + participant.getNameOfParticipant());
            }
        }
    }

    public void showResults(){
        for (Participant participant : participants) {
            if (!participant.isOnDistance()) {
                break;
            }
        }
    }
    public void doIt(Obstacle obstacle){
        for (Participant participant : participants) {
            obstacle.doIt(participant);
            if (!participant.isOnDistance()) {
                break;
            }
        }
    }



}
