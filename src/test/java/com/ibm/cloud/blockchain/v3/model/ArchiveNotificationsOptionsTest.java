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

import com.ibm.cloud.blockchain.v3.model.ArchiveNotificationsOptions;
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
 * Unit test class for the ArchiveNotificationsOptions model.
 */
public class ArchiveNotificationsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testArchiveNotificationsOptions() throws Throwable {
    ArchiveNotificationsOptions archiveNotificationsOptionsModel = new ArchiveNotificationsOptions.Builder()
      .notificationIds(new java.util.ArrayList<String>(java.util.Arrays.asList("c9d00ebf849051e4f102008dc0be2488")))
      .build();
    assertEquals(archiveNotificationsOptionsModel.notificationIds(), new java.util.ArrayList<String>(java.util.Arrays.asList("c9d00ebf849051e4f102008dc0be2488")));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testArchiveNotificationsOptionsError() throws Throwable {
    new ArchiveNotificationsOptions.Builder().build();
  }

}