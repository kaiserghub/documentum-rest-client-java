/*
 * Copyright (c) 2018. OPEN TEXT Corporation. All Rights Reserved.
 */
package com.emc.documentum.rest.client.sample.client.util;

public class Equals {
    public static boolean equal(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }
}
