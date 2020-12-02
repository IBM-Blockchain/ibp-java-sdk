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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincode;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeExternalBuildersItem;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeGolang;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeLogging;
import com.ibm.cloud.blockchain.v3.model.ConfigPeerChaincodeSystem;
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
 * Unit test class for the ConfigPeerChaincode model.
 */
public class ConfigPeerChaincodeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerChaincode() throws Throwable {
    ConfigPeerChaincodeGolang configPeerChaincodeGolangModel = new ConfigPeerChaincodeGolang.Builder()
      .dynamicLink(false)
      .build();
    assertEquals(configPeerChaincodeGolangModel.dynamicLink(), Boolean.valueOf(false));

    ConfigPeerChaincodeExternalBuildersItem configPeerChaincodeExternalBuildersItemModel = new ConfigPeerChaincodeExternalBuildersItem.Builder()
      .path("/path/to/directory")
      .name("descriptive-build-name")
      .environmentWhitelist(new java.util.ArrayList<String>(java.util.Arrays.asList("GOPROXY")))
      .build();
    assertEquals(configPeerChaincodeExternalBuildersItemModel.path(), "/path/to/directory");
    assertEquals(configPeerChaincodeExternalBuildersItemModel.name(), "descriptive-build-name");
    assertEquals(configPeerChaincodeExternalBuildersItemModel.environmentWhitelist(), new java.util.ArrayList<String>(java.util.Arrays.asList("GOPROXY")));

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

    ConfigPeerChaincodeLogging configPeerChaincodeLoggingModel = new ConfigPeerChaincodeLogging.Builder()
      .level("info")
      .shim("warning")
      .format("%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}")
      .build();
    assertEquals(configPeerChaincodeLoggingModel.level(), "info");
    assertEquals(configPeerChaincodeLoggingModel.shim(), "warning");
    assertEquals(configPeerChaincodeLoggingModel.format(), "%{color}%{time:2006-01-02 15:04:05.000 MST} [%{module}] %{shortfunc} -> %{level:.4s} %{id:03x}%{color:reset} %{message}");

    ConfigPeerChaincode configPeerChaincodeModel = new ConfigPeerChaincode.Builder()
      .golang(configPeerChaincodeGolangModel)
      .externalBuilders(new java.util.ArrayList<ConfigPeerChaincodeExternalBuildersItem>(java.util.Arrays.asList(configPeerChaincodeExternalBuildersItemModel)))
      .installTimeout("300s")
      .startuptimeout("300s")
      .executetimeout("30s")
      .system(configPeerChaincodeSystemModel)
      .logging(configPeerChaincodeLoggingModel)
      .build();
    assertEquals(configPeerChaincodeModel.golang(), configPeerChaincodeGolangModel);
    assertEquals(configPeerChaincodeModel.externalBuilders(), new java.util.ArrayList<ConfigPeerChaincodeExternalBuildersItem>(java.util.Arrays.asList(configPeerChaincodeExternalBuildersItemModel)));
    assertEquals(configPeerChaincodeModel.installTimeout(), "300s");
    assertEquals(configPeerChaincodeModel.startuptimeout(), "300s");
    assertEquals(configPeerChaincodeModel.executetimeout(), "30s");
    assertEquals(configPeerChaincodeModel.system(), configPeerChaincodeSystemModel);
    assertEquals(configPeerChaincodeModel.logging(), configPeerChaincodeLoggingModel);

    String json = TestUtilities.serialize(configPeerChaincodeModel);

    ConfigPeerChaincode configPeerChaincodeModelNew = TestUtilities.deserialize(json, ConfigPeerChaincode.class);
    assertTrue(configPeerChaincodeModelNew instanceof ConfigPeerChaincode);
    assertEquals(configPeerChaincodeModelNew.golang().toString(), configPeerChaincodeGolangModel.toString());
    assertEquals(configPeerChaincodeModelNew.installTimeout(), "300s");
    assertEquals(configPeerChaincodeModelNew.startuptimeout(), "300s");
    assertEquals(configPeerChaincodeModelNew.executetimeout(), "30s");
    assertEquals(configPeerChaincodeModelNew.system().toString(), configPeerChaincodeSystemModel.toString());
    assertEquals(configPeerChaincodeModelNew.logging().toString(), configPeerChaincodeLoggingModel.toString());
  }
}