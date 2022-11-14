package animals;

public abstract class Animal implements Participant {

    private String nameOfParticipant;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;
    private boolean onDistance;

    public Animal(String nameOfParticipant, int maxRunDistance,
                  int maxJumpHeight, int maxSwimDistance) {
        this.nameOfParticipant = nameOfParticipant;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public String getNameOfParticipant() {
        return this.nameOfParticipant;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.printf("%s успешно пробежал кросс\n", nameOfParticipant);
        } else {
            System.out.printf("%s не справился с кроссом\n", nameOfParticipant);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.printf("%s успешно перепрыгнул стену\n", nameOfParticipant);
        } else {
            System.out.printf("%s не справился с прыжком\n", nameOfParticipant);
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.printf("%s не умеет плавать\n", nameOfParticipant);
            onDistance = false;
        } else if (distance <= maxSwimDistance) {
            System.out.printf("%s успешно переплыл\n", nameOfParticipant);
        } else {
            System.out.printf("%s не смог переплыть\n", nameOfParticipant);
            onDistance = false;
        }
    }

    @Override
    public String toString() {
        return nameOfParticipant + " : " + (isOnDistance() ? "на дистанции" : "сошел с дистанции");
    }
}
