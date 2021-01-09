
import java.util.ArrayList;

public class Restaurant extends MenuItem{
    public Restaurant(String name, String type, String description, Boolean newItem, Double price) {
        super(name, type, description, newItem, price);
    }
    @Override
    public String orderSummary() {
        return "Item: " + this.name + "\nItem Type: " + this.type + "\nDescription: " + this.description +
                "\nPrice: " + this.price + "\n";
    }


    public static void main(String[] args){
        MenuItem menuItem1 = new MenuItem("Breaded Mushrooms", "appetizer", "vegetarian", true, 7.85 );
        MenuItem menuItem2 = new MenuItem("Baked Potato", "side dish", "healthier choice than fries", false, 3.50);
        MenuItem menuItem3 = new MenuItem("Tartar Sauce", "condiment", "Dipping sauce for apps and sides", true, 0.00);
        MenuItem menuItem4 = new MenuItem("Orange Tofu", "main course", "baked tofu with orange sauce, vegan", false, 10.00);
        MenuItem menuItem5 = new MenuItem("Rice", "side dish", "available in brown or white", false, 1.50);
        MenuItem menuItem6 = new MenuItem("Avocado Veggie Sushi", "appetizer", "vegan sushi option!", true, 3.50);
        MenuItem menuItem7 = new MenuItem("vegan Chik'n nuggets", "main course", "vegetarian chik'n nuggets without egg in batter", true, 6.00);
        MenuItem menuItem8 = new MenuItem("French Fries", "side dish", "the usual", false, 3.00);

        Menu theMenu = new Menu();

        theMenu.addMenuItem(menuItem1);
        theMenu.addMenuItem(menuItem2);
        theMenu.addMenuItem(menuItem3);
        theMenu.addMenuItem(menuItem4);
        theMenu.addMenuItem(menuItem5);
        theMenu.addMenuItem(menuItem6);
        theMenu.addMenuItem(menuItem7);
        theMenu.addMenuItem(menuItem8);

        theMenu.orderSummary(menuItem1);

    }

}
