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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getComponentsByType options.
 */
public class GetComponentsByTypeOptions extends GenericModel {

  /**
   * The type to filter components on.
   */
  public interface ComponentType {
    /** fabric-peer. */
    String FABRIC_PEER = "fabric-peer";
    /** fabric-orderer. */
    String FABRIC_ORDERER = "fabric-orderer";
    /** fabric-ca. */
    String FABRIC_CA = "fabric-ca";
    /** msp. */
    String MSP = "msp";
  }

  /**
   * Set to 'included' if the response should include Kubernetes deployment attributes such as 'resources', 'storage',
   * 'zone', 'region', 'admin_certs', etc. Default responses will not include these fields.
   *
   * **This parameter will not work on *imported* components.**
   *
   * It's recommended to use `cache=skip` as well if up-to-date deployment data is needed.
   */
  public interface DeploymentAttrs {
    /** included. */
    String INCLUDED = "included";
    /** omitted. */
    String OMITTED = "omitted";
  }

  /**
   * Set to 'included' if the response should include parsed PEM data along with base 64 encoded PEM string. Parsed
   * certificate data will include fields such as the serial number, issuer, expiration, subject, subject alt names,
   * etc. Default responses will not include these fields.
   */
  public interface ParsedCerts {
    /** included. */
    String INCLUDED = "included";
    /** omitted. */
    String OMITTED = "omitted";
  }

  /**
   * Set to 'skip' if the response should skip local data and fetch live data wherever possible. Expect longer response
   * times if the cache is skipped. Default responses will use the cache.
   */
  public interface Cache {
    /** skip. */
    String SKIP = "skip";
    /** use. */
    String USE = "use";
  }

  protected String componentType;
  protected String deploymentAttrs;
  protected String parsedCerts;
  protected String cache;

  /**
   * Builder.
   */
  public static class Builder {
    private String componentType;
    private String deploymentAttrs;
    private String parsedCerts;
    private String cache;

    private Builder(GetComponentsByTypeOptions getComponentsByTypeOptions) {
      this.componentType = getComponentsByTypeOptions.componentType;
      this.deploymentAttrs = getComponentsByTypeOptions.deploymentAttrs;
      this.parsedCerts = getComponentsByTypeOptions.parsedCerts;
      this.cache = getComponentsByTypeOptions.cache;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param componentType the componentType
     */
    public Builder(String componentType) {
      this.componentType = componentType;
    }

    /**
     * Builds a GetComponentsByTypeOptions.
     *
     * @return the new GetComponentsByTypeOptions instance
     */
    public GetComponentsByTypeOptions build() {
      return new GetComponentsByTypeOptions(this);
    }

    /**
     * Set the componentType.
     *
     * @param componentType the componentType
     * @return the GetComponentsByTypeOptions builder
     */
    public Builder componentType(String componentType) {
      this.componentType = componentType;
      return this;
    }

    /**
     * Set the deploymentAttrs.
     *
     * @param deploymentAttrs the deploymentAttrs
     * @return the GetComponentsByTypeOptions builder
     */
    public Builder deploymentAttrs(String deploymentAttrs) {
      this.deploymentAttrs = deploymentAttrs;
      return this;
    }

    /**
     * Set the parsedCerts.
     *
     * @param parsedCerts the parsedCerts
     * @return the GetComponentsByTypeOptions builder
     */
    public Builder parsedCerts(String parsedCerts) {
      this.parsedCerts = parsedCerts;
      return this;
    }

    /**
     * Set the cache.
     *
     * @param cache the cache
     * @return the GetComponentsByTypeOptions builder
     */
    public Builder cache(String cache) {
      this.cache = cache;
      return this;
    }
  }

  protected GetComponentsByTypeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.componentType,
      "componentType cannot be empty");
    componentType = builder.componentType;
    deploymentAttrs = builder.deploymentAttrs;
    parsedCerts = builder.parsedCerts;
    cache = builder.cache;
  }

  /**
   * New builder.
   *
   * @return a GetComponentsByTypeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the componentType.
   *
   * The type to filter components on.
   *
   * @return the componentType
   */
  public String componentType() {
    return componentType;
  }

  /**
   * Gets the deploymentAttrs.
   *
   * Set to 'included' if the response should include Kubernetes deployment attributes such as 'resources', 'storage',
   * 'zone', 'region', 'admin_certs', etc. Default responses will not include these fields.
   *
   * **This parameter will not work on *imported* components.**
   *
   * It's recommended to use `cache=skip` as well if up-to-date deployment data is needed.
   *
   * @return the deploymentAttrs
   */
  public String deploymentAttrs() {
    return deploymentAttrs;
  }

  /**
   * Gets the parsedCerts.
   *
   * Set to 'included' if the response should include parsed PEM data along with base 64 encoded PEM string. Parsed
   * certificate data will include fields such as the serial number, issuer, expiration, subject, subject alt names,
   * etc. Default responses will not include these fields.
   *
   * @return the parsedCerts
   */
  public String parsedCerts() {
    return parsedCerts;
  }

  /**
   * Gets the cache.
   *
   * Set to 'skip' if the response should skip local data and fetch live data wherever possible. Expect longer response
   * times if the cache is skipped. Default responses will use the cache.
   *
   * @return the cache
   */
  public String cache() {
    return cache;
  }
}

