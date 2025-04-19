
public class FanProgram {
    public static void main(String[] args) {
        java.util.ArrayList<Fan> fans = new java.util.ArrayList<>();
        
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.HIGH);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        
        Fan fan3 = new Fan();
        fan3.setSpeed(Fan.LOW);
        fan3.setOn(true);
        fan3.setColor("blue");
        
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        
        System.out.println("Displaying all fans in the collection:");
        displayFans(fans);
        
        System.out.println("\nDisplaying a single fan:");
        displayFan(fan1);
        
        System.out.println("\nTesting toString method:");
        System.out.println(fan1);
    }
    
    public static void displayFans(java.util.Collection<Fan> fans) {
        int fanNumber = 1;
        for (Fan fan : fans) {
            System.out.println("Fan #" + fanNumber + ":");
            displayFan(fan);
            fanNumber++;
            System.out.println();
        }
    }
    
    public static void displayFan(Fan fan) {
        System.out.println("  Speed: " + getSpeedAsString(fan.getSpeed()));
        System.out.println("  On: " + fan.isOn());
        System.out.println("  Radius: " + fan.getRadius());
        System.out.println("  Color: " + fan.getColor());
    }
    
    private static String getSpeedAsString(int speed) {
        switch (speed) {
            case Fan.SLOW: return "SLOW";
            case Fan.MEDIUM: return "MEDIUM";
            case Fan.HIGH: return "HIGH";
            default: return "UNKNOWN";
        }
    }
}

class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "white";
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public boolean isOn() {
        return this.on;
    }
    
    public void setOn(boolean on) {
        this.on = on;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString() {
        if (this.on) {
            return "Fan is on - Speed: " + this.speed + 
                   ", Color: " + this.color + 
                   ", Radius: " + this.radius;
        } else {
            return "Fan is off - Color: " + this.color + 
                   ", Radius: " + this.radius;
        }
    }
}