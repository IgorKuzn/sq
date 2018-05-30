package ua.nure.kuznetsov.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class MagneticValues {

    @JsonProperty("x")
    private float x;

    @JsonProperty("y")
    private float y;

    @JsonProperty("z")
    private float z;

    @JsonProperty("time")
    private long time;

    public MagneticValues() {
    }

    public MagneticValues(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        time = new Date().getTime();
    }

    public MagneticValues(float x, float y, float z, long time) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.time = time;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Magnetic field {" +
                "\nx=" + x +
                ", \ny=" + y +
                ", \nz=" + z +
                "\n}";
    }
}
