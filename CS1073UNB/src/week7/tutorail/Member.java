package week7.tutorail;

public class Member {
    private String name;
    private String gym;
    private int id;
    private boolean massage;

    public Member(String name, String gym, int id, boolean massage) {

        this.massage = massage;
             this.name = name;
             this.id = id;
            this.name = name;
            this.gym = gym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMassage() {
        return massage;
    }

    public void setMassage(boolean massage) {
        this.massage = massage;
    }
    public double calCost(){
        return this.massage? 345+50 : 345;
    }
    public boolean compare(Member other){
        return  other.id == this.id;

    }


    @Override
    public String toString() {
        return "Member: " +
                "name: " + name + '\t' +
                "gym: " + gym + '\t' +
                "id: " + id +'\t' +
                "massage: " + massage + '\t' +
                "cost: ";
    }
}
