package com.auction.network.message;

import java.util.HashMap;
import java.util.Map;

/** Request. */
public final class Request {
    /** Command. */
    private String command;
    /** Payload. */
    private Map<String, Object> payload;

    /** Constructor. */
    public Request() {
        this.payload = new HashMap<>();
    }

    /**
     * Constructor.
     *
     * @param reqCommand command
     */
    public Request(final String reqCommand) {
        this.command = reqCommand;
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
     * @param reqCommand command
     */
    public void setCommand(final String reqCommand) {
        this.command = reqCommand;
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
     * @param reqPayload payload
     */
    public void setPayload(final Map<String, Object> reqPayload) {
        this.payload = reqPayload;
    }
}