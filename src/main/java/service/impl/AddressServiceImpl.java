package service.impl;

import base.service.impl.BaseServiceImpl;
import entity.Address;
import repository.AddressRepository;
import service.AddressService;

public class AddressServiceImpl extends BaseServiceImpl<Address,Long, AddressRepository> implements AddressService {
    public AddressServiceImpl(AddressRepository repository) {
        super(repository);
    }
}
