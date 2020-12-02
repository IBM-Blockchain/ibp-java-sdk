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

import com.ibm.cloud.blockchain.v3.model.CryptoObjectEnrollmentTlsca;
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
 * Unit test class for the CryptoObjectEnrollmentTlsca model.
 */
public class CryptoObjectEnrollmentTlscaTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCryptoObjectEnrollmentTlsca() throws Throwable {
    CryptoObjectEnrollmentTlsca cryptoObjectEnrollmentTlscaModel = new CryptoObjectEnrollmentTlsca.Builder()
      .host("n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud")
      .port(Double.valueOf("7054"))
      .name("tlsca")
      .tlsCert("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=")
      .enrollId("admin")
      .enrollSecret("password")
      .csrHosts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(cryptoObjectEnrollmentTlscaModel.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(cryptoObjectEnrollmentTlscaModel.port(), Double.valueOf("7054"));
    assertEquals(cryptoObjectEnrollmentTlscaModel.name(), "tlsca");
    assertEquals(cryptoObjectEnrollmentTlscaModel.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(cryptoObjectEnrollmentTlscaModel.enrollId(), "admin");
    assertEquals(cryptoObjectEnrollmentTlscaModel.enrollSecret(), "password");
    assertEquals(cryptoObjectEnrollmentTlscaModel.csrHosts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    String json = TestUtilities.serialize(cryptoObjectEnrollmentTlscaModel);

    CryptoObjectEnrollmentTlsca cryptoObjectEnrollmentTlscaModelNew = TestUtilities.deserialize(json, CryptoObjectEnrollmentTlsca.class);
    assertTrue(cryptoObjectEnrollmentTlscaModelNew instanceof CryptoObjectEnrollmentTlsca);
    assertEquals(cryptoObjectEnrollmentTlscaModelNew.host(), "n3a3ec3-myca.ibp.us-south.containers.appdomain.cloud");
    assertEquals(cryptoObjectEnrollmentTlscaModelNew.port(), Double.valueOf("7054"));
    assertEquals(cryptoObjectEnrollmentTlscaModelNew.name(), "tlsca");
    assertEquals(cryptoObjectEnrollmentTlscaModelNew.tlsCert(), "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCkNlcnQgZGF0YSB3b3VsZCBiZSBoZXJlIGlmIHRoaXMgd2FzIHJlYWwKLS0tLS1FTkQgQ0VSVElGSUNBVEUtLS0tLQo=");
    assertEquals(cryptoObjectEnrollmentTlscaModelNew.enrollId(), "admin");
    assertEquals(cryptoObjectEnrollmentTlscaModelNew.enrollSecret(), "password");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCryptoObjectEnrollmentTlscaError() throws Throwable {
    new CryptoObjectEnrollmentTlsca.Builder().build();
  }

}