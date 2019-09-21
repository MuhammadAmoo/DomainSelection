package com.amoo.repository.Impl.lawEnforcer;

import com.amoo.domain.lawenforcer.LawEnforcer;
import com.amoo.repository.IRepository;

import java.util.Set;

public interface LawEnforcerRepository extends IRepository<LawEnforcer, String> {
    Set<LawEnforcer> getAll();

}
