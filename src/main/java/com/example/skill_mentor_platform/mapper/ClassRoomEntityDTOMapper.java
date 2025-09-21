package com.example.skill_mentor_platform.mapper;

import com.example.skill_mentor_platform.dto.ClassRoomDTO;
import com.example.skill_mentor_platform.entity.ClassRoomEntity;

public class ClassRoomEntityDTOMapper {
    public static ClassRoomDTO map(ClassRoomEntity classroomEntity) {
        ClassRoomDTO classroomDTO = new ClassRoomDTO();
        classroomDTO.setClassRoomId(classroomEntity.getClassRoomId());
        classroomDTO.setTitle(classroomEntity.getTitle());
        classroomDTO.setEnrolledStudentCount(classroomEntity.getEnrolledStudentCount());
        classroomDTO.setImageUrl(classroomEntity.getImageUrl());
        return classroomDTO;
    }

    public static ClassRoomEntity map(ClassRoomDTO classroomDTO) {
        ClassRoomEntity classroomEntity = new ClassRoomEntity();
        classroomEntity.setClassRoomId(classroomDTO.getClassRoomId());
        classroomEntity.setTitle(classroomDTO.getTitle());
        classroomEntity.setEnrolledStudentCount(classroomDTO.getEnrolledStudentCount());
        classroomEntity.setImageUrl(classroomDTO.getImageUrl());
        return classroomEntity;
    }
}
