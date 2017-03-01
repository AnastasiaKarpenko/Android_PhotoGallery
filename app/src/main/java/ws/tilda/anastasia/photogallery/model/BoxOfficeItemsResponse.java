package ws.tilda.anastasia.photogallery.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class BoxOfficeItemsResponse {
    List<GalleryItem> items;

    public BoxOfficeItemsResponse() {
        items = new ArrayList<>();
    }

    public List<GalleryItem> getItems() {
        return items;
    }

    public static BoxOfficeItemsResponse parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        BoxOfficeItemsResponse boxOfficeMovieResponse = gson.fromJson(response, BoxOfficeItemsResponse.class);
        return boxOfficeMovieResponse;
    }
}
