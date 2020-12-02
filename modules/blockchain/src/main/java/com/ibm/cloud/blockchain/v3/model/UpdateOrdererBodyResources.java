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
 * CPU and memory properties. This feature is not available if using a free Kubernetes cluster.
 */
public class UpdateOrdererBodyResources extends GenericModel {

  protected ResourceObject orderer;
  protected ResourceObject proxy;

  /**
   * Builder.
   */
  public static class Builder {
    private ResourceObject orderer;
    private ResourceObject proxy;

    private Builder(UpdateOrdererBodyResources updateOrdererBodyResources) {
      this.orderer = updateOrdererBodyResources.orderer;
      this.proxy = updateOrdererBodyResources.proxy;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateOrdererBodyResources.
     *
     * @return the new UpdateOrdererBodyResources instance
     */
    public UpdateOrdererBodyResources build() {
      return new UpdateOrdererBodyResources(this);
    }

    /**
     * Set the orderer.
     *
     * @param orderer the orderer
     * @return the UpdateOrdererBodyResources builder
     */
    public Builder orderer(ResourceObject orderer) {
      this.orderer = orderer;
      return this;
    }

    /**
     * Set the proxy.
     *
     * @param proxy the proxy
     * @return the UpdateOrdererBodyResources builder
     */
    public Builder proxy(ResourceObject proxy) {
      this.proxy = proxy;
      return this;
    }
  }

  protected UpdateOrdererBodyResources(Builder builder) {
    orderer = builder.orderer;
    proxy = builder.proxy;
  }

  /**
   * New builder.
   *
   * @return a UpdateOrdererBodyResources builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the orderer.
   *
   * This field requires the use of Fabric v1.4.* and higher.
   *
   * @return the orderer
   */
  public ResourceObject orderer() {
    return orderer;
  }

  /**
   * Gets the proxy.
   *
   * This field requires the use of Fabric v1.4.* and higher.
   *
   * @return the proxy
   */
  public ResourceObject proxy() {
    return proxy;
  }
}

