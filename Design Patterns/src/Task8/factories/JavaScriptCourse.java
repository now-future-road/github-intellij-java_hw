package Task8.factories;

import Task8.seniors.SeniorDeveloper;
import Task8.juniors.JuniorDeveloper;
import Task8.middle.MiddleDeveloper;


public class JavaScriptCourse implements DeveloperCourse {

    @Override
    public JuniorDeveloper createJunior() {
        return new JuniorDeveloper() {
            @Override
            public void fixBugs() {
            }
        };
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new MiddleDeveloper() {
            @Override
            public void writeNewModule() {

            }
        };
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new SeniorDeveloper() {
            @Override
            public void designArchitecture() {

            }
        };
    }
}