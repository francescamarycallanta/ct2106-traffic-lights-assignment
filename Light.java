
/**
 * A class that represents a single light. All lights have a colour and indicator of whether
they are currently on or off (a Boolean variable)
 *
 * @Francesca Mary Callanta
 * @1.0
 */
public class Light {
    private boolean isOn;  // Indicates if the light is on (true) or off (false)
    private String colour;   // Describes the colour of the light

    // Constructor with colour parameter, default isOff
    public Light(String colour) {
        this.colour = colour;   // Initialize the colour field
        this.isOn = false;    // By default, the light is off
    }

    // Accessor method for colour
    public String getColour() {
        return colour;
    }

    // Mutator method for colour
    public void setColour(String newColour) {
        colour = newColour;     // Update the colour field
    }

    // Method to turn on the light
    public void turnOn() {
        isOn = true;          // Set the isOn field to true
    }

    // Method to turn off the light
    public void turnOff() {
        isOn = false;         // Set the isOn field to false
    }

    // Method to print the current state of the light
    public void printState() {
        
        if (isOn) {
        System.out.println("[" + colour + "]"); // Print the colour if the light is on
    } else {
        System.out.println("[=OFF=]"); // Print "=OFF=" if the light is off
    }
    }
}
