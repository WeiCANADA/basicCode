package src.classAsBianLiangTybe;

public class HeroMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("������");
        hero.setAge(98);
        //����һ����������
        Weapon weapon = new Weapon("��ë����");
        //ΪӢ���䱸����
        //hero.setWeapon(weapon);
        hero.attack();
    }
}
