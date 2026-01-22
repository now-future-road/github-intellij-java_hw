package Task8.factories;

import Task8.seniors.SeniorDeveloper;
import Task8.middle.MiddleDeveloper;
import Task8.juniors.JuniorDeveloper;


public interface DeveloperCourse{
    JuniorDeveloper  createJunior();
    MiddleDeveloper  createMiddle();
    SeniorDeveloper  createSenior();

}
