package com.github.ioloolo.template.domain.user.dto.response;

public record TokenResponse(
        String accessToken,
        String refreshToken
) {}
