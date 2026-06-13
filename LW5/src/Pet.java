abstract class Pet {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String petName){
        this.name = petName;
    }

    abstract String speak();
    abstract String getType();
}

class Dog extends Pet {

    public String speak() {
        return "woof woof !";
    }
    public String getType() {
        return "dog";
    }
}

class Cat extends Pet {
    public String speak () {
        return "meaw meaw!";
    }
    public String getType() {
        return "cat";
    }
}