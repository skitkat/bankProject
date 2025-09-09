import org.example.SavingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SavingAccountTest {
    @Test
    public  void withdrawTest(){
        System.out.println("Testing withdraw");
        double opening_bal = 1000;
        SavingAccount sa2 = new SavingAccount(opening_bal);
        Assertions.assertTrue(sa2 != null);
        System.out.println("Object creation test case passed...");
        double amtToWithdraw = 500;
        sa2.withdraw(amtToWithdraw);
        double expected_bal = opening_bal - amtToWithdraw;
        Assertions.assertEquals(expected_bal, sa2.getBalance());
        System.out.println("After withdraw");
        sa2.getBalance();
        System.out.println("Withdraw testing done");
    }
}
