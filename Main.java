class Main extends Unicorn{
    public static void main (String[] args) {
        Unicorn maLicorne = new Unicorn();
        maLicorne.name = "sup";
        System.out.println(maLicorne.name);
    }
}

class Unicorn {
    String name;
}