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

import com.ibm.cloud.blockchain.v3.model.LoggingSettingsServer;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoggingSettingsServer model.
 */
public class LoggingSettingsServerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoggingSettingsServer() throws Throwable {
    LoggingSettingsServer loggingSettingsServerModel = new LoggingSettingsServer.Builder()
      .enabled(true)
      .level("silly")
      .uniqueName(false)
      .build();
    assertEquals(loggingSettingsServerModel.enabled(), Boolean.valueOf(true));
    assertEquals(loggingSettingsServerModel.level(), "silly");
    assertEquals(loggingSettingsServerModel.uniqueName(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(loggingSettingsServerModel);

    LoggingSettingsServer loggingSettingsServerModelNew = TestUtilities.deserialize(json, LoggingSettingsServer.class);
    assertTrue(loggingSettingsServerModelNew instanceof LoggingSettingsServer);
    assertEquals(loggingSettingsServerModelNew.enabled(), Boolean.valueOf(true));
    assertEquals(loggingSettingsServerModelNew.level(), "silly");
    assertEquals(loggingSettingsServerModelNew.uniqueName(), Boolean.valueOf(false));
  }
}