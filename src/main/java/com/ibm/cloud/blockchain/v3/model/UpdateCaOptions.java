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
 * The updateCa options.
 */
public class UpdateCaOptions extends GenericModel {

  protected String id;
  protected UpdateCaBodyConfigOverride configOverride;
  protected Double replicas;
  protected UpdateCaBodyResources resources;
  protected String version;
  protected String zone;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private UpdateCaBodyConfigOverride configOverride;
    private Double replicas;
    private UpdateCaBodyResources resources;
    private String version;
    private String zone;

    private Builder(UpdateCaOptions updateCaOptions) {
      this.id = updateCaOptions.id;
      this.configOverride = updateCaOptions.configOverride;
      this.replicas = updateCaOptions.replicas;
      this.resources = updateCaOptions.resources;
      this.version = updateCaOptions.version;
      this.zone = updateCaOptions.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateCaOptions.
     *
     * @return the new UpdateCaOptions instance
     */
    public UpdateCaOptions build() {
      return new UpdateCaOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateCaOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the configOverride.
     *
     * @param configOverride the configOverride
     * @return the UpdateCaOptions builder
     */
    public Builder configOverride(UpdateCaBodyConfigOverride configOverride) {
      this.configOverride = configOverride;
      return this;
    }

    /**
     * Set the replicas.
     *
     * @param replicas the replicas
     * @return the UpdateCaOptions builder
     */
    public Builder replicas(Double replicas) {
      this.replicas = replicas;
      return this;
    }

    /**
     * Set the resources.
     *
     * @param resources the resources
     * @return the UpdateCaOptions builder
     */
    public Builder resources(UpdateCaBodyResources resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the UpdateCaOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the UpdateCaOptions builder
     */
    public Builder zone(String zone) {
      this.zone = zone;
      return this;
    }
  }

  protected UpdateCaOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    configOverride = builder.configOverride;
    replicas = builder.replicas;
    resources = builder.resources;
    version = builder.version;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a UpdateCaOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The `id` of the component to modify. Use the [Get all components](#list_components) API to determine the component
   * id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the configOverride.
   *
   * Update the [Fabric CA configuration
   * file](https://hyperledger-fabric-ca.readthedocs.io/en/release-1.4/serverconfig.html) if you want use custom
   * attributes to configure advanced CA features. Omit if not.
   *
   * *The field **names** below are not case-sensitive.*.
   *
   * @return the configOverride
   */
  public UpdateCaBodyConfigOverride configOverride() {
    return configOverride;
  }

  /**
   * Gets the replicas.
   *
   * The number of replica pods running at any given time.
   *
   * @return the replicas
   */
  public Double replicas() {
    return replicas;
  }

  /**
   * Gets the resources.
   *
   * CPU and memory properties. This feature is not available if using a free Kubernetes cluster.
   *
   * @return the resources
   */
  public UpdateCaBodyResources resources() {
    return resources;
  }

  /**
   * Gets the version.
   *
   * The Hyperledger Fabric release version to update to.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the zone.
   *
   * Specify the Kubernetes zone for the deployment. The deployment will use a k8s node in this zone. Find the list of
   * possible zones by retrieving your Kubernetes node labels: `kubectl get nodes --show-labels`. [More
   * information](https://kubernetes.io/docs/setup/best-practices/multiple-zones).
   *
   * @return the zone
   */
  public String zone() {
    return zone;
  }
}

