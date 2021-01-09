
import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
        this.lastUpdated = LocalDate.now();

    }

    public void removeMenuItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
        this.lastUpdated = LocalDate.now();
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }


    public String updateTheMenu() {
        String menu = "";
        for (MenuItem item : this.menuItems) {
            if (item.IsNew()) {
                menu += "*";
            }
            menu += item.toString() + "\n";
        }
        menu += "* indicates that this item is new. \n Last updated: " + this.lastUpdated;
        return menu;
    }
}










