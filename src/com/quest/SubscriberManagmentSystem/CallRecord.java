package com.quest.SubscriberManagmentSystem;

import java.time.LocalDateTime;
import java.io.Serializable;

public class CallRecord implements Serializable {
    private String subscriberId;
    private String callType; // Local/STD/ISD
    private int duration; // in minutes
    private LocalDateTime timestamp;

    public CallRecord(String subscriberId, String callType, int duration) {
        this.subscriberId = subscriberId;
        this.callType = callType;
        this.duration = duration;
        this.timestamp = LocalDateTime.now();
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public String getCallType() {
        return callType;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "CallRecord [SubscriberID=" + subscriberId + ", Type=" + callType +
                ", Duration=" + duration + " mins, Timestamp=" + timestamp + "]";
    }
}


