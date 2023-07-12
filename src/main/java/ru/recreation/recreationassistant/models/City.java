package ru.recreation.recreationassistant.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class City
{

    public double getLongitude()
    {
        return longitude;
    }

    public double getLatitude()
    {
        return latitude;
    }

    private double longitude;
    private double latitude;
}
