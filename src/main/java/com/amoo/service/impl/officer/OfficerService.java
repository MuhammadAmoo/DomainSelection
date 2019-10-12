package com.amoo.service.impl.officer;

import com.amoo.domain.officer.Officer;
import com.amoo.service.IService;

import java.util.Set;

public interface OfficerService extends IService<Officer, String> {
    Set<Officer> getAll();
}
