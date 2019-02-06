//Store Class
//Version One - very rough
//Rochele
//Uploaded 2/5/19

public class Store {
    String tool1;
    String tool2;
    String tool3;
    String boat = "Boat";
    String binoc = "Binoculers";
    String energy = "Unit of Energy";
    int tool1Price;
    int tool2Price;
    int tool3Price;
    int boatPrice;
    int binocPrice;
    int energyPrice;

    //default constructor
    public Store() {
        tool1 = "Jack Hammer";
        tool1Price = 5;
        tool2 = "Weed Whacker";
        tool2Price = 5;
        tool3 = "Chain Saw";
        tool3Price = 2;
        boatPrice = 15;
        binocPrice = 15;
        energyPrice = 2;
    }

    //set from config file
    public Store(String tool1, String tool2, String tool3, int tool1Price,
                 int tool2Price, int tool3Price, int boatPrice, int binocPrice, int energyPrice) {
        this.tool1 = tool1;
        this.tool2 = tool2;
        this.tool3 = tool3;
        this.tool1Price = tool1Price;
        this.tool2Price = tool2Price;
        this.tool3Price = tool3Price;
        this.boatPrice = boatPrice;
        this.binocPrice = binocPrice;
        this.energyPrice = energyPrice;
    }

    //returns selected item's price to be subtracted from hero $ later
    public int getPrice(int type) {
        switch (type) {
            case 1:
                return tool1Price;
            case 2:
                return tool2Price;
            case 3:
                return tool3Price;
            case 4:
                return boatPrice;
            case 5:
                return binocPrice;
            case 6:
                return energyPrice;
            default:
                System.out.println("Error in Type Input");
                return 0;
        }
    }

    //prints out store items and prices - formatting is a work in progress
    public void printStore() {
        System.out.println("TOOL" + "\t" + "\t" + "\t" + "\t" + "PRICE");
        System.out.println("1. " + tool1 + "\t" + "\t" + "$" + tool1Price);
        System.out.println("2. " + tool2 + "\t" + "\t" + "$" + tool2Price);
        System.out.println("3. " + tool3 + "\t" + "\t" + "$" + tool3Price);
        System.out.println("4. " + boat + "\t" + "\t" + "\t" + "\t" + "$" + boatPrice);
        System.out.println("5. " + binoc + "\t" + "\t" + "$" + binocPrice);
        System.out.println("6. " + energy + "\t" + "$" + energyPrice);
    }
}      
        
