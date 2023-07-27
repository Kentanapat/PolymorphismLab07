public class Duck extends Animal implements Flyable{
    void sound(){
        System.out.println("Honk Honk");
    }
    void waddle(){
        System.out.println("wag wag wag");
    }
    @Override
    public void fly() {
        System.out.println("it fly!");
    }
    @Override
    public void glide() {
        System.out.println("skadoosh");
    }
    @Override
    void clean() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Cleaning myself");
    }
    public void clean(Cow cow) {
        System.out.println("Duck is cleaning Cow");
    }
}
