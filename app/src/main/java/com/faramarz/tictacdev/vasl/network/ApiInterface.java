package com.faramarz.tictacdev.vasl.network;

import com.faramarz.tictacdev.vasl.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();

}
