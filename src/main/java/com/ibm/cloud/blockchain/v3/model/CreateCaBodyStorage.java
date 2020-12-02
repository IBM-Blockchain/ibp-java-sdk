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
 * Disk space properties. This feature is not available if using a free Kubernetes cluster.
 */
public class CreateCaBodyStorage extends GenericModel {

  protected StorageObject ca;

  /**
   * Builder.
   */
  public static class Builder {
    private StorageObject ca;

    private Builder(CreateCaBodyStorage createCaBodyStorage) {
      this.ca = createCaBodyStorage.ca;
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
    public Builder(StorageObject ca) {
      this.ca = ca;
    }

    /**
     * Builds a CreateCaBodyStorage.
     *
     * @return the new CreateCaBodyStorage instance
     */
    public CreateCaBodyStorage build() {
      return new CreateCaBodyStorage(this);
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the CreateCaBodyStorage builder
     */
    public Builder ca(StorageObject ca) {
      this.ca = ca;
      return this;
    }
  }

  protected CreateCaBodyStorage(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ca,
      "ca cannot be null");
    ca = builder.ca;
  }

  /**
   * New builder.
   *
   * @return a CreateCaBodyStorage builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public StorageObject ca() {
    return ca;
  }
}

