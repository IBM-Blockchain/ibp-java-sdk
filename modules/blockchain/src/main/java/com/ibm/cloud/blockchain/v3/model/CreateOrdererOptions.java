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
 * The createOrderer options.
 */
public class CreateOrdererOptions extends GenericModel {

  /**
   * The type of Fabric orderer. Currently, only the type `"raft"` is supported.
   * [etcd/raft](/docs/blockchain?topic=blockchain-ibp-console-build-network#ibp-console-build-network-ordering-console).
   */
  public interface OrdererType {
    /** raft. */
    String RAFT = "raft";
  }

  protected String ordererType;
  protected String mspId;
  protected String displayName;
  protected List<CryptoObject> crypto;
  protected String clusterName;
  protected String clusterId;
  protected String externalAppend;
  protected List<ConfigOrdererCreate> configOverride;
  protected CreateOrdererRaftBodyResources resources;
  protected CreateOrdererRaftBodyStorage storage;
  protected String systemChannelId;
  protected List<String> zone;
  protected List<String> tags;
  protected List<String> region;
  protected Hsm hsm;
  protected String version;

  /**
   * Builder.
   */
  public static class Builder {
    private String ordererType;
    private String mspId;
    private String displayName;
    private List<CryptoObject> crypto;
    private String clusterName;
    private String clusterId;
    private String externalAppend;
    private List<ConfigOrdererCreate> configOverride;
    private CreateOrdererRaftBodyResources resources;
    private CreateOrdererRaftBodyStorage storage;
    private String systemChannelId;
    private List<String> zone;
    private List<String> tags;
    private List<String> region;
    private Hsm hsm;
    private String version;

    private Builder(CreateOrdererOptions createOrdererOptions) {
      this.ordererType = createOrdererOptions.ordererType;
      this.mspId = createOrdererOptions.mspId;
      this.displayName = createOrdererOptions.displayName;
      this.crypto = createOrdererOptions.crypto;
      this.clusterName = createOrdererOptions.clusterName;
      this.clusterId = createOrdererOptions.clusterId;
      this.externalAppend = createOrdererOptions.externalAppend;
      this.configOverride = createOrdererOptions.configOverride;
      this.resources = createOrdererOptions.resources;
      this.storage = createOrdererOptions.storage;
      this.systemChannelId = createOrdererOptions.systemChannelId;
      this.zone = createOrdererOptions.zone;
      this.tags = createOrdererOptions.tags;
      this.region = createOrdererOptions.region;
      this.hsm = createOrdererOptions.hsm;
      this.version = createOrdererOptions.version;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ordererType the ordererType
     * @param mspId the mspId
     * @param displayName the displayName
     * @param crypto the crypto
     */
    public Builder(String ordererType, String mspId, String displayName, List<CryptoObject> crypto) {
      this.ordererType = ordererType;
      this.mspId = mspId;
      this.displayName = displayName;
      this.crypto = crypto;
    }

    /**
     * Builds a CreateOrdererOptions.
     *
     * @return the new CreateOrdererOptions instance
     */
    public CreateOrdererOptions build() {
      return new CreateOrdererOptions(this);
    }

    /**
     * Adds an crypto to crypto.
     *
     * @param crypto the new crypto
     * @return the CreateOrdererOptions builder
     */
    public Builder addCrypto(CryptoObject crypto) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(crypto,
        "crypto cannot be null");
      if (this.crypto == null) {
        this.crypto = new ArrayList<CryptoObject>();
      }
      this.crypto.add(crypto);
      return this;
    }

    /**
     * Adds an configOverride to configOverride.
     *
     * @param configOverride the new configOverride
     * @return the CreateOrdererOptions builder
     */
    public Builder addConfigOverride(ConfigOrdererCreate configOverride) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(configOverride,
        "configOverride cannot be null");
      if (this.configOverride == null) {
        this.configOverride = new ArrayList<ConfigOrdererCreate>();
      }
      this.configOverride.add(configOverride);
      return this;
    }

    /**
     * Adds an zone to zone.
     *
     * @param zone the new zone
     * @return the CreateOrdererOptions builder
     */
    public Builder addZone(String zone) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(zone,
        "zone cannot be null");
      if (this.zone == null) {
        this.zone = new ArrayList<String>();
      }
      this.zone.add(zone);
      return this;
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateOrdererOptions builder
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
     * Adds an region to region.
     *
     * @param region the new region
     * @return the CreateOrdererOptions builder
     */
    public Builder addRegion(String region) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(region,
        "region cannot be null");
      if (this.region == null) {
        this.region = new ArrayList<String>();
      }
      this.region.add(region);
      return this;
    }

    /**
     * Set the ordererType.
     *
     * @param ordererType the ordererType
     * @return the CreateOrdererOptions builder
     */
    public Builder ordererType(String ordererType) {
      this.ordererType = ordererType;
      return this;
    }

    /**
     * Set the mspId.
     *
     * @param mspId the mspId
     * @return the CreateOrdererOptions builder
     */
    public Builder mspId(String mspId) {
      this.mspId = mspId;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the CreateOrdererOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the crypto.
     * Existing crypto will be replaced.
     *
     * @param crypto the crypto
     * @return the CreateOrdererOptions builder
     */
    public Builder crypto(List<CryptoObject> crypto) {
      this.crypto = crypto;
      return this;
    }

    /**
     * Set the clusterName.
     *
     * @param clusterName the clusterName
     * @return the CreateOrdererOptions builder
     */
    public Builder clusterName(String clusterName) {
      this.clusterName = clusterName;
      return this;
    }

    /**
     * Set the clusterId.
     *
     * @param clusterId the clusterId
     * @return the CreateOrdererOptions builder
     */
    public Builder clusterId(String clusterId) {
      this.clusterId = clusterId;
      return this;
    }

    /**
     * Set the externalAppend.
     *
     * @param externalAppend the externalAppend
     * @return the CreateOrdererOptions builder
     */
    public Builder externalAppend(String externalAppend) {
      this.externalAppend = externalAppend;
      return this;
    }

    /**
     * Set the configOverride.
     * Existing configOverride will be replaced.
     *
     * @param configOverride the configOverride
     * @return the CreateOrdererOptions builder
     */
    public Builder configOverride(List<ConfigOrdererCreate> configOverride) {
      this.configOverride = configOverride;
      return this;
    }

    /**
     * Set the resources.
     *
     * @param resources the resources
     * @return the CreateOrdererOptions builder
     */
    public Builder resources(CreateOrdererRaftBodyResources resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the storage.
     *
     * @param storage the storage
     * @return the CreateOrdererOptions builder
     */
    public Builder storage(CreateOrdererRaftBodyStorage storage) {
      this.storage = storage;
      return this;
    }

    /**
     * Set the systemChannelId.
     *
     * @param systemChannelId the systemChannelId
     * @return the CreateOrdererOptions builder
     */
    public Builder systemChannelId(String systemChannelId) {
      this.systemChannelId = systemChannelId;
      return this;
    }

    /**
     * Set the zone.
     * Existing zone will be replaced.
     *
     * @param zone the zone
     * @return the CreateOrdererOptions builder
     */
    public Builder zone(List<String> zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateOrdererOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the region.
     * Existing region will be replaced.
     *
     * @param region the region
     * @return the CreateOrdererOptions builder
     */
    public Builder region(List<String> region) {
      this.region = region;
      return this;
    }

    /**
     * Set the hsm.
     *
     * @param hsm the hsm
     * @return the CreateOrdererOptions builder
     */
    public Builder hsm(Hsm hsm) {
      this.hsm = hsm;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the CreateOrdererOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }

  protected CreateOrdererOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ordererType,
      "ordererType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mspId,
      "mspId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crypto,
      "crypto cannot be null");
    ordererType = builder.ordererType;
    mspId = builder.mspId;
    displayName = builder.displayName;
    crypto = builder.crypto;
    clusterName = builder.clusterName;
    clusterId = builder.clusterId;
    externalAppend = builder.externalAppend;
    configOverride = builder.configOverride;
    resources = builder.resources;
    storage = builder.storage;
    systemChannelId = builder.systemChannelId;
    zone = builder.zone;
    tags = builder.tags;
    region = builder.region;
    hsm = builder.hsm;
    version = builder.version;
  }

  /**
   * New builder.
   *
   * @return a CreateOrdererOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ordererType.
   *
   * The type of Fabric orderer. Currently, only the type `"raft"` is supported.
   * [etcd/raft](/docs/blockchain?topic=blockchain-ibp-console-build-network#ibp-console-build-network-ordering-console).
   *
   * @return the ordererType
   */
  public String ordererType() {
    return ordererType;
  }

  /**
   * Gets the mspId.
   *
   * The MSP id that is related to this component.
   *
   * @return the mspId
   */
  public String mspId() {
    return mspId;
  }

  /**
   * Gets the displayName.
   *
   * A descriptive base name for each ordering node. One or more child IBP console tiles display this name.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the crypto.
   *
   * An array of config objects. When creating a new OS (Ordering Service) the array must have one object per desired
   * raft node. 1 or 5 nodes are recommended.
   *
   * **When appending to an existing OS only an array of size 1 is supported.**
   *
   * See this [topic](/docs/blockchain?topic=blockchain-ibp-v2-apis#ibp-v2-apis-config) for instructions on how to build
   * a config object.
   *
   * @return the crypto
   */
  public List<CryptoObject> crypto() {
    return crypto;
  }

  /**
   * Gets the clusterName.
   *
   * A descriptive name for an ordering service. The parent IBP console tile displays this name.
   *
   * This field should only be set if you are creating a new OS cluster or when appending to an unknown (external) OS
   * cluster. An unknown/external cluster is one that this IBP console has not imported or created.
   *
   * @return the clusterName
   */
  public String clusterName() {
    return clusterName;
  }

  /**
   * Gets the clusterId.
   *
   * This field should only be set if you are appending a new raft node to an **existing** raft cluster. When appending
   * to a known (internal) OS cluster set `cluster_id` to the same value used by the OS cluster. When appending to an
   * unknown (external) OS cluster set `cluster_id` to a unique string.
   *
   * Setting this field means the `config` array should be of length 1, since it is not possible to add multiple raft
   * nodes at the same time in Fabric.
   *
   * If this field is set the orderer will be "pre-created" and start without a genesis block. It is effectively dead
   * until it is configured. This is the first step to **append** a node to a raft cluster. The next step is to add this
   * node as a consenter to the system-channel by using Fabric-APIs. Then, init this node by sending the updated
   * system-channel config-block with the [Submit config block to orderer](#submit-block) API. The node will not be
   * usable until these steps are completed.
   *
   * @return the clusterId
   */
  public String clusterId() {
    return clusterId;
  }

  /**
   * Gets the externalAppend.
   *
   * Set to `true` only if you are appending to an unknown (external) OS cluster. Else set it to `false` or omit the
   * field. An unknown/external cluster is one that this IBP console has not imported or created.
   *
   * @return the externalAppend
   */
  public String externalAppend() {
    return externalAppend;
  }

  /**
   * Gets the configOverride.
   *
   * An array of configuration override objects. 1 object per component. Must be the same size as the `config` array.
   *
   * @return the configOverride
   */
  public List<ConfigOrdererCreate> configOverride() {
    return configOverride;
  }

  /**
   * Gets the resources.
   *
   * CPU and memory properties. This feature is not available if using a free Kubernetes cluster.
   *
   * @return the resources
   */
  public CreateOrdererRaftBodyResources resources() {
    return resources;
  }

  /**
   * Gets the storage.
   *
   * Disk space properties. This feature is not available if using a free Kubernetes cluster.
   *
   * @return the storage
   */
  public CreateOrdererRaftBodyStorage storage() {
    return storage;
  }

  /**
   * Gets the systemChannelId.
   *
   * The name of the system channel. Defaults to `testchainid`.
   *
   * @return the systemChannelId
   */
  public String systemChannelId() {
    return systemChannelId;
  }

  /**
   * Gets the zone.
   *
   * An array of Kubernetes zones for the deployment. 1 zone per component. Must be the same size as the `config` array.
   *
   * @return the zone
   */
  public List<String> zone() {
    return zone;
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
   * Gets the region.
   *
   * An array of Kubernetes regions for the deployment. One region per component. Must be the same size as the `config`
   * array.
   *
   * @return the region
   */
  public List<String> region() {
    return region;
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

