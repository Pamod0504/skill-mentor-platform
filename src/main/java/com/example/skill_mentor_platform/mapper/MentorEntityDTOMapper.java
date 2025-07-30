package com.example.skill_mentor_platform.mapper;


import com.example.skill_mentor_platform.dto.MentorDTO;
import com.example.skill_mentor_platform.entity.MentorEntity;

public class MentorEntityDTOMapper {
    public static MentorDTO map(MentorEntity mentorEntity) {
        MentorDTO mentorDTO = new MentorDTO();
        mentorDTO.setMentorId(mentorEntity.getMentorId());
        mentorDTO.setClerkMentorId(mentorEntity.getClerkMentorId());
        mentorDTO.setFirstName(mentorEntity.getFirstName());
        mentorDTO.setLastName(mentorEntity.getLastName());
        mentorDTO.setEmail(mentorEntity.getEmail());
        mentorDTO.setProfession(mentorEntity.getProfession());
        mentorDTO.setPhoneNumber(mentorEntity.getPhoneNumber());
        mentorDTO.setAddress(mentorEntity.getAddress());
        mentorDTO.setSessionFee(mentorEntity.getSessionFee());
        mentorDTO.setTitle(mentorEntity.getTitle());
        mentorDTO.setSubject(mentorEntity.getSubject());
        mentorDTO.setMentorImage(mentorEntity.getMentorImage());
        mentorDTO.setQualification(mentorEntity.getQualification());
        return mentorDTO;
    }

    public static MentorEntity map(MentorDTO mentorDTO) {
        MentorEntity mentorEntity = new MentorEntity();
        mentorEntity.setMentorId(mentorDTO.getMentorId());
        mentorEntity.setClerkMentorId(mentorDTO.getClerkMentorId());
        mentorEntity.setFirstName(mentorDTO.getFirstName());
        mentorEntity.setLastName(mentorDTO.getLastName());
        mentorEntity.setEmail(mentorDTO.getEmail());
        mentorEntity.setProfession(mentorDTO.getProfession());
        mentorEntity.setPhoneNumber(mentorDTO.getPhoneNumber());
        mentorEntity.setAddress(mentorDTO.getAddress());
        mentorEntity.setSessionFee(mentorDTO.getSessionFee());
        mentorEntity.setTitle(mentorDTO.getTitle());
        mentorEntity.setSubject(mentorDTO.getSubject());
        mentorEntity.setMentorImage(mentorDTO.getMentorImage());
        mentorEntity.setQualification(mentorDTO.getQualification());
        return mentorEntity;
    }
}