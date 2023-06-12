// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/query.proto

package com.lum.network.millions;

/**
 * Protobuf type {@code lum.network.millions.QueryAccountPoolWithdrawalsRequest}
 */
public final class QueryAccountPoolWithdrawalsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lum.network.millions.QueryAccountPoolWithdrawalsRequest)
    QueryAccountPoolWithdrawalsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAccountPoolWithdrawalsRequest.newBuilder() to construct.
  private QueryAccountPoolWithdrawalsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAccountPoolWithdrawalsRequest() {
    depositorAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAccountPoolWithdrawalsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lum.network.millions.QueryProto.internal_static_lum_network_millions_QueryAccountPoolWithdrawalsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lum.network.millions.QueryProto.internal_static_lum_network_millions_QueryAccountPoolWithdrawalsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lum.network.millions.QueryAccountPoolWithdrawalsRequest.class, com.lum.network.millions.QueryAccountPoolWithdrawalsRequest.Builder.class);
  }

  public static final int DEPOSITOR_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object depositorAddress_ = "";
  /**
   * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
   * @return The depositorAddress.
   */
  @java.lang.Override
  public java.lang.String getDepositorAddress() {
    java.lang.Object ref = depositorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      depositorAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
   * @return The bytes for depositorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepositorAddressBytes() {
    java.lang.Object ref = depositorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      depositorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POOL_ID_FIELD_NUMBER = 2;
  private long poolId_ = 0L;
  /**
   * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, depositorAddress_);
    }
    if (poolId_ != 0L) {
      output.writeUInt64(2, poolId_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, depositorAddress_);
    }
    if (poolId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, poolId_);
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
    if (!(obj instanceof com.lum.network.millions.QueryAccountPoolWithdrawalsRequest)) {
      return super.equals(obj);
    }
    com.lum.network.millions.QueryAccountPoolWithdrawalsRequest other = (com.lum.network.millions.QueryAccountPoolWithdrawalsRequest) obj;

    if (!getDepositorAddress()
        .equals(other.getDepositorAddress())) return false;
    if (getPoolId()
        != other.getPoolId()) return false;
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
    hash = (37 * hash) + DEPOSITOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getDepositorAddress().hashCode();
    hash = (37 * hash) + POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPoolId());
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest parseFrom(
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
  public static Builder newBuilder(com.lum.network.millions.QueryAccountPoolWithdrawalsRequest prototype) {
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
   * Protobuf type {@code lum.network.millions.QueryAccountPoolWithdrawalsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lum.network.millions.QueryAccountPoolWithdrawalsRequest)
      com.lum.network.millions.QueryAccountPoolWithdrawalsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lum.network.millions.QueryProto.internal_static_lum_network_millions_QueryAccountPoolWithdrawalsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lum.network.millions.QueryProto.internal_static_lum_network_millions_QueryAccountPoolWithdrawalsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lum.network.millions.QueryAccountPoolWithdrawalsRequest.class, com.lum.network.millions.QueryAccountPoolWithdrawalsRequest.Builder.class);
    }

    // Construct using com.lum.network.millions.QueryAccountPoolWithdrawalsRequest.newBuilder()
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
      depositorAddress_ = "";
      poolId_ = 0L;
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
      return com.lum.network.millions.QueryProto.internal_static_lum_network_millions_QueryAccountPoolWithdrawalsRequest_descriptor;
    }

    @java.lang.Override
    public com.lum.network.millions.QueryAccountPoolWithdrawalsRequest getDefaultInstanceForType() {
      return com.lum.network.millions.QueryAccountPoolWithdrawalsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.lum.network.millions.QueryAccountPoolWithdrawalsRequest build() {
      com.lum.network.millions.QueryAccountPoolWithdrawalsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.lum.network.millions.QueryAccountPoolWithdrawalsRequest buildPartial() {
      com.lum.network.millions.QueryAccountPoolWithdrawalsRequest result = new com.lum.network.millions.QueryAccountPoolWithdrawalsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.lum.network.millions.QueryAccountPoolWithdrawalsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.depositorAddress_ = depositorAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lum.network.millions.QueryAccountPoolWithdrawalsRequest) {
        return mergeFrom((com.lum.network.millions.QueryAccountPoolWithdrawalsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lum.network.millions.QueryAccountPoolWithdrawalsRequest other) {
      if (other == com.lum.network.millions.QueryAccountPoolWithdrawalsRequest.getDefaultInstance()) return this;
      if (!other.getDepositorAddress().isEmpty()) {
        depositorAddress_ = other.depositorAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
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
              depositorAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              poolId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object depositorAddress_ = "";
    /**
     * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
     * @return The depositorAddress.
     */
    public java.lang.String getDepositorAddress() {
      java.lang.Object ref = depositorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        depositorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
     * @return The bytes for depositorAddress.
     */
    public com.google.protobuf.ByteString
        getDepositorAddressBytes() {
      java.lang.Object ref = depositorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        depositorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
     * @param value The depositorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDepositorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      depositorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDepositorAddress() {
      depositorAddress_ = getDefaultInstance().getDepositorAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
     * @param value The bytes for depositorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDepositorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      depositorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long poolId_ ;
    /**
     * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
     * @param value The poolId to set.
     * @return This builder for chaining.
     */
    public Builder setPoolId(long value) {

      poolId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      poolId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:lum.network.millions.QueryAccountPoolWithdrawalsRequest)
  }

  // @@protoc_insertion_point(class_scope:lum.network.millions.QueryAccountPoolWithdrawalsRequest)
  private static final com.lum.network.millions.QueryAccountPoolWithdrawalsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lum.network.millions.QueryAccountPoolWithdrawalsRequest();
  }

  public static com.lum.network.millions.QueryAccountPoolWithdrawalsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAccountPoolWithdrawalsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryAccountPoolWithdrawalsRequest>() {
    @java.lang.Override
    public QueryAccountPoolWithdrawalsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAccountPoolWithdrawalsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAccountPoolWithdrawalsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.lum.network.millions.QueryAccountPoolWithdrawalsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

