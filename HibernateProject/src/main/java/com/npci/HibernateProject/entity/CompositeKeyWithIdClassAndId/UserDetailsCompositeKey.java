package com.npci.HibernateProject.entity.CompositeKeyWithIdClassAndId;

import java.io.Serializable;
import java.util.Objects;

public class UserDetailsCompositeKey implements Serializable {
    private String userName;
    private String address;

    public UserDetailsCompositeKey(){

    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if (!(obj instanceof UserDetailsCompositeKey)){
            return false;
        }
        UserDetailsCompositeKey userCK=(UserDetailsCompositeKey) obj;

        return this.userName.equals(userCK.userName)&& this.address.equals(userCK);

    }
    @Override
    public int hashCode(){
        return Objects.hash(userName,address);

    }
}
