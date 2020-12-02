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

import com.ibm.cloud.blockchain.v3.model.Bccsp;
import com.ibm.cloud.blockchain.v3.model.BccspPKCS11;
import com.ibm.cloud.blockchain.v3.model.BccspSW;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerAdminService;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerAuthentication;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerClient;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerCreatePeer;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerDeliveryclient;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerDeliveryclientAddressOverridesItem;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerDiscovery;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossip;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipElection;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtData;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerGossipState;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepalive;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepaliveClient;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepaliveDeliveryClient;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerLimits;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerLimitsConcurrency;
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
 * Unit test class for the ConfigPeerCreatePeer model.
 */
public class ConfigPeerCreatePeerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerCreatePeer() throws Throwable {
    ConfigPeerKeepaliveClient configPeerKeepaliveClientModel = new ConfigPeerKeepaliveClient.Builder()
      .interval("60s")
      .timeout("20s")
      .build();
    assertEquals(configPeerKeepaliveClientModel.interval(), "60s");
    assertEquals(configPeerKeepaliveClientModel.timeout(), "20s");

    ConfigPeerKeepaliveDeliveryClient configPeerKeepaliveDeliveryClientModel = new ConfigPeerKeepaliveDeliveryClient.Builder()
      .interval("60s")
      .timeout("20s")
      .build();
    assertEquals(configPeerKeepaliveDeliveryClientModel.interval(), "60s");
    assertEquals(configPeerKeepaliveDeliveryClientModel.timeout(), "20s");

    ConfigPeerKeepalive configPeerKeepaliveModel = new ConfigPeerKeepalive.Builder()
      .minInterval("60s")
      .client(configPeerKeepaliveClientModel)
      .deliveryClient(configPeerKeepaliveDeliveryClientModel)
      .build();
    assertEquals(configPeerKeepaliveModel.minInterval(), "60s");
    assertEquals(configPeerKeepaliveModel.client(), configPeerKeepaliveClientModel);
    assertEquals(configPeerKeepaliveModel.deliveryClient(), configPeerKeepaliveDeliveryClientModel);

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

    ConfigPeerAuthentication configPeerAuthenticationModel = new ConfigPeerAuthentication.Builder()
      .timewindow("15m")
      .build();
    assertEquals(configPeerAuthenticationModel.timewindow(), "15m");

    BccspSW bccspSwModel = new BccspSW.Builder()
      .hash("SHA2")
      .security(Double.valueOf("256"))
      .build();
    assertEquals(bccspSwModel.hash(), "SHA2");
    assertEquals(bccspSwModel.security(), Double.valueOf("256"));

    BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder()
      .label("testString")
      .pin("testString")
      .hash("SHA2")
      .security(Double.valueOf("256"))
      .build();
    assertEquals(bccspPkcS11Model.label(), "testString");
    assertEquals(bccspPkcS11Model.pin(), "testString");
    assertEquals(bccspPkcS11Model.hash(), "SHA2");
    assertEquals(bccspPkcS11Model.security(), Double.valueOf("256"));

    Bccsp bccspModel = new Bccsp.Builder()
      .xDefault("SW")
      .sw(bccspSwModel)
      .pkcS11(bccspPkcS11Model)
      .build();
    assertEquals(bccspModel.xDefault(), "SW");
    assertEquals(bccspModel.sw(), bccspSwModel);
    assertEquals(bccspModel.pkcS11(), bccspPkcS11Model);

    ConfigPeerClient configPeerClientModel = new ConfigPeerClient.Builder()
      .connTimeout("2s")
      .build();
    assertEquals(configPeerClientModel.connTimeout(), "2s");

    ConfigPeerDeliveryclientAddressOverridesItem configPeerDeliveryclientAddressOverridesItemModel = new ConfigPeerDeliveryclientAddressOverridesItem.Builder()
      .from("n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050")
      .to("n3a3ec3-myorderer2.ibp.us-south.containers.appdomain.cloud:7050")
      .caCertsFile("my-data/cert.pem")
      .build();
    assertEquals(configPeerDeliveryclientAddressOverridesItemModel.from(), "n3a3ec3-myorderer.ibp.us-south.containers.appdomain.cloud:7050");
    assertEquals(configPeerDeliveryclientAddressOverridesItemModel.to(), "n3a3ec3-myorderer2.ibp.us-south.containers.appdomain.cloud:7050");
    assertEquals(configPeerDeliveryclientAddressOverridesItemModel.caCertsFile(), "my-data/cert.pem");

    ConfigPeerDeliveryclient configPeerDeliveryclientModel = new ConfigPeerDeliveryclient.Builder()
      .reconnectTotalTimeThreshold("60m")
      .connTimeout("2s")
      .reConnectBackoffThreshold("60m")
      .addressOverrides(new java.util.ArrayList<ConfigPeerDeliveryclientAddressOverridesItem>(java.util.Arrays.asList(configPeerDeliveryclientAddressOverridesItemModel)))
      .build();
    assertEquals(configPeerDeliveryclientModel.reconnectTotalTimeThreshold(), "60m");
    assertEquals(configPeerDeliveryclientModel.connTimeout(), "2s");
    assertEquals(configPeerDeliveryclientModel.reConnectBackoffThreshold(), "60m");
    assertEquals(configPeerDeliveryclientModel.addressOverrides(), new java.util.ArrayList<ConfigPeerDeliveryclientAddressOverridesItem>(java.util.Arrays.asList(configPeerDeliveryclientAddressOverridesItemModel)));

    ConfigPeerAdminService configPeerAdminServiceModel = new ConfigPeerAdminService.Builder()
      .listenAddress("0.0.0.0:7051")
      .build();
    assertEquals(configPeerAdminServiceModel.listenAddress(), "0.0.0.0:7051");

    ConfigPeerDiscovery configPeerDiscoveryModel = new ConfigPeerDiscovery.Builder()
      .enabled(true)
      .authCacheEnabled(true)
      .authCacheMaxSize(Double.valueOf("1000"))
      .authCachePurgeRetentionRatio(Double.valueOf("0.75"))
      .orgMembersAllowedAccess(false)
      .build();
    assertEquals(configPeerDiscoveryModel.enabled(), Boolean.valueOf(true));
    assertEquals(configPeerDiscoveryModel.authCacheEnabled(), Boolean.valueOf(true));
    assertEquals(configPeerDiscoveryModel.authCacheMaxSize(), Double.valueOf("1000"));
    assertEquals(configPeerDiscoveryModel.authCachePurgeRetentionRatio(), Double.valueOf("0.75"));
    assertEquals(configPeerDiscoveryModel.orgMembersAllowedAccess(), Boolean.valueOf(false));

    ConfigPeerLimitsConcurrency configPeerLimitsConcurrencyModel = new ConfigPeerLimitsConcurrency.Builder()
      .endorserService(Double.valueOf("2500"))
      .deliverService(Double.valueOf("2500"))
      .build();
    assertEquals(configPeerLimitsConcurrencyModel.endorserService(), Double.valueOf("2500"));
    assertEquals(configPeerLimitsConcurrencyModel.deliverService(), Double.valueOf("2500"));

    ConfigPeerLimits configPeerLimitsModel = new ConfigPeerLimits.Builder()
      .concurrency(configPeerLimitsConcurrencyModel)
      .build();
    assertEquals(configPeerLimitsModel.concurrency(), configPeerLimitsConcurrencyModel);

    ConfigPeerCreatePeer configPeerCreatePeerModel = new ConfigPeerCreatePeer.Builder()
      .id("john-doe")
      .networkId("dev")
      .keepalive(configPeerKeepaliveModel)
      .gossip(configPeerGossipModel)
      .authentication(configPeerAuthenticationModel)
      .bccsp(bccspModel)
      .client(configPeerClientModel)
      .deliveryclient(configPeerDeliveryclientModel)
      .adminService(configPeerAdminServiceModel)
      .validatorPoolSize(Double.valueOf("8"))
      .discovery(configPeerDiscoveryModel)
      .limits(configPeerLimitsModel)
      .build();
    assertEquals(configPeerCreatePeerModel.id(), "john-doe");
    assertEquals(configPeerCreatePeerModel.networkId(), "dev");
    assertEquals(configPeerCreatePeerModel.keepalive(), configPeerKeepaliveModel);
    assertEquals(configPeerCreatePeerModel.gossip(), configPeerGossipModel);
    assertEquals(configPeerCreatePeerModel.authentication(), configPeerAuthenticationModel);
    assertEquals(configPeerCreatePeerModel.bccsp(), bccspModel);
    assertEquals(configPeerCreatePeerModel.client(), configPeerClientModel);
    assertEquals(configPeerCreatePeerModel.deliveryclient(), configPeerDeliveryclientModel);
    assertEquals(configPeerCreatePeerModel.adminService(), configPeerAdminServiceModel);
    assertEquals(configPeerCreatePeerModel.validatorPoolSize(), Double.valueOf("8"));
    assertEquals(configPeerCreatePeerModel.discovery(), configPeerDiscoveryModel);
    assertEquals(configPeerCreatePeerModel.limits(), configPeerLimitsModel);

    String json = TestUtilities.serialize(configPeerCreatePeerModel);

    ConfigPeerCreatePeer configPeerCreatePeerModelNew = TestUtilities.deserialize(json, ConfigPeerCreatePeer.class);
    assertTrue(configPeerCreatePeerModelNew instanceof ConfigPeerCreatePeer);
    assertEquals(configPeerCreatePeerModelNew.id(), "john-doe");
    assertEquals(configPeerCreatePeerModelNew.networkId(), "dev");
    assertEquals(configPeerCreatePeerModelNew.keepalive().toString(), configPeerKeepaliveModel.toString());
    assertEquals(configPeerCreatePeerModelNew.gossip().toString(), configPeerGossipModel.toString());
    assertEquals(configPeerCreatePeerModelNew.authentication().toString(), configPeerAuthenticationModel.toString());
    assertEquals(configPeerCreatePeerModelNew.bccsp().toString(), bccspModel.toString());
    assertEquals(configPeerCreatePeerModelNew.client().toString(), configPeerClientModel.toString());
    assertEquals(configPeerCreatePeerModelNew.deliveryclient().toString(), configPeerDeliveryclientModel.toString());
    assertEquals(configPeerCreatePeerModelNew.adminService().toString(), configPeerAdminServiceModel.toString());
    assertEquals(configPeerCreatePeerModelNew.validatorPoolSize(), Double.valueOf("8"));
    assertEquals(configPeerCreatePeerModelNew.discovery().toString(), configPeerDiscoveryModel.toString());
    assertEquals(configPeerCreatePeerModelNew.limits().toString(), configPeerLimitsModel.toString());
  }
}