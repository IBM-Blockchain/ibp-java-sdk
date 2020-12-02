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

import com.ibm.cloud.blockchain.v3.model.ConfigCARegistryIdentitiesItem;
import com.ibm.cloud.blockchain.v3.model.IdentityAttrs;
import com.ibm.cloud.blockchain.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigCARegistryIdentitiesItem model.
 */
public class ConfigCARegistryIdentitiesItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCARegistryIdentitiesItem() throws Throwable {
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

    ConfigCARegistryIdentitiesItem configCaRegistryIdentitiesItemModel = new ConfigCARegistryIdentitiesItem.Builder()
      .name("admin")
      .pass("password")
      .type("client")
      .maxenrollments(Double.valueOf("-1"))
      .affiliation("testString")
      .attrs(identityAttrsModel)
      .build();
    assertEquals(configCaRegistryIdentitiesItemModel.name(), "admin");
    assertEquals(configCaRegistryIdentitiesItemModel.pass(), "password");
    assertEquals(configCaRegistryIdentitiesItemModel.type(), "client");
    assertEquals(configCaRegistryIdentitiesItemModel.maxenrollments(), Double.valueOf("-1"));
    assertEquals(configCaRegistryIdentitiesItemModel.affiliation(), "testString");
    assertEquals(configCaRegistryIdentitiesItemModel.attrs(), identityAttrsModel);

    String json = TestUtilities.serialize(configCaRegistryIdentitiesItemModel);

    ConfigCARegistryIdentitiesItem configCaRegistryIdentitiesItemModelNew = TestUtilities.deserialize(json, ConfigCARegistryIdentitiesItem.class);
    assertTrue(configCaRegistryIdentitiesItemModelNew instanceof ConfigCARegistryIdentitiesItem);
    assertEquals(configCaRegistryIdentitiesItemModelNew.name(), "admin");
    assertEquals(configCaRegistryIdentitiesItemModelNew.pass(), "password");
    assertEquals(configCaRegistryIdentitiesItemModelNew.type(), "client");
    assertEquals(configCaRegistryIdentitiesItemModelNew.maxenrollments(), Double.valueOf("-1"));
    assertEquals(configCaRegistryIdentitiesItemModelNew.affiliation(), "testString");
    assertEquals(configCaRegistryIdentitiesItemModelNew.attrs().toString(), identityAttrsModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConfigCARegistryIdentitiesItemError() throws Throwable {
    new ConfigCARegistryIdentitiesItem.Builder().build();
  }

}