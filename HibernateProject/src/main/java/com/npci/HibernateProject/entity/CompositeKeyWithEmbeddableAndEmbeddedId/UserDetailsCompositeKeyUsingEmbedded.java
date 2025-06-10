package com.npci.HibernateProject.entity.CompositeKeyWithEmbeddableAndEmbeddedId;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserDetailsCompositeKeyUsingEmbedded implements Serializable {
    private String userName;
    private String address;

    public UserDetailsCompositeKeyUsingEmbedded(){

    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if (!(obj instanceof UserDetailsCompositeKeyUsingEmbedded)){
            return false;
        }
        UserDetailsCompositeKeyUsingEmbedded userCK=(UserDetailsCompositeKeyUsingEmbedded) obj;

        return this.userName.equals(userCK.userName)&& this.address.equals(userCK);

    }
    @Override
    public int hashCode(){
        return Objects.hash(userName,address);

    }
}
