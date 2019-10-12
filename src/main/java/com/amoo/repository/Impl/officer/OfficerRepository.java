package com.amoo.repository.Impl.officer;

import com.amoo.domain.officer.Officer;
import com.amoo.repository.IRepository;
import java.util.Set;


public interface OfficerRepository extends IRepository<Officer, String> {
    Set<Officer> getAll();
}
