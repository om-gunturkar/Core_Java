package Stream1;
import java.util.*;
import java.util.stream.Collectors;

class Restaurant {
    String name;
    String specialDish;
    double rating;

    public Restaurant(String name, String specialDish, double rating) {
        this.name = name;
        this.specialDish = specialDish;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurant: " + name + ", Dish: " + specialDish + ", Rating: " + rating;
    }
}

public class ZomatoStreamAPI {
    public static void main(String[] args) {
        List<Restaurant> restaurants = Arrays.asList(
                new Restaurant("The Spice Hub", "Biryani", 4.7),
                new Restaurant("Foodies Delight", "Pasta", 4.5),
                new Restaurant("Gourmet Paradise", "Sushi", 4.9),
                new Restaurant("Tandoori Treats", "Paneer Tikka", 4.3),
                new Restaurant("Cafe Aroma", "Cappuccino", 4.6),
                new Restaurant("Ocean Breeze", "Grilled Salmon", 4.8),
                new Restaurant("Street Bites", "Tacos", 4.4)
        );

        // Get top 5 restaurants sorted by rating
        List<Restaurant> topRestaurants = restaurants.stream()
                .sorted((r1, r2) -> Double.compare(r2.rating, r1.rating))
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Top 5 Restaurants:");
        topRestaurants.forEach(System.out::println);

        // Display special dishes separately
        System.out.println("\nSpecial Dishes:");
        topRestaurants.forEach(r -> System.out.println(r.specialDish));
    }
}
