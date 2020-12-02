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
 * NodeOu.
 */
public class NodeOu extends GenericModel {

  protected Boolean enabled;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;

    private Builder(NodeOu nodeOu) {
      this.enabled = nodeOu.enabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a NodeOu.
     *
     * @return the new NodeOu instance
     */
    public NodeOu build() {
      return new NodeOu(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the NodeOu builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }

  protected NodeOu(Builder builder) {
    enabled = builder.enabled;
  }

  /**
   * New builder.
   *
   * @return a NodeOu builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Indicates if node OUs are enabled or not.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }
}

