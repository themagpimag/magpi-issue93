public class HelloLoop {
    public static void main (String[] args) {
        String message = "Hello loop";
        int loopCounter = 1;
        int multiplier = 1;
        int numberOfLoops = 3;

        if (args.length >= 1) {
            multiplier = Integer.valueOf(args[0]);
        }

        if (args.length >= 2) {
            numberOfLoops = Integer.valueOf(args[1]);
        }

        while (loopCounter <= numberOfLoops) {
            int calculated = multiplier * loopCounter;
            System.out.println(message + ": " + loopCounter + ", calculated: " + calculated);
            loopCounter++;
        }
    }
}
