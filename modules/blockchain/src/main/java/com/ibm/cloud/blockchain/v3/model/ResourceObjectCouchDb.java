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
 * *Legacy field name* Use the field `statedb` instead. This field requires the use of Fabric v1.4.* and higher.
 */
public class ResourceObjectCouchDb extends GenericModel {

  protected ResourceRequests requests;
  protected ResourceLimits limits;

  /**
   * Builder.
   */
  public static class Builder {
    private ResourceRequests requests;
    private ResourceLimits limits;

    private Builder(ResourceObjectCouchDb resourceObjectCouchDb) {
      this.requests = resourceObjectCouchDb.requests;
      this.limits = resourceObjectCouchDb.limits;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param requests the requests
     */
    public Builder(ResourceRequests requests) {
      this.requests = requests;
    }

    /**
     * Builds a ResourceObjectCouchDb.
     *
     * @return the new ResourceObjectCouchDb instance
     */
    public ResourceObjectCouchDb build() {
      return new ResourceObjectCouchDb(this);
    }

    /**
     * Set the requests.
     *
     * @param requests the requests
     * @return the ResourceObjectCouchDb builder
     */
    public Builder requests(ResourceRequests requests) {
      this.requests = requests;
      return this;
    }

    /**
     * Set the limits.
     *
     * @param limits the limits
     * @return the ResourceObjectCouchDb builder
     */
    public Builder limits(ResourceLimits limits) {
      this.limits = limits;
      return this;
    }
  }

  protected ResourceObjectCouchDb(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.requests,
      "requests cannot be null");
    requests = builder.requests;
    limits = builder.limits;
  }

  /**
   * New builder.
   *
   * @return a ResourceObjectCouchDb builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the requests.
   *
   * @return the requests
   */
  public ResourceRequests requests() {
    return requests;
  }

  /**
   * Gets the limits.
   *
   * @return the limits
   */
  public ResourceLimits limits() {
    return limits;
  }
}

