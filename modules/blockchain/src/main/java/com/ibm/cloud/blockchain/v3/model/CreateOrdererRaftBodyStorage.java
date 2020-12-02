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
public class CreateOrdererRaftBodyStorage extends GenericModel {

  protected StorageObject orderer;

  /**
   * Builder.
   */
  public static class Builder {
    private StorageObject orderer;

    private Builder(CreateOrdererRaftBodyStorage createOrdererRaftBodyStorage) {
      this.orderer = createOrdererRaftBodyStorage.orderer;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param orderer the orderer
     */
    public Builder(StorageObject orderer) {
      this.orderer = orderer;
    }

    /**
     * Builds a CreateOrdererRaftBodyStorage.
     *
     * @return the new CreateOrdererRaftBodyStorage instance
     */
    public CreateOrdererRaftBodyStorage build() {
      return new CreateOrdererRaftBodyStorage(this);
    }

    /**
     * Set the orderer.
     *
     * @param orderer the orderer
     * @return the CreateOrdererRaftBodyStorage builder
     */
    public Builder orderer(StorageObject orderer) {
      this.orderer = orderer;
      return this;
    }
  }

  protected CreateOrdererRaftBodyStorage(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.orderer,
      "orderer cannot be null");
    orderer = builder.orderer;
  }

  /**
   * New builder.
   *
   * @return a CreateOrdererRaftBodyStorage builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the orderer.
   *
   * @return the orderer
   */
  public StorageObject orderer() {
    return orderer;
  }
}

