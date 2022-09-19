
public class Machine {

    private Item[][] items;

    public Machine(Item[][] items) {

        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {

                this.items[i][j] = new Item(items[i][j]);
                
            }
        }
    }
    
    public Item getItem(int row, int spot) {
        return new Item(this.items[row][spot]);
    }
    
    public void setItems(Item item, int row, int spot) {

        this.items[row][spot] = new Item(item);

    }
    
    public String toString() {

        String temp = "";

        for (int i = 0; i < items.length; i++) {

            for (int j = 0; j < items[i].length; j++) {

                temp += items[i][j].toString() + "\t";
            }
            temp += "\n";

        }

        return temp;

    }

    public boolean dispense(int row, int spot) {

        if (row >= items.length || spot >= items.length) {
            
            return false;
        }

        if (this.items[row][spot].getQuantity() > 0) {
            this.items[row][spot].setQuantity(this.items[row][spot].getQuantity() - 1);
            return true;
        }

        return false;
    }
}