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

import com.ibm.cloud.blockchain.v3.model.ImportCaBodyMspComponent;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImportCaBodyMspComponent model.
 */
public class ImportCaBodyMspComponentTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImportCaBodyMspComponent() throws Throwable {
    ImportCaBodyMspComponent importCaBodyMspComponentModel = new ImportCaBodyMspComponent.Builder()
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .build();
    assertEquals(importCaBodyMspComponentModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");

    String json = TestUtilities.serialize(importCaBodyMspComponentModel);

    ImportCaBodyMspComponent importCaBodyMspComponentModelNew = TestUtilities.deserialize(json, ImportCaBodyMspComponent.class);
    assertTrue(importCaBodyMspComponentModelNew instanceof ImportCaBodyMspComponent);
    assertEquals(importCaBodyMspComponentModelNew.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportCaBodyMspComponentError() throws Throwable {
    new ImportCaBodyMspComponent.Builder().build();
  }

}