/**
 * @test /nodynamiccopyright/
 * @bug 7177306
 * @summary Regression: unchecked method call does not erase return type
 * @compile/fail/ref=T7177306e.out -XDrawDiagnostics T7177306e.java
 */

import java.util.List;

class T7177306e {

    <Z, U extends List<Z>> void m(List<U> lu) { }

    void test(List<List<?>> llw) {
       m(llw);
    }
}
