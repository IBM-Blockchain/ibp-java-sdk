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

import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediate;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateEnrollment;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateParentserver;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateTls;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateTlsClient;
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
 * Unit test class for the ConfigCAIntermediate model.
 */
public class ConfigCAIntermediateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCAIntermediate() throws Throwable {
    ConfigCAIntermediateParentserver configCaIntermediateParentserverModel = new ConfigCAIntermediateParentserver.Builder()
      .url("testString")
      .caname("testString")
      .build();
    assertEquals(configCaIntermediateParentserverModel.url(), "testString");
    assertEquals(configCaIntermediateParentserverModel.caname(), "testString");

    ConfigCAIntermediateEnrollment configCaIntermediateEnrollmentModel = new ConfigCAIntermediateEnrollment.Builder()
      .hosts("localhost")
      .profile("testString")
      .label("testString")
      .build();
    assertEquals(configCaIntermediateEnrollmentModel.hosts(), "localhost");
    assertEquals(configCaIntermediateEnrollmentModel.profile(), "testString");
    assertEquals(configCaIntermediateEnrollmentModel.label(), "testString");

    ConfigCAIntermediateTlsClient configCaIntermediateTlsClientModel = new ConfigCAIntermediateTlsClient.Builder()
      .certfile("testString")
      .keyfile("testString")
      .build();
    assertEquals(configCaIntermediateTlsClientModel.certfile(), "testString");
    assertEquals(configCaIntermediateTlsClientModel.keyfile(), "testString");

    ConfigCAIntermediateTls configCaIntermediateTlsModel = new ConfigCAIntermediateTls.Builder()
      .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .client(configCaIntermediateTlsClientModel)
      .build();
    assertEquals(configCaIntermediateTlsModel.certfiles(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(configCaIntermediateTlsModel.client(), configCaIntermediateTlsClientModel);

    ConfigCAIntermediate configCaIntermediateModel = new ConfigCAIntermediate.Builder()
      .parentserver(configCaIntermediateParentserverModel)
      .enrollment(configCaIntermediateEnrollmentModel)
      .tls(configCaIntermediateTlsModel)
      .build();
    assertEquals(configCaIntermediateModel.parentserver(), configCaIntermediateParentserverModel);
    assertEquals(configCaIntermediateModel.enrollment(), configCaIntermediateEnrollmentModel);
    assertEquals(configCaIntermediateModel.tls(), configCaIntermediateTlsModel);

    String json = TestUtilities.serialize(configCaIntermediateModel);

    ConfigCAIntermediate configCaIntermediateModelNew = TestUtilities.deserialize(json, ConfigCAIntermediate.class);
    assertTrue(configCaIntermediateModelNew instanceof ConfigCAIntermediate);
    assertEquals(configCaIntermediateModelNew.parentserver().toString(), configCaIntermediateParentserverModel.toString());
    assertEquals(configCaIntermediateModelNew.enrollment().toString(), configCaIntermediateEnrollmentModel.toString());
    assertEquals(configCaIntermediateModelNew.tls().toString(), configCaIntermediateTlsModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConfigCAIntermediateError() throws Throwable {
    new ConfigCAIntermediate.Builder().build();
  }

}