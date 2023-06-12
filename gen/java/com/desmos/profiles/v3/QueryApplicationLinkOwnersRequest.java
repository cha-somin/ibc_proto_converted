// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/query_app_links.proto

package com.desmos.profiles.v3;

/**
 * <pre>
 * QueryApplicationLinkOwnersRequest contains the data of the request that can
 * be used to get application link owners
 * </pre>
 *
 * Protobuf type {@code desmos.profiles.v3.QueryApplicationLinkOwnersRequest}
 */
public final class QueryApplicationLinkOwnersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.profiles.v3.QueryApplicationLinkOwnersRequest)
    QueryApplicationLinkOwnersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryApplicationLinkOwnersRequest.newBuilder() to construct.
  private QueryApplicationLinkOwnersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryApplicationLinkOwnersRequest() {
    application_ = "";
    username_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryApplicationLinkOwnersRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.profiles.v3.QueryAppLinksProto.internal_static_desmos_profiles_v3_QueryApplicationLinkOwnersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.profiles.v3.QueryAppLinksProto.internal_static_desmos_profiles_v3_QueryApplicationLinkOwnersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest.class, com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest.Builder.class);
  }

  public static final int APPLICATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object application_ = "";
  /**
   * <pre>
   * (Optional) Application name to search link owners of. If not specified, all
   * links stored will be searched instead.
   * </pre>
   *
   * <code>string application = 1 [json_name = "application"];</code>
   * @return The application.
   */
  @java.lang.Override
  public java.lang.String getApplication() {
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      application_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Optional) Application name to search link owners of. If not specified, all
   * links stored will be searched instead.
   * </pre>
   *
   * <code>string application = 1 [json_name = "application"];</code>
   * @return The bytes for application.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApplicationBytes() {
    java.lang.Object ref = application_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      application_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object username_ = "";
  /**
   * <pre>
   * (Optional) Username to search for. This will only be used if the
   * application is specified as well
   * </pre>
   *
   * <code>string username = 2 [json_name = "username"];</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Optional) Username to search for. This will only be used if the
   * application is specified as well
   * </pre>
   *
   * <code>string username = 2 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGINATION_FIELD_NUMBER = 3;
  private com.cosmos.base.query.v1beta1.PageRequest pagination_;
  /**
   * <pre>
   * Pagination defines an optional pagination for the request
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * Pagination defines an optional pagination for the request
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequest getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * Pagination defines an optional pagination for the request
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(application_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, application_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
    }
    if (pagination_ != null) {
      output.writeMessage(3, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(application_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, application_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPagination());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest)) {
      return super.equals(obj);
    }
    com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest other = (com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest) obj;

    if (!getApplication()
        .equals(other.getApplication())) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + APPLICATION_FIELD_NUMBER;
    hash = (53 * hash) + getApplication().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * QueryApplicationLinkOwnersRequest contains the data of the request that can
   * be used to get application link owners
   * </pre>
   *
   * Protobuf type {@code desmos.profiles.v3.QueryApplicationLinkOwnersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.profiles.v3.QueryApplicationLinkOwnersRequest)
      com.desmos.profiles.v3.QueryApplicationLinkOwnersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.profiles.v3.QueryAppLinksProto.internal_static_desmos_profiles_v3_QueryApplicationLinkOwnersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.profiles.v3.QueryAppLinksProto.internal_static_desmos_profiles_v3_QueryApplicationLinkOwnersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest.class, com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest.Builder.class);
    }

    // Construct using com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      application_ = "";
      username_ = "";
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.profiles.v3.QueryAppLinksProto.internal_static_desmos_profiles_v3_QueryApplicationLinkOwnersRequest_descriptor;
    }

    @java.lang.Override
    public com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest getDefaultInstanceForType() {
      return com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest build() {
      com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest buildPartial() {
      com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest result = new com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.application_ = application_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.username_ = username_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest) {
        return mergeFrom((com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest other) {
      if (other == com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest.getDefaultInstance()) return this;
      if (!other.getApplication().isEmpty()) {
        application_ = other.application_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              application_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              username_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object application_ = "";
    /**
     * <pre>
     * (Optional) Application name to search link owners of. If not specified, all
     * links stored will be searched instead.
     * </pre>
     *
     * <code>string application = 1 [json_name = "application"];</code>
     * @return The application.
     */
    public java.lang.String getApplication() {
      java.lang.Object ref = application_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        application_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Optional) Application name to search link owners of. If not specified, all
     * links stored will be searched instead.
     * </pre>
     *
     * <code>string application = 1 [json_name = "application"];</code>
     * @return The bytes for application.
     */
    public com.google.protobuf.ByteString
        getApplicationBytes() {
      java.lang.Object ref = application_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        application_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Optional) Application name to search link owners of. If not specified, all
     * links stored will be searched instead.
     * </pre>
     *
     * <code>string application = 1 [json_name = "application"];</code>
     * @param value The application to set.
     * @return This builder for chaining.
     */
    public Builder setApplication(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      application_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Application name to search link owners of. If not specified, all
     * links stored will be searched instead.
     * </pre>
     *
     * <code>string application = 1 [json_name = "application"];</code>
     * @return This builder for chaining.
     */
    public Builder clearApplication() {
      application_ = getDefaultInstance().getApplication();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Application name to search link owners of. If not specified, all
     * links stored will be searched instead.
     * </pre>
     *
     * <code>string application = 1 [json_name = "application"];</code>
     * @param value The bytes for application to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      application_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <pre>
     * (Optional) Username to search for. This will only be used if the
     * application is specified as well
     * </pre>
     *
     * <code>string username = 2 [json_name = "username"];</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Optional) Username to search for. This will only be used if the
     * application is specified as well
     * </pre>
     *
     * <code>string username = 2 [json_name = "username"];</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Optional) Username to search for. This will only be used if the
     * application is specified as well
     * </pre>
     *
     * <code>string username = 2 [json_name = "username"];</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      username_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Username to search for. This will only be used if the
     * application is specified as well
     * </pre>
     *
     * <code>string username = 2 [json_name = "username"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      username_ = getDefaultInstance().getUsername();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Username to search for. This will only be used if the
     * application is specified as well
     * </pre>
     *
     * <code>string username = 2 [json_name = "username"];</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      username_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.cosmos.base.query.v1beta1.PageRequest pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * Pagination defines an optional pagination for the request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Pagination defines an optional pagination for the request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageRequest getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Pagination defines an optional pagination for the request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pagination defines an optional pagination for the request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageRequest.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pagination defines an optional pagination for the request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pagination defines an optional pagination for the request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pagination defines an optional pagination for the request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequest.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Pagination defines an optional pagination for the request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * Pagination defines an optional pagination for the request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:desmos.profiles.v3.QueryApplicationLinkOwnersRequest)
  }

  // @@protoc_insertion_point(class_scope:desmos.profiles.v3.QueryApplicationLinkOwnersRequest)
  private static final com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest();
  }

  public static com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryApplicationLinkOwnersRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryApplicationLinkOwnersRequest>() {
    @java.lang.Override
    public QueryApplicationLinkOwnersRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<QueryApplicationLinkOwnersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryApplicationLinkOwnersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

