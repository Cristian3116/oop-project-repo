package packUnu;

public class Doi {
    int number = 800;

    public static void main(String[] args) {
        Doi obj1 = new Doi();
        Doi obj2 = new Doi();
        Doi obj3 = new Doi();

        obj1.number = 300;
        obj2.number = 400;

        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);

    }
}
