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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepalive;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepaliveClient;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepaliveDeliveryClient;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigPeerKeepalive model.
 */
public class ConfigPeerKeepaliveTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerKeepalive() throws Throwable {
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

    String json = TestUtilities.serialize(configPeerKeepaliveModel);

    ConfigPeerKeepalive configPeerKeepaliveModelNew = TestUtilities.deserialize(json, ConfigPeerKeepalive.class);
    assertTrue(configPeerKeepaliveModelNew instanceof ConfigPeerKeepalive);
    assertEquals(configPeerKeepaliveModelNew.minInterval(), "60s");
    assertEquals(configPeerKeepaliveModelNew.client().toString(), configPeerKeepaliveClientModel.toString());
    assertEquals(configPeerKeepaliveModelNew.deliveryClient().toString(), configPeerKeepaliveDeliveryClientModel.toString());
  }
}