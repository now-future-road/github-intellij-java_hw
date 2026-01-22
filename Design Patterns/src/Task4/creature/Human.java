package Task4.creature;

import Task4.move.MoveLogic;
import Task4.sound.SoundLogic;

public class Human extends Creature{
    public Human(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }
    String getName() {
        return "Person";
    }
    public void searchMeaningOfLife(){
        System.out.println(getName()  + "looking for meaning of life");
    }
}
