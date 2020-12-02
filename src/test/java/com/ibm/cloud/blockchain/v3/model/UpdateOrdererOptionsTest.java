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
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererAuthentication;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererDebug;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererGeneralUpdate;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererKeepalive;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetrics;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetricsStatsd;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererUpdate;
import com.ibm.cloud.blockchain.v3.model.CryptoEnrollmentComponent;
import com.ibm.cloud.blockchain.v3.model.NodeOu;
import com.ibm.cloud.blockchain.v3.model.ResourceLimits;
import com.ibm.cloud.blockchain.v3.model.ResourceObject;
import com.ibm.cloud.blockchain.v3.model.ResourceRequests;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoField;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.UpdateEnrollmentCryptoFieldTlsca;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoField;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldCa;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldComponent;
import com.ibm.cloud.blockchain.v3.model.UpdateMspCryptoFieldTlsca;
import com.ibm.cloud.blockchain.v3.model.UpdateOrdererBodyCrypto;
import com.ibm.cloud.blockchain.v3.model.UpdateOrdererBodyResources;
import com.ibm.cloud.blockchain.v3.model.UpdateOrdererOptions;
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
 * Unit test class for the UpdateOrdererOptions model.
 */
public class UpdateOrdererOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateOrdererOptions() throws Throwable {
    ConfigOrdererKeepalive configOrdererKeepaliveModel = new ConfigOrdererKeepalive.Builder()
      .serverMinInterval("60s")
      .serverInterval("2h")
      .serverTimeout("20s")
      .build();
    assertEquals(configOrdererKeepaliveModel.serverMinInterval(), "60s");
    assertEquals(configOrdererKeepaliveModel.serverInterval(), "2h");
    assertEquals(configOrdererKeepaliveModel.serverTimeout(), "20s");

    ConfigOrdererAuthentication configOrdererAuthenticationModel = new ConfigOrdererAuthentication.Builder()
      .timeWindow("15m")
      .noExpirationChecks(false)
      .build();
    assertEquals(configOrdererAuthenticationModel.timeWindow(), "15m");
    assertEquals(configOrdererAuthenticationModel.noExpirationChecks(), Boolean.valueOf(false));

    ConfigOrdererGeneralUpdate configOrdererGeneralUpdateModel = new ConfigOrdererGeneralUpdate.Builder()
      .keepalive(configOrdererKeepaliveModel)
      .authentication(configOrdererAuthenticationModel)
      .build();
    assertEquals(configOrdererGeneralUpdateModel.keepalive(), configOrdererKeepaliveModel);
    assertEquals(configOrdererGeneralUpdateModel.authentication(), configOrdererAuthenticationModel);

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

    ConfigOrdererUpdate configOrdererUpdateModel = new ConfigOrdererUpdate.Builder()
      .general(configOrdererGeneralUpdateModel)
      .debug(configOrdererDebugModel)
      .metrics(configOrdererMetricsModel)
      .build();
    assertEquals(configOrdererUpdateModel.general(), configOrdererGeneralUpdateModel);
    assertEquals(configOrdererUpdateModel.debug(), configOrdererDebugModel);
    assertEquals(configOrdererUpdateModel.metrics(), configOrdererMetricsModel);

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

    UpdateOrdererBodyCrypto updateOrdererBodyCryptoModel = new UpdateOrdererBodyCrypto.Builder()
      .enrollment(updateEnrollmentCryptoFieldModel)
      .msp(updateMspCryptoFieldModel)
      .build();
    assertEquals(updateOrdererBodyCryptoModel.enrollment(), updateEnrollmentCryptoFieldModel);
    assertEquals(updateOrdererBodyCryptoModel.msp(), updateMspCryptoFieldModel);

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

    ResourceObject resourceObjectModel = new ResourceObject.Builder()
      .requests(resourceRequestsModel)
      .limits(resourceLimitsModel)
      .build();
    assertEquals(resourceObjectModel.requests(), resourceRequestsModel);
    assertEquals(resourceObjectModel.limits(), resourceLimitsModel);

    UpdateOrdererBodyResources updateOrdererBodyResourcesModel = new UpdateOrdererBodyResources.Builder()
      .orderer(resourceObjectModel)
      .proxy(resourceObjectModel)
      .build();
    assertEquals(updateOrdererBodyResourcesModel.orderer(), resourceObjectModel);
    assertEquals(updateOrdererBodyResourcesModel.proxy(), resourceObjectModel);

    UpdateOrdererOptions updateOrdererOptionsModel = new UpdateOrdererOptions.Builder()
      .id("testString")
      .adminCerts(new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")))
      .configOverride(configOrdererUpdateModel)
      .crypto(updateOrdererBodyCryptoModel)
      .nodeOu(nodeOuModel)
      .replicas(Double.valueOf("1"))
      .resources(updateOrdererBodyResourcesModel)
      .version("1.4.6-1")
      .zone("-")
      .build();
    assertEquals(updateOrdererOptionsModel.id(), "testString");
    assertEquals(updateOrdererOptionsModel.adminCerts(), new java.util.ArrayList<String>(java.util.Arrays.asList("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")));
    assertEquals(updateOrdererOptionsModel.configOverride(), configOrdererUpdateModel);
    assertEquals(updateOrdererOptionsModel.crypto(), updateOrdererBodyCryptoModel);
    assertEquals(updateOrdererOptionsModel.nodeOu(), nodeOuModel);
    assertEquals(updateOrdererOptionsModel.replicas(), Double.valueOf("1"));
    assertEquals(updateOrdererOptionsModel.resources(), updateOrdererBodyResourcesModel);
    assertEquals(updateOrdererOptionsModel.version(), "1.4.6-1");
    assertEquals(updateOrdererOptionsModel.zone(), "-");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateOrdererOptionsError() throws Throwable {
    new UpdateOrdererOptions.Builder().build();
  }

}