public class FilterSystem {

    // Mock database entries
    private static final String[] DATABASE = {
        "Product A: Price $100, Category Electronics",
        "Product B: Price $50, Category Books",
        "Product C: Price $150, Category Electronics",
        "Product D: Price $30, Category Apparel",
        // ... more entries
    };

    public static void filterByPriceRange(int min, int max) {
        for (String entry : DATABASE) {
            // Extract the price substring
            int priceStart = entry.indexOf("Price $") + "Price $".length();
            int priceEnd = entry.indexOf(",", priceStart);
            String priceStr = entry.substring(priceStart, priceEnd);
            
            try {
                int price = Integer.parseInt(priceStr);
                if (price >= min && price <= max) {
                    System.out.println(entry);
                }
            } catch (NumberFormatException e) {
                System.err.println("Error parsing price: " + priceStr);
            }
        }
    }

    public static void main(String[] args) {
        filterByPriceRange(50, 150);  // Filters entries with prices between $50 and $150
    }
}
