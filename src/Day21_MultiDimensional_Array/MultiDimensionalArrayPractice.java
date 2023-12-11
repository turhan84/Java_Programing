package Day21_MultiDimensional_Array;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {
        String[] group1 = {"Ahmet", "Baturay", "Beyza", "Dilara"}; // 4 names
        String[] group2 = {"Entisar", "Ermek", "Esmira"};// 3 names
        String[] group3 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};// 5 names
        String[] group4 = {"Yasin", "Muhtar"};// 2 names


        String[][] groups = {group1,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);

            }

        }

        System.out.println("===========================================");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("===========================================");

        for (int i = groups.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(groups[i]));
            for (String eachStudent : groups[i]) {
                System.out.println(eachStudent);
            }
        }


        System.out.println("===============================================");

        System.out.println(Arrays.deepToString(groups)); //deepToString() ==> for multi-dimensional dimensional arrays ONLY

        System.out.println(Arrays.toString(groups[1])); // toString() ==> for single dimensional arrays ONLY




    }
}
