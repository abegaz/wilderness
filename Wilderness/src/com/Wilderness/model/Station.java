package com.Wilderness.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Station {

    private final StringProperty station;
    private final StringProperty stationID;
    private final StringProperty temp;
//    private final StringProperty groundTemp;
    private final StringProperty pressure;
    private final StringProperty windSpeed;
    private final StringProperty Precipitation;
    private final SimpleIntegerProperty Precipitation1;
    private final StringProperty selectedDate;

    /**
     * Default constructor.
     */
    public Station() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     * 
     * @param station
     * @param stationID
     */
    public Station(String station, String stationID) {
        this.station = new SimpleStringProperty(station);
        this.stationID = new SimpleStringProperty(stationID);
        this.temp = new SimpleStringProperty();
//        this.groundTemp = new SimpleStringProperty();
        this.pressure = new SimpleStringProperty();
        this.windSpeed = new SimpleStringProperty();

        // Some initial data for testing.
        this.Precipitation = new SimpleStringProperty();
        this.Precipitation1 = new SimpleIntegerProperty();
        this.selectedDate = new SimpleStringProperty();
    }
    public Station(String station, String stationID, String temp, String pressure, String Precipitation, String windSpeed, String selectedDate) {
        this.station = new SimpleStringProperty(station);
        this.stationID = new SimpleStringProperty(stationID);
        this.temp = new SimpleStringProperty(temp);
//        this.groundTemp = new SimpleStringProperty(groundTemp);
        this.pressure = new SimpleStringProperty(pressure);
        this.windSpeed = new SimpleStringProperty(windSpeed);
        this.Precipitation = new SimpleStringProperty(Precipitation);
        this.selectedDate = new SimpleStringProperty(selectedDate);

        // Some initial data for testing.
//        this.Precipitation = new SimpleStringProperty(Precipitation);
        this.Precipitation1 = new SimpleIntegerProperty();
//        this.selectedDate = new SimpleObjectProperty<LocalDate>(LocalDate.of(2017, 11, 10));
    }

    public String getStation() {
        return station.get();
    }

    public void setStation(String Station) {
        this.station.set(Station);
    }

    public StringProperty StationProperty() {
        return station;
    }
    
    public String getStationID() {
    	return stationID.get();
    }
    public void setStationID(String stationID) {
    	this.stationID.set(stationID);
    }
    public StringProperty StationIDProperty() {
    	return stationID;
    }

    public String getTemp() {
        return temp.get();
    }

    public void setTemp(String Temp) {
        this.temp.set(Temp);
    }

    public StringProperty TempProperty() {
        return temp;
    }

    public String getPrecipitation() {
        return Precipitation.get();
    }

    public void setPrecipitation(String Precipitation) {
        this.Precipitation.set(Precipitation);
    }

    public StringProperty PrecipitationProperty() {
        return Precipitation;
    }

    public int getPrecipitation1() {
        return Precipitation1.get();
    }
    public void setPrecipitation1(int Precipitation1) {
        this.Precipitation1.set(Precipitation1);
    }

    public IntegerProperty Precipitation1Property() {
        return Precipitation1;
    }

    public String getSelectedDate() {
        return selectedDate.get();
    }

    public void setSelectedDate(String selectedDate) {
        this.selectedDate.set(selectedDate);
    }

    public StringProperty selectedDateProperty() {
        return selectedDate;
    }
    public String getWindSpeed() {
    	return windSpeed.get();
    }
    public void setWindSpeed(String windSpeed) {
    	this.windSpeed.set(windSpeed);
    }
    public String getPressure() {
    	return pressure.get();
    }
    public void setPressure(String pressure) {
    	
    }

	

	
	}
