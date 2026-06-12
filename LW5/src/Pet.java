public class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String petName){
        this.name = petName;
    }

    public String speak(){
        return "";
    }
}

class Dog extends Pet {
    public String speak() {
        return "woof woof !";
    }
}

class Cat extends Pet {
    public String speak () {
        return "meaw meaw!";
    }
}