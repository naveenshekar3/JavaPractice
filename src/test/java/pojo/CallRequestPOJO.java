package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CallRequestPOJO {
    @JsonProperty("From")
    private String From;
    @JsonProperty("To")
    private String To;
    @JsonProperty("CallerId")
    private String CallerId;
    @JsonProperty("Record")
    private boolean Record;
    @JsonProperty("StatusCallback")
    private String StatusCallback;
    @JsonProperty("StatusCallbackContentType")
    private String StatusCallbackContentType;
    @JsonProperty("StatusCallbackEvents")
    private List<String> StatusCallbackEvents;

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getCallerId() {
        return CallerId;
    }

    public void setCallerId(String callerId) {
        CallerId = callerId;
    }

    public boolean isRecord() {
        return Record;
    }

    public void setRecord(boolean record) {
        Record = record;
    }

    public String getStatusCallback() {
        return StatusCallback;
    }

    public void setStatusCallback(String statusCallback) {
        StatusCallback = statusCallback;
    }

    public String getStatusCallbackContentType() {
        return StatusCallbackContentType;
    }

    public void setStatusCallbackContentType(String statusCallbackContentType) {
        StatusCallbackContentType = statusCallbackContentType;
    }

    public List<String> getStatusCallbackEvents() {
        return StatusCallbackEvents;
    }

    public void setStatusCallbackEvents(List<String> statusCallbackEvents) {
        StatusCallbackEvents = statusCallbackEvents;
    }
}
