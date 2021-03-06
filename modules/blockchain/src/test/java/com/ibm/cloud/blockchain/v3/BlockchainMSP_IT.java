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

package com.ibm.cloud.blockchain.v3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.blockchain.test.SdkIntegrationTestBase;
import com.ibm.cloud.blockchain.v3.model.DeleteComponentResponse;
import com.ibm.cloud.blockchain.v3.model.EditMspOptions;
import com.ibm.cloud.blockchain.v3.model.GetMSPCertificateResponse;
import com.ibm.cloud.blockchain.v3.model.GetMspCertificateOptions;
import com.ibm.cloud.blockchain.v3.model.ImportMspOptions;
import com.ibm.cloud.blockchain.v3.model.MspResponse;
import com.ibm.cloud.blockchain.v3.model.RemoveComponentOptions;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Integration test class for the Blockchain service.
 */
public class BlockchainMSP_IT extends SdkIntegrationTestBase {
        public Blockchain service = null;
        public static Map<String, String> config = null;
        final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
        final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

        /**
         * This method provides our config filename to the base class.
         */

        public String getConfigFilename() {
                return "../../blockchain_v3.env";
        }

        public String prefix(String name) {
                return new StringBuilder().append("JavaIBPSDK_").append(name).toString();
        }

        @BeforeClass
        public void constructService() {
                // Ask super if we should skip the tests.
                if (skipTests()) {
                        return;
                }

                service = Blockchain.newInstance();
                assertNotNull(service);
                assertNotNull(service.getServiceUrl());

                // Load up our test-specific config properties.
                config = CredentialUtils.getServiceProperties(Blockchain.DEFAULT_SERVICE_NAME);
                assertNotNull(config);
                assertFalse(config.isEmpty());
                assertEquals(service.getServiceUrl(), config.get("URL"));

                System.out.println("Setup complete.");
        }

        String mspId;
        String mspUID;

        @Test()
        public void importMSP() throws Exception {
                try {
                        List<String> rootCerts = Arrays.asList(new String[] {
                                        "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUNHVENDQWIrZ0F3SUJBZ0lVY1NLNjBlUE9CNGI1MUIzekZsSnkrYkUzbnlnd0NnWUlLb1pJemowRUF3SXcKWWpFTE1Ba0dBMVVFQmhNQ1ZWTXhGekFWQmdOVkJBZ1REazV2Y25Sb0lFTmhjbTlzYVc1aE1SUXdFZ1lEVlFRSwpFd3RJZVhCbGNteGxaR2RsY2pFUE1BMEdBMVVFQ3hNR1JtRmljbWxqTVJNd0VRWURWUVFERXdwdmNtY3hZMkV4CkxXTmhNQjRYRFRJd01UQXhNekUwTlRFd01Gb1hEVE0xTVRBeE1ERTBOVEV3TUZvd1lqRUxNQWtHQTFVRUJoTUMKVlZNeEZ6QVZCZ05WQkFnVERrNXZjblJvSUVOaGNtOXNhVzVoTVJRd0VnWURWUVFLRXd0SWVYQmxjbXhsWkdkbApjakVQTUEwR0ExVUVDeE1HUm1GaWNtbGpNUk13RVFZRFZRUURFd3B2Y21jeFkyRXhMV05oTUZrd0V3WUhLb1pJCnpqMENBUVlJS29aSXpqMERBUWNEUWdBRXpHRmZMdWV6SmxYdDlBa1A3VmNBb0RVeGJvVDBpYUxTTWl4bDRkVi8Kay9sUm5XUUpSdFVZdGk0cWxOQVFqd2JNTlRmWVc2TjQwWG1rdEkxMzRrKyt6cU5UTUZFd0RnWURWUjBQQVFILwpCQVFEQWdFR01BOEdBMVVkRXdFQi93UUZNQU1CQWY4d0hRWURWUjBPQkJZRUZMbkRDWFNiZXFCc3plYy84Yi9FCmxFcG9hTVhITUE4R0ExVWRFUVFJTUFhSEJIOEFBQUV3Q2dZSUtvWkl6ajBFQXdJRFNBQXdSUUloQU16T2pBelIKR1lKL3F3eVh5Wm5EVXo2eU53S2VtTFVkendISEwyTU9FZXZ2QWlCd3VMZEZ6VlhubzY0ZEJSMG43czBMdk1XbQo0bTdNRFBZQzJzQlg4K3hIRXc9PQotLS0tLUVORCBDRVJUSUZJQ0FURS0tLS0tCg==" });
                        List<String> admins = Arrays.asList(new String[] {
                                        "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUI0ekNDQVlxZ0F3SUJBZ0lVV0J3NHcxMXNVVm9oU0N6WGZ4dWxQVzFRTDFRd0NnWUlLb1pJemowRUF3SXcKWWpFTE1Ba0dBMVVFQmhNQ1ZWTXhGekFWQmdOVkJBZ1REazV2Y25Sb0lFTmhjbTlzYVc1aE1SUXdFZ1lEVlFRSwpFd3RJZVhCbGNteGxaR2RsY2pFUE1BMEdBMVVFQ3hNR1JtRmljbWxqTVJNd0VRWURWUVFERXdwdmNtY3hZMkV4CkxXTmhNQjRYRFRJd01UQXhNekUwTlRVd01Gb1hEVEl4TVRBeE16RTFNREF3TUZvd0lERU9NQXdHQTFVRUN4TUYKWVdSdGFXNHhEakFNQmdOVkJBTVRCV0ZrYldsdU1Ga3dFd1lIS29aSXpqMENBUVlJS29aSXpqMERBUWNEUWdBRQo5bVZlM0ZzUlNsTjhKemhDVlhmUHdkci9yc0dyZnlSNzJjUjFGdVRPNnhqVE1TNko5M0hsdUZ2YXdrWUFMUk13CmJFNHZLYXpDVWE0bjkyeDNNVDc5eWFOZ01GNHdEZ1lEVlIwUEFRSC9CQVFEQWdlQU1Bd0dBMVVkRXdFQi93UUMKTUFBd0hRWURWUjBPQkJZRUZFY1lLUTcwU1cvVkZLM210d0M0R3JFUFUzUjlNQjhHQTFVZEl3UVlNQmFBRkxuRApDWFNiZXFCc3plYy84Yi9FbEVwb2FNWEhNQW9HQ0NxR1NNNDlCQU1DQTBjQU1FUUNJRnZQWWhNNVNIMmEwSUpoClloem1lN1lrOWlSSDNDOStlNmMrbjkwcHE2bW5BaUJBQlJGSzlPUmJlc2hJb1QrOWxwbENUbVhWelJsenJDR1gKUVE4NS94Ykdudz09Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K" });
                        List<String> tlsRootCerts = Arrays.asList(new String[] {
                                        "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUNEVENDQWJTZ0F3SUJBZ0lVVGJwSVdaUlRCcFV3SVhqZW9xQzlKSk56T2NFd0NnWUlLb1pJemowRUF3SXcKWlRFTE1Ba0dBMVVFQmhNQ1ZWTXhGekFWQmdOVkJBZ1REazV2Y25Sb0lFTmhjbTlzYVc1aE1SUXdFZ1lEVlFRSwpFd3RJZVhCbGNteGxaR2RsY2pFUE1BMEdBMVVFQ3hNR1JtRmljbWxqTVJZd0ZBWURWUVFERXcxdmNtY3hZMkV4CkxYUnNjMk5oTUI0WERUSXdNVEF4TXpFME5URXdNRm9YRFRNMU1UQXhNREUwTlRFd01Gb3daVEVMTUFrR0ExVUUKQmhNQ1ZWTXhGekFWQmdOVkJBZ1REazV2Y25Sb0lFTmhjbTlzYVc1aE1SUXdFZ1lEVlFRS0V3dEllWEJsY214bApaR2RsY2pFUE1BMEdBMVVFQ3hNR1JtRmljbWxqTVJZd0ZBWURWUVFERXcxdmNtY3hZMkV4TFhSc2MyTmhNRmt3CkV3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFVS9LZTFMNTdxQlNycTcrK0d3eU5oTTR2eEc2WWtEUVoKNHFMR25yOTBYNTBJYjlOTUhyWVpXam5kNXpoZE5JTlJYZnowOTJDZkYvYlRGM3BuMnRvK3RxTkNNRUF3RGdZRApWUjBQQVFIL0JBUURBZ0VHTUE4R0ExVWRFd0VCL3dRRk1BTUJBZjh3SFFZRFZSME9CQllFRkRzY2lSL3Z1TGcyCmZzQ05jU0dQc1RoUTY5WEFNQW9HQ0NxR1NNNDlCQU1DQTBjQU1FUUNJREd4MG5ZVmtRK2Y4T0RmL3lyQUdvSEkKSGhQbU42OUtCL3djRzM2RG5tRWxBaUI3dHczT3pYNldLVmFiSm9XelpRNExWNlJhRnJtMFpPVGhxWk5CbVVSdAo4Zz09Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K" });

                        ImportMspOptions importMspOptions = new ImportMspOptions.Builder().mspId("org1")
                                        .displayName("My First Org").rootCerts(rootCerts).admins(admins)
                                        .tlsRootCerts(tlsRootCerts).build();

                        ServiceCall<MspResponse> call = service.importMsp(importMspOptions);
                        Response<MspResponse> resp = call.execute();

                        assertNotNull(resp);
                        MspResponse actionresp = resp.getResult();
                        assertNotNull(actionresp);

                        assertEquals(200, resp.getStatusCode());
                        System.out.println(actionresp.getDisplayName());
                        mspId = actionresp.getMspId();
                        mspUID = actionresp.getId();

                        System.out.println("Imported MSP uid="+mspUID+" id="+mspId);
                } catch (ServiceResponseException e) {
                        Exception wrappedError = new Exception(e.getDebuggingInfo().toString());
                        wrappedError.initCause(e);
                        throw wrappedError;
                }
        }

        @Test(dependsOnMethods = { "importMSP" }, groups = { "msp_use" })
        public void editMSP() throws Exception {
                try {
                        System.out.println("Edit msp" +mspId);
                        EditMspOptions options = new EditMspOptions.Builder().id(mspUID).displayName("Updated MSP")
                                        .build();
                        ServiceCall<MspResponse> call = service.editMsp(options);

                        Response<MspResponse> resp = call.execute();

                        assertNotNull(resp);
                        MspResponse actionresp = resp.getResult();
                        assertNotNull(actionresp);

                        assertEquals(200, resp.getStatusCode());
                        System.out.println(actionresp.getDisplayName());
                } catch (ServiceResponseException e) {
                        Exception wrappedError = new Exception(e.getDebuggingInfo().toString());
                        wrappedError.initCause(e);
                        throw wrappedError;
                }
        }

        @Test(dependsOnMethods = { "importMSP" }, groups = { "msp_use" })
        public void getMSP() throws Exception {
                try {
                        System.out.println("Get msp" +mspId);
                        GetMspCertificateOptions getMspCertificateOptions = new GetMspCertificateOptions.Builder()
                                        .mspId(mspId).build();

                        ServiceCall<GetMSPCertificateResponse> call = service
                                        .getMspCertificate(getMspCertificateOptions);
                        Response<GetMSPCertificateResponse> resp = call.execute();
                        assertEquals(200, resp.getStatusCode());
                } catch (ServiceResponseException e) {
                        Exception wrappedError = new Exception(e.getDebuggingInfo().toString());
                        wrappedError.initCause(e);
                        throw wrappedError;
                }
        }

        @Test(dependsOnMethods = { "importMSP" },dependsOnGroups = { "msp_use" })
        public void removeMSP() throws Exception {
                try {
                        System.out.println("Remove msp" +mspId);
                        RemoveComponentOptions removeComponentOptions = new RemoveComponentOptions.Builder().id(mspUID)
                                        .build();

                        ServiceCall<DeleteComponentResponse> call = service.removeComponent(removeComponentOptions);
                        Response<DeleteComponentResponse> resp = call.execute();
                        assertEquals(200, resp.getStatusCode());
                } catch (ServiceResponseException e) {
                        Exception wrappedError = new Exception(e.getDebuggingInfo().toString());
                        wrappedError.initCause(e);
                        throw wrappedError;
                }
        }

        @AfterClass
        public void tearDown() {
                // Add any clean up logic here
                System.out.println("Clean up complete.");
        }
}
