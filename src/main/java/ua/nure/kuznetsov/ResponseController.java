package ua.nure.kuznetsov;

import org.springframework.web.bind.annotation.*;
import ua.nure.kuznetsov.entity.AccelerometerValues;
import ua.nure.kuznetsov.entity.SensorValuesRequest;

@RestController
public class ResponseController {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Response greeting(@RequestBody SensorValuesRequest sensorValues) {
//        for (int i = 0; i < sensorValues.getAccelerometerValues().size(); i++) {
//            sensorValues.getAccelerometerValues().get(i).getX()
//        }
        return new Response("Принято "
                + sensorValues.getAccelerometerValues().size()
                + " записей акселерометра, "
                + sensorValues.getMagneticValues().size()
                + " записей магнитометра, "
                + sensorValues.getGyroscopeValues().size()
                + " записей гироскопа.");
    }
}