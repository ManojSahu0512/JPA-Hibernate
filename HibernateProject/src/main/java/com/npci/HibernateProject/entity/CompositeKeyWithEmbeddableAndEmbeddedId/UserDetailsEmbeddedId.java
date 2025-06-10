package com.npci.HibernateProject.entity.CompositeKeyWithEmbeddableAndEmbeddedId;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Table(name = "user_detail_embedded")
@Entity
public class UserDetailsEmbeddedId {

    @EmbeddedId
    UserDetailsCompositeKeyUsingEmbedded userDetailsCK;


    public UserDetailsEmbeddedId(){

    }

}
