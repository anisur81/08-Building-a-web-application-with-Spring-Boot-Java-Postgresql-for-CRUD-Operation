package com.anis.portfolio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contactreq")
public class ContactReq {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "orgtitle", nullable = false, length = 150)
    private String orgTitle;

    @Column(name = "phoneno", nullable = false, length = 20)
    private String phoneNo;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 250)
    private String address;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String comment;

    public ContactReq() {
    }

    public ContactReq(String orgTitle,
                      String phoneNo,
                      String email,
                      String address,
                      String comment) {
        this.orgTitle = orgTitle;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgTitle() {
        return orgTitle;
    }

    public void setOrgTitle(String orgTitle) {
        this.orgTitle = orgTitle;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}