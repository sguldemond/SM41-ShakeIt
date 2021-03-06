package domain;

import java.util.Date;

/**
 * Created by Stan Guldemond on 13/10/16.
 */
public class Shake {

    private Integer userid;
    private Float latitude;
    private Float longitude;

    public Shake(Integer userid, Float lat, Float lon, String dateTime) {
        this.userid = userid;
        latitude = lat;
        longitude = lon;
    }

    public Integer getUserid() {
        return userid;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }
}
