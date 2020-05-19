package Meteo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TempSensorAdapter implements MeteoSensor {
    private final SensorTemperature sensorTemperature;

    public TempSensorAdapter(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensorTemperature.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.of(
                LocalDate.ofYearDay(
                        sensorTemperature.year(),sensorTemperature.day()
                ),
                LocalTime.ofSecondOfDay(
                        sensorTemperature.second()
                )
        );
    }
}
