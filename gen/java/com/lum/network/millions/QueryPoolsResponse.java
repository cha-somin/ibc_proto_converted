// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/query.proto

package com.lum.network.millions;

/**
 * Protobuf type {@code lum.network.millions.QueryPoolsResponse}
 */
public final class QueryPoolsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lum.network.millions.QueryPoolsResponse)
    QueryPoolsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPoolsResponse.newBuilder() to construct.
  private QueryPoolsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPoolsResponse() {
    pools_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPoolsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lum.network.millions.QueryProto.internal_static_lum_network_millions_QueryPoolsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lum.network.millions.QueryProto.internal_static_lum_network_millions_QueryPoolsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lum.network.millions.QueryPoolsResponse.class, com.lum.network.millions.QueryPoolsResponse.Builder.class);
  }

  public static final int POOLS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.lum.network.millions.Pool> pools_;
  /**
   * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.lum.network.millions.Pool> getPoolsList() {
    return pools_;
  }
  /**
   * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.lum.network.millions.PoolOrBuilder> 
      getPoolsOrBuilderList() {
    return pools_;
  }
  /**
   * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getPoolsCount() {
    return pools_.size();
  }
  /**
   * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.lum.network.millions.Pool getPools(int index) {
    return pools_.get(index);
  }
  /**
   * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.lum.network.millions.PoolOrBuilder getPoolsOrBuilder(
      int index) {
    return pools_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
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
    for (int i = 0; i < pools_.size(); i++) {
      output.writeMessage(1, pools_.get(i));
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
    for (int i = 0; i < pools_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, pools_.get(i));
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
    if (!(obj instanceof com.lum.network.millions.QueryPoolsResponse)) {
      return super.equals(obj);
    }
    com.lum.network.millions.QueryPoolsResponse other = (com.lum.network.millions.QueryPoolsResponse) obj;

    if (!getPoolsList()
        .equals(other.getPoolsList())) return false;
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
    if (getPoolsCount() > 0) {
      hash = (37 * hash) + POOLS_FIELD_NUMBER;
      hash = (53 * hash) + getPoolsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lum.network.millions.QueryPoolsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.QueryPoolsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.QueryPoolsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.QueryPoolsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.QueryPoolsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.QueryPoolsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.QueryPoolsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.millions.QueryPoolsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.lum.network.millions.QueryPoolsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.lum.network.millions.QueryPoolsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lum.network.millions.QueryPoolsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.millions.QueryPoolsResponse parseFrom(
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
  public static Builder newBuilder(com.lum.network.millions.QueryPoolsResponse prototype) {
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
   * Protobuf type {@code lum.network.millions.QueryPoolsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lum.network.millions.QueryPoolsResponse)
      com.lum.network.millions.QueryPoolsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lum.network.millions.QueryProto.internal_static_lum_network_millions_QueryPoolsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lum.network.millions.QueryProto.internal_static_lum_network_millions_QueryPoolsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lum.network.millions.QueryPoolsResponse.class, com.lum.network.millions.QueryPoolsResponse.Builder.class);
    }

    // Construct using com.lum.network.millions.QueryPoolsResponse.newBuilder()
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
      if (poolsBuilder_ == null) {
        pools_ = java.util.Collections.emptyList();
      } else {
        pools_ = null;
        poolsBuilder_.clear();
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
      return com.lum.network.millions.QueryProto.internal_static_lum_network_millions_QueryPoolsResponse_descriptor;
    }

    @java.lang.Override
    public com.lum.network.millions.QueryPoolsResponse getDefaultInstanceForType() {
      return com.lum.network.millions.QueryPoolsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.lum.network.millions.QueryPoolsResponse build() {
      com.lum.network.millions.QueryPoolsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.lum.network.millions.QueryPoolsResponse buildPartial() {
      com.lum.network.millions.QueryPoolsResponse result = new com.lum.network.millions.QueryPoolsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.lum.network.millions.QueryPoolsResponse result) {
      if (poolsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pools_ = java.util.Collections.unmodifiableList(pools_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pools_ = pools_;
      } else {
        result.pools_ = poolsBuilder_.build();
      }
    }

    private void buildPartial0(com.lum.network.millions.QueryPoolsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lum.network.millions.QueryPoolsResponse) {
        return mergeFrom((com.lum.network.millions.QueryPoolsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lum.network.millions.QueryPoolsResponse other) {
      if (other == com.lum.network.millions.QueryPoolsResponse.getDefaultInstance()) return this;
      if (poolsBuilder_ == null) {
        if (!other.pools_.isEmpty()) {
          if (pools_.isEmpty()) {
            pools_ = other.pools_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePoolsIsMutable();
            pools_.addAll(other.pools_);
          }
          onChanged();
        }
      } else {
        if (!other.pools_.isEmpty()) {
          if (poolsBuilder_.isEmpty()) {
            poolsBuilder_.dispose();
            poolsBuilder_ = null;
            pools_ = other.pools_;
            bitField0_ = (bitField0_ & ~0x00000001);
            poolsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPoolsFieldBuilder() : null;
          } else {
            poolsBuilder_.addAllMessages(other.pools_);
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
              com.lum.network.millions.Pool m =
                  input.readMessage(
                      com.lum.network.millions.Pool.parser(),
                      extensionRegistry);
              if (poolsBuilder_ == null) {
                ensurePoolsIsMutable();
                pools_.add(m);
              } else {
                poolsBuilder_.addMessage(m);
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

    private java.util.List<com.lum.network.millions.Pool> pools_ =
      java.util.Collections.emptyList();
    private void ensurePoolsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pools_ = new java.util.ArrayList<com.lum.network.millions.Pool>(pools_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.lum.network.millions.Pool, com.lum.network.millions.Pool.Builder, com.lum.network.millions.PoolOrBuilder> poolsBuilder_;

    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.lum.network.millions.Pool> getPoolsList() {
      if (poolsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pools_);
      } else {
        return poolsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public int getPoolsCount() {
      if (poolsBuilder_ == null) {
        return pools_.size();
      } else {
        return poolsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public com.lum.network.millions.Pool getPools(int index) {
      if (poolsBuilder_ == null) {
        return pools_.get(index);
      } else {
        return poolsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPools(
        int index, com.lum.network.millions.Pool value) {
      if (poolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoolsIsMutable();
        pools_.set(index, value);
        onChanged();
      } else {
        poolsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPools(
        int index, com.lum.network.millions.Pool.Builder builderForValue) {
      if (poolsBuilder_ == null) {
        ensurePoolsIsMutable();
        pools_.set(index, builderForValue.build());
        onChanged();
      } else {
        poolsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPools(com.lum.network.millions.Pool value) {
      if (poolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoolsIsMutable();
        pools_.add(value);
        onChanged();
      } else {
        poolsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPools(
        int index, com.lum.network.millions.Pool value) {
      if (poolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoolsIsMutable();
        pools_.add(index, value);
        onChanged();
      } else {
        poolsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPools(
        com.lum.network.millions.Pool.Builder builderForValue) {
      if (poolsBuilder_ == null) {
        ensurePoolsIsMutable();
        pools_.add(builderForValue.build());
        onChanged();
      } else {
        poolsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPools(
        int index, com.lum.network.millions.Pool.Builder builderForValue) {
      if (poolsBuilder_ == null) {
        ensurePoolsIsMutable();
        pools_.add(index, builderForValue.build());
        onChanged();
      } else {
        poolsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllPools(
        java.lang.Iterable<? extends com.lum.network.millions.Pool> values) {
      if (poolsBuilder_ == null) {
        ensurePoolsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pools_);
        onChanged();
      } else {
        poolsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearPools() {
      if (poolsBuilder_ == null) {
        pools_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        poolsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public Builder removePools(int index) {
      if (poolsBuilder_ == null) {
        ensurePoolsIsMutable();
        pools_.remove(index);
        onChanged();
      } else {
        poolsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public com.lum.network.millions.Pool.Builder getPoolsBuilder(
        int index) {
      return getPoolsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public com.lum.network.millions.PoolOrBuilder getPoolsOrBuilder(
        int index) {
      if (poolsBuilder_ == null) {
        return pools_.get(index);  } else {
        return poolsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.lum.network.millions.PoolOrBuilder> 
         getPoolsOrBuilderList() {
      if (poolsBuilder_ != null) {
        return poolsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pools_);
      }
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public com.lum.network.millions.Pool.Builder addPoolsBuilder() {
      return getPoolsFieldBuilder().addBuilder(
          com.lum.network.millions.Pool.getDefaultInstance());
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public com.lum.network.millions.Pool.Builder addPoolsBuilder(
        int index) {
      return getPoolsFieldBuilder().addBuilder(
          index, com.lum.network.millions.Pool.getDefaultInstance());
    }
    /**
     * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.lum.network.millions.Pool.Builder> 
         getPoolsBuilderList() {
      return getPoolsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.lum.network.millions.Pool, com.lum.network.millions.Pool.Builder, com.lum.network.millions.PoolOrBuilder> 
        getPoolsFieldBuilder() {
      if (poolsBuilder_ == null) {
        poolsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.lum.network.millions.Pool, com.lum.network.millions.Pool.Builder, com.lum.network.millions.PoolOrBuilder>(
                pools_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pools_ = null;
      }
      return poolsBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
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


    // @@protoc_insertion_point(builder_scope:lum.network.millions.QueryPoolsResponse)
  }

  // @@protoc_insertion_point(class_scope:lum.network.millions.QueryPoolsResponse)
  private static final com.lum.network.millions.QueryPoolsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lum.network.millions.QueryPoolsResponse();
  }

  public static com.lum.network.millions.QueryPoolsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPoolsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryPoolsResponse>() {
    @java.lang.Override
    public QueryPoolsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryPoolsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPoolsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.lum.network.millions.QueryPoolsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

