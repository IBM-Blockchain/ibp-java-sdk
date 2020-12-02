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

import com.ibm.cloud.blockchain.v3.model.IdentityAttrs;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IdentityAttrs model.
 */
public class IdentityAttrsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIdentityAttrs() throws Throwable {
    IdentityAttrs identityAttrsModel = new IdentityAttrs.Builder()
      .hfRegistrarRoles("*")
      .hfRegistrarDelegateRoles("*")
      .hfRevoker(true)
      .hfIntermediateCa(true)
      .hfGenCrl(true)
      .hfRegistrarAttributes("*")
      .hfAffiliationMgr(true)
      .build();
    assertEquals(identityAttrsModel.hfRegistrarRoles(), "*");
    assertEquals(identityAttrsModel.hfRegistrarDelegateRoles(), "*");
    assertEquals(identityAttrsModel.hfRevoker(), Boolean.valueOf(true));
    assertEquals(identityAttrsModel.hfIntermediateCa(), Boolean.valueOf(true));
    assertEquals(identityAttrsModel.hfGenCrl(), Boolean.valueOf(true));
    assertEquals(identityAttrsModel.hfRegistrarAttributes(), "*");
    assertEquals(identityAttrsModel.hfAffiliationMgr(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(identityAttrsModel);

    IdentityAttrs identityAttrsModelNew = TestUtilities.deserialize(json, IdentityAttrs.class);
    assertTrue(identityAttrsModelNew instanceof IdentityAttrs);
    assertEquals(identityAttrsModelNew.hfRegistrarRoles(), "*");
    assertEquals(identityAttrsModelNew.hfRegistrarDelegateRoles(), "*");
    assertEquals(identityAttrsModelNew.hfRevoker(), Boolean.valueOf(true));
    assertEquals(identityAttrsModelNew.hfIntermediateCa(), Boolean.valueOf(true));
    assertEquals(identityAttrsModelNew.hfGenCrl(), Boolean.valueOf(true));
    assertEquals(identityAttrsModelNew.hfRegistrarAttributes(), "*");
    assertEquals(identityAttrsModelNew.hfAffiliationMgr(), Boolean.valueOf(true));
  }
}