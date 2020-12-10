/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.example;

import java.util.List;

import com.ibm.cloud.blockchain.v3.Blockchain;
import com.ibm.cloud.blockchain.v3.model.GenericComponentResponse;
import com.ibm.cloud.blockchain.v3.model.GetComponentsByTypeOptions;
import com.ibm.cloud.blockchain.v3.model.GetComponentsByTypeOptions.Type;
import com.ibm.cloud.blockchain.v3.model.GetMultiComponentsResponse;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;

public class App {

    private App() {

    }

    public static void main(String[] args) {
        System.out.println("Application to Test Admin Access to IBP");

        try {
            // Create an IAM authenticator.
            IamAuthenticator authenticator = new IamAuthenticator(System.getenv("IAM_API_KEY"));

            Blockchain bc = new Blockchain("myIbp", authenticator);
            bc.setServiceUrl(System.getenv("IBP_SERVICE_INSTANCE_URL"));

            // get all the peer components
            GetComponentsByTypeOptions options = new GetComponentsByTypeOptions.Builder().type(Type.FABRIC_PEER)
                    .build();
            ServiceCall<GetMultiComponentsResponse> call = bc.getComponentsByType(options);
            Response<GetMultiComponentsResponse> response = call.execute();
            List<GenericComponentResponse> l = response.getResult().getComponents();

            System.out.println(l);
        } catch (ServiceResponseException e) {

            // essential to catch and get the debugging information
            RuntimeException wrappedError = new RuntimeException(e.getDebuggingInfo().toString());
            wrappedError.initCause(e);
            throw wrappedError;
        }
    }
}
