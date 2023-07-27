public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Cow ngua = new Cow();
        ngua.sound();
        Duck donald = new Duck();
        donald.sound();
        Pig pork = new Pig();
        pork.sound();
        Owl silence = new Owl();
        silence.sound();
    }
}
