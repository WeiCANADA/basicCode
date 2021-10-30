package week7.A8;

public class HomeBusiness extends Dwelling{
    private int businessSize;
    public HomeBusiness(String owner, String type, int size, boolean hasFirePlace,int businessSize) {
        super(owner, type, size, hasFirePlace);
        this.businessSize = businessSize;
    }

    @Override
    public double calInsurance(double rate) {
        return this.businessSize > super.getSize() * 0.5 ?
                super.calInsurance(rate + 2.35) : super.calInsurance(rate + 1.84);
    }
}
