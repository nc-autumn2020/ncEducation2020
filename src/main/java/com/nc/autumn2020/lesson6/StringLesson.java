package com.nc.autumn2020.lesson6;

import com.nc.autumn2020.LessonApi;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class StringLesson implements LessonApi {
    @Override
    public void executeSolution(String[] args) {

        String url = "http://localhost.netcracker.com:6810/somproduct.plain_taskc.nc?" +
                "tab=_Task&object=9090363151013783084" +
                "&container=9158610804913819337" +
                "&task=9158610807913819337" +
                "&state=update&return=%2Fcommon%2Fuobject.jsp%3Fobject%3D9158610804913819337&object=9090363151013783084";
        try {
            String decodedUrl = URLDecoder.decode(url, "UTF-8");
            System.out.println(decodedUrl);

            String encodeUrlResult = URLEncoder.encode(decodedUrl,"ASCII");
            System.out.println(encodeUrlResult);
            String[] split = decodedUrl.split("\\?",2);
            split[1] = URLEncoder.encode(split[1],"ASCII");

            for (String s : split) {
                System.out.printf("result s = %s\n",s);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        UrlHolder instance = new UrlHolderFactory().createInstance(url);
        KeyValueParameter[] keyValueParameters = instance.getKeyValueParameters();
        for (KeyValueParameter keyValueParameter : keyValueParameters) {

            String result1 = new StringBuilder().append(keyValueParameter.getKey())
                    .append("=")
            .append(keyValueParameter.getValue()).toString();

        }

    }
}
