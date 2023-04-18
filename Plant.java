
package OOP_lEC;

public class Plant {
    String type;
    String size;
    String lightRequirements;
    String waterRequirements;
    String soilTypePreference;
    String temperaturePreference;

    public Plant(String type, String size, String lightRequirements, String waterRequirements, 
            String soilTypePreference, String temperaturePreference) {
        this.type = type;
        this.size = size;
        this.lightRequirements = lightRequirements;
        this.waterRequirements = waterRequirements;
        this.soilTypePreference = soilTypePreference;
        this.temperaturePreference = temperaturePreference;
    }

    public void waterPlant() {
        System.out.println("Plant watered.");
    }
    
    public static void main(String [] args){
        Plant myPlant = new Plant("Succulent", "Small", "High", "Low", 
                "Well-draining", "Warm");
        
        Plant yourPlant = new Plant("Potted", "Big", "Low", "High", 
                "Well-draining", "Cold");
        
        System.out.println("Plant type: " + myPlant.type + 
                "\nPlant size: " + myPlant.size + 
                "\nPlant light requirements: " + myPlant.lightRequirements + 
                "\nPlant water requirements: " + myPlant.waterRequirements + 
                "\nSoil Type Preference of the plant: "+ myPlant.soilTypePreference + 
                "\nTemperature Preference of the plant: " + myPlant.temperaturePreference);
         myPlant.waterPlant();
        
         
         System.out.println("\nPlant type: " + yourPlant.type + 
                "\nPlant size: " + yourPlant.size + 
                "\nPlant light requirements: " + yourPlant.lightRequirements + 
                "\nPlant water requirements: " + yourPlant.waterRequirements + 
                "\nSoil Type Preference of the plant: "+ yourPlant.soilTypePreference + 
                "\nTemperature Preference of the plant: " + yourPlant.temperaturePreference);
         myPlant.waterPlant();
    }
}
