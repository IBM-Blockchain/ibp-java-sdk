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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeLogging;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigPeerChaincodeLogging model.
 */
public class ConfigPeerChaincodeLoggingTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerChaincodeLogging() throws Throwable {
    ConfigPeerChaincodeLogging configPeerChaincodeLoggingModel = new ConfigPeerChaincodeLogging.Builder()
      .level("info")
      .shim("warning")
      .format("%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}")
      .build();
    assertEquals(configPeerChaincodeLoggingModel.level(), "info");
    assertEquals(configPeerChaincodeLoggingModel.shim(), "warning");
    assertEquals(configPeerChaincodeLoggingModel.format(), "%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}");

    String json = TestUtilities.serialize(configPeerChaincodeLoggingModel);

    ConfigPeerChaincodeLogging configPeerChaincodeLoggingModelNew = TestUtilities.deserialize(json, ConfigPeerChaincodeLogging.class);
    assertTrue(configPeerChaincodeLoggingModelNew instanceof ConfigPeerChaincodeLogging);
    assertEquals(configPeerChaincodeLoggingModelNew.level(), "info");
    assertEquals(configPeerChaincodeLoggingModelNew.shim(), "warning");
    assertEquals(configPeerChaincodeLoggingModelNew.format(), "%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}");
  }
}