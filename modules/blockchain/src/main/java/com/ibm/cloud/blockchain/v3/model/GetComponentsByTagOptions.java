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
 * The getComponentsByTag options.
 */
public class GetComponentsByTagOptions extends GenericModel {

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

  protected String tag;
  protected String deploymentAttrs;
  protected String parsedCerts;
  protected String cache;

  /**
   * Builder.
   */
  public static class Builder {
    private String tag;
    private String deploymentAttrs;
    private String parsedCerts;
    private String cache;

    private Builder(GetComponentsByTagOptions getComponentsByTagOptions) {
      this.tag = getComponentsByTagOptions.tag;
      this.deploymentAttrs = getComponentsByTagOptions.deploymentAttrs;
      this.parsedCerts = getComponentsByTagOptions.parsedCerts;
      this.cache = getComponentsByTagOptions.cache;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param tag the tag
     */
    public Builder(String tag) {
      this.tag = tag;
    }

    /**
     * Builds a GetComponentsByTagOptions.
     *
     * @return the new GetComponentsByTagOptions instance
     */
    public GetComponentsByTagOptions build() {
      return new GetComponentsByTagOptions(this);
    }

    /**
     * Set the tag.
     *
     * @param tag the tag
     * @return the GetComponentsByTagOptions builder
     */
    public Builder tag(String tag) {
      this.tag = tag;
      return this;
    }

    /**
     * Set the deploymentAttrs.
     *
     * @param deploymentAttrs the deploymentAttrs
     * @return the GetComponentsByTagOptions builder
     */
    public Builder deploymentAttrs(String deploymentAttrs) {
      this.deploymentAttrs = deploymentAttrs;
      return this;
    }

    /**
     * Set the parsedCerts.
     *
     * @param parsedCerts the parsedCerts
     * @return the GetComponentsByTagOptions builder
     */
    public Builder parsedCerts(String parsedCerts) {
      this.parsedCerts = parsedCerts;
      return this;
    }

    /**
     * Set the cache.
     *
     * @param cache the cache
     * @return the GetComponentsByTagOptions builder
     */
    public Builder cache(String cache) {
      this.cache = cache;
      return this;
    }
  }

  protected GetComponentsByTagOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tag,
      "tag cannot be empty");
    tag = builder.tag;
    deploymentAttrs = builder.deploymentAttrs;
    parsedCerts = builder.parsedCerts;
    cache = builder.cache;
  }

  /**
   * New builder.
   *
   * @return a GetComponentsByTagOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the tag.
   *
   * The tag to filter components on. Not case-sensitive.
   *
   * @return the tag
   */
  public String tag() {
    return tag;
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

