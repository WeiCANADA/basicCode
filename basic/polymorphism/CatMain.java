package polymorphism;

public class CatMain {
    public static void main(String[] args) {
        polymorphism.Animal animal = new polymorphism.Cat() {
            @Override
            public void sleep() {

            }
        };//向上转型调用子类Cat 的方法
        animal.eat();//猫吃鱼
       // animal.catchMouse();//子类Cat的特有方法,父类不能调用

        if(animal instanceof polymorphism.Cat) {
            polymorphism.Cat cat = (polymorphism.Cat) animal;//向下转型 还原动作.
            cat.catchMouse();
        }
    }
}
