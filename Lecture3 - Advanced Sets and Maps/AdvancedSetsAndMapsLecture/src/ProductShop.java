import java.util.*;

public class ProductShop {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<String, List<String>> shopsAndProducts = new LinkedHashMap<>();

        String line = in.nextLine();

        while (!line.equals("Revision")) {

            String[] input = line.split(", ");
            String shop = input[0];
            String product = input[1] + ";" + input[2];

            List<String> productAndPrice = new ArrayList<>();

            shopsAndProducts.putIfAbsent(shop, productAndPrice);

            productAndPrice = shopsAndProducts.get(shop);

            productAndPrice.add(product);

            shopsAndProducts.put(shop, productAndPrice);

            line = in.nextLine();
        }

        shopsAndProducts.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(es -> {
            System.out.printf("%s->\n", es.getKey());
            for (String productPrice : es.getValue()) {
                String[] productAndPriceArr = productPrice.split(";");
                String product = productAndPriceArr[0];
                double price = Double.parseDouble(productAndPriceArr[1]);
                System.out.printf("Product: %s, Price: %.1f\n", product, price);
            }
        });
    }
}
