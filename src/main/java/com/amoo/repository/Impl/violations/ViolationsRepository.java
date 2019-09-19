package com.amoo.repository.Impl.violations;

import com.amoo.domain.Violations.Violation;
import com.amoo.repository.IRepository;

import java.util.Set;

public interface ViolationsRepository extends IRepository<Violation, Integer> {
    Set<Violation> getAll();
}

