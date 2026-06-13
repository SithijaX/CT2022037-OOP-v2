import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        int count = 0;

        while(true) {
            try{
                System.out.print("Enter pet's name ('STOP' for end): ");
                String petName = sc.nextLine();

                //check if user want to end
                if(petName.equals("STOP")) {
                    break;
                }

                System.out.print("Enter pet's type ('c' for Cat , 'D' for Dog): ");
                char petType = sc.nextLine().charAt(0);

                if(petType == 'c' || petType == 'C') {
                    pets[count] = new Cat();
                    pets[count].setName(petName);
                } else if (petType == 'd' || petType == 'D') {
                    pets[count] = new Dog();
                    pets[count].setName(petName);
                }
                else {
                    System.out.println("Invalid input");
                    continue;
                }
                count++;
            } catch(Exception e) {
                System.out.println("!--array full--!");
                break;
            }
        }

        //get cats
        System.out.println("1. Cats:");
        for (int i = 0; i < count; i++) {
            if(pets[i] instanceof Cat) {
                System.out.println("\t"+((Cat)pets[i]).getName());
            }
        }

        //get dogs
        System.out.println("\n2. Dogs:");
        for(int i=0; i<count; i++){
            if(pets[i] instanceof Dog) {
                System.out.println("\t"+ ((Dog)pets[i]).getName());
            }
        }
        sc.close();
    }
}
