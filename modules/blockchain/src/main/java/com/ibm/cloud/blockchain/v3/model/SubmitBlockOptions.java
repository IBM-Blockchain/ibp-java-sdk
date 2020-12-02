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
 * The submitBlock options.
 */
public class SubmitBlockOptions extends GenericModel {

  protected String id;
  protected String b64Block;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String b64Block;

    private Builder(SubmitBlockOptions submitBlockOptions) {
      this.id = submitBlockOptions.id;
      this.b64Block = submitBlockOptions.b64Block;
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
     * Builds a SubmitBlockOptions.
     *
     * @return the new SubmitBlockOptions instance
     */
    public SubmitBlockOptions build() {
      return new SubmitBlockOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the SubmitBlockOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the b64Block.
     *
     * @param b64Block the b64Block
     * @return the SubmitBlockOptions builder
     */
    public Builder b64Block(String b64Block) {
      this.b64Block = b64Block;
      return this;
    }
  }

  protected SubmitBlockOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    b64Block = builder.b64Block;
  }

  /**
   * New builder.
   *
   * @return a SubmitBlockOptions builder
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
   * Gets the b64Block.
   *
   * The latest config block of the system channel. Base 64 encoded. To obtain this block, you must use a **Fabric
   * API**. This config block should list this ordering node as a valid consenter on the system-channel.
   *
   * @return the b64Block
   */
  public String b64Block() {
    return b64Block;
  }
}

