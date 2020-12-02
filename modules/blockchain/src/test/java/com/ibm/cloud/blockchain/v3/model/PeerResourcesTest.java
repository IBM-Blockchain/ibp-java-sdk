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

import com.ibm.cloud.blockchain.v3.model.PeerResources;
import com.ibm.cloud.blockchain.v3.model.ResourceLimits;
import com.ibm.cloud.blockchain.v3.model.ResourceObject;
import com.ibm.cloud.blockchain.v3.model.ResourceObjectCouchDb;
import com.ibm.cloud.blockchain.v3.model.ResourceObjectFabV1;
import com.ibm.cloud.blockchain.v3.model.ResourceObjectFabV2;
import com.ibm.cloud.blockchain.v3.model.ResourceRequests;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PeerResources model.
 */
public class PeerResourcesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPeerResources() throws Throwable {
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

    ResourceObjectFabV2 resourceObjectFabV2Model = new ResourceObjectFabV2.Builder()
      .requests(resourceRequestsModel)
      .limits(resourceLimitsModel)
      .build();
    assertEquals(resourceObjectFabV2Model.requests(), resourceRequestsModel);
    assertEquals(resourceObjectFabV2Model.limits(), resourceLimitsModel);

    ResourceObjectCouchDb resourceObjectCouchDbModel = new ResourceObjectCouchDb.Builder()
      .requests(resourceRequestsModel)
      .limits(resourceLimitsModel)
      .build();
    assertEquals(resourceObjectCouchDbModel.requests(), resourceRequestsModel);
    assertEquals(resourceObjectCouchDbModel.limits(), resourceLimitsModel);

    ResourceObject resourceObjectModel = new ResourceObject.Builder()
      .requests(resourceRequestsModel)
      .limits(resourceLimitsModel)
      .build();
    assertEquals(resourceObjectModel.requests(), resourceRequestsModel);
    assertEquals(resourceObjectModel.limits(), resourceLimitsModel);

    ResourceObjectFabV1 resourceObjectFabV1Model = new ResourceObjectFabV1.Builder()
      .requests(resourceRequestsModel)
      .limits(resourceLimitsModel)
      .build();
    assertEquals(resourceObjectFabV1Model.requests(), resourceRequestsModel);
    assertEquals(resourceObjectFabV1Model.limits(), resourceLimitsModel);

    PeerResources peerResourcesModel = new PeerResources.Builder()
      .chaincodelauncher(resourceObjectFabV2Model)
      .couchdb(resourceObjectCouchDbModel)
      .statedb(resourceObjectModel)
      .dind(resourceObjectFabV1Model)
      .fluentd(resourceObjectFabV1Model)
      .peer(resourceObjectModel)
      .proxy(resourceObjectModel)
      .build();
    assertEquals(peerResourcesModel.chaincodelauncher(), resourceObjectFabV2Model);
    assertEquals(peerResourcesModel.couchdb(), resourceObjectCouchDbModel);
    assertEquals(peerResourcesModel.statedb(), resourceObjectModel);
    assertEquals(peerResourcesModel.dind(), resourceObjectFabV1Model);
    assertEquals(peerResourcesModel.fluentd(), resourceObjectFabV1Model);
    assertEquals(peerResourcesModel.peer(), resourceObjectModel);
    assertEquals(peerResourcesModel.proxy(), resourceObjectModel);

    String json = TestUtilities.serialize(peerResourcesModel);

    PeerResources peerResourcesModelNew = TestUtilities.deserialize(json, PeerResources.class);
    assertTrue(peerResourcesModelNew instanceof PeerResources);
    assertEquals(peerResourcesModelNew.chaincodelauncher().toString(), resourceObjectFabV2Model.toString());
    assertEquals(peerResourcesModelNew.couchdb().toString(), resourceObjectCouchDbModel.toString());
    assertEquals(peerResourcesModelNew.statedb().toString(), resourceObjectModel.toString());
    assertEquals(peerResourcesModelNew.dind().toString(), resourceObjectFabV1Model.toString());
    assertEquals(peerResourcesModelNew.fluentd().toString(), resourceObjectFabV1Model.toString());
    assertEquals(peerResourcesModelNew.peer().toString(), resourceObjectModel.toString());
    assertEquals(peerResourcesModelNew.proxy().toString(), resourceObjectModel.toString());
  }
}