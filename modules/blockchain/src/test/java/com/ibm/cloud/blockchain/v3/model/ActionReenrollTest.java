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

import com.ibm.cloud.blockchain.v3.model.ActionReenroll;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ActionReenroll model.
 */
public class ActionReenrollTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testActionReenroll() throws Throwable {
    ActionReenroll actionReenrollModel = new ActionReenroll.Builder()
      .tlsCert(true)
      .ecert(true)
      .build();
    assertEquals(actionReenrollModel.tlsCert(), Boolean.valueOf(true));
    assertEquals(actionReenrollModel.ecert(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(actionReenrollModel);

    ActionReenroll actionReenrollModelNew = TestUtilities.deserialize(json, ActionReenroll.class);
    assertTrue(actionReenrollModelNew instanceof ActionReenroll);
    assertEquals(actionReenrollModelNew.tlsCert(), Boolean.valueOf(true));
    assertEquals(actionReenrollModelNew.ecert(), Boolean.valueOf(true));
  }
}