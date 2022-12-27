package service.impl;

import base.service.impl.BaseServiceImpl;
import entity.UserAccount;
import repository.UserAccountRepository;
import service.UserAccountService;

public class UserAccountServiceImpl extends BaseServiceImpl<UserAccount, Long, UserAccountRepository> implements UserAccountService {
    public UserAccountServiceImpl(UserAccountRepository repository) {
        super(repository);
    }
}
