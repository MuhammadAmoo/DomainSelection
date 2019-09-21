package com.amoo.repository.Impl.driver;

import com.amoo.domain.driver.Address;
import com.amoo.repository.IRepository;

import java.util.Set;

public interface AddressRepository extends IRepository<Address, String> {
    Set<Address> getAll();
}
