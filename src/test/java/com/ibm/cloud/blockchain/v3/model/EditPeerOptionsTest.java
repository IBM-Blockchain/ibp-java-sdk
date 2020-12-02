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

import com.ibm.cloud.blockchain.v3.model.EditPeerOptions;
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
 * Unit test class for the EditPeerOptions model.
 */
public class EditPeerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEditPeerOptions() throws Throwable {
    EditPeerOptions editPeerOptionsModel = new EditPeerOptions.Builder()
      .id("testString")
      .displayName("My Peer")
      .apiUrl("grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051")
      .operationsUrl("https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443")
      .grpcwpUrl("https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084")
      .mspId("Org1")
      .location("ibmcloud")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
      .build();
    assertEquals(editPeerOptionsModel.id(), "testString");
    assertEquals(editPeerOptionsModel.displayName(), "My Peer");
    assertEquals(editPeerOptionsModel.apiUrl(), "grpcs://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:7051");
    assertEquals(editPeerOptionsModel.operationsUrl(), "https://n3a3ec3-mypeer.ibp.us-south.containers.appdomain.cloud:9443");
    assertEquals(editPeerOptionsModel.grpcwpUrl(), "https://n3a3ec3-mypeer-proxy.ibp.us-south.containers.appdomain.cloud:8084");
    assertEquals(editPeerOptionsModel.mspId(), "Org1");
    assertEquals(editPeerOptionsModel.location(), "ibmcloud");
    assertEquals(editPeerOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditPeerOptionsError() throws Throwable {
    new EditPeerOptions.Builder().build();
  }

}