package Task8.factories;

import Task8.JavaJunior;
import Task8.JavaMiddle;
import Task8.JavaSenior;
import Task8.juniors.JuniorDeveloper;
import Task8.middle.MiddleDeveloper;
import Task8.seniors.SeniorDeveloper;


public class JavaRush implements DeveloperCourse {
    public JuniorDeveloper createJunior(){
        return new JavaJunior();
    };
    public MiddleDeveloper createMiddle(){
        return new JavaMiddle();

    };
    public SeniorDeveloper createSenior(){
        return new JavaSenior();
    };


}
