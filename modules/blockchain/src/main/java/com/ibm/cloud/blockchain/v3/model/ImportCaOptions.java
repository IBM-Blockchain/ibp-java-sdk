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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The importCa options.
 */
public class ImportCaOptions extends GenericModel {

  protected String displayName;
  protected String apiUrl;
  protected ImportCaBodyMsp msp;
  protected String location;
  protected String operationsUrl;
  protected List<String> tags;
  protected String tlsCert;

  /**
   * Builder.
   */
  public static class Builder {
    private String displayName;
    private String apiUrl;
    private ImportCaBodyMsp msp;
    private String location;
    private String operationsUrl;
    private List<String> tags;
    private String tlsCert;

    private Builder(ImportCaOptions importCaOptions) {
      this.displayName = importCaOptions.displayName;
      this.apiUrl = importCaOptions.apiUrl;
      this.msp = importCaOptions.msp;
      this.location = importCaOptions.location;
      this.operationsUrl = importCaOptions.operationsUrl;
      this.tags = importCaOptions.tags;
      this.tlsCert = importCaOptions.tlsCert;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param displayName the displayName
     * @param apiUrl the apiUrl
     * @param msp the msp
     */
    public Builder(String displayName, String apiUrl, ImportCaBodyMsp msp) {
      this.displayName = displayName;
      this.apiUrl = apiUrl;
      this.msp = msp;
    }

    /**
     * Builds a ImportCaOptions.
     *
     * @return the new ImportCaOptions instance
     */
    public ImportCaOptions build() {
      return new ImportCaOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the ImportCaOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the ImportCaOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the apiUrl.
     *
     * @param apiUrl the apiUrl
     * @return the ImportCaOptions builder
     */
    public Builder apiUrl(String apiUrl) {
      this.apiUrl = apiUrl;
      return this;
    }

    /**
     * Set the msp.
     *
     * @param msp the msp
     * @return the ImportCaOptions builder
     */
    public Builder msp(ImportCaBodyMsp msp) {
      this.msp = msp;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the ImportCaOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the operationsUrl.
     *
     * @param operationsUrl the operationsUrl
     * @return the ImportCaOptions builder
     */
    public Builder operationsUrl(String operationsUrl) {
      this.operationsUrl = operationsUrl;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the ImportCaOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the tlsCert.
     *
     * @param tlsCert the tlsCert
     * @return the ImportCaOptions builder
     */
    public Builder tlsCert(String tlsCert) {
      this.tlsCert = tlsCert;
      return this;
    }
  }

  protected ImportCaOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.apiUrl,
      "apiUrl cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.msp,
      "msp cannot be null");
    displayName = builder.displayName;
    apiUrl = builder.apiUrl;
    msp = builder.msp;
    location = builder.location;
    operationsUrl = builder.operationsUrl;
    tags = builder.tags;
    tlsCert = builder.tlsCert;
  }

  /**
   * New builder.
   *
   * @return a ImportCaOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the displayName.
   *
   * A descriptive name for this component.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the apiUrl.
   *
   * The URL for the CA. Typically, client applications would send requests to this URL. Include the protocol,
   * hostname/ip and port.
   *
   * @return the apiUrl
   */
  public String apiUrl() {
    return apiUrl;
  }

  /**
   * Gets the msp.
   *
   * @return the msp
   */
  public ImportCaBodyMsp msp() {
    return msp;
  }

  /**
   * Gets the location.
   *
   * Indicates where the component is running.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the operationsUrl.
   *
   * The operations URL for the CA. Include the protocol, hostname/ip and port.
   *
   * @return the operationsUrl
   */
  public String operationsUrl() {
    return operationsUrl;
  }

  /**
   * Gets the tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the tlsCert.
   *
   * The TLS certificate as base 64 encoded PEM. Certificate is used to secure/validate a TLS connection with this
   * component.
   *
   * @return the tlsCert
   */
  public String tlsCert() {
    return tlsCert;
  }
}

