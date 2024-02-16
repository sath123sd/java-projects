
class Sports {
    public void play() {
        System.out.println("Playing a sport...");
    }
}
class Football extends Sports {
    public void play() {
        System.out.println("Playing football...");
    }
}
class Basketball extends Sports {
    public void play() {
        System.out.println("Playing basketball...");
    }
}
class Rugby extends Sports {
    public void play() {
        System.out.println("Playing rugby...");
    }
}
public class polymorphism  {
    public static void main(String[] args) {
        Sports sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}