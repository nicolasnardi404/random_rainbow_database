package com.randomrainbow.springboot.demosecurity.service;

import org.springframework.web.multipart.MultipartFile;

import com.randomrainbow.springboot.demosecurity.entity.User;


public interface EmailService  {

    void sendVerificationEmail(User user, String token);

    void sendPasswordResetEmail(User user, String resetToken);
}