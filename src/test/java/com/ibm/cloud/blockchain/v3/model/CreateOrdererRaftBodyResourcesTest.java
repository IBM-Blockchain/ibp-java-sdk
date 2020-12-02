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

import com.ibm.cloud.blockchain.v3.model.CreateOrdererRaftBodyResources;
import com.ibm.cloud.blockchain.v3.model.ResourceLimits;
import com.ibm.cloud.blockchain.v3.model.ResourceObject;
import com.ibm.cloud.blockchain.v3.model.ResourceRequests;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateOrdererRaftBodyResources model.
 */
public class CreateOrdererRaftBodyResourcesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateOrdererRaftBodyResources() throws Throwable {
    ResourceRequests resourceRequestsModel = new ResourceRequests.Builder()
      .cpu("100m")
      .memory("256MiB")
      .build();
    assertEquals(resourceRequestsModel.cpu(), "100m");
    assertEquals(resourceRequestsModel.memory(), "256MiB");

    ResourceLimits resourceLimitsModel = new ResourceLimits.Builder()
      .cpu("100m")
      .memory("256MiB")
      .build();
    assertEquals(resourceLimitsModel.cpu(), "100m");
    assertEquals(resourceLimitsModel.memory(), "256MiB");

    ResourceObject resourceObjectModel = new ResourceObject.Builder()
      .requests(resourceRequestsModel)
      .limits(resourceLimitsModel)
      .build();
    assertEquals(resourceObjectModel.requests(), resourceRequestsModel);
    assertEquals(resourceObjectModel.limits(), resourceLimitsModel);

    CreateOrdererRaftBodyResources createOrdererRaftBodyResourcesModel = new CreateOrdererRaftBodyResources.Builder()
      .orderer(resourceObjectModel)
      .proxy(resourceObjectModel)
      .build();
    assertEquals(createOrdererRaftBodyResourcesModel.orderer(), resourceObjectModel);
    assertEquals(createOrdererRaftBodyResourcesModel.proxy(), resourceObjectModel);

    String json = TestUtilities.serialize(createOrdererRaftBodyResourcesModel);

    CreateOrdererRaftBodyResources createOrdererRaftBodyResourcesModelNew = TestUtilities.deserialize(json, CreateOrdererRaftBodyResources.class);
    assertTrue(createOrdererRaftBodyResourcesModelNew instanceof CreateOrdererRaftBodyResources);
    assertEquals(createOrdererRaftBodyResourcesModelNew.orderer().toString(), resourceObjectModel.toString());
    assertEquals(createOrdererRaftBodyResourcesModelNew.proxy().toString(), resourceObjectModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateOrdererRaftBodyResourcesError() throws Throwable {
    new CreateOrdererRaftBodyResources.Builder().build();
  }

}