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

import com.ibm.cloud.blockchain.v3.model.ConfigCARegistry;
import com.ibm.cloud.blockchain.v3.model.ConfigCARegistryIdentitiesItem;
import com.ibm.cloud.blockchain.v3.model.IdentityAttrs;
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
 * Unit test class for the ConfigCARegistry model.
 */
public class ConfigCARegistryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCARegistry() throws Throwable {
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

    ConfigCARegistry configCaRegistryModel = new ConfigCARegistry.Builder()
      .maxenrollments(Double.valueOf("-1"))
      .identities(new java.util.ArrayList<ConfigCARegistryIdentitiesItem>(java.util.Arrays.asList(configCaRegistryIdentitiesItemModel)))
      .build();
    assertEquals(configCaRegistryModel.maxenrollments(), Double.valueOf("-1"));
    assertEquals(configCaRegistryModel.identities(), new java.util.ArrayList<ConfigCARegistryIdentitiesItem>(java.util.Arrays.asList(configCaRegistryIdentitiesItemModel)));

    String json = TestUtilities.serialize(configCaRegistryModel);

    ConfigCARegistry configCaRegistryModelNew = TestUtilities.deserialize(json, ConfigCARegistry.class);
    assertTrue(configCaRegistryModelNew instanceof ConfigCARegistry);
    assertEquals(configCaRegistryModelNew.maxenrollments(), Double.valueOf("-1"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConfigCARegistryError() throws Throwable {
    new ConfigCARegistry.Builder().build();
  }

}