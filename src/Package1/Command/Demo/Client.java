package Package1.Command.Demo;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("huy8895");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);

        BankApp bankApp = new BankApp(open,close);
        bankApp.clickCloseAccount();
        bankApp.clickCloseAccount();
    }
}
