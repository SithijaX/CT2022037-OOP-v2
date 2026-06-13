import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        char petType;
        int count = 0;
        Pet[] pets = new Pet[100];

        while (true) {
            if (count == 100 ) {
                break;
            }

            System.out.print("Enter pet's name ('STOP' for end) : ");
            name = sc.nextLine();

            if(name.equals("STOP")) {
                break;
            }

            System.out.print("pet-type ('d' for Dog, 'c' for Cat): ");
            petType = sc.next().charAt(0);
            sc.nextLine();

            if (petType == 'd' || petType == 'D'){
                pets[count] = new Dog();
            } else if (petType == 'c' || petType == 'C') {
                pets[count] = new Cat();
            }
            else {
                System.out.println("Invalid input!");
                continue;
            }

            pets[count].setName(name);
            count++;
        }
        System.out.println("Pet Name\tPet Type");

        for (int i=0; i<count; i++) {
            System.out.println(pets[i].getName() + "\t\t" + pets[i].getType());
        }
    }
}
