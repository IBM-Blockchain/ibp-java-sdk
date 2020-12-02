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

import com.ibm.cloud.blockchain.v3.model.ActionEnroll;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ActionEnroll model.
 */
public class ActionEnrollTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testActionEnroll() throws Throwable {
    ActionEnroll actionEnrollModel = new ActionEnroll.Builder()
      .tlsCert(true)
      .ecert(true)
      .build();
    assertEquals(actionEnrollModel.tlsCert(), Boolean.valueOf(true));
    assertEquals(actionEnrollModel.ecert(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(actionEnrollModel);

    ActionEnroll actionEnrollModelNew = TestUtilities.deserialize(json, ActionEnroll.class);
    assertTrue(actionEnrollModelNew instanceof ActionEnroll);
    assertEquals(actionEnrollModelNew.tlsCert(), Boolean.valueOf(true));
    assertEquals(actionEnrollModelNew.ecert(), Boolean.valueOf(true));
  }
}