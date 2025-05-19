package org.ready.bitebyte.common.kafka.dto;

public record MemberResult(
        int memberId,
        int score,
        int rank
) {}