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
 * The caAction options.
 */
public class CaActionOptions extends GenericModel {

  protected String id;
  protected Boolean restart;
  protected ActionRenew renew;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean restart;
    private ActionRenew renew;

    private Builder(CaActionOptions caActionOptions) {
      this.id = caActionOptions.id;
      this.restart = caActionOptions.restart;
      this.renew = caActionOptions.renew;
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
     * Builds a CaActionOptions.
     *
     * @return the new CaActionOptions instance
     */
    public CaActionOptions build() {
      return new CaActionOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CaActionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the restart.
     *
     * @param restart the restart
     * @return the CaActionOptions builder
     */
    public Builder restart(Boolean restart) {
      this.restart = restart;
      return this;
    }

    /**
     * Set the renew.
     *
     * @param renew the renew
     * @return the CaActionOptions builder
     */
    public Builder renew(ActionRenew renew) {
      this.renew = renew;
      return this;
    }
  }

  protected CaActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    restart = builder.restart;
    renew = builder.renew;
  }

  /**
   * New builder.
   *
   * @return a CaActionOptions builder
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
   * Gets the restart.
   *
   * Set to `true` to restart the component.
   *
   * @return the restart
   */
  public Boolean restart() {
    return restart;
  }

  /**
   * Gets the renew.
   *
   * @return the renew
   */
  public ActionRenew renew() {
    return renew;
  }
}

