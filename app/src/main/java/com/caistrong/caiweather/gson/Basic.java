package com.caistrong.caiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 蔡晓聪 on 2017/9/25.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
