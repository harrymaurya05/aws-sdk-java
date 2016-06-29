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

package com.amazonaws.services.config.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DescribeDeliveryChannelsRequest Marshaller
 */
public class DescribeDeliveryChannelsRequestMarshaller
        implements
        Marshaller<Request<DescribeDeliveryChannelsRequest>, DescribeDeliveryChannelsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeDeliveryChannelsRequestMarshaller(
            SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeDeliveryChannelsRequest> marshall(
            DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest) {

        if (describeDeliveryChannelsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeDeliveryChannelsRequest> request = new DefaultRequest<DescribeDeliveryChannelsRequest>(
                describeDeliveryChannelsRequest, "AmazonConfig");
        request.addHeader("X-Amz-Target",
                "StarlingDoveService.DescribeDeliveryChannels");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory
                    .createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> deliveryChannelNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeDeliveryChannelsRequest
                    .getDeliveryChannelNames();
            if (!deliveryChannelNamesList.isEmpty()
                    || !deliveryChannelNamesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("DeliveryChannelNames");
                jsonGenerator.writeStartArray();
                for (String deliveryChannelNamesListValue : deliveryChannelNamesList) {
                    if (deliveryChannelNamesListValue != null) {
                        jsonGenerator.writeValue(deliveryChannelNamesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
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
