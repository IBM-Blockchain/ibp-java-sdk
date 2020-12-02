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
import com.ibm.cloud.blockchain.v3.model.ResourceObjectCouchDb;
import com.ibm.cloud.blockchain.v3.model.ResourceRequests;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceObjectCouchDb model.
 */
public class ResourceObjectCouchDbTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceObjectCouchDb() throws Throwable {
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

    ResourceObjectCouchDb resourceObjectCouchDbModel = new ResourceObjectCouchDb.Builder()
      .requests(resourceRequestsModel)
      .limits(resourceLimitsModel)
      .build();
    assertEquals(resourceObjectCouchDbModel.requests(), resourceRequestsModel);
    assertEquals(resourceObjectCouchDbModel.limits(), resourceLimitsModel);

    String json = TestUtilities.serialize(resourceObjectCouchDbModel);

    ResourceObjectCouchDb resourceObjectCouchDbModelNew = TestUtilities.deserialize(json, ResourceObjectCouchDb.class);
    assertTrue(resourceObjectCouchDbModelNew instanceof ResourceObjectCouchDb);
    assertEquals(resourceObjectCouchDbModelNew.requests().toString(), resourceRequestsModel.toString());
    assertEquals(resourceObjectCouchDbModelNew.limits().toString(), resourceLimitsModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResourceObjectCouchDbError() throws Throwable {
    new ResourceObjectCouchDb.Builder().build();
  }

}