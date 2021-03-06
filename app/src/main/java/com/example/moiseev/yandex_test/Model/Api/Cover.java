
package com.example.moiseev.yandex_test.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cover {

    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("big")
    @Expose
    private String big;

    /**
     * 
     * @return
     *     The small
     */
    public String getSmall() {
        return small;
    }

    /**
     * 
     * @param small
     *     The small
     */
    public void setSmall(String small) {
        this.small = small;
    }

    /**
     * 
     * @return
     *     The big
     */
    public String getBig() {
        return big;
    }

    /**
     * 
     * @param big
     *     The big
     */
    public void setBig(String big) {
        this.big = big;
    }

}
