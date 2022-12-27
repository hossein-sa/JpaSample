import entity.Address;
import entity.UserAccount;
import util.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("20", "Farah", "Susan");
        UserAccount user1 = new UserAccount("Aref", "Sa", "1234567890", address);
        ApplicationContext.getAddressService().save(address);
        ApplicationContext.getUserAccountService().save(user1);


    }
}
