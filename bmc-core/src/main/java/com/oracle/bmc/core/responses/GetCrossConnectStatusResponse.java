/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.responses;

import java.io.*;
import java.util.*;

import com.oracle.bmc.model.*;
import javax.ws.rs.core.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Builder(builderClassName = "Builder")
@Getter
public class GetCrossConnectStatusResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned CrossConnectStatus instance.
     */
    private CrossConnectStatus crossConnectStatus;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetCrossConnectStatusResponse o) {
            opcRequestId(o.getOpcRequestId());
            crossConnectStatus(o.getCrossConnectStatus());

            return this;
        }
    }
}
