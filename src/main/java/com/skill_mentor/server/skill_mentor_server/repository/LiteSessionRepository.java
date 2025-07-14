package com.skill_mentor.server.skill_mentor_server.repository;

import com.skill_mentor.server.skill_mentor_server.entity.LiteSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiteSessionRepository extends JpaRepository<LiteSessionEntity, Integer> {
}
