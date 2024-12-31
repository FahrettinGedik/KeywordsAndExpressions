public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {

        boolean isGameOver = true;
        int score = 5000;
        int isLevelCompleted = 5;
        int bonusPoints = 100;

        if (score == 5000) {
            System.out.println("You got 5000 points");
        }

        int myVariable = 50;

        if (myVariable == 50) {

            System.out.println("My variable is 50");

        } else {

            System.out.println("My variable is not 50");

        }

        if (score < 5000) {
            System.out.println("You lost");
        } else {
            System.out.println("You got 5000 points");
        }

        if (score <= 5000) {
            System.out.println("Your score was less than or equal to 5000");
        } else {
            System.out.println("Got here");
        }

        if (isGameOver) {
            System.out.println("Game over");
        } else {
            System.out.println("Game is still running");
        }
        boolean firstCondition = true;
        boolean secondCondition = true;

        if (firstCondition) {
            // Code in block will execute only if
            // firstCondition is true
        } else if (secondCondition) {

            // Code in block will execute if firstCondition is false
            // and secondCondition is true
            // THERE IS NO LIMIT TO THE NUMBER OF CONDITION THAT CAN BE TESTED
        } else {

            // Code in block will execute if
            // all condition above are false
            // THE ELSE BLOCK MUST BE LAST BUT IS OPTIONAL
        }

        if (score < 5000 && score > 1000) { // false
            System.out.println("Your score is between 1000 and 5000");
        } else if (score < 1000) { // false
            System.out.println("Your score is less than 1000");

        }else {
            System.out.println("Got here");
        }

        int newScore = 800;

        if (newScore < 5000 && newScore > 1000) {
            System.out.println("Your score is between 1000 and 5000");
        } else if (newScore < 1000) {
            System.out.println("Your score is less than 1000");

        }else {
            System.out.println("Got here");
        }





    }
}
