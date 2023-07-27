public class PekingDuck extends Duck{
    void sound(){
        System.out.println("No response...");
    }
    void waddle(){
        System.out.println("No response...");
    }
    @Override
    public void fly() {
        System.out.println("I'M DEAD");
    }
    @Override
    public void glide() {
        System.out.println("I AM DEAD.");
    }
    public void clean(Duck donald) {
        System.out.println("I'm literally dead, I cant be clean someone else");
    }
}
