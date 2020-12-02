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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeSystem;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigPeerChaincodeSystem model.
 */
public class ConfigPeerChaincodeSystemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerChaincodeSystem() throws Throwable {
    ConfigPeerChaincodeSystem configPeerChaincodeSystemModel = new ConfigPeerChaincodeSystem.Builder()
      .cscc(true)
      .lscc(true)
      .escc(true)
      .vscc(true)
      .qscc(true)
      .build();
    assertEquals(configPeerChaincodeSystemModel.cscc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModel.lscc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModel.escc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModel.vscc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModel.qscc(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(configPeerChaincodeSystemModel);

    ConfigPeerChaincodeSystem configPeerChaincodeSystemModelNew = TestUtilities.deserialize(json, ConfigPeerChaincodeSystem.class);
    assertTrue(configPeerChaincodeSystemModelNew instanceof ConfigPeerChaincodeSystem);
    assertEquals(configPeerChaincodeSystemModelNew.cscc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModelNew.lscc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModelNew.escc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModelNew.vscc(), Boolean.valueOf(true));
    assertEquals(configPeerChaincodeSystemModelNew.qscc(), Boolean.valueOf(true));
  }
}