// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/gamm/v1beta1/query.proto

package com.osmosis.gamm.v1beta1;

/**
 * <pre>
 *=============================== PoolLiquidity
 * Deprecated: please use the alternative in x/poolmanager
 * </pre>
 *
 * Protobuf type {@code osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest}
 */
@java.lang.Deprecated public final class QueryTotalPoolLiquidityRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest)
    QueryTotalPoolLiquidityRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTotalPoolLiquidityRequest.newBuilder() to construct.
  private QueryTotalPoolLiquidityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTotalPoolLiquidityRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTotalPoolLiquidityRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest.class, com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest.Builder.class);
  }

  public static final int POOL_ID_FIELD_NUMBER = 1;
  private long poolId_ = 0L;
  /**
   * <code>uint64 pool_id = 1 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest)) {
      return super.equals(obj);
    }
    com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest other = (com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest parseFrom(
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
  public static Builder newBuilder(com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest prototype) {
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
   *=============================== PoolLiquidity
   * Deprecated: please use the alternative in x/poolmanager
   * </pre>
   *
   * Protobuf type {@code osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest)
      com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest.class, com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest.Builder.class);
    }

    // Construct using com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityRequest_descriptor;
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest getDefaultInstanceForType() {
      return com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest build() {
      com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest buildPartial() {
      com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest result = new com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest) {
        return mergeFrom((com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest other) {
      if (other == com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
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
     * <code>uint64 pool_id = 1 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <code>uint64 pool_id = 1 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
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
     * <code>uint64 pool_id = 1 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      poolId_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest)
  }

  // @@protoc_insertion_point(class_scope:osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest)
  private static final com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest();
  }

  public static com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTotalPoolLiquidityRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryTotalPoolLiquidityRequest>() {
    @java.lang.Override
    public QueryTotalPoolLiquidityRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTotalPoolLiquidityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTotalPoolLiquidityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

