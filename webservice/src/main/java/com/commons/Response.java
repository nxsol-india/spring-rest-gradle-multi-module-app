package com.commons;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response implements Serializable {

    private static final long serialVersionUID = 6474479867580063500L;

    private ResultCode status;
    private Object data;
    private String message;

    public Response(ResultCode status, String message) {
        this.status = status;
        this.message = message;
    }

	public Response setResult(Object data) {
        this.data = data;
        return this;
    }

	public ResultCode getStatus() {
		return status;
	}

	public void setStatus(ResultCode status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
