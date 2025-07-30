package com.example.skill_mentor_platform.repository;

import com.example.skill_mentor_platform.entity.ClassRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends JpaRepository<ClassRoomEntity, Integer> {

}