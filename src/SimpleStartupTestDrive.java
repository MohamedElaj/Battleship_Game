public class SimpleStartupTestDrive {
    public static void main(String[] args) {

        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();
        SimpleStartup theStartup = new SimpleStartup();

        // Lassen nur eine Zahl generieren, dass dann randomNum zugewiesen wird.
        int randomNum = (int) (Math.random() * 5);
        // Diese eine Zahl ist der Ort auf einer Zeile. Weil drei Position eingenommen
        // werden müssen (Spielregeln) addieren wir die Zahl für jede Stelle mit 1 und 2.
        int [] locations = {randomNum, randomNum + 1, randomNum + 2};

        theStartup.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive) {
            int guess = helper.getUserInput("enter a number");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }

    }

}