/*
 * Copyright (c) Taskdock, Inc. 2009-2010. All Rights Reserved.
 */

package com.taskdock.wsdoc;

public class JsonDict implements JsonType {

    private JsonType keyType;
    private JsonType valType;

    public JsonDict(JsonType keyType, JsonType valType) {
        this.keyType = keyType;
        this.valType = valType;
    }

    public JsonType getKeyType() {
        return keyType;
    }

    public JsonType getValueType() {
        return valType;
    }
}
