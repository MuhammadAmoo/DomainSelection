package com.amoo.repository.Impl.lawEnforcer;

import com.amoo.domain.lawenforcer.LawEnforcer;

import java.util.HashSet;
import java.util.Set;

public class LawEnforcerRepositoryImpl implements LawEnforcerRepository {

    private static LawEnforcerRepositoryImpl repository = null;
    Set<LawEnforcer> lawenforcers;

    private LawEnforcerRepositoryImpl (){
        this.lawenforcers = new HashSet<>();
    }

    public static LawEnforcerRepositoryImpl getLawEnforcer(){
        if(repository == null) repository = new LawEnforcerRepositoryImpl();
        return repository;
    }


    @Override
    public LawEnforcer create(LawEnforcer lawEnforcer) {
        lawenforcers.add(lawEnforcer);
        return lawEnforcer;
    }

    @Override
    public LawEnforcer read(String s) {
        return search(s);
    }

    @Override
    public LawEnforcer update(LawEnforcer lawEnforcer) {
        LawEnforcer find = search(lawEnforcer.getName());
        if(lawenforcers.contains(find)){
            lawenforcers.remove(find);
            lawenforcers.add(lawEnforcer);
        }
        return lawEnforcer;
    }

    @Override
    public void delete(String s) {
        lawenforcers.remove(search(s));
    }

    @Override
    public Set<LawEnforcer> getAll() {
        return lawenforcers;
    }

    public LawEnforcer search(String reg_Num){
        return lawenforcers.stream().filter(lawenforcers -> lawenforcers.getName() == reg_Num).findAny().orElse(null);
    }
}
