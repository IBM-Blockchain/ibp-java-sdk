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

import com.ibm.cloud.blockchain.v3.model.ConfigOrdererKeepalive;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigOrdererKeepalive model.
 */
public class ConfigOrdererKeepaliveTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigOrdererKeepalive() throws Throwable {
    ConfigOrdererKeepalive configOrdererKeepaliveModel = new ConfigOrdererKeepalive.Builder()
      .serverMinInterval("60s")
      .serverInterval("2h")
      .serverTimeout("20s")
      .build();
    assertEquals(configOrdererKeepaliveModel.serverMinInterval(), "60s");
    assertEquals(configOrdererKeepaliveModel.serverInterval(), "2h");
    assertEquals(configOrdererKeepaliveModel.serverTimeout(), "20s");

    String json = TestUtilities.serialize(configOrdererKeepaliveModel);

    ConfigOrdererKeepalive configOrdererKeepaliveModelNew = TestUtilities.deserialize(json, ConfigOrdererKeepalive.class);
    assertTrue(configOrdererKeepaliveModelNew instanceof ConfigOrdererKeepalive);
    assertEquals(configOrdererKeepaliveModelNew.serverMinInterval(), "60s");
    assertEquals(configOrdererKeepaliveModelNew.serverInterval(), "2h");
    assertEquals(configOrdererKeepaliveModelNew.serverTimeout(), "20s");
  }
}