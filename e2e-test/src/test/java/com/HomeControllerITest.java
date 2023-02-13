package com;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeControllerITest {
    @Test
    public void testHelloWorld() throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        Request request = new Request.Builder()
                .get()
                .url("http://127.0.0.1:8080")
                .build();
        Call call = okHttpClient.newCall(request);
        ResponseBody body = call.execute().body();
        assertThat(body.string()).isEqualTo("Hello!");
    }
}
