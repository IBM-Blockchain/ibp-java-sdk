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

import com.ibm.cloud.blockchain.v3.model.ConfigCASigningDefault;
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
 * Unit test class for the ConfigCASigningDefault model.
 */
public class ConfigCASigningDefaultTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCASigningDefault() throws Throwable {
    ConfigCASigningDefault configCaSigningDefaultModel = new ConfigCASigningDefault.Builder()
      .usage(new java.util.ArrayList<String>(java.util.Arrays.asList("cert sign")))
      .expiry("8760h")
      .build();
    assertEquals(configCaSigningDefaultModel.usage(), new java.util.ArrayList<String>(java.util.Arrays.asList("cert sign")));
    assertEquals(configCaSigningDefaultModel.expiry(), "8760h");

    String json = TestUtilities.serialize(configCaSigningDefaultModel);

    ConfigCASigningDefault configCaSigningDefaultModelNew = TestUtilities.deserialize(json, ConfigCASigningDefault.class);
    assertTrue(configCaSigningDefaultModelNew instanceof ConfigCASigningDefault);
    assertEquals(configCaSigningDefaultModelNew.expiry(), "8760h");
  }
}