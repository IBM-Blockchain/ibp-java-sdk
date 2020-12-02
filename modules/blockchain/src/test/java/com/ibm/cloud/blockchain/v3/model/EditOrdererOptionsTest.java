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

package com.ibm.cloud.blockchain.v3.model;

import com.ibm.cloud.blockchain.v3.model.EditOrdererOptions;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EditOrdererOptions model.
 */
public class EditOrdererOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEditOrdererOptions() throws Throwable {
    EditOrdererOptions editOrdererOptionsModel = new EditOrdererOptions.Builder()
      .id("testString")
      .clusterName("ordering service 1")
      .displayName("orderer")
      .apiUrl("grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050")
      .operationsUrl("https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443")
      .grpcwpUrl("https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443")
      .mspId("Org1")
      .consenterProposalFin(true)
      .location("ibmcloud")
      .systemChannelId("testchainid")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
      .build();
    assertEquals(editOrdererOptionsModel.id(), "testString");
    assertEquals(editOrdererOptionsModel.clusterName(), "ordering service 1");
    assertEquals(editOrdererOptionsModel.displayName(), "orderer");
    assertEquals(editOrdererOptionsModel.apiUrl(), "grpcs://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050");
    assertEquals(editOrdererOptionsModel.operationsUrl(), "https://n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:8443");
    assertEquals(editOrdererOptionsModel.grpcwpUrl(), "https://n3a3ec3-myorderer-proxy.ibp.us-south.containers.appdomain.cloud:443");
    assertEquals(editOrdererOptionsModel.mspId(), "Org1");
    assertEquals(editOrdererOptionsModel.consenterProposalFin(), Boolean.valueOf(true));
    assertEquals(editOrdererOptionsModel.location(), "ibmcloud");
    assertEquals(editOrdererOptionsModel.systemChannelId(), "testchainid");
    assertEquals(editOrdererOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditOrdererOptionsError() throws Throwable {
    new EditOrdererOptions.Builder().build();
  }

}