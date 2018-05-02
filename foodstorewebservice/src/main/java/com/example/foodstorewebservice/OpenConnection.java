package com.example.foodstorewebservice;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OpenConnection {

    //Url
    private String url = "http://192.168.1.3:8000/rest/productos";
    //Connect trought  OkHttpClient
    private OkHttpClient client = new OkHttpClient();

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    //Obtain Url
    public String getUrl() {
        return url;
    }

    //Clange Url
    public void setUrl(String url) {
        this.url = url;
    }

    //Insert data in DJANGO REST.FRAMEWORK       POST
    String insertarDatos(String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(this.url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    //Obtain data in DJANGO REST.FRAMEWORK        GET
    String obtenerDatos() throws IOException {
        Request request = new Request.Builder()
                .url(this.url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    //Tranform data into array list
    public ArrayList<String> json_array(String cadena_json, String variable){
        ArrayList<String> lista = new ArrayList<String>();
        try {
            JSONArray json = new JSONArray(cadena_json);
            for(int i=0;i<json.length();i++){
                JSONObject object=json.getJSONObject(i);
                lista.add(object.getString(variable));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return lista;
    }
}