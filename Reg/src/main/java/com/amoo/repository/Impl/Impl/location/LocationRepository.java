package com.amoo.repository.Impl.Impl.location;

import com.amoo.domain.Location.Location;
import com.amoo.repository.Impl.IRepository;

import java.util.Set;


public interface LocationRepository extends IRepository<Location, Integer> {
    Set<Location> getAll();

}
