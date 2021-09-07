public class Dogs {


    public static void dogInfo(int legs, String color) {
        System.out.println("The dog has " + legs + " legs and is the colour " + color);
    }

    public static void main(String[] args) {

        int dog_legs = 8;
        String dog_color = "brown";
    dogInfo(dog_legs, dog_color);
    }
    }
