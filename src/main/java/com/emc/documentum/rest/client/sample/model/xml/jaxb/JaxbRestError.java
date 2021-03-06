/*
 * Copyright (c) 2018. OPEN TEXT Corporation. All Rights Reserved.
 */
package com.emc.documentum.rest.client.sample.model.xml.jaxb;

import java.util.Objects;

import javax.xml.bind.annotation.XmlRootElement;

import com.emc.documentum.rest.client.sample.client.util.Equals;
import com.emc.documentum.rest.client.sample.model.RestError;

@XmlRootElement(name="error")
public class JaxbRestError implements RestError {
    private int status;
    private String code;
    private String message;
    private String details;
    private String id;

    @Override
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        JaxbRestError that = (JaxbRestError)obj;
        return Equals.equal(id, that.id)
            && Equals.equal(status, that.status) 
            && Equals.equal(code, that.code)
            && Equals.equal(message, that.message)
            && Equals.equal(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, code, message, details);
    }
}
