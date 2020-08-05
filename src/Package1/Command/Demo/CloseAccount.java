package Package1.Command.Demo;

public class CloseAccount implements Command {
    Account account;

    public CloseAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.close();
    }
}
