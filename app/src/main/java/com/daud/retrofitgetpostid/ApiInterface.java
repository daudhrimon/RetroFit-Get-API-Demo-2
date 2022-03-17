package com.daud.retrofitgetpostid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("comments?")
    Call<List<ModelClass>> getData(@Query("postId") int postId);

}
