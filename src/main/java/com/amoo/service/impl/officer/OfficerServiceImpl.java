package com.amoo.service.impl.officer;

import com.amoo.domain.officer.Officer;
import com.amoo.repository.Impl.officer.hibernateImpl.OfficerRepositoryHibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("OfficerServiceImpl")
public class OfficerServiceImpl implements OfficerService{

    @Autowired
    private OfficerRepositoryHibernate repository;

    private OfficerServiceImpl(){

    }
//ask about crud not taking integer, and thats what you need
    @Override
    public Set<Officer> getAll() {
        return new HashSet<>(this.repository.findAll());
    }

    @Override
    public Officer create(Officer officer) {
        return this.create(officer);
    }

    @Override
    public Officer read(String string) {
        return this.repository.findById(string).orElse(null);
    }

    @Override
    public Officer update(Officer officer) {
        return this.update(officer);
    }

    @Override
    public void delete(String string) {this.repository.deleteById(string);
    }
}
