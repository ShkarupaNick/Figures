package ua.homework2.www;

import org.json.JSONException;

/**
 * Created by nshkarupa on 30.07.2015.
 */


public class Main {

    public static String json = "{\n" +
            "  \"operation\": \"ADD\",\n" +
            "  \"items\": [\n" +
            "    {\n" +
            "      \"name\":\"CAPASITOR\",\n" +
            "      \"number\":\"ELCOMP00001\",\n" +
            "      \"color\":\"RED\",\n" +
            "      \"count\":4\n" +
            "    },\n" +
            "    { \"name\":\"TRANSISTOR\",\n" +
            "      \"number\":\"ELCOMP00002\",\n" +
            "      \"color\":\"BLACK\",\n" +
            "      \"count\":5\n" +
            "    },\n" +
            "    { \"name\":\"CAPASITOR\",\n" +
            "      \"number\":\"ELCOMP00003\",\n" +
            "      \"color\":\"RED\",\n" +
            "      \"count\":3\n" +
            "    }\n" +
            "  ]\n" +
            "}";
    public static void main(String args[]) throws JSONException {

        JsonParser p = new JsonParser();
        p.parse(json);
        System.out.println(p.getOperation());
        System.out.println(p.getReqItems());

        OperationController controller = new OperationController(p.getReqItems(), p.getOperation());

        Cart<AbstractItem> cart = Cart.getInstatce();
        controller.makeOperation(cart);
        System.out.println(cart);
        System.out.println(cart.getCount());
    }
}
