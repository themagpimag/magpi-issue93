import java.io.IOException;
import java.util.Scanner;

public class HelloGpio {

    // Main method required by Java, this is called at the start of the application
    public static void main (String[] args) {
        try {
            // Initialize GPIO BCM 22 as output pin
            execute("raspi-gpio set 22 op");
            // Initialize GPIO BCM 24 as input pin
            execute("raspi-gpio set 24 ip");
            // Initialize the integer loop counter as 1
            int loopCounter = 1;
            // Initialize the boolean for the led state to true
            boolean ledOn = true;

            // Loop six times
            while (loopCounter <= 6) {
                // Change the LED state 
                if (ledOn) {
                    System.out.println("Changing LED to ON");
                    execute("raspi-gpio set 22 dh");
                } else {
                    System.out.println("Changing LED to OFF");
                    execute("raspi-gpio set 22 dl");
                }

                // Check the state of the button
                if (execute("raspi-gpio get 24").contains("level=1")) {
                    System.out.println("Button is pressed");
                }                 

                // Change the state for the LED for the next loop
                ledOn = !ledOn;

                // Wait a second
                Thread.sleep(1000);

                // Increment the loop counter with one
                loopCounter++;
            }
        } catch (InterruptedException ex) {
            System.err.println("Exception from Thread: " + ex.getMessage());
        }
    }

    // Separate methode to execute the given command and return the result string.
    public static String execute(String cmd) {
        try {
            Scanner s = new Scanner(Runtime.getRuntime().exec(cmd).getInputStream()).useDelimiter("\\A");
            return s.hasNext() ? s.next() : "";
        } catch (IOException ex) {
            System.err.println("Exception from Runtime: " + ex.getMessage());
            return "";
        }
    }
}

