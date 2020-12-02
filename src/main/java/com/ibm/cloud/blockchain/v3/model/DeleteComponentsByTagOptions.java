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
 * The deleteComponentsByTag options.
 */
public class DeleteComponentsByTagOptions extends GenericModel {

  protected String tag;

  /**
   * Builder.
   */
  public static class Builder {
    private String tag;

    private Builder(DeleteComponentsByTagOptions deleteComponentsByTagOptions) {
      this.tag = deleteComponentsByTagOptions.tag;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param tag the tag
     */
    public Builder(String tag) {
      this.tag = tag;
    }

    /**
     * Builds a DeleteComponentsByTagOptions.
     *
     * @return the new DeleteComponentsByTagOptions instance
     */
    public DeleteComponentsByTagOptions build() {
      return new DeleteComponentsByTagOptions(this);
    }

    /**
     * Set the tag.
     *
     * @param tag the tag
     * @return the DeleteComponentsByTagOptions builder
     */
    public Builder tag(String tag) {
      this.tag = tag;
      return this;
    }
  }

  protected DeleteComponentsByTagOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tag,
      "tag cannot be empty");
    tag = builder.tag;
  }

  /**
   * New builder.
   *
   * @return a DeleteComponentsByTagOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the tag.
   *
   * The tag to filter components on. Not case-sensitive.
   *
   * @return the tag
   */
  public String tag() {
    return tag;
  }
}

