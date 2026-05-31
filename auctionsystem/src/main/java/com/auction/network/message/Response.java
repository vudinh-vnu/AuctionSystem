package com.auction.network.message;

import java.util.HashMap;
import java.util.Map;

/** Response. */
public final class Response {
    /** Command. */
    private String command;
    /** Status. */
    private String status;
    /** Message. */
    private String message;
    /** Payload. */
    private Map<String, Object> payload;

    /** Constructor. */
    public Response() {
        this.payload = new HashMap<>();
    }

    /**
     * Constructor.
     *
     * @param resCommand command
     * @param resStatus status
     * @param resMessage message
     */
    public Response(
            final String resCommand,
            final String resStatus,
            final String resMessage) {
        this.command = resCommand;
        this.status = resStatus;
        this.message = resMessage;
        this.payload = new HashMap<>();
    }

    /**
     * Thêm data.
     *
     * @param key key
     * @param value value
     */
    public void addData(final String key, final Object value) {
        this.payload.put(key, value);
    }

    /**
     * Get command.
     *
     * @return command
     */
    public String getCommand() {
        return command;
    }

    /**
     * Set command.
     *
     * @param resCommand command
     */
    public void setCommand(final String resCommand) {
        this.command = resCommand;
    }

    /**
     * Get status.
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set status.
     *
     * @param resStatus status
     */
    public void setStatus(final String resStatus) {
        this.status = resStatus;
    }

    /**
     * Get message.
     *
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set message.
     *
     * @param resMessage message
     */
    public void setMessage(final String resMessage) {
        this.message = resMessage;
    }

    /**
     * Get payload.
     *
     * @return payload
     */
    public Map<String, Object> getPayload() {
        return payload;
    }

    /**
     * Set payload.
     *
     * @param resPayload payload
     */
    public void setPayload(final Map<String, Object> resPayload) {
        this.payload = resPayload;
    }
}