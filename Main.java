import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Item[][] items = new Item[][]{
        {

           new Item("Pepsi",3,4.00),
           new Item("Kitkat",5,2.50),
           new Item("Pops",5,3.34)
        },
           {
               new Item("Candy",4,1.50),
               new Item("Juice",2,5.50),
               new Item("Cranberry Chocolate",2,5.50)

           },
           {
            new Item("Kitkat",5,2.50),
            new Item("Pops",5,3.34),
            new Item("Juice",2,5.50),

           },
        };
       
       Machine machine = new Machine(items);
    //    Item item = machine.getItem(2, 1);
    //    item.setPrice(2.99);
    //    machine.setItems(item, 2, 1);
    System.out.println( "*****************************************\n \tWELCOME TO JAVA DRINKS!\n*****************************************\n\n ");
    System.out.println(machine.toString());
    Scanner scan = new Scanner(System.in);

       
    while (true) {
        System.out.println("Pick a row: ");
        int row = scan.nextInt();
        System.out.println("Pick a spot in the row: ");
        int spot = scan.nextInt();
        boolean dispensed = machine.dispense(row, spot);

        if (dispensed == true) {
            System.out.println("Enjoy your drink! Press 1 to continue");
        }
        if (dispensed == false) {
            System.out.println(
                    "Sorry we're out of this item or you have entered a wrong choice. Press 1 to purchase another: or other key to exit");
        }
        if (scan.nextInt() != 1) {
            break;
        }
        System.out.println(machine.toString());
    }
    scan.close();

          
        // Item item_2 = new Item(item_1);
 
        // System.out.println(item_1.toString());
        // System.out.println(item_2.toString());
        
    }
}

