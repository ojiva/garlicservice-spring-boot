package com.wards.garlic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wards.garlic.domain.Profile;

@Repository
public interface ProfileRepository extends MongoRepository<Profile, String>{

}
