package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import entity.UserAccount;
import jakarta.persistence.EntityManager;
import repository.UserAccountRepository;

public class UserAccountRepositoryImpl extends BaseRepositoryImpl<UserAccount, Long> implements UserAccountRepository {
    public UserAccountRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<UserAccount> getEntityClass() {
        return UserAccount.class;
    }
}
