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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ActionRenew.
 */
public class ActionRenew extends GenericModel {

  @SerializedName("tls_cert")
  protected Boolean tlsCert;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean tlsCert;

    private Builder(ActionRenew actionRenew) {
      this.tlsCert = actionRenew.tlsCert;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ActionRenew.
     *
     * @return the new ActionRenew instance
     */
    public ActionRenew build() {
      return new ActionRenew(this);
    }

    /**
     * Set the tlsCert.
     *
     * @param tlsCert the tlsCert
     * @return the ActionRenew builder
     */
    public Builder tlsCert(Boolean tlsCert) {
      this.tlsCert = tlsCert;
      return this;
    }
  }

  protected ActionRenew(Builder builder) {
    tlsCert = builder.tlsCert;
  }

  /**
   * New builder.
   *
   * @return a ActionRenew builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the tlsCert.
   *
   * Set to `true` to renew the tls cert for this component.
   *
   * @return the tlsCert
   */
  public Boolean tlsCert() {
    return tlsCert;
  }
}

