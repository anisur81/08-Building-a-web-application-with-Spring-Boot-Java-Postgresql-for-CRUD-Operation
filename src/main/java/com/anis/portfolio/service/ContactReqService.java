package com.anis.portfolio.service;

import com.anis.portfolio.entity.ContactReq;

import java.util.List;
import java.util.Optional;

public interface ContactReqService {

    ContactReq save(ContactReq contactReq);

    List<ContactReq> findAll();

    Optional<ContactReq> findById(Long id);

    ContactReq update(ContactReq contactReq);

    void deleteById(Long id);
}