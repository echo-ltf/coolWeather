package com.example.seadee.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by seadee on 2017/8/9.
 */

public class City extends DataSupport {
    private int id;
    /**
     * 市的名称
     */
    private String cityName;
    /**
     * 市的代号
     */
    private int cityCode;
    /**
     * 市的所属的省的id值
     */
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
