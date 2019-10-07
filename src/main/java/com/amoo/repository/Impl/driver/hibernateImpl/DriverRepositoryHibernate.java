package com.amoo.repository.Impl.driver.hibernateImpl;

import com.amoo.domain.driver.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepositoryHibernate extends JpaRepository<Driver, String>
{

}
