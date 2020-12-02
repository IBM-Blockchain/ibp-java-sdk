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

import com.ibm.cloud.blockchain.v3.model.ConfigPeerAdminService;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigPeerAdminService model.
 */
public class ConfigPeerAdminServiceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigPeerAdminService() throws Throwable {
    ConfigPeerAdminService configPeerAdminServiceModel = new ConfigPeerAdminService.Builder()
      .listenAddress("0.0.0.0:7051")
      .build();
    assertEquals(configPeerAdminServiceModel.listenAddress(), "0.0.0.0:7051");

    String json = TestUtilities.serialize(configPeerAdminServiceModel);

    ConfigPeerAdminService configPeerAdminServiceModelNew = TestUtilities.deserialize(json, ConfigPeerAdminService.class);
    assertTrue(configPeerAdminServiceModelNew instanceof ConfigPeerAdminService);
    assertEquals(configPeerAdminServiceModelNew.listenAddress(), "0.0.0.0:7051");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConfigPeerAdminServiceError() throws Throwable {
    new ConfigPeerAdminService.Builder().build();
  }

}