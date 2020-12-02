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

import com.ibm.cloud.blockchain.v3.model.ConfigCATls;
import com.ibm.cloud.blockchain.v3.model.ConfigCATlsClientauth;
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
 * Unit test class for the ConfigCATls model.
 */
public class ConfigCATlsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCATls() throws Throwable {
    ConfigCATlsClientauth configCaTlsClientauthModel = new ConfigCATlsClientauth.Builder()
      .type("noclientcert")
      .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(configCaTlsClientauthModel.type(), "noclientcert");
    assertEquals(configCaTlsClientauthModel.certfiles(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    ConfigCATls configCaTlsModel = new ConfigCATls.Builder()
      .keyfile("testString")
      .certfile("testString")
      .clientauth(configCaTlsClientauthModel)
      .build();
    assertEquals(configCaTlsModel.keyfile(), "testString");
    assertEquals(configCaTlsModel.certfile(), "testString");
    assertEquals(configCaTlsModel.clientauth(), configCaTlsClientauthModel);

    String json = TestUtilities.serialize(configCaTlsModel);

    ConfigCATls configCaTlsModelNew = TestUtilities.deserialize(json, ConfigCATls.class);
    assertTrue(configCaTlsModelNew instanceof ConfigCATls);
    assertEquals(configCaTlsModelNew.keyfile(), "testString");
    assertEquals(configCaTlsModelNew.certfile(), "testString");
    assertEquals(configCaTlsModelNew.clientauth().toString(), configCaTlsClientauthModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConfigCATlsError() throws Throwable {
    new ConfigCATls.Builder().build();
  }

}