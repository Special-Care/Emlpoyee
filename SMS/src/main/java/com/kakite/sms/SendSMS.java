package com.kakite.sms;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import okhttp3.*;

import java.io.IOException;

public class SendSMS {
    private static String URL = "http://106.ihuyi.com/webservice/sms.php?method=Submit";
    private static String account = "C96299717";
    private static String password = "c31c2b1d7efb00b0b569af83ff5448cc";
    private static String mobile = "13508277465";


    public static void main(String[] args) {
        int mobile_code = (int)((Math.random()*9+1)*100000);
        String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");

        String Url = URL + "&account=" + account + "&password=" + password + "&mobile=" + mobile + "&content=" + content + "&format=json";

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(Url)
                .build();

        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();

            JSONObject jsonObject = JSONObject.parseObject(string);
            String code = jsonObject.getString("code");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
