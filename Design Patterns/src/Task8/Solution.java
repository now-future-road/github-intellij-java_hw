package Task8;

import Task8.factories.DeveloperCourse;
import Task8.factories.JavaRush;
import Task8.Team;
import Task8.factories.JavaScriptCourse;

public class Solution {

    public static void main(String[] args) {
        Team javaTeam = new Team(new JavaRush());
        javaTeam.hireSeniors(1);
        javaTeam.hireMiddles(3);
        javaTeam.hireJuniors(8);
        javaTeam.produceCode();

        DeveloperCourse jsCourse = new JavaScriptCourse();
        Team team = new Team(jsCourse);
        team.hireSeniors(1);
        team.hireMiddles(3);
        team.hireJuniors(8);
        team.produceCode();
    }
}
