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

import com.ibm.cloud.blockchain.v3.model.ConfigCACsr;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsrCa;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsrKeyrequest;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsrNamesItem;
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
 * Unit test class for the ConfigCACsr model.
 */
public class ConfigCACsrTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCACsr() throws Throwable {
    ConfigCACsrKeyrequest configCaCsrKeyrequestModel = new ConfigCACsrKeyrequest.Builder()
      .algo("ecdsa")
      .size(Double.valueOf("256"))
      .build();
    assertEquals(configCaCsrKeyrequestModel.algo(), "ecdsa");
    assertEquals(configCaCsrKeyrequestModel.size(), Double.valueOf("256"));

    ConfigCACsrNamesItem configCaCsrNamesItemModel = new ConfigCACsrNamesItem.Builder()
      .c("US")
      .st("North Carolina")
      .l("Raleigh")
      .o("Hyperledger")
      .ou("Fabric")
      .build();
    assertEquals(configCaCsrNamesItemModel.c(), "US");
    assertEquals(configCaCsrNamesItemModel.st(), "North Carolina");
    assertEquals(configCaCsrNamesItemModel.l(), "Raleigh");
    assertEquals(configCaCsrNamesItemModel.o(), "Hyperledger");
    assertEquals(configCaCsrNamesItemModel.ou(), "Fabric");

    ConfigCACsrCa configCaCsrCaModel = new ConfigCACsrCa.Builder()
      .expiry("131400h")
      .pathlength(Double.valueOf("0"))
      .build();
    assertEquals(configCaCsrCaModel.expiry(), "131400h");
    assertEquals(configCaCsrCaModel.pathlength(), Double.valueOf("0"));

    ConfigCACsr configCaCsrModel = new ConfigCACsr.Builder()
      .cn("ca")
      .keyrequest(configCaCsrKeyrequestModel)
      .names(new java.util.ArrayList<ConfigCACsrNamesItem>(java.util.Arrays.asList(configCaCsrNamesItemModel)))
      .hosts(new java.util.ArrayList<String>(java.util.Arrays.asList("localhost")))
      .ca(configCaCsrCaModel)
      .build();
    assertEquals(configCaCsrModel.cn(), "ca");
    assertEquals(configCaCsrModel.keyrequest(), configCaCsrKeyrequestModel);
    assertEquals(configCaCsrModel.names(), new java.util.ArrayList<ConfigCACsrNamesItem>(java.util.Arrays.asList(configCaCsrNamesItemModel)));
    assertEquals(configCaCsrModel.hosts(), new java.util.ArrayList<String>(java.util.Arrays.asList("localhost")));
    assertEquals(configCaCsrModel.ca(), configCaCsrCaModel);

    String json = TestUtilities.serialize(configCaCsrModel);

    ConfigCACsr configCaCsrModelNew = TestUtilities.deserialize(json, ConfigCACsr.class);
    assertTrue(configCaCsrModelNew instanceof ConfigCACsr);
    assertEquals(configCaCsrModelNew.cn(), "ca");
    assertEquals(configCaCsrModelNew.keyrequest().toString(), configCaCsrKeyrequestModel.toString());
    assertEquals(configCaCsrModelNew.ca().toString(), configCaCsrCaModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConfigCACsrError() throws Throwable {
    new ConfigCACsr.Builder().build();
  }

}