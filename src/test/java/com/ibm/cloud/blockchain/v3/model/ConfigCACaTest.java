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

import com.ibm.cloud.blockchain.v3.model.ConfigCACa;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigCACa model.
 */
public class ConfigCACaTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCACa() throws Throwable {
    ConfigCACa configCaCaModel = new ConfigCACa.Builder()
      .keyfile("testString")
      .certfile("testString")
      .chainfile("testString")
      .build();
    assertEquals(configCaCaModel.keyfile(), "testString");
    assertEquals(configCaCaModel.certfile(), "testString");
    assertEquals(configCaCaModel.chainfile(), "testString");

    String json = TestUtilities.serialize(configCaCaModel);

    ConfigCACa configCaCaModelNew = TestUtilities.deserialize(json, ConfigCACa.class);
    assertTrue(configCaCaModelNew instanceof ConfigCACa);
    assertEquals(configCaCaModelNew.keyfile(), "testString");
    assertEquals(configCaCaModelNew.certfile(), "testString");
    assertEquals(configCaCaModelNew.chainfile(), "testString");
  }
}