package Task4.creature;

import Task4.move.MoveLogic;
import Task4.sound.SoundLogic;

public abstract class Creature {
    protected MoveLogic  moveLogic;
    protected SoundLogic soundLogic;
    Creature(MoveLogic moveLogic, SoundLogic soundLogic) {
        this.moveLogic = moveLogic;
        this.soundLogic = soundLogic;
    }
    abstract String getName();
    public void howDoIMove(){
        moveLogic.move(getName());
    };
    public void howDoISound(){
        soundLogic.sound(getName());
    };

}
