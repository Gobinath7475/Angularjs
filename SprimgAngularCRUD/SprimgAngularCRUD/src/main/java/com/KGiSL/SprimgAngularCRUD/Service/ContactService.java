package com.KGiSL.SprimgAngularCRUD.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.KGiSL.SprimgAngularCRUD.Entity.Contact;

@Service

public interface ContactService {

    List<Contact> getAllContacts();

    Contact createContact(Contact contact);

    Contact getContactById(long id);

    Contact updateContact(int id, Contact updatedContact);

    void deleteContact(int id);
} 
