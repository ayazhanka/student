public class Magazine {
    String Name;

    public String getName() {
        return Name;
    }

    public Magazine(String name) {
        Name = name;
    }
    public static void printMagazines(Printable[] printables) {
        for (Printable p:printables) {
            if (p instanceof Magazine) {
                System.out.println("Magazine name is =" + p.getName());
            }
        }
    }
}
