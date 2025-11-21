
class Dog {
    private String name;
    private String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void display() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy", "German Shepherd");
        Dog d2 = new Dog("Rex", "Bulldog");

        d1.setName("Bruno");
        d1.setBreed("Labrador");

        d2.setName("Rocky");
        d2.setBreed("Husky");

        d1.display();
        d2.display();
    }
}