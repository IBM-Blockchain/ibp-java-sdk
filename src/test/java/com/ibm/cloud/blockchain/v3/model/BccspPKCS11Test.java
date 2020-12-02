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

import com.ibm.cloud.blockchain.v3.model.BccspPKCS11;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BccspPKCS11 model.
 */
public class BccspPKCS11Test {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBccspPKCS11() throws Throwable {
    BccspPKCS11 bccspPkcS11Model = new BccspPKCS11.Builder()
      .label("testString")
      .pin("testString")
      .hash("SHA2")
      .security(Double.valueOf("256"))
      .build();
    assertEquals(bccspPkcS11Model.label(), "testString");
    assertEquals(bccspPkcS11Model.pin(), "testString");
    assertEquals(bccspPkcS11Model.hash(), "SHA2");
    assertEquals(bccspPkcS11Model.security(), Double.valueOf("256"));

    String json = TestUtilities.serialize(bccspPkcS11Model);

    BccspPKCS11 bccspPkcS11ModelNew = TestUtilities.deserialize(json, BccspPKCS11.class);
    assertTrue(bccspPkcS11ModelNew instanceof BccspPKCS11);
    assertEquals(bccspPkcS11ModelNew.label(), "testString");
    assertEquals(bccspPkcS11ModelNew.pin(), "testString");
    assertEquals(bccspPkcS11ModelNew.hash(), "SHA2");
    assertEquals(bccspPkcS11ModelNew.security(), Double.valueOf("256"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBccspPKCS11Error() throws Throwable {
    new BccspPKCS11.Builder().build();
  }

}