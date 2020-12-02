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

import com.ibm.cloud.blockchain.v3.model.CreatePeerBodyStorage;
import com.ibm.cloud.blockchain.v3.model.StorageObject;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePeerBodyStorage model.
 */
public class CreatePeerBodyStorageTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePeerBodyStorage() throws Throwable {
    StorageObject storageObjectModel = new StorageObject.Builder()
      .size("4GiB")
      .xClass("default")
      .build();
    assertEquals(storageObjectModel.size(), "4GiB");
    assertEquals(storageObjectModel.xClass(), "default");

    CreatePeerBodyStorage createPeerBodyStorageModel = new CreatePeerBodyStorage.Builder()
      .peer(storageObjectModel)
      .statedb(storageObjectModel)
      .build();
    assertEquals(createPeerBodyStorageModel.peer(), storageObjectModel);
    assertEquals(createPeerBodyStorageModel.statedb(), storageObjectModel);

    String json = TestUtilities.serialize(createPeerBodyStorageModel);

    CreatePeerBodyStorage createPeerBodyStorageModelNew = TestUtilities.deserialize(json, CreatePeerBodyStorage.class);
    assertTrue(createPeerBodyStorageModelNew instanceof CreatePeerBodyStorage);
    assertEquals(createPeerBodyStorageModelNew.peer().toString(), storageObjectModel.toString());
    assertEquals(createPeerBodyStorageModelNew.statedb().toString(), storageObjectModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePeerBodyStorageError() throws Throwable {
    new CreatePeerBodyStorage.Builder().build();
  }

}