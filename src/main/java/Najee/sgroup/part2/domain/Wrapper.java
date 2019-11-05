package Najee.sgroup.part2.domain;

public class Wrapper {
    private MetaData metaData;
    private TimeSeries timeSeries;

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public TimeSeries getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "metaData=" + metaData +
                ", timeSeries=" + timeSeries +
                '}';
    }
}
