package src.innerClass;
/*
* 一个类内部包含另一个类 如身体和心脏的关系.
*
* 分类:
*  1.成员内部类
*  格式:
*  修饰符 class 外部类名称{
*       修饰符 class 内部类名称{
*       //...
*       }
*       //...
*  }
*
*  重名成员变量的访问方式:
*  不管内部调用还是外部调用,
*  直接访问都是内部内部类的成员变量;
*  访问外部重名成员变量使用this.成员变量名.
*
*  调用成员内部类规则:
*  内使外,随意,外使用内需要内部对象.
*  调用内部方法的格式:
*       1.直接调用:
*           格式:
*               类名称 对象名 = new 类名称();
*               外部类调用:外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
*       2,间接调用:
*       在外部类的方法中,使用内部类,然后main只是调用外部类的方法.
*
*
*  2.局部内部类(包含匿名内部类)
*   定义在方法内部的类
*   匿名内部类
*   如果接口的实现类(父类的子类)只需要使用唯一的一次,那么这种情况下就可以省略掉该类的定义,而改用匿名类.
*   格式;
*    接口名称 对象名 = new 接口名称() {
*    //覆盖重新所有抽象方法
*    }
*       使用匿名内部类的注意事项:
*       1.同一个匿名内部类,在创建兑现对象的时候,只能用一次
*       2.同一个匿名对象,在调用方法的时候,只能调用一次.
*
* */
public class Demo01InnerClassNote {
    public static void main(String[] args) {
        Body body = new Body("张三");
        body.body();//通过外部方法调用内部方法
        body.variableBody();

        Body.Heart heart = new Body(). new Heart();//直接访问内部类方法的格式.
        heart.beat();
        heart.variableHeart();



    }
}
