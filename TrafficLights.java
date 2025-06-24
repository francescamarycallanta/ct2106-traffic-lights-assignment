
/**
 * A class composed of three light objects. It indicates which is currently lit.
 *
 * @Francesca Mary Callanta
 * @1.0
 */
public class TrafficLights {
    
    /*These lines declares private instance variables of the type Light, which are made to hold a reference to an object of 
     the Light class that represents the colour of a traffic light.*/
    private Light greenLight;
    private Light amberLight;
    private Light redLight;

    // Constructor to set the text color for each light.... to make new stoplights you input three colours
    public TrafficLights(String greenColour, String amberColour, String redColour) {
        greenLight = new Light(greenColour);
        amberLight = new Light(amberColour);
        redLight = new Light(redColour);
    }

    // Behavior method: "go" (Only the green light is on)
    public void go() {
        greenLight.turnOn();
        amberLight.turnOff();
        redLight.turnOff();
    }

    // Behavior method: "prepareToStop" (Only the amber light is on)
    public void prepareToStop() {
        greenLight.turnOff();
        amberLight.turnOn();
        redLight.turnOff();
    }

    // Behavior method: "stop" (Only the red light is on)
    public void stop() {
        greenLight.turnOff();
        amberLight.turnOff();
        redLight.turnOn();
    }

    // Behavior method: "printState" (Show the current status of the traffic lights)
    public void printState() {
        greenLight.printState(); 
        amberLight.printState();
        redLight.printState();
        

        System.out.println();  // Print a newline
    }
}
