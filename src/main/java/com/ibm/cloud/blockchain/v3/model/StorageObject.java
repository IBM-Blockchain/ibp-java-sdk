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
 * StorageObject.
 */
public class StorageObject extends GenericModel {

  protected String size;
  @SerializedName("class")
  protected String xClass;

  /**
   * Builder.
   */
  public static class Builder {
    private String size;
    private String xClass;

    private Builder(StorageObject storageObject) {
      this.size = storageObject.size;
      this.xClass = storageObject.xClass;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a StorageObject.
     *
     * @return the new StorageObject instance
     */
    public StorageObject build() {
      return new StorageObject(this);
    }

    /**
     * Set the size.
     *
     * @param size the size
     * @return the StorageObject builder
     */
    public Builder size(String size) {
      this.size = size;
      return this;
    }

    /**
     * Set the xClass.
     *
     * @param xClass the xClass
     * @return the StorageObject builder
     */
    public Builder xClass(String xClass) {
      this.xClass = xClass;
      return this;
    }
  }

  protected StorageObject(Builder builder) {
    size = builder.size;
    xClass = builder.xClass;
  }

  /**
   * New builder.
   *
   * @return a StorageObject builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the size.
   *
   * Maximum disk space for subcomponent. [Resource
   * details](/docs/blockchain?topic=blockchain-ibp-console-govern-components#ibp-console-govern-components-allocate-resources).
   *
   * @return the size
   */
  public String size() {
    return size;
  }

  /**
   * Gets the xClass.
   *
   * Kubernetes storage class for subcomponent's disk space.
   *
   * @return the xClass
   */
  public String xClass() {
    return xClass;
  }
}

