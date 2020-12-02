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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerDeliveryclient;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerDeliveryclientAddressOverridesItem;
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
 * Unit test class for the ConfigPeerDeliveryclient model.
 */
public class ConfigPeerDeliveryclientTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerDeliveryclient() throws Throwable {
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

    String json = TestUtilities.serialize(configPeerDeliveryclientModel);

    ConfigPeerDeliveryclient configPeerDeliveryclientModelNew = TestUtilities.deserialize(json, ConfigPeerDeliveryclient.class);
    assertTrue(configPeerDeliveryclientModelNew instanceof ConfigPeerDeliveryclient);
    assertEquals(configPeerDeliveryclientModelNew.reconnectTotalTimeThreshold(), "60m");
    assertEquals(configPeerDeliveryclientModelNew.connTimeout(), "2s");
    assertEquals(configPeerDeliveryclientModelNew.reConnectBackoffThreshold(), "60m");
  }
}