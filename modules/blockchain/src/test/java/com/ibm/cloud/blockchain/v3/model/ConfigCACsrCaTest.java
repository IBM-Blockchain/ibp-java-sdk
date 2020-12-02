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

import com.ibm.cloud.blockchain.v3.model.ConfigCACsrCa;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigCACsrCa model.
 */
public class ConfigCACsrCaTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCACsrCa() throws Throwable {
    ConfigCACsrCa configCaCsrCaModel = new ConfigCACsrCa.Builder()
      .expiry("131400h")
      .pathlength(Double.valueOf("0"))
      .build();
    assertEquals(configCaCsrCaModel.expiry(), "131400h");
    assertEquals(configCaCsrCaModel.pathlength(), Double.valueOf("0"));

    String json = TestUtilities.serialize(configCaCsrCaModel);

    ConfigCACsrCa configCaCsrCaModelNew = TestUtilities.deserialize(json, ConfigCACsrCa.class);
    assertTrue(configCaCsrCaModelNew instanceof ConfigCACsrCa);
    assertEquals(configCaCsrCaModelNew.expiry(), "131400h");
    assertEquals(configCaCsrCaModelNew.pathlength(), Double.valueOf("0"));
  }
}