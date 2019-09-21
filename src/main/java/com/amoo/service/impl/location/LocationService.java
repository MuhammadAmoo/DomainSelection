package com.amoo.service.impl.location;

import com.amoo.domain.location.Location;
import com.amoo.service.IService;

import java.util.Set;

public interface LocationService extends IService<Location, Integer> {
    Set<Location> getAll();
}

