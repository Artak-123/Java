import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String address;
    private String menu;
    private List<String> review;

    public Restaurant(String name, String address, String menu){
        this.name = name;
        this.address = address;
        this.menu = menu;
        this.review = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMenu() {
        return menu;
    }

    public List<String> getReview() {
        return review;
    }
    public void addReview(String reviews){
        review.add(reviews);
    }
    public void displayInfo(){
        System.out.println(" Restaurant name " + name + " our location " + address + " Restaurant menu " + menu);
        System.out.print(" " );
        for (String reviews:review){
            System.out.print(reviews + " We glade to see you again ");
            System.out.println();
        }
    }
}
class DemoRestaurant{
    public static void main(String[] args) {
        Restaurant place = new Restaurant(" Small Yerevan", " Str.Aram ", " European ");
        place.addReview(" The best place where we ... ");
        place.displayInfo();
        }
    }

