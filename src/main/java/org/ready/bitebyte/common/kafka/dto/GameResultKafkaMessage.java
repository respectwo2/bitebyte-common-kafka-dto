package org.ready.bitebyte.common.kafka.dto;

import java.util.List;

public record GameResultKafkaMessage(
        String gameId,
        String roomId,
        String mode,
        long timestamp,
        List<MemberResult> results
) {
}