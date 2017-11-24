package com.caistrong.caiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 蔡晓聪 on 2017/9/25.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
