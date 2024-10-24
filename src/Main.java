import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] myArray = new int [30];
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            myArray[i] = 1950+
                    random.nextInt(71);
        }
        System.out.println("годы рождения: ");
        for (int year: myArray) {
            System.out.print(year + " ");
        }
        System.out.println();
        int minYear = myArray[0];
        int maxYear = myArray[0];

        for (int year : myArray) {
            if (year < minYear) {
                minYear = year;
            }
            if (year > maxYear) {
                maxYear = year;
            }
        }
        int currentYear = 2024;
        int oldestAge = currentYear - minYear;
        int youngestAge = currentYear - maxYear;
        int ageDiffrence = oldestAge - youngestAge;

        System.out.println("возраст самогог старого: " + oldestAge);
        System.out.println("возраст самого молодого: " + youngestAge);
        System.out.println("разница в возрасте: " + ageDiffrence);;




    }


}


