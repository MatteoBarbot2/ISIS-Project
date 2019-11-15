package champollion;

public class ServicePrevu {
    
    public double volumeCM=0;
    public double volumeTD=0;
    public double volumeTP=0;
    
    ServicePrevu (double CM, double TD, double TP){
        this.volumeCM = CM;
        this.volumeTD = TD;
        this.volumeTP = TP;
    }
    public void AddHeure (double CM, double TD, double TP){
        this.volumeCM = this.volumeCM + CM;
        this.volumeTD = this.volumeTD + TD;
        this.volumeTP = this.volumeTP + TP;
    }
}
