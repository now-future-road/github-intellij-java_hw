package Task4.creature;

import Task4.move.MoveLogic;
import Task4.sound.SoundLogic;

public class Cow extends Creature {
    // This constructor is NECESSARY to pass the logic to the parent Creature
    public Cow(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Cow";
    }

    public void giveMilk() {
        System.out.println(getName() + " gives milk.");
    }
}
