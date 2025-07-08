package com.skill_mentor.server.skill_mentor_server.mapper;


import com.skill_mentor.server.skill_mentor_server.dto.ClassRoomDTO;
import com.skill_mentor.server.skill_mentor_server.entity.ClassRoomEntity;

public class ClassRoomEntityDTOMapper {
    public static ClassRoomDTO map(ClassRoomEntity classroomEntity) {
        ClassRoomDTO classroomDTO = new ClassRoomDTO();
        classroomDTO.setClassRoomId(classroomEntity.getClassRoomId());
        classroomDTO.setTitle(classroomEntity.getTitle());
        classroomDTO.setEnrolledStudentCount(classroomEntity.getEnrolledStudentCount());
        classroomDTO.setClassImage(classroomEntity.getClassImage());
        return classroomDTO;
    }

    public static ClassRoomEntity map(ClassRoomDTO classroomDTO) {
        ClassRoomEntity classroomEntity = new ClassRoomEntity();
        classroomEntity.setClassRoomId(classroomDTO.getClassRoomId());
        classroomEntity.setTitle(classroomDTO.getTitle());
        classroomEntity.setEnrolledStudentCount(classroomDTO.getEnrolledStudentCount());
        classroomEntity.setClassImage(classroomDTO.getClassImage());
        return classroomEntity;
    }
}
