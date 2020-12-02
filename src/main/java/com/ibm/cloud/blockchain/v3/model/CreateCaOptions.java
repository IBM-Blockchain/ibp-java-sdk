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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createCa options.
 */
public class CreateCaOptions extends GenericModel {

  protected String displayName;
  protected CreateCaBodyConfigOverride configOverride;
  protected CreateCaBodyResources resources;
  protected CreateCaBodyStorage storage;
  protected String zone;
  protected Double replicas;
  protected List<String> tags;
  protected Hsm hsm;
  protected String region;
  protected String version;

  /**
   * Builder.
   */
  public static class Builder {
    private String displayName;
    private CreateCaBodyConfigOverride configOverride;
    private CreateCaBodyResources resources;
    private CreateCaBodyStorage storage;
    private String zone;
    private Double replicas;
    private List<String> tags;
    private Hsm hsm;
    private String region;
    private String version;

    private Builder(CreateCaOptions createCaOptions) {
      this.displayName = createCaOptions.displayName;
      this.configOverride = createCaOptions.configOverride;
      this.resources = createCaOptions.resources;
      this.storage = createCaOptions.storage;
      this.zone = createCaOptions.zone;
      this.replicas = createCaOptions.replicas;
      this.tags = createCaOptions.tags;
      this.hsm = createCaOptions.hsm;
      this.region = createCaOptions.region;
      this.version = createCaOptions.version;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param displayName the displayName
     * @param configOverride the configOverride
     */
    public Builder(String displayName, CreateCaBodyConfigOverride configOverride) {
      this.displayName = displayName;
      this.configOverride = configOverride;
    }

    /**
     * Builds a CreateCaOptions.
     *
     * @return the new CreateCaOptions instance
     */
    public CreateCaOptions build() {
      return new CreateCaOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateCaOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the CreateCaOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the configOverride.
     *
     * @param configOverride the configOverride
     * @return the CreateCaOptions builder
     */
    public Builder configOverride(CreateCaBodyConfigOverride configOverride) {
      this.configOverride = configOverride;
      return this;
    }

    /**
     * Set the resources.
     *
     * @param resources the resources
     * @return the CreateCaOptions builder
     */
    public Builder resources(CreateCaBodyResources resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the storage.
     *
     * @param storage the storage
     * @return the CreateCaOptions builder
     */
    public Builder storage(CreateCaBodyStorage storage) {
      this.storage = storage;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreateCaOptions builder
     */
    public Builder zone(String zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the replicas.
     *
     * @param replicas the replicas
     * @return the CreateCaOptions builder
     */
    public Builder replicas(Double replicas) {
      this.replicas = replicas;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateCaOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the hsm.
     *
     * @param hsm the hsm
     * @return the CreateCaOptions builder
     */
    public Builder hsm(Hsm hsm) {
      this.hsm = hsm;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the CreateCaOptions builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the CreateCaOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }

  protected CreateCaOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configOverride,
      "configOverride cannot be null");
    displayName = builder.displayName;
    configOverride = builder.configOverride;
    resources = builder.resources;
    storage = builder.storage;
    zone = builder.zone;
    replicas = builder.replicas;
    tags = builder.tags;
    hsm = builder.hsm;
    region = builder.region;
    version = builder.version;
  }

  /**
   * New builder.
   *
   * @return a CreateCaOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the displayName.
   *
   * A descriptive name for this CA. The IBP console tile displays this name.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the configOverride.
   *
   * Set `config_override` to create the root/initial enroll id and enroll secret as well as enabling custom CA
   * configurations (such as using postgres). See the [Fabric CA configuration
   * file](https://hyperledger-fabric-ca.readthedocs.io/en/release-1.4/serverconfig.html) for more information about
   * each parameter.
   *
   * The field `tlsca` is optional. The IBP console will copy the value of `config_override.ca` into
   * `config_override.tlsca` if `config_override.tlsca` is omitted (which is recommended).
   *
   * *The field **names** below are not case-sensitive.*.
   *
   * @return the configOverride
   */
  public CreateCaBodyConfigOverride configOverride() {
    return configOverride;
  }

  /**
   * Gets the resources.
   *
   * CPU and memory properties. This feature is not available if using a free Kubernetes cluster.
   *
   * @return the resources
   */
  public CreateCaBodyResources resources() {
    return resources;
  }

  /**
   * Gets the storage.
   *
   * Disk space properties. This feature is not available if using a free Kubernetes cluster.
   *
   * @return the storage
   */
  public CreateCaBodyStorage storage() {
    return storage;
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
   * Gets the tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the hsm.
   *
   * The connection details of the HSM (Hardware Security Module).
   *
   * @return the hsm
   */
  public Hsm hsm() {
    return hsm;
  }

  /**
   * Gets the region.
   *
   * Specify the Kubernetes region for the deployment. The deployment will use a k8s node in this region. Find the list
   * of possible regions by retrieving your Kubernetes node labels: `kubectl get nodes --show-labels`. [More
   * info](https://kubernetes.io/docs/setup/best-practices/multiple-zones).
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the version.
   *
   * The Hyperledger Fabric release version to use.
   *
   * @return the version
   */
  public String version() {
    return version;
  }
}

