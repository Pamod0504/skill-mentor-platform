package com.example.skill_mentor_platform.repository;

import com.example.skill_mentor_platform.entity.MentorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MentorRepository extends JpaRepository<MentorEntity, Integer> {
    /**
     * Finds a mentor by their clerk ID.
     *
     * @param clerkId the clerk ID of the mentor
     * @return the MentorEntity if found, otherwise null
     */
    Optional<MentorEntity> findByClerkMentorId(String clerkId);
}
