package com.example.task_manager.entities.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
