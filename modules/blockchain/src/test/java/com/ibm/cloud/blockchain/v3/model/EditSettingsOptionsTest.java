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
import com.ibm.cloud.blockchain.v3.model.EditSettingsBodyInactivityTimeouts;
import com.ibm.cloud.blockchain.v3.model.EditSettingsOptions;
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
 * Unit test class for the EditSettingsOptions model.
 */
public class EditSettingsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEditSettingsOptions() throws Throwable {
    EditSettingsBodyInactivityTimeouts editSettingsBodyInactivityTimeoutsModel = new EditSettingsBodyInactivityTimeouts.Builder()
      .enabled(false)
      .maxIdleTime(Double.valueOf("90000"))
      .build();
    assertEquals(editSettingsBodyInactivityTimeoutsModel.enabled(), Boolean.valueOf(false));
    assertEquals(editSettingsBodyInactivityTimeoutsModel.maxIdleTime(), Double.valueOf("90000"));

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

    EditSettingsOptions editSettingsOptionsModel = new EditSettingsOptions.Builder()
      .inactivityTimeouts(editSettingsBodyInactivityTimeoutsModel)
      .fileLogging(editLogSettingsBodyModel)
      .maxReqPerMin(Double.valueOf("25"))
      .maxReqPerMinAk(Double.valueOf("25"))
      .fabricGetBlockTimeoutMs(Double.valueOf("10000"))
      .fabricInstantiateTimeoutMs(Double.valueOf("300000"))
      .fabricJoinChannelTimeoutMs(Double.valueOf("25000"))
      .fabricInstallCcTimeoutMs(Double.valueOf("300000"))
      .fabricLcInstallCcTimeoutMs(Double.valueOf("300000"))
      .fabricLcGetCcTimeoutMs(Double.valueOf("180000"))
      .fabricGeneralTimeoutMs(Double.valueOf("10000"))
      .build();
    assertEquals(editSettingsOptionsModel.inactivityTimeouts(), editSettingsBodyInactivityTimeoutsModel);
    assertEquals(editSettingsOptionsModel.fileLogging(), editLogSettingsBodyModel);
    assertEquals(editSettingsOptionsModel.maxReqPerMin(), Double.valueOf("25"));
    assertEquals(editSettingsOptionsModel.maxReqPerMinAk(), Double.valueOf("25"));
    assertEquals(editSettingsOptionsModel.fabricGetBlockTimeoutMs(), Double.valueOf("10000"));
    assertEquals(editSettingsOptionsModel.fabricInstantiateTimeoutMs(), Double.valueOf("300000"));
    assertEquals(editSettingsOptionsModel.fabricJoinChannelTimeoutMs(), Double.valueOf("25000"));
    assertEquals(editSettingsOptionsModel.fabricInstallCcTimeoutMs(), Double.valueOf("300000"));
    assertEquals(editSettingsOptionsModel.fabricLcInstallCcTimeoutMs(), Double.valueOf("300000"));
    assertEquals(editSettingsOptionsModel.fabricLcGetCcTimeoutMs(), Double.valueOf("180000"));
    assertEquals(editSettingsOptionsModel.fabricGeneralTimeoutMs(), Double.valueOf("10000"));
  }
}