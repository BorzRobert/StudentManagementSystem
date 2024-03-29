package com.example.StudentManagementSystem.service;

import com.example.StudentManagementSystem.dto.*;
import com.example.StudentManagementSystem.entity.Credentials;
import com.example.StudentManagementSystem.response.LoginResponse;
import com.example.StudentManagementSystem.response.RegistrationResponse;

public interface CredentialsService {
    RegistrationResponse addCredentials(CredentialsDTO credentialsDTO);

    LoginResponse loginCredentials(LoginDTO loginDTO);

    CredentialsDeleteResponseDto deleteCredentials(Integer id);

    CredentialsUpdateResponseDto updateCredentials(CredentialsUpdateRequestDto credentialsDTO);

    CredentialsGetResponseDto getCredentials(Integer id);
}
