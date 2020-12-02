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
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererAuthentication;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererCreate;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererDebug;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererGeneral;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererKeepalive;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetrics;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetricsStatsd;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigOrdererCreate model.
 */
public class ConfigOrdererCreateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigOrdererCreate() throws Throwable {
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

    String json = TestUtilities.serialize(configOrdererCreateModel);

    ConfigOrdererCreate configOrdererCreateModelNew = TestUtilities.deserialize(json, ConfigOrdererCreate.class);
    assertTrue(configOrdererCreateModelNew instanceof ConfigOrdererCreate);
    assertEquals(configOrdererCreateModelNew.general().toString(), configOrdererGeneralModel.toString());
    assertEquals(configOrdererCreateModelNew.debug().toString(), configOrdererDebugModel.toString());
    assertEquals(configOrdererCreateModelNew.metrics().toString(), configOrdererMetricsModel.toString());
  }
}