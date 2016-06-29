/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.gamelift.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ListAliasesRequest Marshaller
 */
public class ListAliasesRequestMarshaller implements
        Marshaller<Request<ListAliasesRequest>, ListAliasesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ListAliasesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListAliasesRequest> marshall(
            ListAliasesRequest listAliasesRequest) {

        if (listAliasesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListAliasesRequest> request = new DefaultRequest<ListAliasesRequest>(
                listAliasesRequest, "AmazonGameLift");
        request.addHeader("X-Amz-Target", "GameLift.ListAliases");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory
                    .createGenerator();

            jsonGenerator.writeStartObject();

            if (listAliasesRequest.getRoutingStrategyType() != null) {
                jsonGenerator.writeFieldName("RoutingStrategyType").writeValue(
                        listAliasesRequest.getRoutingStrategyType());
            }
            if (listAliasesRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(
                        listAliasesRequest.getName());
            }
            if (listAliasesRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(
                        listAliasesRequest.getLimit());
            }
            if (listAliasesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(
                        listAliasesRequest.getNextToken());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
