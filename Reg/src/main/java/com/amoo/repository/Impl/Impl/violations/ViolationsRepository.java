package com.amoo.repository.Impl.Impl.violations;

import com.amoo.domain.Violations.Violation;
import com.amoo.repository.Impl.IRepository;

import java.util.Set;

public interface ViolationsRepository extends IRepository<Violation, Integer> {
    Set<Violation> getAll();
}

