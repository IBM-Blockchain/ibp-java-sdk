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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerKeepaliveClient;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigPeerKeepaliveClient model.
 */
public class ConfigPeerKeepaliveClientTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerKeepaliveClient() throws Throwable {
    ConfigPeerKeepaliveClient configPeerKeepaliveClientModel = new ConfigPeerKeepaliveClient.Builder()
      .interval("60s")
      .timeout("20s")
      .build();
    assertEquals(configPeerKeepaliveClientModel.interval(), "60s");
    assertEquals(configPeerKeepaliveClientModel.timeout(), "20s");

    String json = TestUtilities.serialize(configPeerKeepaliveClientModel);

    ConfigPeerKeepaliveClient configPeerKeepaliveClientModelNew = TestUtilities.deserialize(json, ConfigPeerKeepaliveClient.class);
    assertTrue(configPeerKeepaliveClientModelNew instanceof ConfigPeerKeepaliveClient);
    assertEquals(configPeerKeepaliveClientModelNew.interval(), "60s");
    assertEquals(configPeerKeepaliveClientModelNew.timeout(), "20s");
  }
}