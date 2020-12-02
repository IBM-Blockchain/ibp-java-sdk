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
import com.ibm.cloud.blockchain.v3.model.ClientAuth;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererAuthentication;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererCreate;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererDebug;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererGeneral;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererKeepalive;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetrics;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetricsStatsd;
import com.ibm.cloud.blockchain.v3.model.CreateOrdererOptions;
import com.ibm.cloud.blockchain.v3.model.CreateOrdererRaftBodyResources;
import com.ibm.cloud.blockchain.v3.model.CreateOrdererRaftBodyStorage;
import com.ibm.cloud.blockchain.v3.model.CryptoEnrollmentComponent;
import com.ibm.cloud.blockchain.v3.model.CryptoObject;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollment;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollmentCa;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollmentTlsca;
import com.ibm.cloud.blockchain.v3.model.CryptoObjectMsp;
import com.ibm.cloud.blockchain.v3.model.Hsm;
import com.ibm.cloud.blockchain.v3.model.MspCryptoCa;
import com.ibm.cloud.blockchain.v3.model.MspCryptoComp;
import com.ibm.cloud.blockchain.v3.model.ResourceLimits;
import com.ibm.cloud.blockchain.v3.model.ResourceObject;
import com.ibm.cloud.blockchain.v3.model.ResourceRequests;
import com.ibm.cloud.blockchain.v3.model.StorageObject;
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
 * Unit test class for the CreateOrdererOptions model.
 */
public class CreateOrdererOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateOrdererOptions() throws Throwable {
    CryptoEnrollmentComponent cryptoEnrollmentComponentModel = new CryptoEnrollmentComponent.Builder()
      .admincerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .build();
    assertEquals(cryptoEnrollmentComponentModel.admincerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));

    CryptoObjectEnrollmentCa cryptoObjectEnrollmentCaModel = new CryptoObjectEnrollmentCa.Builder()
      .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
      .port(Double.valueOf("7054"))
      .name("ca")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .enrollId("admin")
      .enrollSecret("password")
      .build();
    assertEquals(cryptoObjectEnrollmentCaModel.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(cryptoObjectEnrollmentCaModel.port(), Double.valueOf("7054"));
    assertEquals(cryptoObjectEnrollmentCaModel.name(), "ca");
    assertEquals(cryptoObjectEnrollmentCaModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(cryptoObjectEnrollmentCaModel.enrollId(), "admin");
    assertEquals(cryptoObjectEnrollmentCaModel.enrollSecret(), "password");

    CryptoObjectEnrollmentTlsca cryptoObjectEnrollmentTlscaModel = new CryptoObjectEnrollmentTlsca.Builder()
      .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
      .port(Double.valueOf("7054"))
      .name("tlsca")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .enrollId("admin")
      .enrollSecret("password")
      .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(cryptoObjectEnrollmentTlscaModel.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(cryptoObjectEnrollmentTlscaModel.port(), Double.valueOf("7054"));
    assertEquals(cryptoObjectEnrollmentTlscaModel.name(), "tlsca");
    assertEquals(cryptoObjectEnrollmentTlscaModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(cryptoObjectEnrollmentTlscaModel.enrollId(), "admin");
    assertEquals(cryptoObjectEnrollmentTlscaModel.enrollSecret(), "password");
    assertEquals(cryptoObjectEnrollmentTlscaModel.csrHosts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    CryptoObjectEnrollment cryptoObjectEnrollmentModel = new CryptoObjectEnrollment.Builder()
      .component(cryptoEnrollmentComponentModel)
      .ca(cryptoObjectEnrollmentCaModel)
      .tlsca(cryptoObjectEnrollmentTlscaModel)
      .build();
    assertEquals(cryptoObjectEnrollmentModel.component(), cryptoEnrollmentComponentModel);
    assertEquals(cryptoObjectEnrollmentModel.ca(), cryptoObjectEnrollmentCaModel);
    assertEquals(cryptoObjectEnrollmentModel.tlsca(), cryptoObjectEnrollmentTlscaModel);

    ClientAuth clientAuthModel = new ClientAuth.Builder()
      .type("noclientcert")
      .tlsCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(clientAuthModel.type(), "noclientcert");
    assertEquals(clientAuthModel.tlsCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    MspCryptoComp mspCryptoCompModel = new MspCryptoComp.Builder()
      .ekey("testString")
      .ecert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .tlsKey("testString")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .clientAuth(clientAuthModel)
      .build();
    assertEquals(mspCryptoCompModel.ekey(), "testString");
    assertEquals(mspCryptoCompModel.ecert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(mspCryptoCompModel.adminCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(mspCryptoCompModel.tlsKey(), "testString");
    assertEquals(mspCryptoCompModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(mspCryptoCompModel.clientAuth(), clientAuthModel);

    MspCryptoCa mspCryptoCaModel = new MspCryptoCa.Builder()
      .rootCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .caIntermediateCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(mspCryptoCaModel.rootCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(mspCryptoCaModel.caIntermediateCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    CryptoObjectMsp cryptoObjectMspModel = new CryptoObjectMsp.Builder()
      .component(mspCryptoCompModel)
      .ca(mspCryptoCaModel)
      .tlsca(mspCryptoCaModel)
      .build();
    assertEquals(cryptoObjectMspModel.component(), mspCryptoCompModel);
    assertEquals(cryptoObjectMspModel.ca(), mspCryptoCaModel);
    assertEquals(cryptoObjectMspModel.tlsca(), mspCryptoCaModel);

    CryptoObject cryptoObjectModel = new CryptoObject.Builder()
      .enrollment(cryptoObjectEnrollmentModel)
      .msp(cryptoObjectMspModel)
      .build();
    assertEquals(cryptoObjectModel.enrollment(), cryptoObjectEnrollmentModel);
    assertEquals(cryptoObjectModel.msp(), cryptoObjectMspModel);

    ConfigOrdererKeepalive configOrdererKeepaliveModel = new ConfigOrdererKeepalive.Builder()
      .serverMinInterval("60s")
      .serverInterval("2h")
      .serverTimeout("20s")
      .build();
    assertEquals(configOrdererKeepaliveModel.serverMinInterval(), "60s");
    assertEquals(configOrdererKeepaliveModel.serverInterval(), "2h");
    assertEquals(configOrdererKeepaliveModel.serverTimeout(), "20s");

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

    ConfigOrdererAuthentication configOrdererAuthenticationModel = new ConfigOrdererAuthentication.Builder()
      .timeWindow("15m")
      .noExpirationChecks(false)
      .build();
    assertEquals(configOrdererAuthenticationModel.timeWindow(), "15m");
    assertEquals(configOrdererAuthenticationModel.noExpirationChecks(), Boolean.valueOf(false));

    ConfigOrdererGeneral configOrdererGeneralModel = new ConfigOrdererGeneral.Builder()
      .keepalive(configOrdererKeepaliveModel)
      .bccsp(bccspModel)
      .authentication(configOrdererAuthenticationModel)
      .build();
    assertEquals(configOrdererGeneralModel.keepalive(), configOrdererKeepaliveModel);
    assertEquals(configOrdererGeneralModel.bccsp(), bccspModel);
    assertEquals(configOrdererGeneralModel.authentication(), configOrdererAuthenticationModel);

    ConfigOrdererDebug configOrdererDebugModel = new ConfigOrdererDebug.Builder()
      .broadcastTraceDir("testString")
      .deliverTraceDir("testString")
      .build();
    assertEquals(configOrdererDebugModel.broadcastTraceDir(), "testString");
    assertEquals(configOrdererDebugModel.deliverTraceDir(), "testString");

    ConfigOrdererMetricsStatsd configOrdererMetricsStatsdModel = new ConfigOrdererMetricsStatsd.Builder()
      .network("udp")
      .address("127.0.0.1:8125")
      .writeInterval("10s")
      .prefix("server")
      .build();
    assertEquals(configOrdererMetricsStatsdModel.network(), "udp");
    assertEquals(configOrdererMetricsStatsdModel.address(), "127.0.0.1:8125");
    assertEquals(configOrdererMetricsStatsdModel.writeInterval(), "10s");
    assertEquals(configOrdererMetricsStatsdModel.prefix(), "server");

    ConfigOrdererMetrics configOrdererMetricsModel = new ConfigOrdererMetrics.Builder()
      .provider("disabled")
      .statsd(configOrdererMetricsStatsdModel)
      .build();
    assertEquals(configOrdererMetricsModel.provider(), "disabled");
    assertEquals(configOrdererMetricsModel.statsd(), configOrdererMetricsStatsdModel);

    ConfigOrdererCreate configOrdererCreateModel = new ConfigOrdererCreate.Builder()
      .general(configOrdererGeneralModel)
      .debug(configOrdererDebugModel)
      .metrics(configOrdererMetricsModel)
      .build();
    assertEquals(configOrdererCreateModel.general(), configOrdererGeneralModel);
    assertEquals(configOrdererCreateModel.debug(), configOrdererDebugModel);
    assertEquals(configOrdererCreateModel.metrics(), configOrdererMetricsModel);

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

    StorageObject storageObjectModel = new StorageObject.Builder()
      .size("4GiB")
      .xClass("default")
      .build();
    assertEquals(storageObjectModel.size(), "4GiB");
    assertEquals(storageObjectModel.xClass(), "default");

    CreateOrdererRaftBodyStorage createOrdererRaftBodyStorageModel = new CreateOrdererRaftBodyStorage.Builder()
      .orderer(storageObjectModel)
      .build();
    assertEquals(createOrdererRaftBodyStorageModel.orderer(), storageObjectModel);

    Hsm hsmModel = new Hsm.Builder()
      .pkcs11endpoint("tcp://example.com:666")
      .build();
    assertEquals(hsmModel.pkcs11endpoint(), "tcp://example.com:666");

    CreateOrdererOptions createOrdererOptionsModel = new CreateOrdererOptions.Builder()
      .ordererType("raft")
      .mspId("Org1")
      .displayName("orderer")
      .crypto(new java.util.ArrayList<CryptoObject>(java.util.Arrays.asList(cryptoObjectModel)))
      .clusterName("ordering service 1")
      .clusterId("abcde")
      .externalAppend("false")
      .configOverride(new java.util.ArrayList<ConfigOrdererCreate>(java.util.Arrays.asList(configOrdererCreateModel)))
      .resources(createOrdererRaftBodyResourcesModel)
      .storage(createOrdererRaftBodyStorageModel)
      .systemChannelId("testchainid")
      .zone(new java.util.ArrayList<String>(java.util.Arrays.asList("-")))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")))
      .region(new java.util.ArrayList<String>(java.util.Arrays.asList("-")))
      .hsm(hsmModel)
      .version("1.4.6-1")
      .build();
    assertEquals(createOrdererOptionsModel.ordererType(), "raft");
    assertEquals(createOrdererOptionsModel.mspId(), "Org1");
    assertEquals(createOrdererOptionsModel.displayName(), "orderer");
    assertEquals(createOrdererOptionsModel.crypto(), new java.util.ArrayList<CryptoObject>(java.util.Arrays.asList(cryptoObjectModel)));
    assertEquals(createOrdererOptionsModel.clusterName(), "ordering service 1");
    assertEquals(createOrdererOptionsModel.clusterId(), "abcde");
    assertEquals(createOrdererOptionsModel.externalAppend(), "false");
    assertEquals(createOrdererOptionsModel.configOverride(), new java.util.ArrayList<ConfigOrdererCreate>(java.util.Arrays.asList(configOrdererCreateModel)));
    assertEquals(createOrdererOptionsModel.resources(), createOrdererRaftBodyResourcesModel);
    assertEquals(createOrdererOptionsModel.storage(), createOrdererRaftBodyStorageModel);
    assertEquals(createOrdererOptionsModel.systemChannelId(), "testchainid");
    assertEquals(createOrdererOptionsModel.zone(), new java.util.ArrayList<String>(java.util.Arrays.asList("-")));
    assertEquals(createOrdererOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("fabric-ca")));
    assertEquals(createOrdererOptionsModel.region(), new java.util.ArrayList<String>(java.util.Arrays.asList("-")));
    assertEquals(createOrdererOptionsModel.hsm(), hsmModel);
    assertEquals(createOrdererOptionsModel.version(), "1.4.6-1");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateOrdererOptionsError() throws Throwable {
    new CreateOrdererOptions.Builder().build();
  }

}