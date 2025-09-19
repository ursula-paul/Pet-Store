public class PetStore {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pet Store!");

        String storeName = "Happy pets";
        int numOfDogs = 6;
        int numOfCats = 5;
        double priceOfDogs = 160.0;
        double priceOfCats = 150.0;
        double revenueMade = 0.0;

        numOfDogs = numOfDogs - 1;
        revenueMade = revenueMade + priceOfDogs;
        numOfCats = numOfCats + 2;
        numOfCats = numOfCats - 1;
        revenueMade = revenueMade + priceOfCats;

        System.out.println(storeName);
        System.out.println("Dogs left: " + numOfDogs);
        System.out.println("Cats left: " + numOfCats);
        // System.out.println("Total revenue: " + revenueMade);
        System.out.println("Total revenue: " + revenueMade);

    }
}