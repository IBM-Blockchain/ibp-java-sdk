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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerLimits;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerLimitsConcurrency;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigPeerLimits model.
 */
public class ConfigPeerLimitsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerLimits() throws Throwable {
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

    String json = TestUtilities.serialize(configPeerLimitsModel);

    ConfigPeerLimits configPeerLimitsModelNew = TestUtilities.deserialize(json, ConfigPeerLimits.class);
    assertTrue(configPeerLimitsModelNew instanceof ConfigPeerLimits);
    assertEquals(configPeerLimitsModelNew.concurrency().toString(), configPeerLimitsConcurrencyModel.toString());
  }
}