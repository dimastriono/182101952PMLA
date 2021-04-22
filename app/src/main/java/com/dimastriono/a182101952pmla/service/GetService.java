package com.dimastriono.a182101952pmla.service;

import com.dimastriono.a182101952pmla.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}
