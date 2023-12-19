package com.KGiSL.SprimgAngularCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KGiSL.SprimgAngularCRUD.Entity.Contact;

public interface ContactRepository  extends JpaRepository<Contact , Integer>{

    
} 