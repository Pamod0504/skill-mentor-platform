package com.skill_mentor.server.skill_mentor_server.mapper;

import com.skill_mentor.server.skill_mentor_server.dto.SessionLiteDTO;
import com.skill_mentor.server.skill_mentor_server.entity.LiteSessionEntity;

public class LiteSessionEntityDTOMapper {

    public static LiteSessionEntity map(SessionLiteDTO sessionLiteDTO) {
        if (sessionLiteDTO == null) {
            return null;
        }
        LiteSessionEntity liteSessionEntity = new LiteSessionEntity();
        liteSessionEntity.setSessionId(sessionLiteDTO.getSessionId());
        liteSessionEntity.setStudentId(sessionLiteDTO.getStudentId());
        liteSessionEntity.setClassRoomId(sessionLiteDTO.getClassRoomId());
        liteSessionEntity.setMentorId(sessionLiteDTO.getMentorId());
        liteSessionEntity.setTopic(sessionLiteDTO.getTopic());
        liteSessionEntity.setStartTime(sessionLiteDTO.getStartTime());
        liteSessionEntity.setEndTime(sessionLiteDTO.getEndTime());
        return liteSessionEntity;
    }

    public static SessionLiteDTO map(LiteSessionEntity liteSessionEntity) {
        if (liteSessionEntity == null) {
            return null;
        }
        SessionLiteDTO sessionLiteDTO = new SessionLiteDTO();
        sessionLiteDTO.setSessionId(liteSessionEntity.getSessionId());
        sessionLiteDTO.setStudentId(liteSessionEntity.getStudentId());
        sessionLiteDTO.setClassRoomId(liteSessionEntity.getClassRoomId());
        sessionLiteDTO.setMentorId(liteSessionEntity.getMentorId());
        sessionLiteDTO.setTopic(liteSessionEntity.getTopic());
        sessionLiteDTO.setStartTime(liteSessionEntity.getStartTime());
        sessionLiteDTO.setEndTime(liteSessionEntity.getEndTime());
        return sessionLiteDTO;
    }
}