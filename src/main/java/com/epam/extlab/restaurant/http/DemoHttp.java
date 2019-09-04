package com.epam.extlab.restaurant.http;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.stereotype.Component;

@Component
public class DemoHttp {
    public int go (){
        HttpResponse jsonResponse
                = Unirest.get("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154")
                .header("accept", "application/json").queryString("apiKey", "123")
                .asJson();
        int body =  jsonResponse.getStatus();
        return body;
    }
}
