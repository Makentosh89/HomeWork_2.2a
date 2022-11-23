public class Main {
    public static void main(String[] args) {

    /*
    Создайте классы для следующих домашних животных
    * Попугай
    * Собака
    * Кошка
    * Рыбки
    Создайте нужные свойства для каждого из классов.
    Создайте по несколько экземпляров каждого из домашних животным. Задайте им все созданные свойства.
    Выведите информацию о питомцах в консоль
    Использовать геттеры и сеттеры для получения и присваивания значений
    Проверить Возраст на негативное значение.
     */


        Parrot parrot1 = new Parrot();
        parrot1.setType("Amazon Parrot");
        parrot1.setName("Poco");
        parrot1.setColor("yellow-green");
        parrot1.setWeight(700);
        parrot1.setAge(0);

        Parrot parrot2= new Parrot();
        parrot2.setType("South-American Selve");
        parrot2.setName("Kaki");
        parrot2.setColor("blue-orange");
        parrot2.setWeight(1.5);
        parrot2.setAge(6);

        System.out.println(parrot1);
        parrot1.checkAge();
        System.out.println();
        System.out.println(parrot2);
        parrot2.checkAge();



        Dog dog1=new Dog();
        dog1.setType("German Shepherd");
        dog1.setName("Rex");
        dog1.setColor("black");
        dog1.setWeight(32);
        dog1.setAge(13);

        Dog dog2=new Dog();
        dog2.setType("English bulldog");
        dog2.setName("Teodor");
        dog2.setColor("yellow-brown");
        dog2.setWeight(25);
        dog2.setAge(10);


        System.out.println("\n"+dog1);
        dog1.checkAge();
        System.out.println();
        System.out.println(dog2);
        dog2.checkAge();

        Cat cat1 = new Cat();
        cat1.setType("Percian cat");
        cat1.setName("Leila");
        cat1.setColor("grey");
        cat1.setWeight(7.6);
        cat1.setAge(17);

        Cat cat2 = new Cat();
        cat2.setType("British cat");
        cat2.setName("Margaret");
        cat2.setColor("white-grey");
        cat2.setWeight(6.5);
        cat2.setAge(0);


        System.out.println("\n"+cat1);
        cat1.checkAge();
        System.out.println();
        System.out.println(cat2);
        cat2.checkAge();

        Fish fish1 = new Fish();
        fish1.setType("drop fish");
        fish1.setColor("white-pink");
        fish1.setWeight(2.0);

        Fish fish2 = new Fish();
        fish2.setType("Tangerine fish");
        fish2.setColor("multi-colored");
        fish2.setWeight(90.2);

        System.out.println("\n"+fish1);
        System.out.println();
        System.out.println(fish2);
    }
}
