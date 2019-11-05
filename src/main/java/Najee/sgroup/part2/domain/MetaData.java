package Najee.sgroup.part2.domain;

    public class MetaData {
    private String Information;
    private String Symbol;
    private String LastRefreshed;
    private String Interval;
    private String OutputSize;
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
}
