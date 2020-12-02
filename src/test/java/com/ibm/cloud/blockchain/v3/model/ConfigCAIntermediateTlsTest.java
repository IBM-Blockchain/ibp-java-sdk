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

import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateTls;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateTlsClient;
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
 * Unit test class for the ConfigCAIntermediateTls model.
 */
public class ConfigCAIntermediateTlsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCAIntermediateTls() throws Throwable {
    ConfigCAIntermediateTlsClient configCaIntermediateTlsClientModel = new ConfigCAIntermediateTlsClient.Builder()
      .certfile("testString")
      .keyfile("testString")
      .build();
    assertEquals(configCaIntermediateTlsClientModel.certfile(), "testString");
    assertEquals(configCaIntermediateTlsClientModel.keyfile(), "testString");

    ConfigCAIntermediateTls configCaIntermediateTlsModel = new ConfigCAIntermediateTls.Builder()
      .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .client(configCaIntermediateTlsClientModel)
      .build();
    assertEquals(configCaIntermediateTlsModel.certfiles(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(configCaIntermediateTlsModel.client(), configCaIntermediateTlsClientModel);

    String json = TestUtilities.serialize(configCaIntermediateTlsModel);

    ConfigCAIntermediateTls configCaIntermediateTlsModelNew = TestUtilities.deserialize(json, ConfigCAIntermediateTls.class);
    assertTrue(configCaIntermediateTlsModelNew instanceof ConfigCAIntermediateTls);
    assertEquals(configCaIntermediateTlsModelNew.client().toString(), configCaIntermediateTlsClientModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConfigCAIntermediateTlsError() throws Throwable {
    new ConfigCAIntermediateTls.Builder().build();
  }

}