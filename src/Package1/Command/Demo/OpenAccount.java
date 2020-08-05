package Package1.Command.Demo;

public class OpenAccount implements Command {
    Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.open();
    }
}
