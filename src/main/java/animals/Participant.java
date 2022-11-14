package animals;

public interface Participant {

    String getNameOfParticipant();

    boolean isOnDistance();

    void run(int distance);

    void jump(int height);

    void swim(int distance);
}
