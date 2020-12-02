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
 * The removeComponent options.
 */
public class RemoveComponentOptions extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    private Builder(RemoveComponentOptions removeComponentOptions) {
      this.id = removeComponentOptions.id;
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
     * Builds a RemoveComponentOptions.
     *
     * @return the new RemoveComponentOptions instance
     */
    public RemoveComponentOptions build() {
      return new RemoveComponentOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the RemoveComponentOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected RemoveComponentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a RemoveComponentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The `id` of the imported component to remove. Use the [Get all components](#list-components) API to determine the
   * component id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

