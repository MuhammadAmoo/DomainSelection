//package com.amoo.repository.Impl.officer;
//
//import com.amoo.domain.officer.Officer;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Repository("Officer")
//public class OfficerRepositoryImpl implements OfficerRepository{
//
////    private static OfficerRepositoryImpl repository = null;
////    Set<Officer> officers;
////
////    private OfficerRepositoryImpl()
////    {
////        this.officers = new HashSet<>();
////    }
////
////    public static OfficerRepositoryImpl getOfficer()
////    {
////        if(repository == null) repository = new OfficerRepositoryImpl();
////        return repository;
////    }
////
////    @Override
////    public Officer create(Officer officer) {
////        officers.add(officer);
////        return officer;
////    }
////
////    @Override
////    public Officer read(Integer s){
////        return search(s);
////    }
////
////    @Override
////    public Officer update(Officer officer) {
////        Officer find = search(Officer.getOfficerId());
////        if(officers.contains(find)){
////            officers.remove(find);
////            officers.add(officer);
////        }
////        return officer;
////    }
////
////    @Override
////    public void delete(Integer s){
////        officers.remove(serach());
////    }
////
////    @Override
////    public Set<Officer> getAll() {
////        return officers;
////    }
////
////
//////    public Officer search(Integer id) {
//////        return of.stream().filter(loc -> loc.getOfficer_id() == id).findAny().orElse(null);
//////
//////    }
//}
