import java.io.Serial;
import java.io.Serializable;

// Lazy pattern
class Lazy implements Serializable {

    private static volatile Lazy lazy;

    // Another is just change this to ENUM so it requires no constructor or method so no changing via Reflection API either
    private Lazy() {
        if(lazy != null) {
            throw new RuntimeException("Breaking SingleTon Pattern");
        }
    }

    @Serial
    public Object readResolve() {
        return lazy;
    }

    public static Lazy getLazy() {

        if(lazy == null) {

            // Synchronized makes it thread safe
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }

        return lazy;
    }

}
