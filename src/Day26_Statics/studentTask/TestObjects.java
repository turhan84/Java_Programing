package Day26_Statics.studentTask;

import java.util.Arrays;

public class TestObjects {


    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");

        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student[] students = {student2, student3, student4, student5};


        StudentsGroup group1 = new StudentsGroup("Java Turtles",  1);

        group1.addStudent(student1);

        group1.addStudent(students);

        group1.addStudent("Khashayar", 34, 'M', "F35");

        System.out.println(group1);

        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);


        for (Student each : group1.students) {
            System.out.println(each.name +" : " + each.id);
        }

        System.out.println("------------------------------------------");

        StudentsGroup group2 = new StudentsGroup("Java Turtles",  2);

        StudentsGroup group3 = new StudentsGroup("Java Turtles",  3);

        StudentsGroup group4 = new StudentsGroup("Java Turtles",  4);

        StudentsGroup[] groups = {group1, group2, group3, group4};


  //========================================================================================
        group2.addStudent("Mehmet",13,'M',"A008");
        Student student11 = new Student("Fatma",35,'F',"A009");
        Student student12 = new Student("Anila",35,'F',"A010");
        Student student13 = new Student("Ayse",35,'F',"A011");
        group2.addStudent(student11);
        Student[] students2 = {student12,student13};
        group2.addStudent(students2);
 //======================================================================================
        group3.addStudent("Mehmet",13,'M',"A015");
        group3.addStudent("Muhammed",20,'M',"A055");
        group3.addStudent("Ali",20,'M',"A056");
        Student student15 = new Student("Fatma",35,'F',"A012");
        Student student16 = new Student("Anila",35,'F',"A013");
        Student student17 = new Student("Ayse",35,'F',"A014");
        group3.addStudent(student15);
        Student[] students3 = {student16,student17};
        group3.addStudent(students3);
//===================================================================================

        group4.addStudent("Mehmet",13,'M',"A016");
        Student student20 = new Student("Fatma",35,'F',"A017");
        Student student21 = new Student("Anila",35,'F',"A018");
        Student student22 = new Student("Ayse",35,'F',"A019");
        group4.addStudent(student20);
        Student[] students4 = {student21,student22};
        group4.addStudent(students4);
        group4.addStudent("Ahmet",32,'M',"A045");

//=====================================================================================

        System.out.println(group1);

        for (Student student : group1.students) {
            System.out.println(student.name + " : " + student.id);
        }
        System.out.println("=====================================================");
        System.out.println(group2);
        for (Student student : group2.students) {
            System.out.println(student.name + " : " + student.id);
        }
        System.out.println("=====================================================");
        System.out.println(group3);
        for (Student student : group3.students) {
            System.out.println(student.name + " : " + student.id);
        }
        System.out.println("=====================================================");
        System.out.println(group4);
        for (Student student : group4.students) {
            System.out.println(student.name + " : " + student.id);
        }


    }

}

/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentsGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */