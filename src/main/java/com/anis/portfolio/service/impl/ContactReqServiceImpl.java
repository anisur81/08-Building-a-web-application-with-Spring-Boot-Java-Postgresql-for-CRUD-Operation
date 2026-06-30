package com.anis.portfolio.service.impl;

import com.anis.portfolio.entity.ContactReq;
import com.anis.portfolio.repository.ContactReqRepository;
import com.anis.portfolio.service.ContactReqService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactReqServiceImpl implements ContactReqService {

    private final ContactReqRepository repository;

    public ContactReqServiceImpl(ContactReqRepository repository) {
        this.repository = repository;
    }

    @Override
    public ContactReq save(ContactReq contactReq) {
        return repository.save(contactReq);
    }

    @Override
    public List<ContactReq> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ContactReq> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public ContactReq update(ContactReq contactReq) {
        return repository.save(contactReq);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}