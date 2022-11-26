package com.example.tugas_restapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPICall {

    //https://my-json-server.typicode.com/ Akbar3802/  FileJson
    //https://my-json-server.typicode.com/typicode/demo/db
    //https://run.mocky.io/v3/12cfc0e8-6642-4218-86bb-af261f3a4f53

    @GET("v3/12cfc0e8-6642-4218-86bb-af261f3a4f53")
    Call<DataModel> getData();
}
