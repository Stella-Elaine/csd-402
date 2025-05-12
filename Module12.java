
public class Module12 {
    
    public static double basicServiceCost = 85.0;
    public static double oilChangeCost = 35.0;
    public static double tireRotationCost = 25.0;
    
    public static double yearlyService() {
        return basicServiceCost;
    }
    
    public static double yearlyService(boolean wantOilChange) {
        double total = basicServiceCost;
        
        if (wantOilChange == true) {
            total = total + oilChangeCost;
        }
        
        return total;
    }
    
    public static double yearlyService(boolean wantOilChange, boolean wantTireRotation) {
        double total = basicServiceCost;
        
        if (wantOilChange == true) {
            total = total + oilChangeCost;
        }
        
        if (wantTireRotation == true) {
            total = total + tireRotationCost;
        }
        
        return total;
    }
    
    public static double yearlyService(boolean wantOilChange, boolean wantTireRotation, double coupon) {
        double total = yearlyService(wantOilChange, wantTireRotation);
        
        total = total - coupon;
        
        if (total < 0) {
            total = 0;
        }
        
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println("Auto Service Calculator");
        System.out.println(" ");
        
        System.out.println("Test 1: Basic service only");
        double cost1 = yearlyService();
        System.out.println("Cost: $" + cost1);
        
        double cost2 = yearlyService();
        System.out.println("Cost again: $" + cost2);
        
        System.out.println("\nTest 2: With oil change");
        double cost3 = yearlyService(true); 
        System.out.println("Cost with oil change: $" + cost3);
        
        double cost4 = yearlyService(false); 
        System.out.println("Cost without oil change: $" + cost4);
        
        System.out.println("\nTest 3: With tire rotation");
        double cost5 = yearlyService(true, true); 
        System.out.println("Cost with oil change and tire rotation: $" + cost5);
        
        double cost6 = yearlyService(true, false); 
        System.out.println("Cost with oil change but no tire rotation: $" + cost6);
        
        System.out.println("\nTest 4: With coupon");
        double cost7 = yearlyService(true, true, 20);  
        System.out.println("Full service with $20 coupon: $" + cost7);
        
        double cost8 = yearlyService(true, true, 200);  
        System.out.println("Full service with $200 coupon (should be $0): $" + cost8);
    }
}