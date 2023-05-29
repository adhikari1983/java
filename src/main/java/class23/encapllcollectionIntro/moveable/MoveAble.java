package class23.encapllcollectionIntro.moveable;

public interface MoveAble {// interface are very lightWeight component
    /** public static final int age; */
               int age = 12;

    /**
     * No constructor:
     * There is no instance variable means no need to initialize the instance variable
       so, we don't need the constructor as well. That's the reason there is no constructor in Interface.
     * Also -> The main reason why interfaces cannot have constructors is that interfaces do not represent concrete implementations.
     * They are purely abstract entities that define the structure and behavior of classes. Constructors are specific to
     * classes and are responsible for initializing the state of objects.
     */

    /**
     *  All methods are by default [ public and abstract ]
     *  So, you do not need to type
     *                 public abstract void move();
     */
                void move();
}


interface  Washable {
    void wash();
}

class Dog implements MoveAble, Washable {
    @Override
    public void move() {
        System.out.println("Dog can also move");
    }

    @Override
    public void wash() {
        System.out.println("You can wash Dog");
    }
}

class Cat implements MoveAble{

    @Override
    public void move() {
        System.out.println("Cat can also move");
    }
}

class Horse implements MoveAble{
    public void move(){
        System.out.println("Horse can also move");
    }
}