package ua.homework2.www;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nshkarupa on 31.07.2015.
 */
public class JsonParser {


    JSONObject o;
    EOperation operation;

    List<ArrayList<String>> reqItems;

    public JSONObject parse(String s) throws JSONException {
        o = new JSONObject(s);
        return o;
    }

    public EOperation getOperation() throws JSONException {
        operation = EOperation.valueOf(o.get("operation").toString());
        return operation;
    }

    public  List<ArrayList<String>> getReqItems() throws JSONException {
        reqItems  = new ArrayList<ArrayList<String>>();
        JSONArray arr = o.getJSONArray("items");
        if(arr.length()>0){
            for(int i = 0; i<arr.length(); i++){
                ArrayList<String> itemCharacteristics = new ArrayList<>();
                JSONObject o = (JSONObject)arr.get(i);
                itemCharacteristics.add(o.getString("name"));
                itemCharacteristics.add(o.getString("number"));
                itemCharacteristics.add(o.getString("color"));
                itemCharacteristics.add((String.valueOf(o.getInt("count"))));
                reqItems.add(itemCharacteristics);
            }

        }
        return reqItems;
    }
}
