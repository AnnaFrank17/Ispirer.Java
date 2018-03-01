import exceptions.ExceptionAAA1;
import exceptions.ExceptionAAA2;
import exceptions.ExceptionAAA3;

public class AAA {
    public AAA(Integer i) throws ExceptionAAA1 {
        if(i == null) {
            throw new ExceptionAAA1("ExcAAA1");
        }
    }

    public void methode(int i) throws ExceptionAAA2, ExceptionAAA3 {
        if(i == 0) {
            throw new ExceptionAAA2("ExcAAA2");
        } else if (i < 0) {
            throw new ExceptionAAA3("ExcAAA3");
        }
    }
}
