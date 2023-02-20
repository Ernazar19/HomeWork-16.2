public class Main {
    public static void main(String[] args) {
        Backend[] backends = {new Java(),
                              new CSharp(),
                              new  Paython()};
        for (Backend bac:backends) {
            System.out.println(bac);
            System.out.println(bac.getClass());
            boolean k = bac instanceof  Backend;
            System.out.println(k);

        }


    }
}