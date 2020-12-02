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
 * The archiveNotifications options.
 */
public class ArchiveNotificationsOptions extends GenericModel {

  protected List<String> notificationIds;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> notificationIds;

    private Builder(ArchiveNotificationsOptions archiveNotificationsOptions) {
      this.notificationIds = archiveNotificationsOptions.notificationIds;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param notificationIds the notificationIds
     */
    public Builder(List<String> notificationIds) {
      this.notificationIds = notificationIds;
    }

    /**
     * Builds a ArchiveNotificationsOptions.
     *
     * @return the new ArchiveNotificationsOptions instance
     */
    public ArchiveNotificationsOptions build() {
      return new ArchiveNotificationsOptions(this);
    }

    /**
     * Adds an notificationIds to notificationIds.
     *
     * @param notificationIds the new notificationIds
     * @return the ArchiveNotificationsOptions builder
     */
    public Builder addNotificationIds(String notificationIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(notificationIds,
        "notificationIds cannot be null");
      if (this.notificationIds == null) {
        this.notificationIds = new ArrayList<String>();
      }
      this.notificationIds.add(notificationIds);
      return this;
    }

    /**
     * Set the notificationIds.
     * Existing notificationIds will be replaced.
     *
     * @param notificationIds the notificationIds
     * @return the ArchiveNotificationsOptions builder
     */
    public Builder notificationIds(List<String> notificationIds) {
      this.notificationIds = notificationIds;
      return this;
    }
  }

  protected ArchiveNotificationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.notificationIds,
      "notificationIds cannot be null");
    notificationIds = builder.notificationIds;
  }

  /**
   * New builder.
   *
   * @return a ArchiveNotificationsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the notificationIds.
   *
   * Array of notification IDs to archive.
   *
   * @return the notificationIds
   */
  public List<String> notificationIds() {
    return notificationIds;
  }
}

