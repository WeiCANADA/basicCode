package week7.tutorail;

public class VIPMember extends Member{
    private String secGym;
    private boolean sauna;


    public VIPMember(String name, String gym, String secGym, int id, boolean massage,boolean sauna) {
        super(name, gym, id, massage);
        this.secGym = secGym;
        this.sauna = sauna;
    }


    public String getSecGym() {
        return secGym;
    }

    public void setSecGym(String secGym) {
        this.secGym = secGym;
    }

    public boolean isSauna() {
        return sauna;
    }

    public void setSauna(boolean sauna) {
        this.sauna = sauna;
    }

    @Override
    public double calCost() {
        double cost =super.calCost() +100;
        if(sauna){
            cost += 75;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "VIPMember:" +
                super.toString() + '\t' +
                "sauna: " + sauna + '\t' +
                "cost: ";
    }
}
