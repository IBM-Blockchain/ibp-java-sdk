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

import com.ibm.cloud.blockchain.v3.model.Bccsp;
import com.ibm.cloud.blockchain.v3.model.BccspPKCS11;
import com.ibm.cloud.blockchain.v3.model.BccspSW;
import com.ibm.cloud.blockchain.v3.model.ConfigCAAffiliations;
import com.ibm.cloud.blockchain.v3.model.ConfigCACa;
import com.ibm.cloud.blockchain.v3.model.ConfigCACfg;
import com.ibm.cloud.blockchain.v3.model.ConfigCACfgIdentities;
import com.ibm.cloud.blockchain.v3.model.ConfigCACors;
import com.ibm.cloud.blockchain.v3.model.ConfigCACrl;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsr;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsrCa;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsrKeyrequest;
import com.ibm.cloud.blockchain.v3.model.ConfigCACsrNamesItem;
import com.ibm.cloud.blockchain.v3.model.ConfigCADb;
import com.ibm.cloud.blockchain.v3.model.ConfigCADbTls;
import com.ibm.cloud.blockchain.v3.model.ConfigCADbTlsClient;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIdemix;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediate;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateEnrollment;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateParentserver;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateTls;
import com.ibm.cloud.blockchain.v3.model.ConfigCAIntermediateTlsClient;
import com.ibm.cloud.blockchain.v3.model.ConfigCARegistry;
import com.ibm.cloud.blockchain.v3.model.ConfigCARegistryIdentitiesItem;
import com.ibm.cloud.blockchain.v3.model.ConfigCATls;
import com.ibm.cloud.blockchain.v3.model.ConfigCATlsClientauth;
import com.ibm.cloud.blockchain.v3.model.ConfigCAUpdate;
import com.ibm.cloud.blockchain.v3.model.IdentityAttrs;
import com.ibm.cloud.blockchain.v3.model.Metrics;
import com.ibm.cloud.blockchain.v3.model.MetricsStatsd;
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
 * Unit test class for the ConfigCAUpdate model.
 */
public class ConfigCAUpdateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigCAUpdate() throws Throwable {
    ConfigCACors configCaCorsModel = new ConfigCACors.Builder()
      .enabled(true)
      .origins(new java.util.ArrayList<String>(java.util.Arrays.asList("*")))
      .build();
    assertEquals(configCaCorsModel.enabled(), Boolean.valueOf(true));
    assertEquals(configCaCorsModel.origins(), new java.util.ArrayList<String>(java.util.Arrays.asList("*")));

    ConfigCATlsClientauth configCaTlsClientauthModel = new ConfigCATlsClientauth.Builder()
      .type("noclientcert")
      .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(configCaTlsClientauthModel.type(), "noclientcert");
    assertEquals(configCaTlsClientauthModel.certfiles(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    ConfigCATls configCaTlsModel = new ConfigCATls.Builder()
      .keyfile("testString")
      .certfile("testString")
      .clientauth(configCaTlsClientauthModel)
      .build();
    assertEquals(configCaTlsModel.keyfile(), "testString");
    assertEquals(configCaTlsModel.certfile(), "testString");
    assertEquals(configCaTlsModel.clientauth(), configCaTlsClientauthModel);

    ConfigCACa configCaCaModel = new ConfigCACa.Builder()
      .keyfile("testString")
      .certfile("testString")
      .chainfile("testString")
      .build();
    assertEquals(configCaCaModel.keyfile(), "testString");
    assertEquals(configCaCaModel.certfile(), "testString");
    assertEquals(configCaCaModel.chainfile(), "testString");

    ConfigCACrl configCaCrlModel = new ConfigCACrl.Builder()
      .expiry("24h")
      .build();
    assertEquals(configCaCrlModel.expiry(), "24h");

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

    ConfigCADbTlsClient configCaDbTlsClientModel = new ConfigCADbTlsClient.Builder()
      .certfile("testString")
      .keyfile("testString")
      .build();
    assertEquals(configCaDbTlsClientModel.certfile(), "testString");
    assertEquals(configCaDbTlsClientModel.keyfile(), "testString");

    ConfigCADbTls configCaDbTlsModel = new ConfigCADbTls.Builder()
      .certfiles(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .client(configCaDbTlsClientModel)
      .enabled(false)
      .build();
    assertEquals(configCaDbTlsModel.certfiles(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(configCaDbTlsModel.client(), configCaDbTlsClientModel);
    assertEquals(configCaDbTlsModel.enabled(), Boolean.valueOf(false));

    ConfigCADb configCaDbModel = new ConfigCADb.Builder()
      .type("postgres")
      .datasource("host=fake.databases.appdomain.cloud port=31941 user=ibm_cloud password=password dbname=ibmclouddb sslmode=verify-full")
      .tls(configCaDbTlsModel)
      .build();
    assertEquals(configCaDbModel.type(), "postgres");
    assertEquals(configCaDbModel.datasource(), "host=fake.databases.appdomain.cloud port=31941 user=ibm_cloud password=password dbname=ibmclouddb sslmode=verify-full");
    assertEquals(configCaDbModel.tls(), configCaDbTlsModel);

    ConfigCAAffiliations configCaAffiliationsModel = new ConfigCAAffiliations.Builder()
      .org1(new java.util.ArrayList<String>(java.util.Arrays.asList("department1")))
      .org2(new java.util.ArrayList<String>(java.util.Arrays.asList("department1")))
      .add("foo", "testString")
      .build();
    assertEquals(configCaAffiliationsModel.getOrg1(), new java.util.ArrayList<String>(java.util.Arrays.asList("department1")));
    assertEquals(configCaAffiliationsModel.getOrg2(), new java.util.ArrayList<String>(java.util.Arrays.asList("department1")));
    assertEquals(configCaAffiliationsModel.get("foo"), "testString");

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

    ConfigCAIdemix configCaIdemixModel = new ConfigCAIdemix.Builder()
      .rhpoolsize(Double.valueOf("100"))
      .nonceexpiration("15s")
      .noncesweepinterval("15m")
      .build();
    assertEquals(configCaIdemixModel.rhpoolsize(), Double.valueOf("100"));
    assertEquals(configCaIdemixModel.nonceexpiration(), "15s");
    assertEquals(configCaIdemixModel.noncesweepinterval(), "15m");

    BccspSW bccspSwModel = new BccspSW.Builder()
      .hash("SHA2")
      .security(Double.valueOf("256"))
      .build();
    assertEquals(bccspSwModel.hash(), "SHA2");
    assertEquals(bccspSwModel.security(), Double.valueOf("256"));

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

    Bccsp bccspModel = new Bccsp.Builder()
      .xDefault("SW")
      .sw(bccspSwModel)
      .pkcS11(bccspPkcS11Model)
      .build();
    assertEquals(bccspModel.xDefault(), "SW");
    assertEquals(bccspModel.sw(), bccspSwModel);
    assertEquals(bccspModel.pkcS11(), bccspPkcS11Model);

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

    ConfigCACfgIdentities configCaCfgIdentitiesModel = new ConfigCACfgIdentities.Builder()
      .passwordattempts(Double.valueOf("10"))
      .allowremove(false)
      .build();
    assertEquals(configCaCfgIdentitiesModel.passwordattempts(), Double.valueOf("10"));
    assertEquals(configCaCfgIdentitiesModel.allowremove(), Boolean.valueOf(false));

    ConfigCACfg configCaCfgModel = new ConfigCACfg.Builder()
      .identities(configCaCfgIdentitiesModel)
      .build();
    assertEquals(configCaCfgModel.identities(), configCaCfgIdentitiesModel);

    MetricsStatsd metricsStatsdModel = new MetricsStatsd.Builder()
      .network("udp")
      .address("127.0.0.1:8125")
      .writeInterval("10s")
      .prefix("server")
      .build();
    assertEquals(metricsStatsdModel.network(), "udp");
    assertEquals(metricsStatsdModel.address(), "127.0.0.1:8125");
    assertEquals(metricsStatsdModel.writeInterval(), "10s");
    assertEquals(metricsStatsdModel.prefix(), "server");

    Metrics metricsModel = new Metrics.Builder()
      .provider("prometheus")
      .statsd(metricsStatsdModel)
      .build();
    assertEquals(metricsModel.provider(), "prometheus");
    assertEquals(metricsModel.statsd(), metricsStatsdModel);

    ConfigCAUpdate configCaUpdateModel = new ConfigCAUpdate.Builder()
      .cors(configCaCorsModel)
      .debug(false)
      .crlsizelimit(Double.valueOf("512000"))
      .tls(configCaTlsModel)
      .ca(configCaCaModel)
      .crl(configCaCrlModel)
      .registry(configCaRegistryModel)
      .db(configCaDbModel)
      .affiliations(configCaAffiliationsModel)
      .csr(configCaCsrModel)
      .idemix(configCaIdemixModel)
      .bccsp(bccspModel)
      .intermediate(configCaIntermediateModel)
      .cfg(configCaCfgModel)
      .metrics(metricsModel)
      .build();
    assertEquals(configCaUpdateModel.cors(), configCaCorsModel);
    assertEquals(configCaUpdateModel.debug(), Boolean.valueOf(false));
    assertEquals(configCaUpdateModel.crlsizelimit(), Double.valueOf("512000"));
    assertEquals(configCaUpdateModel.tls(), configCaTlsModel);
    assertEquals(configCaUpdateModel.ca(), configCaCaModel);
    assertEquals(configCaUpdateModel.crl(), configCaCrlModel);
    assertEquals(configCaUpdateModel.registry(), configCaRegistryModel);
    assertEquals(configCaUpdateModel.db(), configCaDbModel);
    assertEquals(configCaUpdateModel.affiliations(), configCaAffiliationsModel);
    assertEquals(configCaUpdateModel.csr(), configCaCsrModel);
    assertEquals(configCaUpdateModel.idemix(), configCaIdemixModel);
    assertEquals(configCaUpdateModel.bccsp(), bccspModel);
    assertEquals(configCaUpdateModel.intermediate(), configCaIntermediateModel);
    assertEquals(configCaUpdateModel.cfg(), configCaCfgModel);
    assertEquals(configCaUpdateModel.metrics(), metricsModel);

    String json = TestUtilities.serialize(configCaUpdateModel);

    ConfigCAUpdate configCaUpdateModelNew = TestUtilities.deserialize(json, ConfigCAUpdate.class);
    assertTrue(configCaUpdateModelNew instanceof ConfigCAUpdate);
    assertEquals(configCaUpdateModelNew.cors().toString(), configCaCorsModel.toString());
    assertEquals(configCaUpdateModelNew.debug(), Boolean.valueOf(false));
    assertEquals(configCaUpdateModelNew.crlsizelimit(), Double.valueOf("512000"));
    assertEquals(configCaUpdateModelNew.tls().toString(), configCaTlsModel.toString());
    assertEquals(configCaUpdateModelNew.ca().toString(), configCaCaModel.toString());
    assertEquals(configCaUpdateModelNew.crl().toString(), configCaCrlModel.toString());
    assertEquals(configCaUpdateModelNew.registry().toString(), configCaRegistryModel.toString());
    assertEquals(configCaUpdateModelNew.db().toString(), configCaDbModel.toString());
    assertEquals(configCaUpdateModelNew.affiliations().toString(), configCaAffiliationsModel.toString());
    assertEquals(configCaUpdateModelNew.csr().toString(), configCaCsrModel.toString());
    assertEquals(configCaUpdateModelNew.idemix().toString(), configCaIdemixModel.toString());
    assertEquals(configCaUpdateModelNew.bccsp().toString(), bccspModel.toString());
    assertEquals(configCaUpdateModelNew.intermediate().toString(), configCaIntermediateModel.toString());
    assertEquals(configCaUpdateModelNew.cfg().toString(), configCaCfgModel.toString());
    assertEquals(configCaUpdateModelNew.metrics().toString(), metricsModel.toString());
  }
}