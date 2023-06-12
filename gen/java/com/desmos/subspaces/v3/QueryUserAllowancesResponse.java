// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/subspaces/v3/query.proto

package com.desmos.subspaces.v3;

/**
 * <pre>
 * QueryUserAllowancesResponse is the response type for the Query/UserAllowances
 * RPC method
 * </pre>
 *
 * Protobuf type {@code desmos.subspaces.v3.QueryUserAllowancesResponse}
 */
public final class QueryUserAllowancesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.subspaces.v3.QueryUserAllowancesResponse)
    QueryUserAllowancesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryUserAllowancesResponse.newBuilder() to construct.
  private QueryUserAllowancesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryUserAllowancesResponse() {
    grants_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryUserAllowancesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserAllowancesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserAllowancesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.subspaces.v3.QueryUserAllowancesResponse.class, com.desmos.subspaces.v3.QueryUserAllowancesResponse.Builder.class);
  }

  public static final int GRANTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.desmos.subspaces.v3.Grant> grants_;
  /**
   * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.desmos.subspaces.v3.Grant> getGrantsList() {
    return grants_;
  }
  /**
   * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.desmos.subspaces.v3.GrantOrBuilder> 
      getGrantsOrBuilderList() {
    return grants_;
  }
  /**
   * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
   */
  @java.lang.Override
  public int getGrantsCount() {
    return grants_.size();
  }
  /**
   * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
   */
  @java.lang.Override
  public com.desmos.subspaces.v3.Grant getGrants(int index) {
    return grants_.get(index);
  }
  /**
   * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
   */
  @java.lang.Override
  public com.desmos.subspaces.v3.GrantOrBuilder getGrantsOrBuilder(
      int index) {
    return grants_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines an pagination for the response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines an pagination for the response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines an pagination for the response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < grants_.size(); i++) {
      output.writeMessage(1, grants_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < grants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, grants_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.desmos.subspaces.v3.QueryUserAllowancesResponse)) {
      return super.equals(obj);
    }
    com.desmos.subspaces.v3.QueryUserAllowancesResponse other = (com.desmos.subspaces.v3.QueryUserAllowancesResponse) obj;

    if (!getGrantsList()
        .equals(other.getGrantsList())) return false;
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
    if (getGrantsCount() > 0) {
      hash = (37 * hash) + GRANTS_FIELD_NUMBER;
      hash = (53 * hash) + getGrantsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse parseFrom(
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
  public static Builder newBuilder(com.desmos.subspaces.v3.QueryUserAllowancesResponse prototype) {
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
   * QueryUserAllowancesResponse is the response type for the Query/UserAllowances
   * RPC method
   * </pre>
   *
   * Protobuf type {@code desmos.subspaces.v3.QueryUserAllowancesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.subspaces.v3.QueryUserAllowancesResponse)
      com.desmos.subspaces.v3.QueryUserAllowancesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserAllowancesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserAllowancesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.subspaces.v3.QueryUserAllowancesResponse.class, com.desmos.subspaces.v3.QueryUserAllowancesResponse.Builder.class);
    }

    // Construct using com.desmos.subspaces.v3.QueryUserAllowancesResponse.newBuilder()
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
      if (grantsBuilder_ == null) {
        grants_ = java.util.Collections.emptyList();
      } else {
        grants_ = null;
        grantsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
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
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserAllowancesResponse_descriptor;
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QueryUserAllowancesResponse getDefaultInstanceForType() {
      return com.desmos.subspaces.v3.QueryUserAllowancesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QueryUserAllowancesResponse build() {
      com.desmos.subspaces.v3.QueryUserAllowancesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QueryUserAllowancesResponse buildPartial() {
      com.desmos.subspaces.v3.QueryUserAllowancesResponse result = new com.desmos.subspaces.v3.QueryUserAllowancesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.desmos.subspaces.v3.QueryUserAllowancesResponse result) {
      if (grantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          grants_ = java.util.Collections.unmodifiableList(grants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.grants_ = grants_;
      } else {
        result.grants_ = grantsBuilder_.build();
      }
    }

    private void buildPartial0(com.desmos.subspaces.v3.QueryUserAllowancesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.subspaces.v3.QueryUserAllowancesResponse) {
        return mergeFrom((com.desmos.subspaces.v3.QueryUserAllowancesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.subspaces.v3.QueryUserAllowancesResponse other) {
      if (other == com.desmos.subspaces.v3.QueryUserAllowancesResponse.getDefaultInstance()) return this;
      if (grantsBuilder_ == null) {
        if (!other.grants_.isEmpty()) {
          if (grants_.isEmpty()) {
            grants_ = other.grants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGrantsIsMutable();
            grants_.addAll(other.grants_);
          }
          onChanged();
        }
      } else {
        if (!other.grants_.isEmpty()) {
          if (grantsBuilder_.isEmpty()) {
            grantsBuilder_.dispose();
            grantsBuilder_ = null;
            grants_ = other.grants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            grantsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGrantsFieldBuilder() : null;
          } else {
            grantsBuilder_.addAllMessages(other.grants_);
          }
        }
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
              com.desmos.subspaces.v3.Grant m =
                  input.readMessage(
                      com.desmos.subspaces.v3.Grant.parser(),
                      extensionRegistry);
              if (grantsBuilder_ == null) {
                ensureGrantsIsMutable();
                grants_.add(m);
              } else {
                grantsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<com.desmos.subspaces.v3.Grant> grants_ =
      java.util.Collections.emptyList();
    private void ensureGrantsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        grants_ = new java.util.ArrayList<com.desmos.subspaces.v3.Grant>(grants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.desmos.subspaces.v3.Grant, com.desmos.subspaces.v3.Grant.Builder, com.desmos.subspaces.v3.GrantOrBuilder> grantsBuilder_;

    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public java.util.List<com.desmos.subspaces.v3.Grant> getGrantsList() {
      if (grantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(grants_);
      } else {
        return grantsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public int getGrantsCount() {
      if (grantsBuilder_ == null) {
        return grants_.size();
      } else {
        return grantsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public com.desmos.subspaces.v3.Grant getGrants(int index) {
      if (grantsBuilder_ == null) {
        return grants_.get(index);
      } else {
        return grantsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public Builder setGrants(
        int index, com.desmos.subspaces.v3.Grant value) {
      if (grantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGrantsIsMutable();
        grants_.set(index, value);
        onChanged();
      } else {
        grantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public Builder setGrants(
        int index, com.desmos.subspaces.v3.Grant.Builder builderForValue) {
      if (grantsBuilder_ == null) {
        ensureGrantsIsMutable();
        grants_.set(index, builderForValue.build());
        onChanged();
      } else {
        grantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public Builder addGrants(com.desmos.subspaces.v3.Grant value) {
      if (grantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGrantsIsMutable();
        grants_.add(value);
        onChanged();
      } else {
        grantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public Builder addGrants(
        int index, com.desmos.subspaces.v3.Grant value) {
      if (grantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGrantsIsMutable();
        grants_.add(index, value);
        onChanged();
      } else {
        grantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public Builder addGrants(
        com.desmos.subspaces.v3.Grant.Builder builderForValue) {
      if (grantsBuilder_ == null) {
        ensureGrantsIsMutable();
        grants_.add(builderForValue.build());
        onChanged();
      } else {
        grantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public Builder addGrants(
        int index, com.desmos.subspaces.v3.Grant.Builder builderForValue) {
      if (grantsBuilder_ == null) {
        ensureGrantsIsMutable();
        grants_.add(index, builderForValue.build());
        onChanged();
      } else {
        grantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public Builder addAllGrants(
        java.lang.Iterable<? extends com.desmos.subspaces.v3.Grant> values) {
      if (grantsBuilder_ == null) {
        ensureGrantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, grants_);
        onChanged();
      } else {
        grantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public Builder clearGrants() {
      if (grantsBuilder_ == null) {
        grants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        grantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public Builder removeGrants(int index) {
      if (grantsBuilder_ == null) {
        ensureGrantsIsMutable();
        grants_.remove(index);
        onChanged();
      } else {
        grantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public com.desmos.subspaces.v3.Grant.Builder getGrantsBuilder(
        int index) {
      return getGrantsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public com.desmos.subspaces.v3.GrantOrBuilder getGrantsOrBuilder(
        int index) {
      if (grantsBuilder_ == null) {
        return grants_.get(index);  } else {
        return grantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public java.util.List<? extends com.desmos.subspaces.v3.GrantOrBuilder> 
         getGrantsOrBuilderList() {
      if (grantsBuilder_ != null) {
        return grantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(grants_);
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public com.desmos.subspaces.v3.Grant.Builder addGrantsBuilder() {
      return getGrantsFieldBuilder().addBuilder(
          com.desmos.subspaces.v3.Grant.getDefaultInstance());
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public com.desmos.subspaces.v3.Grant.Builder addGrantsBuilder(
        int index) {
      return getGrantsFieldBuilder().addBuilder(
          index, com.desmos.subspaces.v3.Grant.getDefaultInstance());
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Grant grants = 1 [json_name = "grants", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"grants&#92;""];</code>
     */
    public java.util.List<com.desmos.subspaces.v3.Grant.Builder> 
         getGrantsBuilderList() {
      return getGrantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.desmos.subspaces.v3.Grant, com.desmos.subspaces.v3.Grant.Builder, com.desmos.subspaces.v3.GrantOrBuilder> 
        getGrantsFieldBuilder() {
      if (grantsBuilder_ == null) {
        grantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.desmos.subspaces.v3.Grant, com.desmos.subspaces.v3.Grant.Builder, com.desmos.subspaces.v3.GrantOrBuilder>(
                grants_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        grants_ = null;
      }
      return grantsBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines an pagination for the response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination defines an pagination for the response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination defines an pagination for the response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines an pagination for the response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines an pagination for the response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines an pagination for the response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * pagination defines an pagination for the response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines an pagination for the response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * pagination defines an pagination for the response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:desmos.subspaces.v3.QueryUserAllowancesResponse)
  }

  // @@protoc_insertion_point(class_scope:desmos.subspaces.v3.QueryUserAllowancesResponse)
  private static final com.desmos.subspaces.v3.QueryUserAllowancesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.subspaces.v3.QueryUserAllowancesResponse();
  }

  public static com.desmos.subspaces.v3.QueryUserAllowancesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryUserAllowancesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryUserAllowancesResponse>() {
    @java.lang.Override
    public QueryUserAllowancesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryUserAllowancesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryUserAllowancesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.subspaces.v3.QueryUserAllowancesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

