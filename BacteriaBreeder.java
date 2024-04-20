/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */

import java.util.*;

public class BacteriaBreeder {
    private static int currentHour, population;

    private static void newGeneration(int h) {
        if (currentHour != h) {
            currentHour++;
            population *= 5;
            newGeneration(h);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours;
        System.out.print("Bacteria left on classroom door: ");
        population = input.nextInt();
        currentHour = 0;
        System.out.print("Number of hours passed before doorknob was cleaned: ");
        hours = input.nextInt();
        newGeneration(hours);
        System.out.println("There were " + population + " bacteria at the time of cleaning");
    }
}