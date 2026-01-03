public class Client {

    public static void main(String[] args) {
        Lazy lazy = Lazy.getLazy();
        Eager eager = Eager.getEager();

        System.out.println(lazy.hashCode());
        System.out.println(lazy.hashCode());
        System.out.println(eager.hashCode());
        System.out.println(eager.hashCode());

    }
}
