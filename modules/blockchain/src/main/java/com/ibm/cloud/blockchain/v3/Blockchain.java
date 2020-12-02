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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.19.0-be3b4618-20201113-200858
 */

package com.ibm.cloud.blockchain.v3;

import com.google.gson.JsonObject;
import com.ibm.cloud.blockchain.v3.model.ActionsResponse;
import com.ibm.cloud.blockchain.v3.model.ArchiveNotificationsOptions;
import com.ibm.cloud.blockchain.v3.model.ArchiveResponse;
import com.ibm.cloud.blockchain.v3.model.CaActionOptions;
import com.ibm.cloud.blockchain.v3.model.CaResponse;
import com.ibm.cloud.blockchain.v3.model.CacheFlushResponse;
import com.ibm.cloud.blockchain.v3.model.ClearCachesOptions;
import com.ibm.cloud.blockchain.v3.model.CreateCaOptions;
import com.ibm.cloud.blockchain.v3.model.CreateOrdererOptions;
import com.ibm.cloud.blockchain.v3.model.CreatePeerOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteAllComponentsOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteAllNotificationsOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteAllNotificationsResponse;
import com.ibm.cloud.blockchain.v3.model.DeleteAllSessionsOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteAllSessionsResponse;
import com.ibm.cloud.blockchain.v3.model.DeleteComponentOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteComponentResponse;
import com.ibm.cloud.blockchain.v3.model.DeleteComponentsByTagOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteMultiComponentsResponse;
import com.ibm.cloud.blockchain.v3.model.DeleteSigTxOptions;
import com.ibm.cloud.blockchain.v3.model.DeleteSignatureCollectionResponse;
import com.ibm.cloud.blockchain.v3.model.EditAdminCertsOptions;
import com.ibm.cloud.blockchain.v3.model.EditAdminCertsResponse;
import com.ibm.cloud.blockchain.v3.model.EditCaOptions;
import com.ibm.cloud.blockchain.v3.model.EditMspOptions;
import com.ibm.cloud.blockchain.v3.model.EditOrdererOptions;
import com.ibm.cloud.blockchain.v3.model.EditPeerOptions;
import com.ibm.cloud.blockchain.v3.model.EditSettingsOptions;
import com.ibm.cloud.blockchain.v3.model.GenericComponentResponse;
import com.ibm.cloud.blockchain.v3.model.GetAthenaHealthStatsResponse;
import com.ibm.cloud.blockchain.v3.model.GetComponentOptions;
import com.ibm.cloud.blockchain.v3.model.GetComponentsByTagOptions;
import com.ibm.cloud.blockchain.v3.model.GetComponentsByTypeOptions;
import com.ibm.cloud.blockchain.v3.model.GetFabVersionsOptions;
import com.ibm.cloud.blockchain.v3.model.GetFabricVersionsResponse;
import com.ibm.cloud.blockchain.v3.model.GetHealthOptions;
import com.ibm.cloud.blockchain.v3.model.GetMSPCertificateResponse;
import com.ibm.cloud.blockchain.v3.model.GetMspCertificateOptions;
import com.ibm.cloud.blockchain.v3.model.GetMultiComponentsResponse;
import com.ibm.cloud.blockchain.v3.model.GetNotificationsResponse;
import com.ibm.cloud.blockchain.v3.model.GetPostmanOptions;
import com.ibm.cloud.blockchain.v3.model.GetPublicSettingsResponse;
import com.ibm.cloud.blockchain.v3.model.GetSettingsOptions;
import com.ibm.cloud.blockchain.v3.model.GetSwaggerOptions;
import com.ibm.cloud.blockchain.v3.model.ImportCaOptions;
import com.ibm.cloud.blockchain.v3.model.ImportMspOptions;
import com.ibm.cloud.blockchain.v3.model.ImportOrdererOptions;
import com.ibm.cloud.blockchain.v3.model.ImportPeerOptions;
import com.ibm.cloud.blockchain.v3.model.ListComponentsOptions;
import com.ibm.cloud.blockchain.v3.model.ListNotificationsOptions;
import com.ibm.cloud.blockchain.v3.model.MspResponse;
import com.ibm.cloud.blockchain.v3.model.OrdererActionOptions;
import com.ibm.cloud.blockchain.v3.model.OrdererResponse;
import com.ibm.cloud.blockchain.v3.model.PeerActionOptions;
import com.ibm.cloud.blockchain.v3.model.PeerResponse;
import com.ibm.cloud.blockchain.v3.model.RemoveComponentOptions;
import com.ibm.cloud.blockchain.v3.model.RemoveComponentsByTagOptions;
import com.ibm.cloud.blockchain.v3.model.RemoveMultiComponentsResponse;
import com.ibm.cloud.blockchain.v3.model.RestartAthenaResponse;
import com.ibm.cloud.blockchain.v3.model.RestartOptions;
import com.ibm.cloud.blockchain.v3.model.SubmitBlockOptions;
import com.ibm.cloud.blockchain.v3.model.UpdateCaOptions;
import com.ibm.cloud.blockchain.v3.model.UpdateOrdererOptions;
import com.ibm.cloud.blockchain.v3.model.UpdatePeerOptions;
import com.ibm.cloud.blockchain.common.SdkCommon;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * This doc lists APIs that you can use to interact with your IBM Blockchain Platform console (IBP console).
 *
 * @version v3
 * @see <a href="http://swagger.io">blockchain</a>
 */
public class Blockchain extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "blockchain";


 /**
   * Class method which constructs an instance of the `Blockchain` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `Blockchain` client using external configuration
   */
  public static Blockchain newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Blockchain` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Blockchain` client using external configuration
   */
  public static Blockchain newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Blockchain service = new Blockchain(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Blockchain` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Blockchain(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
  }

  /**
   * Get component data.
   *
   * Get the IBP console's data on a component (peer, CA, orderer, or MSP). The component might be imported or created.
   *
   * @param getComponentOptions the {@link GetComponentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GenericComponentResponse}
   */
  public ServiceCall<GenericComponentResponse> getComponent(GetComponentOptions getComponentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getComponentOptions,
      "getComponentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getComponentOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "getComponent");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getComponentOptions.deploymentAttrs() != null) {
      builder.query("deployment_attrs", String.valueOf(getComponentOptions.deploymentAttrs()));
    }
    if (getComponentOptions.parsedCerts() != null) {
      builder.query("parsed_certs", String.valueOf(getComponentOptions.parsedCerts()));
    }
    if (getComponentOptions.cache() != null) {
      builder.query("cache", String.valueOf(getComponentOptions.cache()));
    }
    if (getComponentOptions.caAttrs() != null) {
      builder.query("ca_attrs", String.valueOf(getComponentOptions.caAttrs()));
    }
    ResponseConverter<GenericComponentResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GenericComponentResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove imported component.
   *
   * Remove a single component from the IBP console.
   * - Using this api on an **imported** component removes it from the IBP console.
   * - Using this api on a **created** component removes it from the IBP console **but** it will **not** delete the
   * component from the Kubernetes cluster where it resides. Thus it orphans the Kubernetes deployment (if it exists).
   * Instead use the [Delete component](#delete-component) API to delete the Kubernetes deployment and the IBP console
   * data at once.
   *
   * @param removeComponentOptions the {@link RemoveComponentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteComponentResponse}
   */
  public ServiceCall<DeleteComponentResponse> removeComponent(RemoveComponentOptions removeComponentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeComponentOptions,
      "removeComponentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", removeComponentOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "removeComponent");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteComponentResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteComponentResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete component.
   *
   * Removes a single component from the IBP console **and** it deletes the Kubernetes deployment.
   * - Using this api on an **imported** component will *error out* since its Kubernetes deployment is unknown and
   * cannot be removed. Instead use the [Remove imported component](#remove-component) API to remove imported
   * components.
   * - Using this api on a **created** component removes it from the IBP console **and** it will delete the component
   * from the Kubernetes cluster where it resides. The Kubernetes delete must succeed before the component will be
   * removed from the IBP console.
   *
   * @param deleteComponentOptions the {@link DeleteComponentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteComponentResponse}
   */
  public ServiceCall<DeleteComponentResponse> deleteComponent(DeleteComponentOptions deleteComponentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteComponentOptions,
      "deleteComponentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteComponentOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "deleteComponent");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteComponentResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteComponentResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a CA.
   *
   * Create a Hyperledger Fabric Certificate Authority (CA) in your Kubernetes cluster.
   *
   * @param createCaOptions the {@link CreateCaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CaResponse}
   */
  public ServiceCall<CaResponse> createCa(CreateCaOptions createCaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createCaOptions,
      "createCaOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/fabric-ca"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "createCa");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("display_name", createCaOptions.displayName());
    contentJson.add("config_override", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createCaOptions.configOverride()));
    if (createCaOptions.resources() != null) {
      contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createCaOptions.resources()));
    }
    if (createCaOptions.storage() != null) {
      contentJson.add("storage", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createCaOptions.storage()));
    }
    if (createCaOptions.zone() != null) {
      contentJson.addProperty("zone", createCaOptions.zone());
    }
    if (createCaOptions.replicas() != null) {
      contentJson.addProperty("replicas", createCaOptions.replicas());
    }
    if (createCaOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createCaOptions.tags()));
    }
    if (createCaOptions.hsm() != null) {
      contentJson.add("hsm", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createCaOptions.hsm()));
    }
    if (createCaOptions.region() != null) {
      contentJson.addProperty("region", createCaOptions.region());
    }
    if (createCaOptions.version() != null) {
      contentJson.addProperty("version", createCaOptions.version());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CaResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CaResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Import a CA.
   *
   * Import an existing Certificate Authority (CA) to your IBP console. It is recommended to only import components that
   * were created by this or another IBP console.
   *
   * @param importCaOptions the {@link ImportCaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CaResponse}
   */
  public ServiceCall<CaResponse> importCa(ImportCaOptions importCaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(importCaOptions,
      "importCaOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/fabric-ca"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "importCa");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("display_name", importCaOptions.displayName());
    contentJson.addProperty("api_url", importCaOptions.apiUrl());
    contentJson.add("msp", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importCaOptions.msp()));
    if (importCaOptions.location() != null) {
      contentJson.addProperty("location", importCaOptions.location());
    }
    if (importCaOptions.operationsUrl() != null) {
      contentJson.addProperty("operations_url", importCaOptions.operationsUrl());
    }
    if (importCaOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importCaOptions.tags()));
    }
    if (importCaOptions.tlsCert() != null) {
      contentJson.addProperty("tls_cert", importCaOptions.tlsCert());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CaResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CaResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a CA.
   *
   * Update Kubernetes deployment attributes of a Hyperledger Fabric Certificate Authority (CA) in your cluster.
   *
   * @param updateCaOptions the {@link UpdateCaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CaResponse}
   */
  public ServiceCall<CaResponse> updateCa(UpdateCaOptions updateCaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateCaOptions,
      "updateCaOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateCaOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/fabric-ca/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "updateCa");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateCaOptions.configOverride() != null) {
      contentJson.add("config_override", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCaOptions.configOverride()));
    }
    if (updateCaOptions.replicas() != null) {
      contentJson.addProperty("replicas", updateCaOptions.replicas());
    }
    if (updateCaOptions.resources() != null) {
      contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCaOptions.resources()));
    }
    if (updateCaOptions.version() != null) {
      contentJson.addProperty("version", updateCaOptions.version());
    }
    if (updateCaOptions.zone() != null) {
      contentJson.addProperty("zone", updateCaOptions.zone());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CaResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CaResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Edit data about a CA.
   *
   * Modify local metadata fields of a Certificate Authority (CA). For example, the "display_name" field. This API will
   * **not** change any Kubernetes deployment attributes for the CA.
   *
   * @param editCaOptions the {@link EditCaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CaResponse}
   */
  public ServiceCall<CaResponse> editCa(EditCaOptions editCaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(editCaOptions,
      "editCaOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", editCaOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/fabric-ca/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "editCa");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (editCaOptions.displayName() != null) {
      contentJson.addProperty("display_name", editCaOptions.displayName());
    }
    if (editCaOptions.apiUrl() != null) {
      contentJson.addProperty("api_url", editCaOptions.apiUrl());
    }
    if (editCaOptions.operationsUrl() != null) {
      contentJson.addProperty("operations_url", editCaOptions.operationsUrl());
    }
    if (editCaOptions.caName() != null) {
      contentJson.addProperty("ca_name", editCaOptions.caName());
    }
    if (editCaOptions.location() != null) {
      contentJson.addProperty("location", editCaOptions.location());
    }
    if (editCaOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editCaOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CaResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CaResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Submit action to a CA.
   *
   * Submit an action to a Fabric CA component. Actions such as restarting the component or certificate operations.
   *
   * @param caActionOptions the {@link CaActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionsResponse}
   */
  public ServiceCall<ActionsResponse> caAction(CaActionOptions caActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(caActionOptions,
      "caActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", caActionOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/fabric-ca/{id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "caAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (caActionOptions.restart() != null) {
      contentJson.addProperty("restart", caActionOptions.restart());
    }
    if (caActionOptions.renew() != null) {
      contentJson.add("renew", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(caActionOptions.renew()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ActionsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a peer.
   *
   * Create a Hyperledger Fabric peer in your Kubernetes cluster.
   *
   * @param createPeerOptions the {@link CreatePeerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PeerResponse}
   */
  public ServiceCall<PeerResponse> createPeer(CreatePeerOptions createPeerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPeerOptions,
      "createPeerOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/fabric-peer"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "createPeer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("msp_id", createPeerOptions.mspId());
    contentJson.addProperty("display_name", createPeerOptions.displayName());
    contentJson.add("crypto", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPeerOptions.crypto()));
    if (createPeerOptions.configOverride() != null) {
      contentJson.add("config_override", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPeerOptions.configOverride()));
    }
    if (createPeerOptions.resources() != null) {
      contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPeerOptions.resources()));
    }
    if (createPeerOptions.storage() != null) {
      contentJson.add("storage", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPeerOptions.storage()));
    }
    if (createPeerOptions.zone() != null) {
      contentJson.addProperty("zone", createPeerOptions.zone());
    }
    if (createPeerOptions.stateDb() != null) {
      contentJson.addProperty("state_db", createPeerOptions.stateDb());
    }
    if (createPeerOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPeerOptions.tags()));
    }
    if (createPeerOptions.hsm() != null) {
      contentJson.add("hsm", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPeerOptions.hsm()));
    }
    if (createPeerOptions.region() != null) {
      contentJson.addProperty("region", createPeerOptions.region());
    }
    if (createPeerOptions.version() != null) {
      contentJson.addProperty("version", createPeerOptions.version());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PeerResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PeerResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Import a peer.
   *
   * Import an existing peer into your IBP console. It is recommended to only import components that were created by
   * this or another IBP console.
   *
   * @param importPeerOptions the {@link ImportPeerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PeerResponse}
   */
  public ServiceCall<PeerResponse> importPeer(ImportPeerOptions importPeerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(importPeerOptions,
      "importPeerOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/fabric-peer"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "importPeer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("display_name", importPeerOptions.displayName());
    contentJson.addProperty("grpcwp_url", importPeerOptions.grpcwpUrl());
    contentJson.add("msp", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importPeerOptions.msp()));
    contentJson.addProperty("msp_id", importPeerOptions.mspId());
    if (importPeerOptions.apiUrl() != null) {
      contentJson.addProperty("api_url", importPeerOptions.apiUrl());
    }
    if (importPeerOptions.location() != null) {
      contentJson.addProperty("location", importPeerOptions.location());
    }
    if (importPeerOptions.operationsUrl() != null) {
      contentJson.addProperty("operations_url", importPeerOptions.operationsUrl());
    }
    if (importPeerOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importPeerOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PeerResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PeerResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Edit data about a peer.
   *
   * Modify local metadata fields of a peer. For example, the "display_name" field. This API will **not** change any
   * Kubernetes deployment attributes for the peer.
   *
   * @param editPeerOptions the {@link EditPeerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PeerResponse}
   */
  public ServiceCall<PeerResponse> editPeer(EditPeerOptions editPeerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(editPeerOptions,
      "editPeerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", editPeerOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/fabric-peer/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "editPeer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (editPeerOptions.displayName() != null) {
      contentJson.addProperty("display_name", editPeerOptions.displayName());
    }
    if (editPeerOptions.apiUrl() != null) {
      contentJson.addProperty("api_url", editPeerOptions.apiUrl());
    }
    if (editPeerOptions.operationsUrl() != null) {
      contentJson.addProperty("operations_url", editPeerOptions.operationsUrl());
    }
    if (editPeerOptions.grpcwpUrl() != null) {
      contentJson.addProperty("grpcwp_url", editPeerOptions.grpcwpUrl());
    }
    if (editPeerOptions.mspId() != null) {
      contentJson.addProperty("msp_id", editPeerOptions.mspId());
    }
    if (editPeerOptions.location() != null) {
      contentJson.addProperty("location", editPeerOptions.location());
    }
    if (editPeerOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editPeerOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PeerResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PeerResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Submit action to a peer.
   *
   * Submit an action to a Fabric Peer component. Actions such as restarting the component or certificate operations.
   *
   * @param peerActionOptions the {@link PeerActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionsResponse}
   */
  public ServiceCall<ActionsResponse> peerAction(PeerActionOptions peerActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(peerActionOptions,
      "peerActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", peerActionOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/fabric-peer/{id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "peerAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (peerActionOptions.restart() != null) {
      contentJson.addProperty("restart", peerActionOptions.restart());
    }
    if (peerActionOptions.reenroll() != null) {
      contentJson.add("reenroll", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(peerActionOptions.reenroll()));
    }
    if (peerActionOptions.enroll() != null) {
      contentJson.add("enroll", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(peerActionOptions.enroll()));
    }
    if (peerActionOptions.upgradeDbs() != null) {
      contentJson.addProperty("upgrade_dbs", peerActionOptions.upgradeDbs());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ActionsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a peer.
   *
   * Update Kubernetes deployment attributes of a Hyperledger Fabric Peer node.
   *
   * @param updatePeerOptions the {@link UpdatePeerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PeerResponse}
   */
  public ServiceCall<PeerResponse> updatePeer(UpdatePeerOptions updatePeerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePeerOptions,
      "updatePeerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updatePeerOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/fabric-peer/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "updatePeer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updatePeerOptions.adminCerts() != null) {
      contentJson.add("admin_certs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePeerOptions.adminCerts()));
    }
    if (updatePeerOptions.configOverride() != null) {
      contentJson.add("config_override", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePeerOptions.configOverride()));
    }
    if (updatePeerOptions.crypto() != null) {
      contentJson.add("crypto", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePeerOptions.crypto()));
    }
    if (updatePeerOptions.nodeOu() != null) {
      contentJson.add("node_ou", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePeerOptions.nodeOu()));
    }
    if (updatePeerOptions.replicas() != null) {
      contentJson.addProperty("replicas", updatePeerOptions.replicas());
    }
    if (updatePeerOptions.resources() != null) {
      contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePeerOptions.resources()));
    }
    if (updatePeerOptions.version() != null) {
      contentJson.addProperty("version", updatePeerOptions.version());
    }
    if (updatePeerOptions.zone() != null) {
      contentJson.addProperty("zone", updatePeerOptions.zone());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PeerResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PeerResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an ordering service.
   *
   * Create a Hyperledger Ordering Service (OS) in your Kubernetes cluster. Currently, only raft ordering nodes are
   * supported.
   *
   * @param createOrdererOptions the {@link CreateOrdererOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OrdererResponse}
   */
  public ServiceCall<OrdererResponse> createOrderer(CreateOrdererOptions createOrdererOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createOrdererOptions,
      "createOrdererOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/fabric-orderer"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "createOrderer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("orderer_type", createOrdererOptions.ordererType());
    contentJson.addProperty("msp_id", createOrdererOptions.mspId());
    contentJson.addProperty("display_name", createOrdererOptions.displayName());
    contentJson.add("crypto", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOrdererOptions.crypto()));
    if (createOrdererOptions.clusterName() != null) {
      contentJson.addProperty("cluster_name", createOrdererOptions.clusterName());
    }
    if (createOrdererOptions.clusterId() != null) {
      contentJson.addProperty("cluster_id", createOrdererOptions.clusterId());
    }
    if (createOrdererOptions.externalAppend() != null) {
      contentJson.addProperty("external_append", createOrdererOptions.externalAppend());
    }
    if (createOrdererOptions.configOverride() != null) {
      contentJson.add("config_override", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOrdererOptions.configOverride()));
    }
    if (createOrdererOptions.resources() != null) {
      contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOrdererOptions.resources()));
    }
    if (createOrdererOptions.storage() != null) {
      contentJson.add("storage", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOrdererOptions.storage()));
    }
    if (createOrdererOptions.systemChannelId() != null) {
      contentJson.addProperty("system_channel_id", createOrdererOptions.systemChannelId());
    }
    if (createOrdererOptions.zone() != null) {
      contentJson.add("zone", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOrdererOptions.zone()));
    }
    if (createOrdererOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOrdererOptions.tags()));
    }
    if (createOrdererOptions.region() != null) {
      contentJson.add("region", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOrdererOptions.region()));
    }
    if (createOrdererOptions.hsm() != null) {
      contentJson.add("hsm", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createOrdererOptions.hsm()));
    }
    if (createOrdererOptions.version() != null) {
      contentJson.addProperty("version", createOrdererOptions.version());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<OrdererResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OrdererResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Import an ordering service.
   *
   * Import an existing Ordering Service (OS) to your IBP console. It is recommended to only import components that were
   * created by this or another IBP console.
   *
   * @param importOrdererOptions the {@link ImportOrdererOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OrdererResponse}
   */
  public ServiceCall<OrdererResponse> importOrderer(ImportOrdererOptions importOrdererOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(importOrdererOptions,
      "importOrdererOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/fabric-orderer"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "importOrderer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("cluster_name", importOrdererOptions.clusterName());
    contentJson.addProperty("display_name", importOrdererOptions.displayName());
    contentJson.addProperty("grpcwp_url", importOrdererOptions.grpcwpUrl());
    contentJson.add("msp", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importOrdererOptions.msp()));
    contentJson.addProperty("msp_id", importOrdererOptions.mspId());
    if (importOrdererOptions.apiUrl() != null) {
      contentJson.addProperty("api_url", importOrdererOptions.apiUrl());
    }
    if (importOrdererOptions.clusterId() != null) {
      contentJson.addProperty("cluster_id", importOrdererOptions.clusterId());
    }
    if (importOrdererOptions.location() != null) {
      contentJson.addProperty("location", importOrdererOptions.location());
    }
    if (importOrdererOptions.operationsUrl() != null) {
      contentJson.addProperty("operations_url", importOrdererOptions.operationsUrl());
    }
    if (importOrdererOptions.systemChannelId() != null) {
      contentJson.addProperty("system_channel_id", importOrdererOptions.systemChannelId());
    }
    if (importOrdererOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importOrdererOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<OrdererResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OrdererResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Edit data about an orderer.
   *
   * Modify local metadata fields of a single node in an Ordering Service (OS). For example, the "display_name" field.
   * This API will **not** change any Kubernetes deployment attributes for the node.
   *
   * @param editOrdererOptions the {@link EditOrdererOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OrdererResponse}
   */
  public ServiceCall<OrdererResponse> editOrderer(EditOrdererOptions editOrdererOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(editOrdererOptions,
      "editOrdererOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", editOrdererOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/fabric-orderer/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "editOrderer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (editOrdererOptions.clusterName() != null) {
      contentJson.addProperty("cluster_name", editOrdererOptions.clusterName());
    }
    if (editOrdererOptions.displayName() != null) {
      contentJson.addProperty("display_name", editOrdererOptions.displayName());
    }
    if (editOrdererOptions.apiUrl() != null) {
      contentJson.addProperty("api_url", editOrdererOptions.apiUrl());
    }
    if (editOrdererOptions.operationsUrl() != null) {
      contentJson.addProperty("operations_url", editOrdererOptions.operationsUrl());
    }
    if (editOrdererOptions.grpcwpUrl() != null) {
      contentJson.addProperty("grpcwp_url", editOrdererOptions.grpcwpUrl());
    }
    if (editOrdererOptions.mspId() != null) {
      contentJson.addProperty("msp_id", editOrdererOptions.mspId());
    }
    if (editOrdererOptions.consenterProposalFin() != null) {
      contentJson.addProperty("consenter_proposal_fin", editOrdererOptions.consenterProposalFin());
    }
    if (editOrdererOptions.location() != null) {
      contentJson.addProperty("location", editOrdererOptions.location());
    }
    if (editOrdererOptions.systemChannelId() != null) {
      contentJson.addProperty("system_channel_id", editOrdererOptions.systemChannelId());
    }
    if (editOrdererOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editOrdererOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<OrdererResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OrdererResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Submit action to an orderer.
   *
   * Submit an action to a Fabric Orderer component. Actions such as restarting the component or certificate operations.
   *
   * @param ordererActionOptions the {@link OrdererActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionsResponse}
   */
  public ServiceCall<ActionsResponse> ordererAction(OrdererActionOptions ordererActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(ordererActionOptions,
      "ordererActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", ordererActionOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/fabric-orderer/{id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "ordererAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (ordererActionOptions.restart() != null) {
      contentJson.addProperty("restart", ordererActionOptions.restart());
    }
    if (ordererActionOptions.reenroll() != null) {
      contentJson.add("reenroll", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(ordererActionOptions.reenroll()));
    }
    if (ordererActionOptions.enroll() != null) {
      contentJson.add("enroll", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(ordererActionOptions.enroll()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ActionsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an orderer node.
   *
   * Update Kubernetes deployment attributes of a Hyperledger Fabric Ordering node.
   *
   * @param updateOrdererOptions the {@link UpdateOrdererOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OrdererResponse}
   */
  public ServiceCall<OrdererResponse> updateOrderer(UpdateOrdererOptions updateOrdererOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateOrdererOptions,
      "updateOrdererOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateOrdererOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/fabric-orderer/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "updateOrderer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateOrdererOptions.adminCerts() != null) {
      contentJson.add("admin_certs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateOrdererOptions.adminCerts()));
    }
    if (updateOrdererOptions.configOverride() != null) {
      contentJson.add("config_override", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateOrdererOptions.configOverride()));
    }
    if (updateOrdererOptions.crypto() != null) {
      contentJson.add("crypto", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateOrdererOptions.crypto()));
    }
    if (updateOrdererOptions.nodeOu() != null) {
      contentJson.add("node_ou", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateOrdererOptions.nodeOu()));
    }
    if (updateOrdererOptions.replicas() != null) {
      contentJson.addProperty("replicas", updateOrdererOptions.replicas());
    }
    if (updateOrdererOptions.resources() != null) {
      contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateOrdererOptions.resources()));
    }
    if (updateOrdererOptions.version() != null) {
      contentJson.addProperty("version", updateOrdererOptions.version());
    }
    if (updateOrdererOptions.zone() != null) {
      contentJson.addProperty("zone", updateOrdererOptions.zone());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<OrdererResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OrdererResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Submit config block to orderer.
   *
   * Send a config block (or genesis block) to a pre-created raft orderer node. Use this api to finish the raft-append
   * flow and finalize a pre-created orderer. This is the final step to append a node to a raft cluster. The orderer
   * will restart, load this block, and connect to the other orderers listed in said block.
   *
   * The full flow to append a raft node:
   *   1. Pre-create the orderer with the [Create an ordering service](#create-orderer) API (setting `cluster_id` is how
   * you turn the normal create-orderer api into a pre-create-orderer api).
   *   2. Retrieve the pre-created node's tls cert with the [Get component data](#get-component) API (set the
   * `deployment_attrs=included` parameter).
   *   3. Get the latest config block for the system-channel by using the Fabric API (use a Fabric CLI or another Fabric
   * tool).
   *   4. Edit the config block for the system-channel and add the pre-created orderer's tls cert and api url as a
   * consenter.
   *   5. Create and marshal a Fabric
   * [ConfigUpdate](https://github.com/hyperledger/fabric/blob/release-1.4/protos/common/configtx.proto#L78) proposal
   * with
   * [configtxlator](https://hyperledger-fabric.readthedocs.io/en/release-1.4/commands/configtxlator.html#configtxlator-compute-update)
   * using the old and new block.
   *   6. Sign the `ConfigUpdate` proposal and create a
   * [ConfigSignature](https://github.com/hyperledger/fabric/blob/release-1.4/protos/common/configtx.proto#L111). Create
   * a set of signatures that will satisfy the system channel's update policy.
   *   7. Build a
   * [SignedProposal](https://github.com/hyperledger/fabric/blob/release-1.4/protos/peer/proposal.proto#L105) out of the
   * `ConfigUpdate` &amp; `ConfigSignature`. Submit the `SignedProposal` to an existing ordering node (do not use the
   * pre-created node).
   *   8. After the `SignedProposal` transaction is committed to a block, pull the latest config block (for the
   * system-channel) from an existing ordering node (use a Fabric CLI or another Fabric tool).
   *   9. Submit the latest config block to your pre-created node with the 'Submit config block to orderer' API (which
   * is this api!)
   *   10. Use the [Edit data about an orderer](#edit-orderer) API to change the pre-created node's field
   * `consenter_proposal_fin` to `true`. This changes the status icon on the IBP console.
   *
   * @param submitBlockOptions the {@link SubmitBlockOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GenericComponentResponse}
   */
  public ServiceCall<GenericComponentResponse> submitBlock(SubmitBlockOptions submitBlockOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(submitBlockOptions,
      "submitBlockOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", submitBlockOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/{id}/config", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "submitBlock");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (submitBlockOptions.b64Block() != null) {
      contentJson.addProperty("b64_block", submitBlockOptions.b64Block());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<GenericComponentResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GenericComponentResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Import an MSP.
   *
   * Create or import a Membership Service Provider (MSP) definition into your IBP console. This definition represents
   * an organization that controls a peer or OS (Ordering Service).
   *
   * @param importMspOptions the {@link ImportMspOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MspResponse}
   */
  public ServiceCall<MspResponse> importMsp(ImportMspOptions importMspOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(importMspOptions,
      "importMspOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/msp"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "importMsp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("msp_id", importMspOptions.mspId());
    contentJson.addProperty("display_name", importMspOptions.displayName());
    contentJson.add("root_certs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importMspOptions.rootCerts()));
    if (importMspOptions.intermediateCerts() != null) {
      contentJson.add("intermediate_certs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importMspOptions.intermediateCerts()));
    }
    if (importMspOptions.admins() != null) {
      contentJson.add("admins", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importMspOptions.admins()));
    }
    if (importMspOptions.tlsRootCerts() != null) {
      contentJson.add("tls_root_certs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importMspOptions.tlsRootCerts()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<MspResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MspResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Edit an MSP.
   *
   * Modify local metadata fields of a Membership Service Provider (MSP) definition. For example, the "display_name"
   * property.
   *
   * @param editMspOptions the {@link EditMspOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MspResponse}
   */
  public ServiceCall<MspResponse> editMsp(EditMspOptions editMspOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(editMspOptions,
      "editMspOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", editMspOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/msp/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "editMsp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (editMspOptions.mspId() != null) {
      contentJson.addProperty("msp_id", editMspOptions.mspId());
    }
    if (editMspOptions.displayName() != null) {
      contentJson.addProperty("display_name", editMspOptions.displayName());
    }
    if (editMspOptions.rootCerts() != null) {
      contentJson.add("root_certs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editMspOptions.rootCerts()));
    }
    if (editMspOptions.intermediateCerts() != null) {
      contentJson.add("intermediate_certs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editMspOptions.intermediateCerts()));
    }
    if (editMspOptions.admins() != null) {
      contentJson.add("admins", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editMspOptions.admins()));
    }
    if (editMspOptions.tlsRootCerts() != null) {
      contentJson.add("tls_root_certs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editMspOptions.tlsRootCerts()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<MspResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MspResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get MSP's public certificates.
   *
   * External IBP consoles can use this API to get the public certificate for your given MSP id.
   *
   * @param getMspCertificateOptions the {@link GetMspCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetMSPCertificateResponse}
   */
  public ServiceCall<GetMSPCertificateResponse> getMspCertificate(GetMspCertificateOptions getMspCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMspCertificateOptions,
      "getMspCertificateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("msp_id", getMspCertificateOptions.mspId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/msps/{msp_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "getMspCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getMspCertificateOptions.cache() != null) {
      builder.query("cache", String.valueOf(getMspCertificateOptions.cache()));
    }
    ResponseConverter<GetMSPCertificateResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetMSPCertificateResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Edit admin certs on a component.
   *
   * This api will append or remove admin certs to the components' file system. Certificates will be parsed. If invalid
   * they will be skipped. Duplicate certificates will also be skipped. To view existing admin certificate use the [Get
   * component data](#get-component) API with the query parameters: `?deployment_attrs=included&amp;cache=skip`.
   *
   * **This API will not work on *imported* components.**.
   *
   * @param editAdminCertsOptions the {@link EditAdminCertsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EditAdminCertsResponse}
   */
  public ServiceCall<EditAdminCertsResponse> editAdminCerts(EditAdminCertsOptions editAdminCertsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(editAdminCertsOptions,
      "editAdminCertsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", editAdminCertsOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/{id}/certs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "editAdminCerts");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (editAdminCertsOptions.appendAdminCerts() != null) {
      contentJson.add("append_admin_certs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editAdminCertsOptions.appendAdminCerts()));
    }
    if (editAdminCertsOptions.removeAdminCerts() != null) {
      contentJson.add("remove_admin_certs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editAdminCertsOptions.removeAdminCerts()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<EditAdminCertsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EditAdminCertsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all components.
   *
   * Get the IBP console's data on all components (peers, CAs, orderers, and MSPs). The component might be imported or
   * created.
   *
   * @param listComponentsOptions the {@link ListComponentsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetMultiComponentsResponse}
   */
  public ServiceCall<GetMultiComponentsResponse> listComponents(ListComponentsOptions listComponentsOptions) {
    if (listComponentsOptions == null) {
      listComponentsOptions = new ListComponentsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "listComponents");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listComponentsOptions.deploymentAttrs() != null) {
      builder.query("deployment_attrs", String.valueOf(listComponentsOptions.deploymentAttrs()));
    }
    if (listComponentsOptions.parsedCerts() != null) {
      builder.query("parsed_certs", String.valueOf(listComponentsOptions.parsedCerts()));
    }
    if (listComponentsOptions.cache() != null) {
      builder.query("cache", String.valueOf(listComponentsOptions.cache()));
    }
    if (listComponentsOptions.caAttrs() != null) {
      builder.query("ca_attrs", String.valueOf(listComponentsOptions.caAttrs()));
    }
    ResponseConverter<GetMultiComponentsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetMultiComponentsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all components.
   *
   * Get the IBP console's data on all components (peers, CAs, orderers, and MSPs). The component might be imported or
   * created.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetMultiComponentsResponse}
   */
  public ServiceCall<GetMultiComponentsResponse> listComponents() {
    return listComponents(null);
  }

  /**
   * Get components of a type.
   *
   * Get the IBP console's data on components that are a specific type. The component might be imported or created.
   *
   * @param getComponentsByTypeOptions the {@link GetComponentsByTypeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetMultiComponentsResponse}
   */
  public ServiceCall<GetMultiComponentsResponse> getComponentsByType(GetComponentsByTypeOptions getComponentsByTypeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getComponentsByTypeOptions,
      "getComponentsByTypeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("component-type", getComponentsByTypeOptions.componentType());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/types/{component-type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "getComponentsByType");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getComponentsByTypeOptions.deploymentAttrs() != null) {
      builder.query("deployment_attrs", String.valueOf(getComponentsByTypeOptions.deploymentAttrs()));
    }
    if (getComponentsByTypeOptions.parsedCerts() != null) {
      builder.query("parsed_certs", String.valueOf(getComponentsByTypeOptions.parsedCerts()));
    }
    if (getComponentsByTypeOptions.cache() != null) {
      builder.query("cache", String.valueOf(getComponentsByTypeOptions.cache()));
    }
    ResponseConverter<GetMultiComponentsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetMultiComponentsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get components with tag.
   *
   * Get the IBP console's data on components that have a specific tag. The component might be imported or created. Tags
   * are not case-sensitive.
   *
   * @param getComponentsByTagOptions the {@link GetComponentsByTagOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetMultiComponentsResponse}
   */
  public ServiceCall<GetMultiComponentsResponse> getComponentsByTag(GetComponentsByTagOptions getComponentsByTagOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getComponentsByTagOptions,
      "getComponentsByTagOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("tag", getComponentsByTagOptions.tag());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/tags/{tag}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "getComponentsByTag");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getComponentsByTagOptions.deploymentAttrs() != null) {
      builder.query("deployment_attrs", String.valueOf(getComponentsByTagOptions.deploymentAttrs()));
    }
    if (getComponentsByTagOptions.parsedCerts() != null) {
      builder.query("parsed_certs", String.valueOf(getComponentsByTagOptions.parsedCerts()));
    }
    if (getComponentsByTagOptions.cache() != null) {
      builder.query("cache", String.valueOf(getComponentsByTagOptions.cache()));
    }
    ResponseConverter<GetMultiComponentsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetMultiComponentsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove components with tag.
   *
   * Removes components with the matching tag from the IBP console. Tags are not case-sensitive.
   * - Using this api on **imported** components removes them from the IBP console.
   * - Using this api on **created** components removes them from the IBP console **but** it will **not** delete the
   * components from the Kubernetes cluster where they reside. Thus it orphans the Kubernetes deployments (if it
   * exists). Instead use the [Delete components with tag](#delete_components_by_tag) API to delete the Kubernetes
   * deployment and the IBP console data at once.
   *
   * @param removeComponentsByTagOptions the {@link RemoveComponentsByTagOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RemoveMultiComponentsResponse}
   */
  public ServiceCall<RemoveMultiComponentsResponse> removeComponentsByTag(RemoveComponentsByTagOptions removeComponentsByTagOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeComponentsByTagOptions,
      "removeComponentsByTagOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("tag", removeComponentsByTagOptions.tag());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/components/tags/{tag}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "removeComponentsByTag");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RemoveMultiComponentsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RemoveMultiComponentsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete components with tag.
   *
   * Removes components with the matching tag from the IBP console **and** it deletes the Kubernetes deployment. Tags
   * are not case-sensitive.
   * - Using this api on **imported** components will be skipped over since their Kubernetes deployment is unknown and
   * cannot be removed. Instead use the [Remove components with tag](#remove_components_by_tag) API to remove imported
   * components with a tag.
   * - Using this api on **created** components removes them from the IBP console **and** it will delete the components
   * from the Kubernetes cluster where they reside. The Kubernetes delete must succeed before the component will be
   * removed from the IBP console.
   *
   * @param deleteComponentsByTagOptions the {@link DeleteComponentsByTagOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteMultiComponentsResponse}
   */
  public ServiceCall<DeleteMultiComponentsResponse> deleteComponentsByTag(DeleteComponentsByTagOptions deleteComponentsByTagOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteComponentsByTagOptions,
      "deleteComponentsByTagOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("tag", deleteComponentsByTagOptions.tag());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/tags/{tag}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "deleteComponentsByTag");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteMultiComponentsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteMultiComponentsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete all components.
   *
   * Removes all components from the IBP console **and** their Kubernetes deployments (if applicable). Works on imported
   * and created components (peers, CAs, orderers, MSPs, and signature collection transactions). This api attempts to
   * effectively reset the IBP console to its initial (empty) state (except for logs &amp; notifications, those will
   * remain).
   *
   * @param deleteAllComponentsOptions the {@link DeleteAllComponentsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteMultiComponentsResponse}
   */
  public ServiceCall<DeleteMultiComponentsResponse> deleteAllComponents(DeleteAllComponentsOptions deleteAllComponentsOptions) {
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/components/purge"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "deleteAllComponents");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteMultiComponentsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteMultiComponentsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete all components.
   *
   * Removes all components from the IBP console **and** their Kubernetes deployments (if applicable). Works on imported
   * and created components (peers, CAs, orderers, MSPs, and signature collection transactions). This api attempts to
   * effectively reset the IBP console to its initial (empty) state (except for logs &amp; notifications, those will
   * remain).
   *
   * @return a {@link ServiceCall} with a result of type {@link DeleteMultiComponentsResponse}
   */
  public ServiceCall<DeleteMultiComponentsResponse> deleteAllComponents() {
    return deleteAllComponents(null);
  }

  /**
   * Get public IBP console settings.
   *
   * Retrieve all public (non-sensitive) settings for the IBP console. Use this API for debugging purposes. It shows
   * what behavior to expect and confirms whether the desired settings are active.
   *
   * @param getSettingsOptions the {@link GetSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetPublicSettingsResponse}
   */
  public ServiceCall<GetPublicSettingsResponse> getSettings(GetSettingsOptions getSettingsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "getSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<GetPublicSettingsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetPublicSettingsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get public IBP console settings.
   *
   * Retrieve all public (non-sensitive) settings for the IBP console. Use this API for debugging purposes. It shows
   * what behavior to expect and confirms whether the desired settings are active.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetPublicSettingsResponse}
   */
  public ServiceCall<GetPublicSettingsResponse> getSettings() {
    return getSettings(null);
  }

  /**
   * Change IBP console settings.
   *
   * Edit a few IBP console settings (such as the rate limit and timeout settings). **Some edits will trigger an
   * automatic server restart.**.
   *
   * @param editSettingsOptions the {@link EditSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetPublicSettingsResponse}
   */
  public ServiceCall<GetPublicSettingsResponse> editSettings(EditSettingsOptions editSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(editSettingsOptions,
      "editSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "editSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (editSettingsOptions.inactivityTimeouts() != null) {
      contentJson.add("inactivity_timeouts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editSettingsOptions.inactivityTimeouts()));
    }
    if (editSettingsOptions.fileLogging() != null) {
      contentJson.add("file_logging", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editSettingsOptions.fileLogging()));
    }
    if (editSettingsOptions.maxReqPerMin() != null) {
      contentJson.addProperty("max_req_per_min", editSettingsOptions.maxReqPerMin());
    }
    if (editSettingsOptions.maxReqPerMinAk() != null) {
      contentJson.addProperty("max_req_per_min_ak", editSettingsOptions.maxReqPerMinAk());
    }
    if (editSettingsOptions.fabricGetBlockTimeoutMs() != null) {
      contentJson.addProperty("fabric_get_block_timeout_ms", editSettingsOptions.fabricGetBlockTimeoutMs());
    }
    if (editSettingsOptions.fabricInstantiateTimeoutMs() != null) {
      contentJson.addProperty("fabric_instantiate_timeout_ms", editSettingsOptions.fabricInstantiateTimeoutMs());
    }
    if (editSettingsOptions.fabricJoinChannelTimeoutMs() != null) {
      contentJson.addProperty("fabric_join_channel_timeout_ms", editSettingsOptions.fabricJoinChannelTimeoutMs());
    }
    if (editSettingsOptions.fabricInstallCcTimeoutMs() != null) {
      contentJson.addProperty("fabric_install_cc_timeout_ms", editSettingsOptions.fabricInstallCcTimeoutMs());
    }
    if (editSettingsOptions.fabricLcInstallCcTimeoutMs() != null) {
      contentJson.addProperty("fabric_lc_install_cc_timeout_ms", editSettingsOptions.fabricLcInstallCcTimeoutMs());
    }
    if (editSettingsOptions.fabricLcGetCcTimeoutMs() != null) {
      contentJson.addProperty("fabric_lc_get_cc_timeout_ms", editSettingsOptions.fabricLcGetCcTimeoutMs());
    }
    if (editSettingsOptions.fabricGeneralTimeoutMs() != null) {
      contentJson.addProperty("fabric_general_timeout_ms", editSettingsOptions.fabricGeneralTimeoutMs());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<GetPublicSettingsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetPublicSettingsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Change IBP console settings.
   *
   * Edit a few IBP console settings (such as the rate limit and timeout settings). **Some edits will trigger an
   * automatic server restart.**.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetPublicSettingsResponse}
   */
  public ServiceCall<GetPublicSettingsResponse> editSettings() {
    return editSettings(null);
  }

  /**
   * Get supported Fabric versions.
   *
   * Get list of supported Fabric versions by each component type. These are the Fabric versions your IBP console can
   * use when creating or upgrading components.
   *
   * @param getFabVersionsOptions the {@link GetFabVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetFabricVersionsResponse}
   */
  public ServiceCall<GetFabricVersionsResponse> getFabVersions(GetFabVersionsOptions getFabVersionsOptions) {
    if (getFabVersionsOptions == null) {
      getFabVersionsOptions = new GetFabVersionsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/kubernetes/fabric/versions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "getFabVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getFabVersionsOptions.cache() != null) {
      builder.query("cache", String.valueOf(getFabVersionsOptions.cache()));
    }
    ResponseConverter<GetFabricVersionsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetFabricVersionsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get supported Fabric versions.
   *
   * Get list of supported Fabric versions by each component type. These are the Fabric versions your IBP console can
   * use when creating or upgrading components.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetFabricVersionsResponse}
   */
  public ServiceCall<GetFabricVersionsResponse> getFabVersions() {
    return getFabVersions(null);
  }

  /**
   * Get IBP console health stats.
   *
   * See statistics of the IBP console process such as memory usage, CPU usage, up time, cache, and operating system
   * stats.
   *
   * @param getHealthOptions the {@link GetHealthOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetAthenaHealthStatsResponse}
   */
  public ServiceCall<GetAthenaHealthStatsResponse> getHealth(GetHealthOptions getHealthOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/health"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "getHealth");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<GetAthenaHealthStatsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetAthenaHealthStatsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get IBP console health stats.
   *
   * See statistics of the IBP console process such as memory usage, CPU usage, up time, cache, and operating system
   * stats.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetAthenaHealthStatsResponse}
   */
  public ServiceCall<GetAthenaHealthStatsResponse> getHealth() {
    return getHealth(null);
  }

  /**
   * Get all notifications.
   *
   * Retrieve all notifications. This API supports pagination through the query parameters. Notifications are generated
   * from actions such as creating a component, deleting a component, server restart, and so on.
   *
   * @param listNotificationsOptions the {@link ListNotificationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetNotificationsResponse}
   */
  public ServiceCall<GetNotificationsResponse> listNotifications(ListNotificationsOptions listNotificationsOptions) {
    if (listNotificationsOptions == null) {
      listNotificationsOptions = new ListNotificationsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/notifications"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "listNotifications");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listNotificationsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listNotificationsOptions.limit()));
    }
    if (listNotificationsOptions.skip() != null) {
      builder.query("skip", String.valueOf(listNotificationsOptions.skip()));
    }
    if (listNotificationsOptions.componentId() != null) {
      builder.query("component_id", String.valueOf(listNotificationsOptions.componentId()));
    }
    ResponseConverter<GetNotificationsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetNotificationsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all notifications.
   *
   * Retrieve all notifications. This API supports pagination through the query parameters. Notifications are generated
   * from actions such as creating a component, deleting a component, server restart, and so on.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetNotificationsResponse}
   */
  public ServiceCall<GetNotificationsResponse> listNotifications() {
    return listNotifications(null);
  }

  /**
   * Delete a signature collection tx.
   *
   * Delete a signature collection transaction. These transactions involve creating or editing Fabric channels &amp;
   * chaincode approvals. This request is not distributed to external IBP consoles, thus the signature collection
   * transaction is only deleted locally.
   *
   * @param deleteSigTxOptions the {@link DeleteSigTxOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteSignatureCollectionResponse}
   */
  public ServiceCall<DeleteSignatureCollectionResponse> deleteSigTx(DeleteSigTxOptions deleteSigTxOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSigTxOptions,
      "deleteSigTxOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSigTxOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/signature_collections/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "deleteSigTx");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteSignatureCollectionResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteSignatureCollectionResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Archive notifications.
   *
   * Archive 1 or more notifications. Archived notifications will no longer appear in the default [Get all
   * notifications](#list-notifications) API.
   *
   * @param archiveNotificationsOptions the {@link ArchiveNotificationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ArchiveResponse}
   */
  public ServiceCall<ArchiveResponse> archiveNotifications(ArchiveNotificationsOptions archiveNotificationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(archiveNotificationsOptions,
      "archiveNotificationsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/notifications/bulk"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "archiveNotifications");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.add("notification_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(archiveNotificationsOptions.notificationIds()));
    builder.bodyJson(contentJson);
    ResponseConverter<ArchiveResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ArchiveResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Restart the IBP console.
   *
   * Restart IBP console processes. This causes a small outage (10 - 30 seconds) which is possibly disruptive to active
   * user sessions.
   *
   * @param restartOptions the {@link RestartOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RestartAthenaResponse}
   */
  public ServiceCall<RestartAthenaResponse> restart(RestartOptions restartOptions) {
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/restart"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "restart");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RestartAthenaResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RestartAthenaResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Restart the IBP console.
   *
   * Restart IBP console processes. This causes a small outage (10 - 30 seconds) which is possibly disruptive to active
   * user sessions.
   *
   * @return a {@link ServiceCall} with a result of type {@link RestartAthenaResponse}
   */
  public ServiceCall<RestartAthenaResponse> restart() {
    return restart(null);
  }

  /**
   * Delete all IBP console sessions.
   *
   * Delete all client sessions in IBP console. Use this API to clear any active logins and force everyone to log in
   * again. This API is useful for debugging purposes and when changing roles of a user. It forces any role changes to
   * take effect immediately. Otherwise, permission or role changes will take effect during the user's next login or
   * session expiration.
   *
   * @param deleteAllSessionsOptions the {@link DeleteAllSessionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteAllSessionsResponse}
   */
  public ServiceCall<DeleteAllSessionsResponse> deleteAllSessions(DeleteAllSessionsOptions deleteAllSessionsOptions) {
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/sessions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "deleteAllSessions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteAllSessionsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteAllSessionsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete all IBP console sessions.
   *
   * Delete all client sessions in IBP console. Use this API to clear any active logins and force everyone to log in
   * again. This API is useful for debugging purposes and when changing roles of a user. It forces any role changes to
   * take effect immediately. Otherwise, permission or role changes will take effect during the user's next login or
   * session expiration.
   *
   * @return a {@link ServiceCall} with a result of type {@link DeleteAllSessionsResponse}
   */
  public ServiceCall<DeleteAllSessionsResponse> deleteAllSessions() {
    return deleteAllSessions(null);
  }

  /**
   * Delete all notifications.
   *
   * Delete all notifications. This API is intended for administration.
   *
   * @param deleteAllNotificationsOptions the {@link DeleteAllNotificationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteAllNotificationsResponse}
   */
  public ServiceCall<DeleteAllNotificationsResponse> deleteAllNotifications(DeleteAllNotificationsOptions deleteAllNotificationsOptions) {
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/notifications/purge"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "deleteAllNotifications");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteAllNotificationsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteAllNotificationsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete all notifications.
   *
   * Delete all notifications. This API is intended for administration.
   *
   * @return a {@link ServiceCall} with a result of type {@link DeleteAllNotificationsResponse}
   */
  public ServiceCall<DeleteAllNotificationsResponse> deleteAllNotifications() {
    return deleteAllNotifications(null);
  }

  /**
   * Clear IBP console caches.
   *
   * Clear the in-memory caches across all IBP console server processes. No effect on caches that are currently
   * disabled.
   *
   * @param clearCachesOptions the {@link ClearCachesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CacheFlushResponse}
   */
  public ServiceCall<CacheFlushResponse> clearCaches(ClearCachesOptions clearCachesOptions) {
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/cache"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "clearCaches");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CacheFlushResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CacheFlushResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Clear IBP console caches.
   *
   * Clear the in-memory caches across all IBP console server processes. No effect on caches that are currently
   * disabled.
   *
   * @return a {@link ServiceCall} with a result of type {@link CacheFlushResponse}
   */
  public ServiceCall<CacheFlushResponse> clearCaches() {
    return clearCaches(null);
  }

  /**
   * Generate Postman collection.
   *
   * Generate and download a Postman API Collection. The JSON contains all the APIs available in the IBP console. It can
   * be imported to the [Postman](https://www.postman.com/downloads) desktop application. **The examples in the
   * collection will be pre-populated with authorization credentials.** The authorization credentials to use must be
   * provided to this API. See the query parameters for available options.
   *
   * Choose an auth strategy that matches your environment &amp; concerns:
   *
   * - **IAM Bearer Auth** - *[Available on IBM Cloud]* - This is the recommended auth strategy. The same bearer token
   * used to authenticate this request will be copied into the Postman collection examples. Since the bearer token
   * expires the auth embedded in the collection will also expire. At that point the collection might be deleted &amp;
   * regenerated, or manually edited to refresh the authorization header values. To use this strategy set `auth_type` to
   * `bearer`.
   * - **IAM Api Key Auth** - *[Available on IBM Cloud]* - The IAM api key will be copied into the Postman collection
   * examples. This means the auth embedded in the collection will never expire. To use this strategy set `auth_type` to
   * `api_key`.
   * - **Basic Auth** - *[Available on OpenShift &amp; IBM Cloud Private]* - A basic auth username and password will be
   * copied into the Postman collection examples. This is **not** available for an IBP SaaS instance on IBM Cloud. To
   * use this strategy set `auth_type` to `basic`.
   *
   * @param getPostmanOptions the {@link GetPostmanOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> getPostman(GetPostmanOptions getPostmanOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPostmanOptions,
      "getPostmanOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/postman"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "getPostman");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("auth_type", String.valueOf(getPostmanOptions.authType()));
    if (getPostmanOptions.token() != null) {
      builder.query("token", String.valueOf(getPostmanOptions.token()));
    }
    if (getPostmanOptions.apiKey() != null) {
      builder.query("api_key", String.valueOf(getPostmanOptions.apiKey()));
    }
    if (getPostmanOptions.username() != null) {
      builder.query("username", String.valueOf(getPostmanOptions.username()));
    }
    if (getPostmanOptions.password() != null) {
      builder.query("password", String.valueOf(getPostmanOptions.password()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Download OpenAPI file.
   *
   * Download the [OpenAPI](https://swagger.io/specification/) specification YAML file (aka swagger file) for the IBP
   * console. This is the same file that was used to generate the APIs on this page. This file documents APIs offered by
   * the IBP console.
   *
   * @param getSwaggerOptions the {@link GetSwaggerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> getSwagger(GetSwaggerOptions getSwaggerOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ak/api/v3/openapi"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("blockchain", "v3", "getSwagger");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "text/plain");
    ResponseConverter<String> responseConverter = ResponseConverterUtils.getString();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Download OpenAPI file.
   *
   * Download the [OpenAPI](https://swagger.io/specification/) specification YAML file (aka swagger file) for the IBP
   * console. This is the same file that was used to generate the APIs on this page. This file documents APIs offered by
   * the IBP console.
   *
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> getSwagger() {
    return getSwagger(null);
  }

}
