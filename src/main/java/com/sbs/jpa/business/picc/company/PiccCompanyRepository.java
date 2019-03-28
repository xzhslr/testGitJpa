package com.sbs.jpa.business.picc.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PiccCompanyRepository extends JpaRepository<PiccCompany, Integer> {

//    List<PiccCompany> findByComnameStartsWith(@Param("comname") String comname);

    List<PiccCompany> findByComnameStartsWith(String comname);

    @Query(value = "select * from Picc_Company where comname like '?0%' order by id", nativeQuery = true)
    List<PiccCompany> selectByCombaneList(@Param("comname") String comname);


    List<PiccCompany> findByComname(String comname);

}
