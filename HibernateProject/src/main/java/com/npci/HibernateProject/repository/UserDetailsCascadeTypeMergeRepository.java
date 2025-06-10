package com.npci.HibernateProject.repository;

import com.npci.HibernateProject.entity.Association.CascadeType.MergeExp.UserDetailsMerge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsCascadeTypeMergeRepository extends JpaRepository<UserDetailsMerge,Long> {

}
