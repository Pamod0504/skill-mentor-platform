package com.skill_mentor.server.skill_mentor_server.service;

import com.skill_mentor.server.skill_mentor_server.common.Constants;
import com.skill_mentor.server.skill_mentor_server.dto.AuditDTO;
import com.skill_mentor.server.skill_mentor_server.dto.PaymentDTO;
import com.skill_mentor.server.skill_mentor_server.dto.SessionDTO;
import com.skill_mentor.server.skill_mentor_server.dto.SessionLiteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SessionService {

    /**
     * Creates a new session with the given session details.
     *
     * @param sessionDTO the session data to be created
     * @return the created session with its generated ID and saved values
     */
    SessionLiteDTO createSession(SessionLiteDTO sessionDTO);

    /**
     * Retrieves all session records with student, mentor, and classroom details.
     *
     * @return a list of all sessions
     */
    List<SessionDTO> getAllSessions();

    /**
     * Retrieves a list of session audit records.
     * This typically includes detailed info about each session for reporting or auditing.
     *
     * @return a list of session audit DTOs
     */
    List<AuditDTO> getAllAudits();

    /**
     * Finds total mentor payments within a given date range.
     *
     * @param startDate the start date in ISO format (e.g., "2024-01-01")
     * @param endDate   the end date in ISO format (e.g., "2024-01-31")
     * @return a list of payment DTOs showing mentor-wise totals
     */
    List<PaymentDTO> findMentorPayments(String startDate, String endDate);

    List<SessionDTO> getAllStudentSessions(String studentClerkId);

    /**
     * Updates the status of an existing session
     *
     * @param sessionId     the ID of the session to update
     * @param sessionStatus the new status to set
     * @return the updated session
     */
    SessionDTO updateSessionStatus(Integer sessionId, Constants.SessionStatus sessionStatus);
}
