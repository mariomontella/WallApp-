package com.networkmario.wallapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

private static Retrofit retrofit=null;
public static final String API="ja83W9jPAlDfSnI2o5hM5WTwG99IORXu0JfprxyRUd06iuLnM7eQsfi6";



public static ApiInterface getApiInterface()
{
    if(retrofit==null)
    {
        retrofit=new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }

    return retrofit.create(ApiInterface.class);
}}
