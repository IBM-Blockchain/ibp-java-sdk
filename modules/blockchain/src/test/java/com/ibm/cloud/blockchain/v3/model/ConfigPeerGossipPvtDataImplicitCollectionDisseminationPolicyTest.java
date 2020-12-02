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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy model.
 */
public class ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy() throws Throwable {
    ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel = new ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy.Builder()
      .requiredPeerCount(Double.valueOf("0"))
      .maxPeerCount(Double.valueOf("1"))
      .build();
    assertEquals(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel.requiredPeerCount(), Double.valueOf("0"));
    assertEquals(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel.maxPeerCount(), Double.valueOf("1"));

    String json = TestUtilities.serialize(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel);

    ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModelNew = TestUtilities.deserialize(json, ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy.class);
    assertTrue(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModelNew instanceof ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy);
    assertEquals(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModelNew.requiredPeerCount(), Double.valueOf("0"));
    assertEquals(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModelNew.maxPeerCount(), Double.valueOf("1"));
  }
}