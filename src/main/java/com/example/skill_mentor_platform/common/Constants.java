package com.example.skill_mentor_platform.common;

import org.springframework.security.access.prepost.PreAuthorize;

public class Constants {
    public static final String APPLICATION_JSON = "application/json";

    public static final String ADMIN_ROLE_PERMISSION = "hasRole('ADMIN')";
//    public static final String MODERATOR_ROLE_PERMISSION = "hasRole('MODERATOR')";
    public static final String STUDENT_ROLE_PERMISSION = "hasRole('STUDENT')";

    public enum SessionStatus {
        PENDING,
        ACCEPTED,
        COMPLETED
    }
}
