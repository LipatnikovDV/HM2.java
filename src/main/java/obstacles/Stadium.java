package obstacles;

import animals.Participant;

public class Stadium extends Obstacle {

    private int length;

    public Stadium(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant animal) {
        animal.run(length);
    }
}