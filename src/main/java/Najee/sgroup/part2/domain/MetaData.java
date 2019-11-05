package Najee.sgroup.part2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaData {
    private String id;
    @JsonProperty("1. Information")
    private String Information;
    @JsonProperty("2. Symbol")
    private String Symbol;
    @JsonProperty("3. Last Refreshed")
    private String LastRefreshed;
    @JsonProperty("4. Interval")
    private String Interval;
    @JsonProperty("5. Output Size")
    private String OutputSize;
    @JsonProperty("6. Time Zone")
    private String TimeZone;

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getLastRefreshed() {
        return LastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        LastRefreshed = lastRefreshed;
    }

    public String getInterval() {
        return Interval;
    }

    public void setInterval(String interval) {
        Interval = interval;
    }

    public String getOutputSize() {
        return OutputSize;
    }

    public void setOutputSize(String outputSize) {
        OutputSize = outputSize;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String timeZone) {
        TimeZone = timeZone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

        @Override
        public String toString() {
            return "MetaData{" +
                    "id='" + id + '\'' +
                    ", Information='" + Information + '\'' +
                    ", Symbol='" + Symbol + '\'' +
                    ", LastRefreshed='" + LastRefreshed + '\'' +
                    ", Interval='" + Interval + '\'' +
                    ", OutputSize='" + OutputSize + '\'' +
                    ", TimeZone='" + TimeZone + '\'' +
                    '}';
        }
    }
