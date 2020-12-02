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

import com.ibm.cloud.blockchain.v3.model.MetricsStatsd;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the MetricsStatsd model.
 */
public class MetricsStatsdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMetricsStatsd() throws Throwable {
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

    String json = TestUtilities.serialize(metricsStatsdModel);

    MetricsStatsd metricsStatsdModelNew = TestUtilities.deserialize(json, MetricsStatsd.class);
    assertTrue(metricsStatsdModelNew instanceof MetricsStatsd);
    assertEquals(metricsStatsdModelNew.network(), "udp");
    assertEquals(metricsStatsdModelNew.address(), "127.0.0.1:8125");
    assertEquals(metricsStatsdModelNew.writeInterval(), "10s");
    assertEquals(metricsStatsdModelNew.prefix(), "server");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testMetricsStatsdError() throws Throwable {
    new MetricsStatsd.Builder().build();
  }

}