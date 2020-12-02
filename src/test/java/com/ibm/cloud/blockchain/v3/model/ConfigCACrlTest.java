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

import com.ibm.cloud.blockchain.v3.model.ConfigCACrl;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigCACrl model.
 */
public class ConfigCACrlTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCACrl() throws Throwable {
    ConfigCACrl configCaCrlModel = new ConfigCACrl.Builder()
      .expiry("24h")
      .build();
    assertEquals(configCaCrlModel.expiry(), "24h");

    String json = TestUtilities.serialize(configCaCrlModel);

    ConfigCACrl configCaCrlModelNew = TestUtilities.deserialize(json, ConfigCACrl.class);
    assertTrue(configCaCrlModelNew instanceof ConfigCACrl);
    assertEquals(configCaCrlModelNew.expiry(), "24h");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConfigCACrlError() throws Throwable {
    new ConfigCACrl.Builder().build();
  }

}