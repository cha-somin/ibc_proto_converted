// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/liquidfarming/v1beta1/query.proto

package com.crescent.liquidfarming.v1beta1;

/**
 * <pre>
 * QueryRewardsAuctionsRequest is request type for the Query/RewardsAuctions RPC method.
 * </pre>
 *
 * Protobuf type {@code crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest}
 */
public final class QueryRewardsAuctionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest)
    QueryRewardsAuctionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRewardsAuctionsRequest.newBuilder() to construct.
  private QueryRewardsAuctionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRewardsAuctionsRequest() {
    status_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRewardsAuctionsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.liquidfarming.v1beta1.QueryProto.internal_static_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.liquidfarming.v1beta1.QueryProto.internal_static_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest.class, com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest.Builder.class);
  }

  public static final int POOL_ID_FIELD_NUMBER = 1;
  private long poolId_ = 0L;
  /**
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object status_ = "";
  /**
   * <code>string status = 2 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <code>string status = 2 [json_name = "status"];</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGINATION_FIELD_NUMBER = 3;
  private com.cosmos.base.query.v1beta1.PageRequest pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequest getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
  }
  /**
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
    if (poolId_ != 0L) {
      output.writeUInt64(1, poolId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
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
    if (poolId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, poolId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
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
    if (!(obj instanceof com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest)) {
      return super.equals(obj);
    }
    com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest other = (com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
    if (!getStatus()
        .equals(other.getStatus())) return false;
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
    hash = (37 * hash) + POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPoolId());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest parseFrom(
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
  public static Builder newBuilder(com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest prototype) {
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
   * QueryRewardsAuctionsRequest is request type for the Query/RewardsAuctions RPC method.
   * </pre>
   *
   * Protobuf type {@code crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest)
      com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.liquidfarming.v1beta1.QueryProto.internal_static_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.liquidfarming.v1beta1.QueryProto.internal_static_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest.class, com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest.Builder.class);
    }

    // Construct using com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest.newBuilder()
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
      poolId_ = 0L;
      status_ = "";
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
      return com.crescent.liquidfarming.v1beta1.QueryProto.internal_static_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsRequest_descriptor;
    }

    @java.lang.Override
    public com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest getDefaultInstanceForType() {
      return com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest build() {
      com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest buildPartial() {
      com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest result = new com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = status_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest) {
        return mergeFrom((com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest other) {
      if (other == com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
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
            case 8: {
              poolId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              status_ = input.readStringRequireUtf8();
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

    private long poolId_ ;
    /**
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @param value The poolId to set.
     * @return This builder for chaining.
     */
    public Builder setPoolId(long value) {

      poolId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      poolId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>string status = 2 [json_name = "status"];</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string status = 2 [json_name = "status"];</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string status = 2 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string status = 2 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      status_ = getDefaultInstance().getStatus();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string status = 2 [json_name = "status"];</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.cosmos.base.query.v1beta1.PageRequest pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
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
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequest.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
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


    // @@protoc_insertion_point(builder_scope:crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest)
  }

  // @@protoc_insertion_point(class_scope:crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest)
  private static final com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest();
  }

  public static com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRewardsAuctionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryRewardsAuctionsRequest>() {
    @java.lang.Override
    public QueryRewardsAuctionsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryRewardsAuctionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRewardsAuctionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

