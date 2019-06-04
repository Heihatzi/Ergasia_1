package Ergasia_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ergasia_1 {

    public static void main(String[] args) {

        List<Student> ls = new ArrayList();
        List<Trainer> lt = new ArrayList();
        List<Course> lc = new ArrayList();
        List<Assignment> la = new ArrayList();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        Trainer t1 = new Trainer();
        Trainer t2 = new Trainer();
        Trainer t3 = new Trainer();
        Trainer t4 = new Trainer();
        Trainer t5 = new Trainer();

        Course c1 = new Course();
        Course c2 = new Course();
        Course c3 = new Course();
        Course c4 = new Course();
        Course c5 = new Course();

        Assignment a1 = new Assignment();
        Assignment a2 = new Assignment();
        Assignment a3 = new Assignment();
        Assignment a4 = new Assignment();
        Assignment a5 = new Assignment();

        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);
        ls.add(s5);

        lt.add(t1);
        lt.add(t2);
        lt.add(t3);
        lt.add(t4);
        lt.add(t5);

        lc.add(c1);
        lc.add(c2);
        lc.add(c3);
        lc.add(c4);
        lc.add(c5);

        la.add(a1);
        la.add(a2);
        la.add(a3);
        la.add(a4);
        la.add(a5);

        System.out.println(ls);
        System.out.println(lt);
        System.out.println(lc);
        System.out.println(la);

//        System.out.println("Welcome! Please Type number to pick menu item: \n "
//                + "1. Students \n 2. Assignments \n 3. Trainers \n 4. Courses ");
        String q1 = null;

        while (!q1.equals("y") || !q1.equals("n")) {
            System.out.println("Insert data? y/n : ");  // question 1  (q1)
            Scanner input = new Scanner(System.in);
            q1 = input.next();
        }

        if (q1.equals("")) {
            
        }
    }

}
