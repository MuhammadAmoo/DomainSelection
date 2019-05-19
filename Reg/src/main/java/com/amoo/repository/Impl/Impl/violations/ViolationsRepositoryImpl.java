package com.amoo.repository.Impl.Impl.violations;

import com.amoo.domain.Violations.Violation;

import java.util.HashSet;
import java.util.Set;

public class ViolationsRepositoryImpl implements ViolationsRepository{

    private static ViolationsRepositoryImpl repository = null;
    Set<Violation> violations;

    private ViolationsRepositoryImpl (){
        this.violations = new HashSet<>();
    }

    public static ViolationsRepositoryImpl getViolation(){
        if(repository == null) repository = new ViolationsRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Violation> getAll() {
        return null;
    }

    @Override
    public Violation create(Violation violation) {
        violations.add(violation);
        return violation;
    }

    @Override
    public Violation read(Integer violation_num) {
        return search(violation_num);
    }

    @Override
    public Violation update(Violation violation) {
        Violation find = search(violation.getViolation_id());
        if(violations.contains(find)){
            violations.remove(find);
            violations.add(violation);
        }
        return violation;
    }

    @Override
    public void delete(Integer violation_num)
    {
        violations.remove(search(violation_num));

    }

    public Violation search(Integer violation_num){
        return violations.stream().filter(violations -> violations.getViolation_id() == violation_num).findAny().orElse(null);
    }

}
