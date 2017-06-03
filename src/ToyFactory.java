/**
 * Created by Hotown on 17/6/3.
 */
interface Toy {
    void talk();
}

class Dog implements Toy {
    // Write your code here
    @Override
    public void talk() {
        System.out.println("Wow");
    }
}

class Cat implements Toy {
    // Write your code here
    @Override
    public void talk() {
        System.out.println("Meow");
    }
}

public class ToyFactory {
    /**
     * @param type a string
     * @return Get object of the type
     */
    public Toy getToy(String type) {
        // Write your code here
        if("Cat".equals(type)) {
            return new Cat();
        } else if ("Dog".equals(type)) {
            return new Dog();
        }
        return null;
    }
}
