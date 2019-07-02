package effectivejava.chapter01_CreateAndDestoryObjects;

public class Item03_EnforceInstantiability {
}

/**
 * Noninstantiable utility class
 */
class Tool {
    static int sum(int a, int b) {
        return a + b;
    }

    static final String sign = "sign";

    /**
     * suppress default constructor for noninstantiability
     */
    private Tool() {
    }
}
