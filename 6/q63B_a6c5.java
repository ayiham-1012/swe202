public class q63B_a6c5 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, "Brown", "Bulldog");
        Cat cat = new Cat("Kitty", 3, "White", "Persian");
        System.out.println("1.========");
        System.out.println(dog.dogInfo());
        System.out.println("2.========");
        System.out.println(cat.catInfo());
        System.out.println("3.========");
        dog.makeSound();
        System.out.println("4.========");
        cat.makeSound();
    }
}
public class Animal {
    public String name;
    public int age;
    public String color;
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String info() {
        return "Name: " + name + "\nAge: " + age + "\nColor:" + color +"\n";
    }
}


/*

1.========
Name: Buddy
Age: 5
Color: Brown
Breed: Bulldog
2.========
Name: Kitty
Age: 3
Color: White
Breed: Persian
3.========
Brown color Buddy is barking
4.========
White color Kitty is meowing

 */