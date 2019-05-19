package com.amoo.repository.Impl.Impl.lawEnforcer;

import com.amoo.domain.LawEnforcer.LawEnforcer;
import com.amoo.repository.Impl.IRepository;

import java.util.Set;

public interface LawEnforcerRepository extends IRepository<LawEnforcer, String> {
    Set<LawEnforcer> getAll();

}
