import exceptions.ExceptionAAA1;
import exceptions.ExceptionAAA2;
import exceptions.ExceptionAAA3;

public class Main {

    public static void main(String[] args) {

        try {
            AAA aaa = new AAA(null);
            AAA withoutExc = new AAA(5);
            withoutExc.methode(0);
            withoutExc.methode(-1);
        } catch (ExceptionAAA1 exceptionAAA1) {
            System.out.println(exceptionAAA1.getMessage());
        } catch (ExceptionAAA3 exceptionAAA3) {
            System.out.println(exceptionAAA3.getMessage());
        } catch (ExceptionAAA2 exceptionAAA2) {
            System.out.println(exceptionAAA2.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
