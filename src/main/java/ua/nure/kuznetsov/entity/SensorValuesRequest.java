package ua.nure.kuznetsov.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class SensorValuesRequest {

    @JsonProperty("accelerometer_values")
    private List<AccelerometerValues> accelerometerValues = new ArrayList<>();

    @JsonProperty("magnetic_field_values")
    private List<MagneticValues> magneticValues = new ArrayList<>();

    @JsonProperty("gyroscope_values")
    private List<GyroscopeValues> gyroscopeValues = new ArrayList<>();

    public List<AccelerometerValues> getAccelerometerValues() {
        return accelerometerValues;
    }

    public List<MagneticValues> getMagneticValues() {
        return magneticValues;
    }

    public List<GyroscopeValues> getGyroscopeValues() {
        return gyroscopeValues;
    }
}
