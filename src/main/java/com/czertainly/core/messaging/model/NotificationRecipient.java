package com.czertainly.core.messaging.model;

import com.czertainly.core.enums.RecipientTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class NotificationRecipient {
    private RecipientTypeEnum recipientType;

    private UUID recipientUuid;

    public static List<NotificationRecipient> buildUserNotificationRecipient(UUID userUuid) {
        return userUuid != null ? List.of(new NotificationRecipient(RecipientTypeEnum.USER, userUuid)) : null;
    }

    public static List<NotificationRecipient> buildGroupNotificationRecipient(UUID groupUuid) {
        return groupUuid != null ? List.of(new NotificationRecipient(RecipientTypeEnum.GROUP, groupUuid)) : null;
    }

    public static List<NotificationRecipient> buildRoleNotificationRecipient(UUID roleUuid) {
        return roleUuid != null ? List.of(new NotificationRecipient(RecipientTypeEnum.ROLE, roleUuid)) : null;
    }
}
