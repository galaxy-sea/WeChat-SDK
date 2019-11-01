package com.galaxy.miniprogram.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;


/**
 * @Author galaxy
 * @Date 2019/10/19 13:04
 **/
public class HttpUtils {

    public static String doPost(URI uri, String body) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(uri);
        httpPost.setEntity(new StringEntity(body));
        CloseableHttpResponse response = httpclient.execute(httpPost);
        String result = null;
        try {
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity entity = response.getEntity();
                result = EntityUtils.toString(response.getEntity(), "UTF-8");
                EntityUtils.consume(entity);
            }
        } finally {
            response.close();
        }
        return result;
    }
}
