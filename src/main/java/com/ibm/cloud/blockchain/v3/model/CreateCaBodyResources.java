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
public class CreateCaBodyResources extends GenericModel {

  protected ResourceObject ca;

  /**
   * Builder.
   */
  public static class Builder {
    private ResourceObject ca;

    private Builder(CreateCaBodyResources createCaBodyResources) {
      this.ca = createCaBodyResources.ca;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ca the ca
     */
    public Builder(ResourceObject ca) {
      this.ca = ca;
    }

    /**
     * Builds a CreateCaBodyResources.
     *
     * @return the new CreateCaBodyResources instance
     */
    public CreateCaBodyResources build() {
      return new CreateCaBodyResources(this);
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the CreateCaBodyResources builder
     */
    public Builder ca(ResourceObject ca) {
      this.ca = ca;
      return this;
    }
  }

  protected CreateCaBodyResources(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ca,
      "ca cannot be null");
    ca = builder.ca;
  }

  /**
   * New builder.
   *
   * @return a CreateCaBodyResources builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ca.
   *
   * This field requires the use of Fabric v1.4.* and higher.
   *
   * @return the ca
   */
  public ResourceObject ca() {
    return ca;
  }
}

