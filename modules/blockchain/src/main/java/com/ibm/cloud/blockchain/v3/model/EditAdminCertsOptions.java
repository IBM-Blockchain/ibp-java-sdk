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
 * The editAdminCerts options.
 */
public class EditAdminCertsOptions extends GenericModel {

  protected String id;
  protected List<String> appendAdminCerts;
  protected List<String> removeAdminCerts;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private List<String> appendAdminCerts;
    private List<String> removeAdminCerts;

    private Builder(EditAdminCertsOptions editAdminCertsOptions) {
      this.id = editAdminCertsOptions.id;
      this.appendAdminCerts = editAdminCertsOptions.appendAdminCerts;
      this.removeAdminCerts = editAdminCertsOptions.removeAdminCerts;
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
     * Builds a EditAdminCertsOptions.
     *
     * @return the new EditAdminCertsOptions instance
     */
    public EditAdminCertsOptions build() {
      return new EditAdminCertsOptions(this);
    }

    /**
     * Adds an appendAdminCerts to appendAdminCerts.
     *
     * @param appendAdminCerts the new appendAdminCerts
     * @return the EditAdminCertsOptions builder
     */
    public Builder addAppendAdminCerts(String appendAdminCerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(appendAdminCerts,
        "appendAdminCerts cannot be null");
      if (this.appendAdminCerts == null) {
        this.appendAdminCerts = new ArrayList<String>();
      }
      this.appendAdminCerts.add(appendAdminCerts);
      return this;
    }

    /**
     * Adds an removeAdminCerts to removeAdminCerts.
     *
     * @param removeAdminCerts the new removeAdminCerts
     * @return the EditAdminCertsOptions builder
     */
    public Builder addRemoveAdminCerts(String removeAdminCerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(removeAdminCerts,
        "removeAdminCerts cannot be null");
      if (this.removeAdminCerts == null) {
        this.removeAdminCerts = new ArrayList<String>();
      }
      this.removeAdminCerts.add(removeAdminCerts);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the EditAdminCertsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the appendAdminCerts.
     * Existing appendAdminCerts will be replaced.
     *
     * @param appendAdminCerts the appendAdminCerts
     * @return the EditAdminCertsOptions builder
     */
    public Builder appendAdminCerts(List<String> appendAdminCerts) {
      this.appendAdminCerts = appendAdminCerts;
      return this;
    }

    /**
     * Set the removeAdminCerts.
     * Existing removeAdminCerts will be replaced.
     *
     * @param removeAdminCerts the removeAdminCerts
     * @return the EditAdminCertsOptions builder
     */
    public Builder removeAdminCerts(List<String> removeAdminCerts) {
      this.removeAdminCerts = removeAdminCerts;
      return this;
    }
  }

  protected EditAdminCertsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    appendAdminCerts = builder.appendAdminCerts;
    removeAdminCerts = builder.removeAdminCerts;
  }

  /**
   * New builder.
   *
   * @return a EditAdminCertsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The `id` of the component to edit. Use the [Get all components](#list_components) API to determine the id of the
   * component.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the appendAdminCerts.
   *
   * The admin certificates to add to the file system.
   *
   * @return the appendAdminCerts
   */
  public List<String> appendAdminCerts() {
    return appendAdminCerts;
  }

  /**
   * Gets the removeAdminCerts.
   *
   * The admin certificates to remove from the file system. To see the current list run the [Get a
   * component](#get-component) API with the `deployment_attrs=included` parameter.
   *
   * @return the removeAdminCerts
   */
  public List<String> removeAdminCerts() {
    return removeAdminCerts;
  }
}

