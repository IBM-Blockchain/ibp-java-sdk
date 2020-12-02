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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerDiscovery;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigPeerDiscovery model.
 */
public class ConfigPeerDiscoveryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerDiscovery() throws Throwable {
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

    String json = TestUtilities.serialize(configPeerDiscoveryModel);

    ConfigPeerDiscovery configPeerDiscoveryModelNew = TestUtilities.deserialize(json, ConfigPeerDiscovery.class);
    assertTrue(configPeerDiscoveryModelNew instanceof ConfigPeerDiscovery);
    assertEquals(configPeerDiscoveryModelNew.enabled(), Boolean.valueOf(true));
    assertEquals(configPeerDiscoveryModelNew.authCacheEnabled(), Boolean.valueOf(true));
    assertEquals(configPeerDiscoveryModelNew.authCacheMaxSize(), Double.valueOf("1000"));
    assertEquals(configPeerDiscoveryModelNew.authCachePurgeRetentionRatio(), Double.valueOf("0.75"));
    assertEquals(configPeerDiscoveryModelNew.orgMembersAllowedAccess(), Boolean.valueOf(false));
  }
}