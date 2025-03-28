
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.aspectj.testing.Tester;

/** @testcase PR#36778 advise join points in subclass of empty interface */
public class EmptyInterfaceCE {

    public static void main(String[] args) {
        new C().go();
        // at least constructor and method execution
        if (2 > Log.hits) {
            Tester.check(false, Log.log.toString());
        }
    }
}

aspect Log {
    static int hits;
    static StringBuffer log = new StringBuffer();
    interface LoggedType {
    }
    declare parents: C implements LoggedType;
    @SuppressAjWarnings("adviceDidNotMatch") void around() : staticinitialization(LoggedType) // CE: limitation
        {
        hits++;
        log.append(thisJoinPoint + ";");
    }
}

class C {
    void go() {}
}
