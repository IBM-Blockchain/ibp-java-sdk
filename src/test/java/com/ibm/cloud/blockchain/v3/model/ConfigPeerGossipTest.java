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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossip;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipElection;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtData;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipState;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigPeerGossip model.
 */
public class ConfigPeerGossipTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerGossip() throws Throwable {
    ConfigPeerGossipElection configPeerGossipElectionModel = new ConfigPeerGossipElection.Builder()
      .startupGracePeriod("15s")
      .membershipSampleInterval("1s")
      .leaderAliveThreshold("10s")
      .leaderElectionDuration("5s")
      .build();
    assertEquals(configPeerGossipElectionModel.startupGracePeriod(), "15s");
    assertEquals(configPeerGossipElectionModel.membershipSampleInterval(), "1s");
    assertEquals(configPeerGossipElectionModel.leaderAliveThreshold(), "10s");
    assertEquals(configPeerGossipElectionModel.leaderElectionDuration(), "5s");

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

    ConfigPeerGossipState configPeerGossipStateModel = new ConfigPeerGossipState.Builder()
      .enabled(true)
      .checkInterval("10s")
      .responseTimeout("3s")
      .batchSize(Double.valueOf("10"))
      .blockBufferSize(Double.valueOf("100"))
      .maxRetries(Double.valueOf("3"))
      .build();
    assertEquals(configPeerGossipStateModel.enabled(), Boolean.valueOf(true));
    assertEquals(configPeerGossipStateModel.checkInterval(), "10s");
    assertEquals(configPeerGossipStateModel.responseTimeout(), "3s");
    assertEquals(configPeerGossipStateModel.batchSize(), Double.valueOf("10"));
    assertEquals(configPeerGossipStateModel.blockBufferSize(), Double.valueOf("100"));
    assertEquals(configPeerGossipStateModel.maxRetries(), Double.valueOf("3"));

    ConfigPeerGossip configPeerGossipModel = new ConfigPeerGossip.Builder()
      .useLeaderElection(true)
      .orgLeader(false)
      .membershipTrackerInterval("5s")
      .maxBlockCountToStore(Double.valueOf("100"))
      .maxPropagationBurstLatency("10ms")
      .maxPropagationBurstSize(Double.valueOf("10"))
      .propagateIterations(Double.valueOf("3"))
      .pullInterval("4s")
      .pullPeerNum(Double.valueOf("3"))
      .requestStateInfoInterval("4s")
      .publishStateInfoInterval("4s")
      .stateInfoRetentionInterval("0s")
      .publishCertPeriod("10s")
      .skipBlockVerification(false)
      .dialTimeout("3s")
      .connTimeout("2s")
      .recvBuffSize(Double.valueOf("20"))
      .sendBuffSize(Double.valueOf("200"))
      .digestWaitTime("1s")
      .requestWaitTime("1500ms")
      .responseWaitTime("2s")
      .aliveTimeInterval("5s")
      .aliveExpirationTimeout("25s")
      .reconnectInterval("25s")
      .election(configPeerGossipElectionModel)
      .pvtData(configPeerGossipPvtDataModel)
      .state(configPeerGossipStateModel)
      .build();
    assertEquals(configPeerGossipModel.useLeaderElection(), Boolean.valueOf(true));
    assertEquals(configPeerGossipModel.orgLeader(), Boolean.valueOf(false));
    assertEquals(configPeerGossipModel.membershipTrackerInterval(), "5s");
    assertEquals(configPeerGossipModel.maxBlockCountToStore(), Double.valueOf("100"));
    assertEquals(configPeerGossipModel.maxPropagationBurstLatency(), "10ms");
    assertEquals(configPeerGossipModel.maxPropagationBurstSize(), Double.valueOf("10"));
    assertEquals(configPeerGossipModel.propagateIterations(), Double.valueOf("3"));
    assertEquals(configPeerGossipModel.pullInterval(), "4s");
    assertEquals(configPeerGossipModel.pullPeerNum(), Double.valueOf("3"));
    assertEquals(configPeerGossipModel.requestStateInfoInterval(), "4s");
    assertEquals(configPeerGossipModel.publishStateInfoInterval(), "4s");
    assertEquals(configPeerGossipModel.stateInfoRetentionInterval(), "0s");
    assertEquals(configPeerGossipModel.publishCertPeriod(), "10s");
    assertEquals(configPeerGossipModel.skipBlockVerification(), Boolean.valueOf(false));
    assertEquals(configPeerGossipModel.dialTimeout(), "3s");
    assertEquals(configPeerGossipModel.connTimeout(), "2s");
    assertEquals(configPeerGossipModel.recvBuffSize(), Double.valueOf("20"));
    assertEquals(configPeerGossipModel.sendBuffSize(), Double.valueOf("200"));
    assertEquals(configPeerGossipModel.digestWaitTime(), "1s");
    assertEquals(configPeerGossipModel.requestWaitTime(), "1500ms");
    assertEquals(configPeerGossipModel.responseWaitTime(), "2s");
    assertEquals(configPeerGossipModel.aliveTimeInterval(), "5s");
    assertEquals(configPeerGossipModel.aliveExpirationTimeout(), "25s");
    assertEquals(configPeerGossipModel.reconnectInterval(), "25s");
    assertEquals(configPeerGossipModel.election(), configPeerGossipElectionModel);
    assertEquals(configPeerGossipModel.pvtData(), configPeerGossipPvtDataModel);
    assertEquals(configPeerGossipModel.state(), configPeerGossipStateModel);

    String json = TestUtilities.serialize(configPeerGossipModel);

    ConfigPeerGossip configPeerGossipModelNew = TestUtilities.deserialize(json, ConfigPeerGossip.class);
    assertTrue(configPeerGossipModelNew instanceof ConfigPeerGossip);
    assertEquals(configPeerGossipModelNew.useLeaderElection(), Boolean.valueOf(true));
    assertEquals(configPeerGossipModelNew.orgLeader(), Boolean.valueOf(false));
    assertEquals(configPeerGossipModelNew.membershipTrackerInterval(), "5s");
    assertEquals(configPeerGossipModelNew.maxBlockCountToStore(), Double.valueOf("100"));
    assertEquals(configPeerGossipModelNew.maxPropagationBurstLatency(), "10ms");
    assertEquals(configPeerGossipModelNew.maxPropagationBurstSize(), Double.valueOf("10"));
    assertEquals(configPeerGossipModelNew.propagateIterations(), Double.valueOf("3"));
    assertEquals(configPeerGossipModelNew.pullInterval(), "4s");
    assertEquals(configPeerGossipModelNew.pullPeerNum(), Double.valueOf("3"));
    assertEquals(configPeerGossipModelNew.requestStateInfoInterval(), "4s");
    assertEquals(configPeerGossipModelNew.publishStateInfoInterval(), "4s");
    assertEquals(configPeerGossipModelNew.stateInfoRetentionInterval(), "0s");
    assertEquals(configPeerGossipModelNew.publishCertPeriod(), "10s");
    assertEquals(configPeerGossipModelNew.skipBlockVerification(), Boolean.valueOf(false));
    assertEquals(configPeerGossipModelNew.dialTimeout(), "3s");
    assertEquals(configPeerGossipModelNew.connTimeout(), "2s");
    assertEquals(configPeerGossipModelNew.recvBuffSize(), Double.valueOf("20"));
    assertEquals(configPeerGossipModelNew.sendBuffSize(), Double.valueOf("200"));
    assertEquals(configPeerGossipModelNew.digestWaitTime(), "1s");
    assertEquals(configPeerGossipModelNew.requestWaitTime(), "1500ms");
    assertEquals(configPeerGossipModelNew.responseWaitTime(), "2s");
    assertEquals(configPeerGossipModelNew.aliveTimeInterval(), "5s");
    assertEquals(configPeerGossipModelNew.aliveExpirationTimeout(), "25s");
    assertEquals(configPeerGossipModelNew.reconnectInterval(), "25s");
    assertEquals(configPeerGossipModelNew.election().toString(), configPeerGossipElectionModel.toString());
    assertEquals(configPeerGossipModelNew.pvtData().toString(), configPeerGossipPvtDataModel.toString());
    assertEquals(configPeerGossipModelNew.state().toString(), configPeerGossipStateModel.toString());
  }
}