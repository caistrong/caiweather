package com.caistrong.caiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 蔡晓聪 on 2017/9/25.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
