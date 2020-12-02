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

import com.ibm.cloud.blockchain.v3.model.ConfigOrdererAuthentication;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererDebug;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererGeneralUpdate;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererKeepalive;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetrics;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererMetricsStatsd;
import com.ibm.cloud.blockchain.v3.model.ConfigOrdererUpdate;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigOrdererUpdate model.
 */
public class ConfigOrdererUpdateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigOrdererUpdate() throws Throwable {
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

    String json = TestUtilities.serialize(configOrdererUpdateModel);

    ConfigOrdererUpdate configOrdererUpdateModelNew = TestUtilities.deserialize(json, ConfigOrdererUpdate.class);
    assertTrue(configOrdererUpdateModelNew instanceof ConfigOrdererUpdate);
    assertEquals(configOrdererUpdateModelNew.general().toString(), configOrdererGeneralUpdateModel.toString());
    assertEquals(configOrdererUpdateModelNew.debug().toString(), configOrdererDebugModel.toString());
    assertEquals(configOrdererUpdateModelNew.metrics().toString(), configOrdererMetricsModel.toString());
  }
}