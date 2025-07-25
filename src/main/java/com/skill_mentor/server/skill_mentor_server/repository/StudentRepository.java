package com.skill_mentor.server.skill_mentor_server.repository;

import com.skill_mentor.server.skill_mentor_server.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    /**
     * Finds a student by their clerk student ID.
     *
     * @param clerkStudentId the clerk student ID of the student
     * @return an Optional containing the StudentEntity if found, otherwise empty
     */
    Optional<StudentEntity> findByClerkStudentId(String clerkStudentId);
}
