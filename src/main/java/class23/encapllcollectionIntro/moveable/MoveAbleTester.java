package class23.encapllcollectionIntro.moveable;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble moveAble = new Horse();
        MoveAble[] moveAbles = {new Cat(), new Dog()};

        for (MoveAble m : moveAbles) {
            m.move();
        }
    }
}
