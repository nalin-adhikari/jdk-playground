# Abstract Factory Pattern 🏭

The Abstract Factory pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Real-World Example 🎈
Imagine you have different toy shops in different countries. Each shop makes toys that match their country's style:
- A **Wooden Toy Shop** that makes everything from wood (traditional style)
- A **Plastic Toy Shop** that makes everything from plastic (modern style)

Each shop can make different toys (like cars and dolls), but in their own style. It's like having different toy factories, each with its own special way of making toys!

## Implementation Details 🛠️

### Product Interfaces
```java
public interface Car {
    void play();
}

public interface Doll {
    void play();
}
```

### Concrete Products
```java
public class WoodenCar implements Car {
    @Override
    public void play() {
        System.out.println("Rolling the wooden car!");
    }
}

public class WoodenDoll implements Doll {
    @Override
    public void play() {
        System.out.println("Playing with wooden doll!");
    }
}
```

### Abstract Factory
```java
public interface ToyFactory {
    Car createCar();
    Doll createDoll();
}
```

### Concrete Factories
```java
public class WoodenToyFactory implements ToyFactory {
    @Override
    public Car createCar() {
        return new WoodenCar();
    }
    
    @Override
    public Doll createDoll() {
        return new WoodenDoll();
    }
}
```

## Usage Example 🎯
```java
ToyFactory woodenShop = new WoodenToyFactory();
Car woodenCar = woodenShop.createCar();
Doll woodenDoll = woodenShop.createDoll();

woodenCar.play();  // Output: Rolling the wooden car!
woodenDoll.play(); // Output: Playing with wooden doll!
```

## Advantages 👍
1. **Consistent Style**: All toys from one factory match each other (all wooden or all plastic)
2. **Easy to Add New Factories**: Can easily add new toy shops (like MetalToyFactory)
3. **Guaranteed Compatibility**: Toys from the same factory work well together
4. **Hide Complex Creation**: Users don't need to know how toys are made

## Disadvantages 👎
1. **More Complex**: Needs lots of interfaces and classes to set up
2. **Hard to Add New Products**: Adding a new type of toy means updating all factories
3. **Overkill for Simple Cases**: Too complicated if you only need a few products

## Summary 📝
- Abstract Factory is like having different toy shops
- Each shop has its own style of making toys
- Each shop can make many types of toys
- All toys from one shop match each other
- You just ask the shop for what you want!