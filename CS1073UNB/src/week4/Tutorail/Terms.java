package week4.Tutorail;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-09-30 8:42 p.m.
 */
public class Terms {
    private double rate;
    private double fee;
    public  Terms(double rate, double fee){
        this.rate = rate;
        this.fee = fee;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString(){
		return "Interest Rate: " + rate + "\tFee: $" + fee;
	}
}
