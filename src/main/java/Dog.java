public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed) {
        this.setName(name);
        this.setAge(age);
        this.breed=breed;
    }
    public Dog() {
        super();
        this.breed="yellow";
    }
    // makeNoise() method
    public void makeNoise() {
        System.out.println("* d o g  n o i s e *!");
    }


    // toString method
    public String toString(){
        return "Name: "+this.getName()+"\nAge: "+this.getAge()+"\nBreed: "+this.breed;
    }


    // Getter
    public String getBreed(){
        return this.breed;
    }

    // Setter
    public void setBreed(String a){
        if(a.trim().length()>0){
            this.breed=a;
        }
    }


}