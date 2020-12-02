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
 * ResourceRequests.
 */
public class ResourceRequests extends GenericModel {

  protected String cpu;
  protected String memory;

  /**
   * Builder.
   */
  public static class Builder {
    private String cpu;
    private String memory;

    private Builder(ResourceRequests resourceRequests) {
      this.cpu = resourceRequests.cpu;
      this.memory = resourceRequests.memory;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResourceRequests.
     *
     * @return the new ResourceRequests instance
     */
    public ResourceRequests build() {
      return new ResourceRequests(this);
    }

    /**
     * Set the cpu.
     *
     * @param cpu the cpu
     * @return the ResourceRequests builder
     */
    public Builder cpu(String cpu) {
      this.cpu = cpu;
      return this;
    }

    /**
     * Set the memory.
     *
     * @param memory the memory
     * @return the ResourceRequests builder
     */
    public Builder memory(String memory) {
      this.memory = memory;
      return this;
    }
  }

  protected ResourceRequests(Builder builder) {
    cpu = builder.cpu;
    memory = builder.memory;
  }

  /**
   * New builder.
   *
   * @return a ResourceRequests builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cpu.
   *
   * Desired CPU for subcomponent. [Resource
   * details](/docs/blockchain?topic=blockchain-ibp-console-govern-components#ibp-console-govern-components-allocate-resources).
   *
   * @return the cpu
   */
  public String cpu() {
    return cpu;
  }

  /**
   * Gets the memory.
   *
   * Desired memory for subcomponent. [Resource
   * details](/docs/blockchain?topic=blockchain-ibp-console-govern-components#ibp-console-govern-components-allocate-resources).
   *
   * @return the memory
   */
  public String memory() {
    return memory;
  }
}

