public class DogClient {
    public static void main(String[] args) {
        Dog bob = new Dog("bob",9,"black");
        System.out.println(bob);
        bob.makeNoise();
    }
}