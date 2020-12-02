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

import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateParentserver;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigCAIntermediateParentserver model.
 */
public class ConfigCAIntermediateParentserverTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCAIntermediateParentserver() throws Throwable {
    ConfigCAIntermediateParentserver configCaIntermediateParentserverModel = new ConfigCAIntermediateParentserver.Builder()
      .url("testString")
      .caname("testString")
      .build();
    assertEquals(configCaIntermediateParentserverModel.url(), "testString");
    assertEquals(configCaIntermediateParentserverModel.caname(), "testString");

    String json = TestUtilities.serialize(configCaIntermediateParentserverModel);

    ConfigCAIntermediateParentserver configCaIntermediateParentserverModelNew = TestUtilities.deserialize(json, ConfigCAIntermediateParentserver.class);
    assertTrue(configCaIntermediateParentserverModelNew instanceof ConfigCAIntermediateParentserver);
    assertEquals(configCaIntermediateParentserverModelNew.url(), "testString");
    assertEquals(configCaIntermediateParentserverModelNew.caname(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConfigCAIntermediateParentserverError() throws Throwable {
    new ConfigCAIntermediateParentserver.Builder().build();
  }

}