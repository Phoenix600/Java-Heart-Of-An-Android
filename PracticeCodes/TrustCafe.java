import java.util.Scanner;

class TrustCafeForCustomers {
    // This string and qtyAndPrice array is comman to all objects, no new copy is created
    static String[] items;
    static String[] localItems;
    static int[][] qtyAndPrice;
    
    // object variables
    int choice;
    int bill;
    int Tip = 0;

    public TrustCafeForCustomers() {
        init();
        printMenu();
    }


    void takeOrder()
    {
      Scanner input = new Scanner(System.in);
      
      

      input.close();
    }

    private void init() {
        // Setting the Items :
        items = new String[10];
        localItems = new String[10];
        localItems[0] = "Veg-Puff";
        localItems[1] = "Paneer-Puff";
        localItems[2] = "Kolhapuri Sandwich";
        localItems[3] = "Cheese Sanwich";
        localItems[4] = "Waffles";
        localItems[5] = "Hot Coffee";
        localItems[6] = "Cold Coffee";
        localItems[7] = "Lemon Tea";
        localItems[8] = "Tea";
        localItems[9] = "Water Bottle";

        qtyAndPrice = new int[10][2];

        // Setting the prices
        qtyAndPrice[0][1] = 30; // Veg Puff
        qtyAndPrice[1][1] = 50; // Paneer Puff
        qtyAndPrice[2][1] = 75; // Kolhapuri sandwich
        qtyAndPrice[3][1] = 60; // Cheese Sandwich
        qtyAndPrice[4][1] = 25; // Waffles Price
        qtyAndPrice[5][1] = 10; // HotCoffee Price
        qtyAndPrice[6][1] = 50; // Cold Coffee
        qtyAndPrice[7][1] = 15; // Lemon Tea
        qtyAndPrice[8][1] = 10; // Tea
        qtyAndPrice[9][1] = 20; // Water Bottle

        // Setting Quantity to 10 default
        for (int i = 0; i <10; i++) {
            qtyAndPrice[i][0] = 10;
        }

    }

    void printMenu() {
        System.out.print("======================================================\n");
        System.out.print("#                 TRUST-CAFE FETRI                   #\n");
        System.out.print("======================================================\n");
        System.out.printf("| ITEM KEY      ITEM-NAME       QTY     ITEM-PRICE   |\n");
        System.out.print("======================================================\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("| %2d   %20s      %d        %d        |\n", i, localItems[i], qtyAndPrice[i][0], qtyAndPrice[i][1]);
        }
        System.out.print("======================================================\n");
        System.out.print("[99] To Exit \n");
        System.out.print("======================================================\n");
        System.out.printf("Order > ");
    }

}

public class TrustCafe {
    public static void main(String... args) {

        TrustCafeForCustomers customer1 = new TrustCafeForCustomers();
    }

}
