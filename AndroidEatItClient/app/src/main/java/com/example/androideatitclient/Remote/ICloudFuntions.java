package com.example.androideatitclient.Remote;

import io.reactivex.Observable;
import okhttp3.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ICloudFuntions {
    @GET("helloWorld")
    Observable<Response> getCustomerToken(@Query("access_token") String accessToken);
}
