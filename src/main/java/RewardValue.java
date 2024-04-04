public class RewardValue{
    private double value;

    RewardValue(double cashValue){
        this.value = cashValue;
    }



    public double getCashValue() {
        return value;
    }

    public double getMilesValue() {return this.value;}


}