package Task4;

import Task4.creature.*;
import Task4.move.*;
import Task4.sound.*;

public class Solution {
    public static void main(String[] args) {
        // Create a swimming meowing human
        Human swimmingMeowingHuman = new Human(new Swim(), new Meow());
        swimmingMeowingHuman.howDoIMove();
        swimmingMeowingHuman.howDoISound();
        swimmingMeowingHuman.searchMeaningOfLife();
    }
}