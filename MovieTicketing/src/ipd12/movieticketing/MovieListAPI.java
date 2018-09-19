/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author 1796174
 */
public class MovieListAPI {

    private static String readAll(BufferedReader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        String cp;
        while ((cp = rd.readLine()) != null) {
            sb.append(cp);
        }

        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        try (InputStream is = new URL(url).openStream()) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        }
    }

    public ArrayList<JSONObject> getMoviesFromAPI() throws IOException, JSONException {
        JSONObject json = readJsonFromUrl("https://api.themoviedb.org/3/movie/now_playing?api_key=9b4b290076ed71bdb51694dc5037e5cf&language=en-US&page=1");
        System.out.println("Trying to get movies from API");
        JSONArray results = json.getJSONArray("results");
        ArrayList<JSONObject> array = new ArrayList<>();
        int size = results.length();

        for (int i = 0; i < size; i++) {
            JSONObject o = results.getJSONObject(i);
            array.add(o);
        }
        return array;
    }
}
