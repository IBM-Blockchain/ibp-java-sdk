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
 * The listComponents options.
 */
public class ListComponentsOptions extends GenericModel {

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

  /**
   * Set to 'included' if the response should fetch CA attributes, inspect certificates, and append extra fields to CA
   * and MSP component responses.
   * - CA components will have fields appended/updated with data fetched from the `/cainfo?ca=ca` endpoint of a CA, such
   * as: `ca_name`, `root_cert`, `fabric_version`, `issuer_public_key` and `issued_known_msps`. The field
   * `issued_known_msps` indicates imported IBP MSPs that this CA has issued. Meaning the MSP's root cert contains a
   * signature that is derived from this CA's root cert. Only imported MSPs are checked. Default responses will not
   * include these fields.
   * - MSP components will have the field `issued_by_ca_id` appended. This field indicates the id of an IBP console CA
   * that issued this MSP. Meaning the MSP's root cert contains a signature that is derived from this CA's root cert.
   * Only imported/created CAs are checked. Default responses will not include these fields.
   */
  public interface CaAttrs {
    /** included. */
    String INCLUDED = "included";
    /** omitted. */
    String OMITTED = "omitted";
  }

  protected String deploymentAttrs;
  protected String parsedCerts;
  protected String cache;
  protected String caAttrs;

  /**
   * Builder.
   */
  public static class Builder {
    private String deploymentAttrs;
    private String parsedCerts;
    private String cache;
    private String caAttrs;

    private Builder(ListComponentsOptions listComponentsOptions) {
      this.deploymentAttrs = listComponentsOptions.deploymentAttrs;
      this.parsedCerts = listComponentsOptions.parsedCerts;
      this.cache = listComponentsOptions.cache;
      this.caAttrs = listComponentsOptions.caAttrs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListComponentsOptions.
     *
     * @return the new ListComponentsOptions instance
     */
    public ListComponentsOptions build() {
      return new ListComponentsOptions(this);
    }

    /**
     * Set the deploymentAttrs.
     *
     * @param deploymentAttrs the deploymentAttrs
     * @return the ListComponentsOptions builder
     */
    public Builder deploymentAttrs(String deploymentAttrs) {
      this.deploymentAttrs = deploymentAttrs;
      return this;
    }

    /**
     * Set the parsedCerts.
     *
     * @param parsedCerts the parsedCerts
     * @return the ListComponentsOptions builder
     */
    public Builder parsedCerts(String parsedCerts) {
      this.parsedCerts = parsedCerts;
      return this;
    }

    /**
     * Set the cache.
     *
     * @param cache the cache
     * @return the ListComponentsOptions builder
     */
    public Builder cache(String cache) {
      this.cache = cache;
      return this;
    }

    /**
     * Set the caAttrs.
     *
     * @param caAttrs the caAttrs
     * @return the ListComponentsOptions builder
     */
    public Builder caAttrs(String caAttrs) {
      this.caAttrs = caAttrs;
      return this;
    }
  }

  protected ListComponentsOptions(Builder builder) {
    deploymentAttrs = builder.deploymentAttrs;
    parsedCerts = builder.parsedCerts;
    cache = builder.cache;
    caAttrs = builder.caAttrs;
  }

  /**
   * New builder.
   *
   * @return a ListComponentsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the caAttrs.
   *
   * Set to 'included' if the response should fetch CA attributes, inspect certificates, and append extra fields to CA
   * and MSP component responses.
   * - CA components will have fields appended/updated with data fetched from the `/cainfo?ca=ca` endpoint of a CA, such
   * as: `ca_name`, `root_cert`, `fabric_version`, `issuer_public_key` and `issued_known_msps`. The field
   * `issued_known_msps` indicates imported IBP MSPs that this CA has issued. Meaning the MSP's root cert contains a
   * signature that is derived from this CA's root cert. Only imported MSPs are checked. Default responses will not
   * include these fields.
   * - MSP components will have the field `issued_by_ca_id` appended. This field indicates the id of an IBP console CA
   * that issued this MSP. Meaning the MSP's root cert contains a signature that is derived from this CA's root cert.
   * Only imported/created CAs are checked. Default responses will not include these fields.
   *
   * @return the caAttrs
   */
  public String caAttrs() {
    return caAttrs;
  }
}

