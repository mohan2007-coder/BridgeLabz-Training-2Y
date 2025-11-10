package Lambda_expressions;

@FunctionalInterface
interface LightBehavior {
    void activate();
}
class SmartLight {
    private LightBehavior behavior;

    public void setBehavior(LightBehavior behavior) {
        this.behavior = behavior;
    }

    public void activateLight() {
        if (behavior != null) {
            behavior.activate();
        } else {
            System.out.println("No behavior assigned to the light!");
        }
    }
}
public class SmartHome{
    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight();


        LightBehavior motionTrigger = () ->
                System.out.println("Motion detected! Turning on bright white light.");


        LightBehavior eveningTrigger = () ->
                System.out.println("Evening mode activated! Turning on warm dim light.");


        LightBehavior voiceCommandTrigger = () ->
                System.out.println("Voice command received! Activating party light mode.");


        System.out.println("=== Scenario 1: Motion Trigger ===");
        livingRoomLight.setBehavior(motionTrigger);
        livingRoomLight.activateLight();

        System.out.println("\n=== Scenario 2: Time-based Trigger ===");
        livingRoomLight.setBehavior(eveningTrigger);
        livingRoomLight.activateLight();

        System.out.println("\n=== Scenario 3: Voice Command Trigger ===");
        livingRoomLight.setBehavior(voiceCommandTrigger);
        livingRoomLight.activateLight();
    }
}

