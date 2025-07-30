package com.example.skill_mentor_platform.repository;

import com.example.skill_mentor_platform.entity.LiteSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiteSessionRepository extends JpaRepository<LiteSessionEntity, Integer> {
}
