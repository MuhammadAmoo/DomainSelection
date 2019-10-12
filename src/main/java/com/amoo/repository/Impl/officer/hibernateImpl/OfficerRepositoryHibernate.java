package com.amoo.repository.Impl.officer.hibernateImpl;

import com.amoo.domain.officer.Officer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficerRepositoryHibernate extends JpaRepository<Officer, String>
{

}
