package com.skill_mentor.server.skill_mentor_server.repository;


import com.skill_mentor.server.skill_mentor_server.entity.ClassRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends JpaRepository<ClassRoomEntity, Integer> {

}