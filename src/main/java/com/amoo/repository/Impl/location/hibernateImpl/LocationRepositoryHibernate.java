package com.amoo.repository.Impl.location.hibernateImpl;

import com.amoo.domain.location.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepositoryHibernate extends JpaRepository<Location, Integer>
{

}
