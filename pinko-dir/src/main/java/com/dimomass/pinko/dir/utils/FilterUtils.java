package com.dimomass.pinko.dir.utils;

import java.util.Map;

/**
 * Created by dimomass on 29.01.19.
 */
public class FilterUtils {

    private static FilterUtils instance;
    private Map<String, String[]> request;

    private FilterUtils(Map<String, String[]> request) {
        this.request = request;
    }

    public static FilterUtils request(Map<String, String[]> request) {
        return new FilterUtils(request);
    }

    public String filter() {
        String filter = "(&(objectClass=person)";
        for (Map.Entry<String,String[]> entry : request.entrySet()) {
            switch (entry.getKey()) {
                case "f":
                    filter = filter + String.format("(givenName=%s*)", entry.getValue()[0]);
                    break;
                case "l":
                    filter = filter + String.format("(sn=%s*)", entry.getValue()[0]);
                    break;
                case "n":
                    filter = filter + String.format("(ipPhone=%s*)", entry.getValue()[0]);
                    break;
            }
        }
        return filter + ")";
    }
}
