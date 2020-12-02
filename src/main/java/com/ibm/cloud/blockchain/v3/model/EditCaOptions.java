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
 * The editCa options.
 */
public class EditCaOptions extends GenericModel {

  protected String id;
  protected String displayName;
  protected String apiUrl;
  protected String operationsUrl;
  protected String caName;
  protected String location;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String displayName;
    private String apiUrl;
    private String operationsUrl;
    private String caName;
    private String location;
    private List<String> tags;

    private Builder(EditCaOptions editCaOptions) {
      this.id = editCaOptions.id;
      this.displayName = editCaOptions.displayName;
      this.apiUrl = editCaOptions.apiUrl;
      this.operationsUrl = editCaOptions.operationsUrl;
      this.caName = editCaOptions.caName;
      this.location = editCaOptions.location;
      this.tags = editCaOptions.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a EditCaOptions.
     *
     * @return the new EditCaOptions instance
     */
    public EditCaOptions build() {
      return new EditCaOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the EditCaOptions builder
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
     * Set the id.
     *
     * @param id the id
     * @return the EditCaOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the EditCaOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the apiUrl.
     *
     * @param apiUrl the apiUrl
     * @return the EditCaOptions builder
     */
    public Builder apiUrl(String apiUrl) {
      this.apiUrl = apiUrl;
      return this;
    }

    /**
     * Set the operationsUrl.
     *
     * @param operationsUrl the operationsUrl
     * @return the EditCaOptions builder
     */
    public Builder operationsUrl(String operationsUrl) {
      this.operationsUrl = operationsUrl;
      return this;
    }

    /**
     * Set the caName.
     *
     * @param caName the caName
     * @return the EditCaOptions builder
     */
    public Builder caName(String caName) {
      this.caName = caName;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the EditCaOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the EditCaOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected EditCaOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    displayName = builder.displayName;
    apiUrl = builder.apiUrl;
    operationsUrl = builder.operationsUrl;
    caName = builder.caName;
    location = builder.location;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a EditCaOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The `id` of the component to modify. Use the [Get all components](#list_components) API to determine the component
   * id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the displayName.
   *
   * A descriptive name for this CA. The IBP console tile displays this name.
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
   * Gets the caName.
   *
   * The CA's "CAName" attribute. This name is used to distinguish this CA from the TLS CA.
   *
   * @return the caName
   */
  public String caName() {
    return caName;
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
   * Gets the tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }
}

