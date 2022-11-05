package com.gauro.udemyorganizer.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author Chandra
 */
@Component
public class BootStrapPowerBall implements CommandLineRunner {

   // int[] winning = {2, 11, 22, 35, 60, 23}; // Winning numbers, last being Powerball

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


        List<String> numbers=getNumbers().get("lsNumbers");
        String winningNumbers=getNumbers().get("winningNumber").get(0);

        String[] num= winningNumbers.split(",");
        int[] winning = {2, 11, 22, 35, 60, 23};
        for(int ind=0; ind<num.length;ind++){
            winning[ind]=Integer.parseInt(num[ind].trim());
        }
        System.out.println("winning===>");
        Arrays.stream(winning).forEach(el-> System.out.print(el+","));
        System.out.println("======");


        for (String numberStr : numbers) {
            String[] number=numberStr.split(",");

            choices[0] = Integer.parseInt(number[0].trim());
            choices[1] = Integer.parseInt(number[1].trim());
            choices[2] = Integer.parseInt(number[2].trim());
            choices[3] = Integer.parseInt(number[3].trim());
            choices[4] = Integer.parseInt(number[4].trim());
            int powerball = Integer.parseInt(number[5].trim());

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

    Map<String, List<String>> getNumbers() {
      //  Map<String, List<String>> numbers=getNumbersOct31();
        Map<String, List<String>> numbers=getNumbersNov2();

        return numbers;

    }
    private Map<String, List<String>>  getNumbersOct31() {
        Map<String, List<String>> numbers=new HashMap<>();

        List<String> lsNumbers = new ArrayList<>();
        lsNumbers.add("5,23,28,54,61,24");
        lsNumbers.add("5,36,42,63,66,8");
        lsNumbers.add("9,28,37,46,53,10");
        lsNumbers.add("6,24,29,48,55,5");
        lsNumbers.add("12,16,37,42,59,16");
        lsNumbers.add("10,33,36,57,64,12");
        lsNumbers.add("10,29,33,57,69,6");
        lsNumbers.add("13,21,43,63,66,5");
        lsNumbers.add("9,15,36,49,55,20");
        lsNumbers.add("1,5,32,49,61,10");
        lsNumbers.add("9,16,42,49,56,6");
        lsNumbers.add("7,16,36,44,67,23");
        lsNumbers.add("11,26,30,49,55,4");
        lsNumbers.add("12,21,30,48,56,14");
        lsNumbers.add("11,24,37,46,61,13");

        numbers.put("lsNumbers",lsNumbers);
        List<String> winningNumber = new ArrayList<>();
        winningNumber.add("5,23,28,54,61,24");
        numbers.put("winningNumber",winningNumber);


        return numbers;

    }

    Map<String, List<String>>  getNumbersNov2() {
        Map<String, List<String>> numbers=new HashMap<>();

        List<String> lsNumbers = new ArrayList<>();
        lsNumbers.add("4,29,30,36,44,24");
        lsNumbers.add("11,27,28,43,69,23");
        lsNumbers.add("3,4,39,44,57,9");
        lsNumbers.add("6,24,29,48,55,5");
        lsNumbers.add("12,16,37,42,59,16");
        lsNumbers.add("10,33,36,57,64,12");
        lsNumbers.add("5,23,28,54,61,24");
        lsNumbers.add("5,36,42,63,66,8");
        lsNumbers.add("9,28,37,46,53,10");
        lsNumbers.add("11,26,30,49,55,4");
        lsNumbers.add("12,21,30,48,56,14");
        lsNumbers.add("11,24,37,46,61,13");
        lsNumbers.add("1,5,32,49,61,10");
        lsNumbers.add("9,16,42,49,56,6");
        lsNumbers.add("7,16,36,44,67,23");
        lsNumbers.add("1,2,11,27,62,14");
        lsNumbers.add("4,16,23,24,47,15");
        lsNumbers.add("19,22,29,38,50,2");
        lsNumbers.add("11,29,32,36,57,11");
        lsNumbers.add("33,41,42,54,62,23");
        lsNumbers.add("19,39,44,49,51,14");
        lsNumbers.add("19,41,47,51,53,5");
        lsNumbers.add("10,29,33,57,69,6");
        lsNumbers.add("13,21,43,63,66,5");
        lsNumbers.add("9,15,36,49,55,20");
        numbers.put("lsNumbers",lsNumbers);

        List<String> winningNumber = new ArrayList<>();
        winningNumber.add("2, 11, 22, 35, 60, 23");
        numbers.put("winningNumber",winningNumber);
        return numbers;
    }
}
