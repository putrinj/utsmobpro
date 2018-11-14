package com.putrinursofiyanti1605910.utsmobpro;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    public static String DB_API = "3c2521ad3ee0058f8f0cd3e20f72dc09";

    @GET("popular?api_key="+DB_API)
    Call<Example> getPopular();

    @GET("top_rated?api_key="+DB_API)
    Call<Example> getTopRated();


}
