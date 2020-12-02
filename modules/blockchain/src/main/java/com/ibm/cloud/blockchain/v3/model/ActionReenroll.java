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
 * ActionReenroll.
 */
public class ActionReenroll extends GenericModel {

  @SerializedName("tls_cert")
  protected Boolean tlsCert;
  protected Boolean ecert;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean tlsCert;
    private Boolean ecert;

    private Builder(ActionReenroll actionReenroll) {
      this.tlsCert = actionReenroll.tlsCert;
      this.ecert = actionReenroll.ecert;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ActionReenroll.
     *
     * @return the new ActionReenroll instance
     */
    public ActionReenroll build() {
      return new ActionReenroll(this);
    }

    /**
     * Set the tlsCert.
     *
     * @param tlsCert the tlsCert
     * @return the ActionReenroll builder
     */
    public Builder tlsCert(Boolean tlsCert) {
      this.tlsCert = tlsCert;
      return this;
    }

    /**
     * Set the ecert.
     *
     * @param ecert the ecert
     * @return the ActionReenroll builder
     */
    public Builder ecert(Boolean ecert) {
      this.ecert = ecert;
      return this;
    }
  }

  protected ActionReenroll(Builder builder) {
    tlsCert = builder.tlsCert;
    ecert = builder.ecert;
  }

  /**
   * New builder.
   *
   * @return a ActionReenroll builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the tlsCert.
   *
   * Set to `true` to generate a new tls cert for this component via re-enrollment.
   *
   * @return the tlsCert
   */
  public Boolean tlsCert() {
    return tlsCert;
  }

  /**
   * Gets the ecert.
   *
   * Set to `true` to generate a new ecert for this component via re-enrollment.
   *
   * @return the ecert
   */
  public Boolean ecert() {
    return ecert;
  }
}

