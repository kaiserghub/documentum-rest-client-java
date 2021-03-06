/*
 * Copyright (c) 2018. OPEN TEXT Corporation. All Rights Reserved.
 */
package com.emc.documentum.rest.client.sample.model.plain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.emc.documentum.rest.client.sample.model.Link;
import com.emc.documentum.rest.client.sample.model.LinkRelation;
import com.emc.documentum.rest.client.sample.model.RestObject;

/**
 * the plain RestObject implementation which has properties only
 * normally used when create/update the RestObject
 */
public class PlainRestObject implements RestObject {
    private final String type;
    private final Map<String, Object> properties;
    private final String href;

    public PlainRestObject(String type, Map<String, Object> properties) {
        this.properties = properties;
        this.type = type;
        this.href = null;
    }
    
    public PlainRestObject(Map<String, Object> properties) {
        this(null, properties);
    }
    
    public PlainRestObject(String...properties) {
        if(properties == null || properties.length %2 != 0) {
            throw new IllegalArgumentException("the properties must be key value pair");
        }
        Map<String, Object> map = new HashMap<String, Object>();
        for(int i=0;i<properties.length;i+=2) {
            map.put(properties[i], properties[i+1]);
        }
        this.type = null;
        this.href = null;
        this.properties = map;
    }
    
    public PlainRestObject(String href) {
        this.href = href;
        this.type = null;
        this.properties = null;
    }
    
    @Override
    public String getObjectId() {
        return properties==null?null:(String)properties.get("r_object_id");
    }
    
    @Override
    public String getObjectName() {
        return properties==null?null:(String)properties.get("object_name");
    }
    
    @Override
    public String getObjectType() {
        return properties==null?null:(String)properties.get("r_object_type");
    }
    
    @Override
    public String getType() {
        return type;
    }

    @Override
    public Map<String, Object> getProperties() {
        return properties;
    }
    
    @Override
    public String getHref() {
        return href;
    }

    @Override
    public List<Link> getLinks() {
        return null;
    }

    @Override
    public String getHref(LinkRelation rel) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDefinition() {
        return null;
    }

    @Override
    public String getPropertiesType() {
        return null;
    }

    @Override
    public String getHref(LinkRelation rel, String title) {
        return null;
    }

    @Override
    public String self() {
        return null;
    }
}
