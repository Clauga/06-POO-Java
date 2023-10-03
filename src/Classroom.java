public class Classroom {
    public static void main(String[] args) {
        Wilder Mohamend = new Wilder("Mohamend", true);
        Wilder Elodie = new Wilder("Elodie", false);
        Wilder Benjamin = new Wilder("Benjamin", true);

        System.out.println(Mohamend.whoAmI());
        System.out.println(Elodie.whoAmI());
        System.out.println(Benjamin.whoAmI());
    }
}
