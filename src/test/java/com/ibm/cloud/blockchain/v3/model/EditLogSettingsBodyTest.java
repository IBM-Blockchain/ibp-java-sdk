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

import com.ibm.cloud.blockchain.v3.model.EditLogSettingsBody;
import com.ibm.cloud.blockchain.v3.model.LoggingSettingsClient;
import com.ibm.cloud.blockchain.v3.model.LoggingSettingsServer;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EditLogSettingsBody model.
 */
public class EditLogSettingsBodyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEditLogSettingsBody() throws Throwable {
    LoggingSettingsClient loggingSettingsClientModel = new LoggingSettingsClient.Builder()
      .enabled(true)
      .level("silly")
      .uniqueName(false)
      .build();
    assertEquals(loggingSettingsClientModel.enabled(), Boolean.valueOf(true));
    assertEquals(loggingSettingsClientModel.level(), "silly");
    assertEquals(loggingSettingsClientModel.uniqueName(), Boolean.valueOf(false));

    LoggingSettingsServer loggingSettingsServerModel = new LoggingSettingsServer.Builder()
      .enabled(true)
      .level("silly")
      .uniqueName(false)
      .build();
    assertEquals(loggingSettingsServerModel.enabled(), Boolean.valueOf(true));
    assertEquals(loggingSettingsServerModel.level(), "silly");
    assertEquals(loggingSettingsServerModel.uniqueName(), Boolean.valueOf(false));

    EditLogSettingsBody editLogSettingsBodyModel = new EditLogSettingsBody.Builder()
      .client(loggingSettingsClientModel)
      .server(loggingSettingsServerModel)
      .build();
    assertEquals(editLogSettingsBodyModel.client(), loggingSettingsClientModel);
    assertEquals(editLogSettingsBodyModel.server(), loggingSettingsServerModel);

    String json = TestUtilities.serialize(editLogSettingsBodyModel);

    EditLogSettingsBody editLogSettingsBodyModelNew = TestUtilities.deserialize(json, EditLogSettingsBody.class);
    assertTrue(editLogSettingsBodyModelNew instanceof EditLogSettingsBody);
    assertEquals(editLogSettingsBodyModelNew.client().toString(), loggingSettingsClientModel.toString());
    assertEquals(editLogSettingsBodyModelNew.server().toString(), loggingSettingsServerModel.toString());
  }
}