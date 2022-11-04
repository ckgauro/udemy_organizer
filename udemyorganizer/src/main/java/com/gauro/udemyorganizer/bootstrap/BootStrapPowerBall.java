package com.gauro.udemyorganizer.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Chandra
 */
@Component
public class BootStrapPowerBall implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        findNumber();
    }

    private void findNumber() {
        // User variables
        // If you're running high numbers, you may want to comment out some System.out
        // statements of higher probability outcomes
        int tries = 50;                     // $2 per try, mind you
        int jackpot = 1500000000;             // Amount won in the jackpot
        int[] winning = {2, 11, 22, 35, 60, 23}; // Winning numbers, last being Powerball
        boolean presetWin = true;               // if you don't want to use the winning numbers
        // above, set to false and winning numbers will
        // be generated
        // Non-user variables
        int randomNum;
        int payout = 0;
        int[] choices = new int[5];       // the non-Powerball #'s
        int[] winningCombos = new int[9];       // 9 different ways to win
        int[] comboAmounts = {jackpot, 1000000, 50000, 100, 100, 7, 7, 4, 4};                    // Amount won per combination
        String[] comboNames = {"5+1", "5+0", "4+1", "4+0", "3+1", "3+0", "2+1", "1+1", "0+1"}; // Different combinations


        int index = 0;
        for (String number : getNumbers()) {
            String[] num=number.split(",");
            choices[0] = Integer.parseInt(num[0]);
            choices[1] =  Integer.parseInt(num[1]);
            choices[2] =  Integer.parseInt(num[2]);
            choices[3] =  Integer.parseInt(num[3]);
            choices[4] =  Integer.parseInt(num[4]);
            int powerball =  Integer.parseInt(num[5]);

            // Sort 'em
            Arrays.sort(choices, 0, 5);

            int matches = 0;
            if (Arrays.binarySearch(choices, winning[0]) >= 0) {
                matches++;
            }
            if (Arrays.binarySearch(choices, winning[1]) >= 1) {
                matches++;
            }
            if (Arrays.binarySearch(choices, winning[2]) >= 2) {
                matches++;
            }
            if (Arrays.binarySearch(choices, winning[3]) >= 3) {
                matches++;
            }
            if (Arrays.binarySearch(choices, winning[4]) >= 4) {
                matches++;
            }

            // Print out if you won any money
            if (matches == 5 && powerball == winning[5]) {
                System.out.format("%2d %2d %2d %2d %2d %2d | %s on attempt %d%n", choices[0], choices[1], choices[2], choices[3], choices[4], powerball, comboNames[0], index);
                payout += comboAmounts[0];
                winningCombos[0]++;
            } else if (matches == 5) {
                System.out.format("%2d %2d %2d %2d %2d %2d | %s on attempt %d%n", choices[0], choices[1], choices[2], choices[3], choices[4], powerball, comboNames[1], index);
                payout += comboAmounts[1];
                winningCombos[1]++;
            } else if (matches == 4 && powerball == winning[5]) {
                System.out.format("%2d %2d %2d %2d %2d %2d | %s on attempt %d%n", choices[0], choices[1], choices[2], choices[3], choices[4], powerball, comboNames[2], index);
                payout += comboAmounts[2];
                winningCombos[2]++;
            } else if (matches == 4) {
                System.out.format("%2d %2d %2d %2d %2d %2d | %s on attempt %d%n", choices[0], choices[1], choices[2], choices[3], choices[4], powerball, comboNames[3], index);
                payout += comboAmounts[3];
                winningCombos[3]++;
            } else if (matches == 3 && powerball == winning[5]) {
                System.out.format("%2d %2d %2d %2d %2d %2d | %s on attempt %d%n", choices[0], choices[1], choices[2], choices[3], choices[4], powerball, comboNames[4], index);
                payout += comboAmounts[4];
                winningCombos[4]++;
            } else if (matches == 3) {
                System.out.format("%2d %2d %2d %2d %2d %2d | %s on attempt %d%n", choices[0], choices[1], choices[2], choices[3], choices[4], powerball, comboNames[5], index);
                payout += comboAmounts[5];
                winningCombos[5]++;
            } else if (matches == 2 && powerball == winning[5]) {
                System.out.format("%2d %2d %2d %2d %2d %2d | %s on attempt %d%n", choices[0], choices[1], choices[2], choices[3], choices[4], powerball, comboNames[6], index);
                payout += comboAmounts[6];
                winningCombos[6]++;
            } else if (matches == 1 && powerball == winning[5]) {
                System.out.format("%2d %2d %2d %2d %2d %2d | %s on attempt %d%n", choices[0], choices[1], choices[2], choices[3], choices[4], powerball, comboNames[7], index);
                payout += comboAmounts[7];
                winningCombos[7]++;
            } else if (powerball == winning[5]) {
                System.out.format("%2d %2d %2d %2d %2d %2d | %s on attempt %d%n", choices[0], choices[1], choices[2], choices[3], choices[4], powerball, comboNames[8], index);
                payout += comboAmounts[8];
                winningCombos[8]++;
            }
        }

        System.out.println("\nWinning numbers: " + winning[0] + " " + winning[1] + " " + winning[2] +
                " " + winning[3] + " " + winning[4] + " " + winning[5]);

        // Print out final statistics by type of win
        int totalWins = winningCombos[8] + winningCombos[7] + winningCombos[6] + winningCombos[5] + winningCombos[4] +
                winningCombos[3] + winningCombos[2] + winningCombos[1] + winningCombos[0];
        if (totalWins > 0) {
            System.out.println("\nTitle    |          # |          % | Winnings");

            for (int i = 0; i < 9; i++) {
                if (winningCombos[i] > 0) {
                    System.out.format("%s      | %10d | %1.8f | $%d%n", comboNames[i], winningCombos[i],
                            (float) winningCombos[i] / tries, winningCombos[i] * comboAmounts[i]);
                }
            }

            float totalPercent = (float) (winningCombos[8] + winningCombos[7] + winningCombos[6] + winningCombos[5] + winningCombos[4] +
                    winningCombos[3] + winningCombos[2] + winningCombos[1] + winningCombos[0]) / tries;
            int totalWinnings = winningCombos[8] * comboAmounts[8] + winningCombos[7] * comboAmounts[7] + winningCombos[6] * comboAmounts[6] +
                    winningCombos[5] * comboAmounts[5] + winningCombos[4] * comboAmounts[4] + winningCombos[3] * comboAmounts[3] +
                    winningCombos[2] * comboAmounts[2] + winningCombos[1] * comboAmounts[1] + winningCombos[0] * comboAmounts[0];
            System.out.format("Total    | %10d | %1.8f | $%d%n%n", totalWins, totalPercent, totalWinnings);
        }

        // Print out summary
        System.out.format("You started with $%d, and now you have $%d.%n", tries * 2, payout);
        if (payout > tries * 2) {
            System.out.format("Wowie, a %f%% profit!%n", (100 * (float) payout) / ((float) tries * 2));
        } else {
            System.out.format("You lost %f%% of your money.%n", (float) 100 * (1 - ((float) payout / ((float) tries * 2))));
        }
    }

    List<String> getNumbers() {
        List<String> lsNumbers = new ArrayList<>();
        lsNumbers.add("4,19,46,56,58,23");
        lsNumbers.add("02,11,31,35,60,23");

        return lsNumbers;

    }
}
