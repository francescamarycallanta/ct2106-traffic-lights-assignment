
/**
 * This is a testing class which will have a main method, and which will test
the functionality of the TrafficLights class. The Light class will be implicitly tested since it is
used by the TrafficLight class.
 *
 * @Francesca Mary Callanta
 * @1.0
 */

public class TestTrafficLight {
    //Defines the main method. It takes an array of strings args as a parameter, which can be used to pass command-line arguments
    public static void main(String[] args) {
        
        /*Creates an instance of the TrafficLights class named trafficLights. It uses the constructor of the TrafficLights class and passes in colours.
        The colours are used to initialize the state of the traffic lights.*/
        TrafficLights trafficLights = new TrafficLights("Green", "Amber", "Red");
        
    
        
        //This is a for loop that will run 5 times.
        for (int i = 1; i <= 5; i++) {
            // Prints the current iteration number for each loop.
            System.out.println("Run " + i);
            
            //The remaining code was instructed in the assignment.

            trafficLights.go();
            trafficLights.printState();

            trafficLights.prepareToStop();
            trafficLights.printState();

            trafficLights.stop();
            trafficLights.printState();
        }
    }
}

