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

import com.ibm.cloud.blockchain.v3.model.ClientAuth;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerAdminService;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerAuthentication;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincode;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeExternalBuildersItem;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeGolang;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeLogging;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeSystem;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerClient;
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
import com.ibm.cloud.blockchain.v3.model.ConfigPeerUpdate;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerUpdatePeer;
import com.ibm.cloud.blockchain.v3.model.CryptoEnrollmentComponent;
import com.ibm.cloud.blockchain.v3.model.Metrics;
import com.ibm.cloud.blockchain.v3.model.MetricsStatsd;
import com.ibm.cloud.blockchain.v3.model.NodeOu;
import com.ibm.cloud.blockchain.v3.model.PeerResources;
import com.ibm.cloud.blockchain.v3.model.ResourceLimits;
import com.ibm.cloud.blockchain.v3.model.ResourceObject;
import com.ibm.cloud.blockchain.v3.model.ResourceObjectCouchDb;
import com.ibm.cloud.blockchain.v3.model.ResourceObjectFabV1;
import com.ibm.cloud.blockchain.v3.model.ResourceObjectFabV2;
import com.ibm.cloud.blockchain.v3.model.ResourceRequests;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoField;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldTlsca;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoField;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldComponent;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldTlsca;
import com.ibm.cloud.blockchain.v3.model.UpdatePeerBodyCrypto;
import com.ibm.cloud.blockchain.v3.model.UpdatePeerOptions;
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
 * Unit test class for the UpdatePeerOptions model.
 */
public class UpdatePeerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdatePeerOptions() throws Throwable {
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

    ConfigPeerUpdatePeer configPeerUpdatePeerModel = new ConfigPeerUpdatePeer.Builder()
      .id("john-doe")
      .networkId("dev")
      .keepalive(configPeerKeepaliveModel)
      .gossip(configPeerGossipModel)
      .authentication(configPeerAuthenticationModel)
      .client(configPeerClientModel)
      .deliveryclient(configPeerDeliveryclientModel)
      .adminService(configPeerAdminServiceModel)
      .validatorPoolSize(Double.valueOf("8"))
      .discovery(configPeerDiscoveryModel)
      .limits(configPeerLimitsModel)
      .build();
    assertEquals(configPeerUpdatePeerModel.id(), "john-doe");
    assertEquals(configPeerUpdatePeerModel.networkId(), "dev");
    assertEquals(configPeerUpdatePeerModel.keepalive(), configPeerKeepaliveModel);
    assertEquals(configPeerUpdatePeerModel.gossip(), configPeerGossipModel);
    assertEquals(configPeerUpdatePeerModel.authentication(), configPeerAuthenticationModel);
    assertEquals(configPeerUpdatePeerModel.client(), configPeerClientModel);
    assertEquals(configPeerUpdatePeerModel.deliveryclient(), configPeerDeliveryclientModel);
    assertEquals(configPeerUpdatePeerModel.adminService(), configPeerAdminServiceModel);
    assertEquals(configPeerUpdatePeerModel.validatorPoolSize(), Double.valueOf("8"));
    assertEquals(configPeerUpdatePeerModel.discovery(), configPeerDiscoveryModel);
    assertEquals(configPeerUpdatePeerModel.limits(), configPeerLimitsModel);

    ConfigPeerChaincodeGolang configPeerChaincodeGolangModel = new ConfigPeerChaincodeGolang.Builder()
      .dynamicLink(false)
      .build();
    assertEquals(configPeerChaincodeGolangModel.dynamicLink(), Boolean.valueOf(false));

    ConfigPeerChaincodeExternalBuildersItem configPeerChaincodeExternalBuildersItemModel = new ConfigPeerChaincodeExternalBuildersItem.Builder()
      .path("/path/to/directory")
      .name("descriptive-build-name")
      .environmentWhitelist(new java.util.ArrayList<String>(java.util.Arrays.asList("GOPROXY")))
      .build();
    assertEquals(configPeerChaincodeExternalBuildersItemModel.path(), "/path/to/directory");
    assertEquals(configPeerChaincodeExternalBuildersItemModel.name(), "descriptive-build-name");
    assertEquals(configPeerChaincodeExternalBuildersItemModel.environmentWhitelist(), new java.util.ArrayList<String>(java.util.Arrays.asList("GOPROXY")));

    ConfigPeerChaincodeSystem configPeerChaincodeSystemModel = new ConfigPeerChaincodeSystem.Builder()
      .cscc(true)
      .lscc(true)
      .escc(true)
      .vscc(true)
      .qscc(true)
      .build();
    assertEquals(configPeerChaincodeSystemModel.cscc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModel.lscc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModel.escc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModel.vscc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModel.qscc(), Boolean.valueOf(true));

    ConfigPeerChaincodeLogging configPeerChaincodeLoggingModel = new ConfigPeerChaincodeLogging.Builder()
      .level("info")
      .shim("warning")
      .format("%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}")
      .build();
    assertEquals(configPeerChaincodeLoggingModel.level(), "info");
    assertEquals(configPeerChaincodeLoggingModel.shim(), "warning");
    assertEquals(configPeerChaincodeLoggingModel.format(), "%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}");

    ConfigPeerChaincode configPeerChaincodeModel = new ConfigPeerChaincode.Builder()
      .golang(configPeerChaincodeGolangModel)
      .externalBuilders(new java.util.ArrayList<ConfigPeerChaincodeExternalBuildersItem>(java.util.Arrays.asList(configPeerChaincodeExternalBuildersItemModel)))
      .installTimeout("300s")
      .startuptimeout("300s")
      .executetimeout("30s")
      .system(configPeerChaincodeSystemModel)
      .logging(configPeerChaincodeLoggingModel)
      .build();
    assertEquals(configPeerChaincodeModel.golang(), configPeerChaincodeGolangModel);
    assertEquals(configPeerChaincodeModel.externalBuilders(), new java.util.ArrayList<ConfigPeerChaincodeExternalBuildersItem>(java.util.Arrays.asList(configPeerChaincodeExternalBuildersItemModel)));
    assertEquals(configPeerChaincodeModel.installTimeout(), "300s");
    assertEquals(configPeerChaincodeModel.startuptimeout(), "300s");
    assertEquals(configPeerChaincodeModel.executetimeout(), "30s");
    assertEquals(configPeerChaincodeModel.system(), configPeerChaincodeSystemModel);
    assertEquals(configPeerChaincodeModel.logging(), configPeerChaincodeLoggingModel);

    MetricsStatsd metricsStatsdModel = new MetricsStatsd.Builder()
      .network("udp")
      .address("127.0.0.1:8125")
      .writeInterval("10s")
      .prefix("server")
      .build();
    assertEquals(metricsStatsdModel.network(), "udp");
    assertEquals(metricsStatsdModel.address(), "127.0.0.1:8125");
    assertEquals(metricsStatsdModel.writeInterval(), "10s");
    assertEquals(metricsStatsdModel.prefix(), "server");

    Metrics metricsModel = new Metrics.Builder()
      .provider("prometheus")
      .statsd(metricsStatsdModel)
      .build();
    assertEquals(metricsModel.provider(), "prometheus");
    assertEquals(metricsModel.statsd(), metricsStatsdModel);

    ConfigPeerUpdate configPeerUpdateModel = new ConfigPeerUpdate.Builder()
      .peer(configPeerUpdatePeerModel)
      .chaincode(configPeerChaincodeModel)
      .metrics(metricsModel)
      .build();
    assertEquals(configPeerUpdateModel.peer(), configPeerUpdatePeerModel);
    assertEquals(configPeerUpdateModel.chaincode(), configPeerChaincodeModel);
    assertEquals(configPeerUpdateModel.metrics(), metricsModel);

    CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
      .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .build();
    assertEquals(cryptoEnrollmentComponentModel.admincerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));

    UpdateEnrollmentCryptoFieldCa updateEnrollmentCryptoFieldCaModel = new UpdateEnrollmentCryptoFieldCa.Builder()
      .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
      .port(Double.valueOf("7054"))
      .name("ca")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .enrollId("admin")
      .enrollSecret("password")
      .build();
    assertEquals(updateEnrollmentCryptoFieldCaModel.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(updateEnrollmentCryptoFieldCaModel.port(), Double.valueOf("7054"));
    assertEquals(updateEnrollmentCryptoFieldCaModel.name(), "ca");
    assertEquals(updateEnrollmentCryptoFieldCaModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(updateEnrollmentCryptoFieldCaModel.enrollId(), "admin");
    assertEquals(updateEnrollmentCryptoFieldCaModel.enrollSecret(), "password");

    UpdateEnrollmentCryptoFieldTlsca updateEnrollmentCryptoFieldTlscaModel = new UpdateEnrollmentCryptoFieldTlsca.Builder()
      .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
      .port(Double.valueOf("7054"))
      .name("tlsca")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .enrollId("admin")
      .enrollSecret("password")
      .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.port(), Double.valueOf("7054"));
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.name(), "tlsca");
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.enrollId(), "admin");
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.enrollSecret(), "password");
    assertEquals(updateEnrollmentCryptoFieldTlscaModel.csrHosts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    UpdateEnrollmentCryptoField updateEnrollmentCryptoFieldModel = new UpdateEnrollmentCryptoField.Builder()
      .component(cryptoEnrollmentComponentModel)
      .ca(updateEnrollmentCryptoFieldCaModel)
      .tlsca(updateEnrollmentCryptoFieldTlscaModel)
      .build();
    assertEquals(updateEnrollmentCryptoFieldModel.component(), cryptoEnrollmentComponentModel);
    assertEquals(updateEnrollmentCryptoFieldModel.ca(), updateEnrollmentCryptoFieldCaModel);
    assertEquals(updateEnrollmentCryptoFieldModel.tlsca(), updateEnrollmentCryptoFieldTlscaModel);

    UpdateMspCryptoFieldCa updateMspCryptoFieldCaModel = new UpdateMspCryptoFieldCa.Builder()
      .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(updateMspCryptoFieldCaModel.rootCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(updateMspCryptoFieldCaModel.caIntermediateCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    UpdateMspCryptoFieldTlsca updateMspCryptoFieldTlscaModel = new UpdateMspCryptoFieldTlsca.Builder()
      .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(updateMspCryptoFieldTlscaModel.rootCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(updateMspCryptoFieldTlscaModel.caIntermediateCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    ClientAuth clientAuthModel = new ClientAuth.Builder()
      .type("noclientcert")
      .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(clientAuthModel.type(), "noclientcert");
    assertEquals(clientAuthModel.tlsCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    UpdateMspCryptoFieldComponent updateMspCryptoFieldComponentModel = new UpdateMspCryptoFieldComponent.Builder()
      .ekey("testString")
      .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .tlsKey("testString")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .clientAuth(clientAuthModel)
      .build();
    assertEquals(updateMspCryptoFieldComponentModel.ekey(), "testString");
    assertEquals(updateMspCryptoFieldComponentModel.ecert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(updateMspCryptoFieldComponentModel.adminCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(updateMspCryptoFieldComponentModel.tlsKey(), "testString");
    assertEquals(updateMspCryptoFieldComponentModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(updateMspCryptoFieldComponentModel.clientAuth(), clientAuthModel);

    UpdateMspCryptoField updateMspCryptoFieldModel = new UpdateMspCryptoField.Builder()
      .ca(updateMspCryptoFieldCaModel)
      .tlsca(updateMspCryptoFieldTlscaModel)
      .component(updateMspCryptoFieldComponentModel)
      .build();
    assertEquals(updateMspCryptoFieldModel.ca(), updateMspCryptoFieldCaModel);
    assertEquals(updateMspCryptoFieldModel.tlsca(), updateMspCryptoFieldTlscaModel);
    assertEquals(updateMspCryptoFieldModel.component(), updateMspCryptoFieldComponentModel);

    UpdatePeerBodyCrypto updatePeerBodyCryptoModel = new UpdatePeerBodyCrypto.Builder()
      .enrollment(updateEnrollmentCryptoFieldModel)
      .msp(updateMspCryptoFieldModel)
      .build();
    assertEquals(updatePeerBodyCryptoModel.enrollment(), updateEnrollmentCryptoFieldModel);
    assertEquals(updatePeerBodyCryptoModel.msp(), updateMspCryptoFieldModel);

    NodeOu nodeOuModel = new NodeOu.Builder()
      .enabled(true)
      .build();
    assertEquals(nodeOuModel.enabled(), Boolean.valueOf(true));

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

    UpdatePeerOptions updatePeerOptionsModel = new UpdatePeerOptions.Builder()
      .id("testString")
      .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .configOverride(configPeerUpdateModel)
      .crypto(updatePeerBodyCryptoModel)
      .nodeOu(nodeOuModel)
      .replicas(Double.valueOf("1"))
      .resources(peerResourcesModel)
      .version("1.4.6-1")
      .zone("-")
      .build();
    assertEquals(updatePeerOptionsModel.id(), "testString");
    assertEquals(updatePeerOptionsModel.adminCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(updatePeerOptionsModel.configOverride(), configPeerUpdateModel);
    assertEquals(updatePeerOptionsModel.crypto(), updatePeerBodyCryptoModel);
    assertEquals(updatePeerOptionsModel.nodeOu(), nodeOuModel);
    assertEquals(updatePeerOptionsModel.replicas(), Double.valueOf("1"));
    assertEquals(updatePeerOptionsModel.resources(), peerResourcesModel);
    assertEquals(updatePeerOptionsModel.version(), "1.4.6-1");
    assertEquals(updatePeerOptionsModel.zone(), "-");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePeerOptionsError() throws Throwable {
    new UpdatePeerOptions.Builder().build();
  }

}