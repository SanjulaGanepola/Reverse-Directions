/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversehome;

import java.util.Scanner;

/**
 *
 * @author 348676487
 */
public class ReverseHome {

    /**
     * Taka in instructions to go to school and reverse them to show to how to
     * go home. Keep taking in inputted directions until 'school' is entered or
     * the maximum of 100 instructions is reached. Reverse the order and the
     * actual directions. Output the new directions.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);

        String[] inputDirections = new String[100];
        String[] inputStreets = new String[100];

        int directionCount = -1;

        for (int i = 0; i < 100; i++) {
            inputDirections[i] = "";
            inputStreets[i] = "";
        }

        for (int i = 0; i < 100; i++) {
            inputDirections[i] = s.nextLine();
            inputStreets[i] = s.nextLine();

            directionCount++;

            if (inputStreets[i].equalsIgnoreCase("SCHOOL")) {
                break;
            }
        }

        for (int i = directionCount; i >= 0; i--) {
            String reverseDirection = reverseInput(inputDirections[i]);

            if (i != 0) {
                System.out.println("Turn " + reverseDirection + " onto " + inputStreets[i - 1].toUpperCase());
            } else {
                System.out.println("Turn " + reverseDirection + " into HOME");
            }
        }
    }

    /**
     * Reverse the direction that was inputted by the user. If R was inputted
     * return L. If L was inputted return R.
     *
     * @param intputDirection   The inputted direction that needs to be reversed.
     * @return                  The new direction which is the reverse of the original.
     */
    public static String reverseInput(String intputDirection) {
        String reverseDirection = "";

        if (intputDirection.equalsIgnoreCase("R")) {
            reverseDirection = "L";
        } else {
            reverseDirection = "R";
        }
        return reverseDirection;
    }

}
