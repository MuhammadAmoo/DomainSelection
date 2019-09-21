package com.amoo.repository.Impl.location;

import com.amoo.domain.location.Location;
import com.amoo.repository.IRepository;

import java.util.Set;


public interface LocationRepository extends IRepository<Location, Integer> {
    Set<Location> getAll();

}
