package ua.ho.andro.imageserch.helper;

import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

import ua.ho.andro.imageserch.model.Item;
import ua.ho.andro.imageserch.model.Response;

public class ResponseAsync extends AsyncTask<Object, Object, Response> {
    public ResponseAsync(String st){
        searchTerm=st;
    }
    public static Response res;
    private HttpClient client;
    private HttpGet post;
    private String searchTerm;
    private String imgQuery = "https://www.googleapis.com/customsearch/v1?q=" + searchTerm + "&searchType=image&key=AIzaSyCe7xEjy_3Cmwad0qTzl0pS3ThU9NeAr3s&cx=012210011118492976525:7ue0igu-lpk";



    @Override
    protected Response doInBackground(Object... voids) {
        client = new DefaultHttpClient();
        post = new HttpGet(imgQuery);
        res = null;
        // Making HTTP Request
        try {
            HttpResponse response = null;
            response = client.execute(post);
            // writing response to log
            if (response != null)
                try {
                    String result = EntityUtils.toString(response.getEntity(), "utf-8");
                    Gson gson = new GsonBuilder().create();
                    res = gson.fromJson(result, Response.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
        } catch (ClientProtocolException e) {
            // writing exception to log
            e.printStackTrace();
        } catch (IOException e) {
            // writing exception to log
            e.printStackTrace();
        }
        return res;
    }

    @Override
    protected void onPostExecute(@NonNull Response res) {
        super.onPostExecute(res);
        if (res != null) {
            List<Item> item= res.getItems();
            String mas[] =new String[item.size()];
            for (int i=0; i<item.size(); i++){
                mas[i]=item.get(i).getLink();
            }
        }
    }
}