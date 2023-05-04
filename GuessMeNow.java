import javax.swing.*;

public class GuessMeNow {
    public static void main(String[] args) {
        int num = (int) (Math.random()*100 + 1);
        int guess = 0;
        System.out.println("The correct number is " + num);
        int count = 1;

        while (guess != num)
        {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guess Me Now", 3);
            guess = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(guess, num, count));
            count++;
        }
    }

    public static String determineGuess(int guess, int num, int count){
        if (guess <=0 || guess >100) {
            return "Your guess is invalid";
        }
        else if (guess == num ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (guess > num) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (guess < num) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}