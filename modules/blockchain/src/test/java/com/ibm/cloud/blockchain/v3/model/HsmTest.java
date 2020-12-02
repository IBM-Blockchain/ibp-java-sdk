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

import com.ibm.cloud.blockchain.v3.model.Hsm;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Hsm model.
 */
public class HsmTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testHsm() throws Throwable {
    Hsm hsmModel = new Hsm.Builder()
      .pkcs11endpoint("tcp://example.com:666")
      .build();
    assertEquals(hsmModel.pkcs11endpoint(), "tcp://example.com:666");

    String json = TestUtilities.serialize(hsmModel);

    Hsm hsmModelNew = TestUtilities.deserialize(json, Hsm.class);
    assertTrue(hsmModelNew instanceof Hsm);
    assertEquals(hsmModelNew.pkcs11endpoint(), "tcp://example.com:666");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testHsmError() throws Throwable {
    new Hsm.Builder().build();
  }

}