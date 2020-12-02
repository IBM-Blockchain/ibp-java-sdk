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
 * The getPostman options.
 */
public class GetPostmanOptions extends GenericModel {

  /**
   * - **bearer** - IAM Bearer Auth - *[Available on IBM Cloud]* - The same bearer token used to authenticate this
   * request will be copied into the Postman collection examples. The query parameter `token` must also be set with your
   * IAM bearer/access token value.
   * - **api_key** - IAM Api Key Auth - *[Available on IBM Cloud]* - The IAM api key will be copied into the Postman
   * collection examples. The query parameter `api_key` must also be set with your IAM API Key value.
   * - **basic** - Basic Auth - *[Available on OpenShift &amp; IBM Cloud Private]* - A basic auth username and password
   * will be copied into the Postman collection examples. The query parameters `username` &amp; `password` must also be
   * set with your IBP api key credentials. The IBP api key is the username and the api secret is the password.
   */
  public interface AuthType {
    /** bearer. */
    String BEARER = "bearer";
    /** api_key. */
    String API_KEY = "api_key";
    /** basic. */
    String BASIC = "basic";
  }

  protected String authType;
  protected String token;
  protected String apiKey;
  protected String username;
  protected String password;

  /**
   * Builder.
   */
  public static class Builder {
    private String authType;
    private String token;
    private String apiKey;
    private String username;
    private String password;

    private Builder(GetPostmanOptions getPostmanOptions) {
      this.authType = getPostmanOptions.authType;
      this.token = getPostmanOptions.token;
      this.apiKey = getPostmanOptions.apiKey;
      this.username = getPostmanOptions.username;
      this.password = getPostmanOptions.password;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param authType the authType
     */
    public Builder(String authType) {
      this.authType = authType;
    }

    /**
     * Builds a GetPostmanOptions.
     *
     * @return the new GetPostmanOptions instance
     */
    public GetPostmanOptions build() {
      return new GetPostmanOptions(this);
    }

    /**
     * Set the authType.
     *
     * @param authType the authType
     * @return the GetPostmanOptions builder
     */
    public Builder authType(String authType) {
      this.authType = authType;
      return this;
    }

    /**
     * Set the token.
     *
     * @param token the token
     * @return the GetPostmanOptions builder
     */
    public Builder token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the GetPostmanOptions builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the GetPostmanOptions builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the GetPostmanOptions builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }
  }

  protected GetPostmanOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authType,
      "authType cannot be null");
    authType = builder.authType;
    token = builder.token;
    apiKey = builder.apiKey;
    username = builder.username;
    password = builder.password;
  }

  /**
   * New builder.
   *
   * @return a GetPostmanOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authType.
   *
   * - **bearer** - IAM Bearer Auth - *[Available on IBM Cloud]* - The same bearer token used to authenticate this
   * request will be copied into the Postman collection examples. The query parameter `token` must also be set with your
   * IAM bearer/access token value.
   * - **api_key** - IAM Api Key Auth - *[Available on IBM Cloud]* - The IAM api key will be copied into the Postman
   * collection examples. The query parameter `api_key` must also be set with your IAM API Key value.
   * - **basic** - Basic Auth - *[Available on OpenShift &amp; IBM Cloud Private]* - A basic auth username and password
   * will be copied into the Postman collection examples. The query parameters `username` &amp; `password` must also be
   * set with your IBP api key credentials. The IBP api key is the username and the api secret is the password.
   *
   * @return the authType
   */
  public String authType() {
    return authType;
  }

  /**
   * Gets the token.
   *
   * The IAM access/bearer token to use for auth in the collection.
   *
   * @return the token
   */
  public String token() {
    return token;
  }

  /**
   * Gets the apiKey.
   *
   * The IAM api key to use for auth in the collection.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }

  /**
   * Gets the username.
   *
   * The basic auth username to use for auth in the collection.
   *
   * @return the username
   */
  public String username() {
    return username;
  }

  /**
   * Gets the password.
   *
   * The basic auth password to use for auth in the collection.
   *
   * @return the password
   */
  public String password() {
    return password;
  }
}

