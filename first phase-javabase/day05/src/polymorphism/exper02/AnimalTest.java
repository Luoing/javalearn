package polymorphism.exper02;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 15:06
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.adopt(new Dog());//Animal animal = new Dog();

    }

    public void adopt(Animal animal){
//        animal.eat();
//        animal.jump();

        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchDog();
        }else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.jump();
            cat.eat();
        }
    }

}

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }
    public void jump(){
        System.out.println("动物跳动");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗急跳墙");
    }
    public void watchDog(){
        System.out.println("狗看门");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫爬树");
    }

}
