package com.anis.portfolio.repository;

import com.anis.portfolio.entity.ContactReq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactReqRepository extends JpaRepository<ContactReq, Long> {
}