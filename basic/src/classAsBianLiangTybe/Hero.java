package src.classAsBianLiangTybe;

public class Hero {
     private String name;
     private int age;
     private classAsBianLiangTybe.Weapon weapon;

    public Hero() {
    }

    public Hero(String name, int age, classAsBianLiangTybe.Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public classAsBianLiangTybe.Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(classAsBianLiangTybe.Weapon weapon) {
        this.weapon = weapon;
    }
    public void attack(){
        System.out.println("����" + age + "��" + "Ӣ��" + name + "����ʹ��" + weapon.getCode() + "����" +"���й���");
    }
}
