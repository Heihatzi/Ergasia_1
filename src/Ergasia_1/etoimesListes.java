/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ergasia_1;

import static Ergasia_1.Ergasia_1.assignmentList;
import static Ergasia_1.Ergasia_1.courseList;
import static Ergasia_1.Ergasia_1.studentList;
import static Ergasia_1.Ergasia_1.trainerList;

/**
 *
 * @author dimit
 */
public class etoimesListes {
    public static void autoDataEntry() {
        studentList.add(new Student("dimitris1", "xatzhgeorgiou1"));
        studentList.add(new Student("dimitris2", "xatzhgeorgiou2"));
        studentList.add(new Student("dimitris3", "xatzhgeorgiou3"));
        studentList.add(new Student("dimitris4", "xatzhgeorgiou4"));
        studentList.add(new Student("dimitris5", "xatzhgeorgiou5"));

        trainerList.add(new Trainer("tasos1", "lelakis1"));
        trainerList.add(new Trainer("tasos2", "lelakis2"));
        trainerList.add(new Trainer("tasos3", "lelakis3"));
        trainerList.add(new Trainer("tasos4", "lelakis4"));
        trainerList.add(new Trainer("tasos5", "lelakis5"));

        courseList.add(new Course("Java"));
        courseList.add(new Course("C#"));
        

        assignmentList.add(new Assignment("aTitle1"));
        assignmentList.add(new Assignment("aTitle2"));
        assignmentList.add(new Assignment("aTitle3"));
        assignmentList.add(new Assignment("aTitle4"));
        assignmentList.add(new Assignment("aTitle5"));
    }
}
