public class TiposVariaveis {
    public static void main(String[] args) {
        String firstName = "Fabiana";
        String lastName = "Ignácio";
        String fullName = fullName(firstName, lastName);
        int age = 25;

        System.out.println(fullName + " - " + age + "anos");


    }

    public static String fullName(String firstName, String lastName) {
        return ("Full Name: ").concat(firstName).concat(" ").concat(lastName);
    }
}
