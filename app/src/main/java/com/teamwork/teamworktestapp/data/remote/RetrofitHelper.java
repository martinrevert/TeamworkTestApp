package com.teamwork.teamworktestapp.data.remote;

import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.reactivex.schedulers.Schedulers;
import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by martin on 08/03/18.
 * This must be an injectable @Module, but for easy and quick setup is just a helper here
 */

public class RetrofitHelper {

    private static final String ENDPOINT = "https://yat.teamwork.com/";

    public ApiService newApiService() {

        //Not necessary, but in case of need to parse formatted datefields
        //GsonBuilder gsonBuilder = new GsonBuilder()
        //.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
        //.create();

        RxJava2CallAdapterFactory rxAdapter = RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io());

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                //Hardcoded login for the test purpose, normally this must be a token or
                //another secure auth.
                .addInterceptor(new BasicAuthInterceptor("yat@triplespin.com", "yatyatyat27"))
                .addInterceptor(logging)
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                //.cache(cache) /No cache configured for this test purposes, but is possible to have it.
                .build();


        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(rxAdapter)
                .baseUrl(ENDPOINT)
                .client(okHttpClient)
                .build();


        return retrofit.create(ApiService.class);

        }



    private class BasicAuthInterceptor implements Interceptor {

        private String credentials;

        public BasicAuthInterceptor(String user, String password) {
            this.credentials = Credentials.basic(user, password);
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            Request authenticatedRequest = request.newBuilder()
                    .header("Authorization", credentials).build();
            return chain.proceed(authenticatedRequest);
        }

    }


}