package util;

import jakarta.persistence.EntityManager;
import repository.AddressRepository;
import repository.UserAccountRepository;
import repository.impl.AddressRepositoryImpl;
import repository.impl.UserAccountRepositoryImpl;
import service.AddressService;
import service.UserAccountService;
import service.impl.AddressServiceImpl;
import service.impl.UserAccountServiceImpl;

public class ApplicationContext {
    private static UserAccountRepository userAccountRepository;
    private static UserAccountService userAccountService;

    private static AddressRepository addressRepository;
    private static AddressService addressService;


    static {
        EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        userAccountRepository = new UserAccountRepositoryImpl(entityManager);
        userAccountService = new UserAccountServiceImpl(userAccountRepository);

        addressRepository = new AddressRepositoryImpl(entityManager);
        addressService = new AddressServiceImpl(addressRepository);


    }

    public static UserAccountService getUserAccountService() {
        return userAccountService;
    }

    public static AddressService getAddressService() {
        return addressService;
    }
}
