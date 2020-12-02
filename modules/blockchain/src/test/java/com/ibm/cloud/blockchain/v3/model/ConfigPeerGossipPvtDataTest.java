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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtData;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigPeerGossipPvtData model.
 */
public class ConfigPeerGossipPvtDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerGossipPvtData() throws Throwable {
    ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel = new ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy.Builder()
      .requiredPeerCount(Double.valueOf("0"))
      .maxPeerCount(Double.valueOf("1"))
      .build();
    assertEquals(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel.requiredPeerCount(), Double.valueOf("0"));
    assertEquals(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel.maxPeerCount(), Double.valueOf("1"));

    ConfigPeerGossipPvtData configPeerGossipPvtDataModel = new ConfigPeerGossipPvtData.Builder()
      .pullRetryThreshold("60s")
      .transientstoreMaxBlockRetention(Double.valueOf("1000"))
      .pushAckTimeout("3s")
      .btlPullMargin(Double.valueOf("10"))
      .reconcileBatchSize(Double.valueOf("10"))
      .reconcileSleepInterval("1m")
      .reconciliationEnabled(true)
      .skipPullingInvalidTransactionsDuringCommit(false)
      .implicitCollectionDisseminationPolicy(configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel)
      .build();
    assertEquals(configPeerGossipPvtDataModel.pullRetryThreshold(), "60s");
    assertEquals(configPeerGossipPvtDataModel.transientstoreMaxBlockRetention(), Double.valueOf("1000"));
    assertEquals(configPeerGossipPvtDataModel.pushAckTimeout(), "3s");
    assertEquals(configPeerGossipPvtDataModel.btlPullMargin(), Double.valueOf("10"));
    assertEquals(configPeerGossipPvtDataModel.reconcileBatchSize(), Double.valueOf("10"));
    assertEquals(configPeerGossipPvtDataModel.reconcileSleepInterval(), "1m");
    assertEquals(configPeerGossipPvtDataModel.reconciliationEnabled(), Boolean.valueOf(true));
    assertEquals(configPeerGossipPvtDataModel.skipPullingInvalidTransactionsDuringCommit(), Boolean.valueOf(false));
    assertEquals(configPeerGossipPvtDataModel.implicitCollectionDisseminationPolicy(), configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel);

    String json = TestUtilities.serialize(configPeerGossipPvtDataModel);

    ConfigPeerGossipPvtData configPeerGossipPvtDataModelNew = TestUtilities.deserialize(json, ConfigPeerGossipPvtData.class);
    assertTrue(configPeerGossipPvtDataModelNew instanceof ConfigPeerGossipPvtData);
    assertEquals(configPeerGossipPvtDataModelNew.pullRetryThreshold(), "60s");
    assertEquals(configPeerGossipPvtDataModelNew.transientstoreMaxBlockRetention(), Double.valueOf("1000"));
    assertEquals(configPeerGossipPvtDataModelNew.pushAckTimeout(), "3s");
    assertEquals(configPeerGossipPvtDataModelNew.btlPullMargin(), Double.valueOf("10"));
    assertEquals(configPeerGossipPvtDataModelNew.reconcileBatchSize(), Double.valueOf("10"));
    assertEquals(configPeerGossipPvtDataModelNew.reconcileSleepInterval(), "1m");
    assertEquals(configPeerGossipPvtDataModelNew.reconciliationEnabled(), Boolean.valueOf(true));
    assertEquals(configPeerGossipPvtDataModelNew.skipPullingInvalidTransactionsDuringCommit(), Boolean.valueOf(false));
    assertEquals(configPeerGossipPvtDataModelNew.implicitCollectionDisseminationPolicy().toString(), configPeerGossipPvtDataImplicitCollectionDisseminationPolicyModel.toString());
  }
}