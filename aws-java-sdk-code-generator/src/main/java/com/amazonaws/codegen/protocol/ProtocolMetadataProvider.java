/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.codegen.protocol;

/**
 * Provides various pieces of information that are specific to certain protocols.
 */
public interface ProtocolMetadataProvider {

    /**
     * @return True if protocol uses some form of JSON wire format. False otherwise.
     */
    boolean isJsonProtocol();

    /**
     * @return True if protocol uses XML as the wire format. False otherwise.
     */
    boolean isXmlProtocol();

    /**
     * @return True if protocol uses CBOR as the wire format. False otherwise.
     */
    boolean isCborProtocol();

    /**
     * @return The content type to use when sending requests. Currently only respected by JSON
     * protocols.
     */
    String getContentType();

    /**
     * @return The name of the Unmarshaller Context class used by the generated unmarshaller
     * classes.
     */
    String getUnmarshallerContextClassName();

    /**
     * @return The suffix for generated unmarshaller classes. I.e. FooStaxUnmarshaller or
     * FooJsonUnmarshaller.
     */
    String getUnmarshallerClassSuffix();

    /**
     * @return The default implementation of exception unmarshallers to use or derive from.
     * Currently only used by XML protocols.
     */
    String getExceptionUnmarshallerImpl();
}
