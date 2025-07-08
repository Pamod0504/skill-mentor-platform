package com.skill_mentor.server.skill_mentor_server.service.impl;


import com.skill_mentor.server.skill_mentor_server.dto.ClassRoomDTO;
import com.skill_mentor.server.skill_mentor_server.dto.MentorDTO;
import com.skill_mentor.server.skill_mentor_server.entity.ClassRoomEntity;
import com.skill_mentor.server.skill_mentor_server.exception.ClassRoomException;
import com.skill_mentor.server.skill_mentor_server.mapper.ClassRoomEntityDTOMapper;
import com.skill_mentor.server.skill_mentor_server.mapper.MentorEntityDTOMapper;
import com.skill_mentor.server.skill_mentor_server.repository.ClassRoomRepository;
import com.skill_mentor.server.skill_mentor_server.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {
    @Autowired
    private ClassRoomRepository classRoomRepository;

    @Override
    public List<ClassRoomDTO> getAllClassRooms() {
        final List<ClassRoomEntity> classRoomEntities = classRoomRepository.findAll();
        return classRoomEntities.stream().map(
                entity -> {
                    final ClassRoomDTO classRoomDTO = ClassRoomEntityDTOMapper.map(entity);
                    if (entity.getMentor() != null) {
                        final MentorDTO mentorDTO = MentorEntityDTOMapper.map(entity.getMentor());
                        classRoomDTO.setMentorDTO(mentorDTO);
                    }
                    return classRoomDTO;
                }
        ).toList();
    }

    @Override
    public ClassRoomDTO findClassRoomById(Integer id) {
        final Optional<ClassRoomEntity> classRoomEntity = classRoomRepository.findById(id);
        if (classRoomEntity.isEmpty()) {
            throw new ClassRoomException("ClassRoom not found");
        }

        final ClassRoomEntity entity = classRoomEntity.get();
        final ClassRoomDTO classRoomDTO = ClassRoomEntityDTOMapper.map(entity);
        if (entity.getMentor() != null) {
            final MentorDTO mentorDTO = MentorEntityDTOMapper.map(entity.getMentor());
            classRoomDTO.setMentorDTO(mentorDTO);
        }

        return classRoomDTO;
    }

    @Override
    public ClassRoomDTO deleteClassRoomById(Integer id) {
        final Optional<ClassRoomEntity> classRoomEntity = classRoomRepository.findById(id);
        if (classRoomEntity.isEmpty()) {
            throw new ClassRoomException("ClassRoom not found");
        }
        classRoomRepository.deleteById(id);
        return ClassRoomEntityDTOMapper.map(classRoomEntity.get());
    }

    @Override
    public ClassRoomDTO updateClassRoom(ClassRoomDTO classRoomDTO) {
        Optional<ClassRoomEntity> classRoomEntity = classRoomRepository.findById(classRoomDTO.getClassRoomId());
        if (classRoomEntity.isEmpty()) {
            throw new ClassRoomException("ClassRoom not found");
        }
        final ClassRoomEntity updatedEntity = classRoomEntity.get();
        updatedEntity.setTitle(classRoomDTO.getTitle());
        updatedEntity.setEnrolledStudentCount(classRoomDTO.getEnrolledStudentCount());
        final ClassRoomEntity savedEntity = classRoomRepository.save(updatedEntity);
        return ClassRoomEntityDTOMapper.map(savedEntity);
    }

    @Override
    public ClassRoomDTO createClassRoom(ClassRoomDTO classRoomDTO) {
        final ClassRoomEntity classRoomEntity = ClassRoomEntityDTOMapper.map(classRoomDTO);
        final ClassRoomEntity savedEntity = classRoomRepository.save(classRoomEntity);
        return ClassRoomEntityDTOMapper.map(savedEntity);
    }
}