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

import com.ibm.cloud.blockchain.v3.model.ConfigCADbTls;
import com.ibm.cloud.blockchain.v3.model.ConfigCADbTlsClient;
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
 * Unit test class for the ConfigCADbTls model.
 */
public class ConfigCADbTlsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCADbTls() throws Throwable {
    ConfigCADbTlsClient configCaDbTlsClientModel = new ConfigCADbTlsClient.Builder()
      .certfile("testString")
      .keyfile("testString")
      .build();
    assertEquals(configCaDbTlsClientModel.certfile(), "testString");
    assertEquals(configCaDbTlsClientModel.keyfile(), "testString");

    ConfigCADbTls configCaDbTlsModel = new ConfigCADbTls.Builder()
      .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .client(configCaDbTlsClientModel)
      .enabled(false)
      .build();
    assertEquals(configCaDbTlsModel.certfiles(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(configCaDbTlsModel.client(), configCaDbTlsClientModel);
    assertEquals(configCaDbTlsModel.enabled(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(configCaDbTlsModel);

    ConfigCADbTls configCaDbTlsModelNew = TestUtilities.deserialize(json, ConfigCADbTls.class);
    assertTrue(configCaDbTlsModelNew instanceof ConfigCADbTls);
    assertEquals(configCaDbTlsModelNew.client().toString(), configCaDbTlsClientModel.toString());
    assertEquals(configCaDbTlsModelNew.enabled(), Boolean.valueOf(false));
  }
}