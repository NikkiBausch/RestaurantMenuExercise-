import java.util.ArrayList;

public class Menu {

        private String appetizer;
        private ArrayList mainCourse;
        private String dessert;
        private String sideDish;

        public Menu (String appetizer, ArrayList mainCourse, String dessert, String sideDish){
         this.appetizer = appetizer;
         this.mainCourse = mainCourse;
         this.dessert = dessert;
         this.sideDish = sideDish;



    }
    public String getAppetizer(){
        return appetizer;
    }
    public ArrayList getMainCourse(){
            return mainCourse;
    }
    public String getDessert(){
            return dessert;
    }
    public String getSideDish(){
            return sideDish;
    }
}

//method replace old item in a dinner menu with new item?