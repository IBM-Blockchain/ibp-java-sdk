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

import com.ibm.cloud.blockchain.v3.model.ResourceLimits;
import com.ibm.cloud.blockchain.v3.model.ResourceObjectFabV1;
import com.ibm.cloud.blockchain.v3.model.ResourceRequests;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceObjectFabV1 model.
 */
public class ResourceObjectFabV1Test {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceObjectFabV1() throws Throwable {
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

    ResourceObjectFabV1 resourceObjectFabV1Model = new ResourceObjectFabV1.Builder()
      .requests(resourceRequestsModel)
      .limits(resourceLimitsModel)
      .build();
    assertEquals(resourceObjectFabV1Model.requests(), resourceRequestsModel);
    assertEquals(resourceObjectFabV1Model.limits(), resourceLimitsModel);

    String json = TestUtilities.serialize(resourceObjectFabV1Model);

    ResourceObjectFabV1 resourceObjectFabV1ModelNew = TestUtilities.deserialize(json, ResourceObjectFabV1.class);
    assertTrue(resourceObjectFabV1ModelNew instanceof ResourceObjectFabV1);
    assertEquals(resourceObjectFabV1ModelNew.requests().toString(), resourceRequestsModel.toString());
    assertEquals(resourceObjectFabV1ModelNew.limits().toString(), resourceLimitsModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResourceObjectFabV1Error() throws Throwable {
    new ResourceObjectFabV1.Builder().build();
  }

}