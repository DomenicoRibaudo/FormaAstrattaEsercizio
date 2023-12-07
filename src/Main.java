public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(3, 6);
        rettangolo.calcolaArea();
        System.out.println("L'area del rettangolo è = " + rettangolo.calcolaArea());

        Triangolo triangolo = new Triangolo(2, 6);
        triangolo.calcolaArea();
        System.out.println("L'area del triangolo è  = " + triangolo.calcolaArea());

    }
}
