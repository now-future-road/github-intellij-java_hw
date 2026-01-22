package Task7.developers.factory;

import Task7.developers.Developer;

public abstract class ProgrammingCourse  {
    public abstract Developer createDeveloper();
    public void educateStudent(){
        Developer developer = createDeveloper();
        developer.study();

    };

}
