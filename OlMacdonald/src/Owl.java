public class Owl extends Animal implements Flyable {
    void sound(){
        System.out.println("始めました。");
    }
    @Override
    public void fly(){
        System.out.println("weeeeee");
    }
    @Override
    public void glide() {
        System.out.println("woosh");
    }
}
