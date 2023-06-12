// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/liquidity/v1beta1/query.proto

package com.crescent.liquidity.v1beta1;

/**
 * <pre>
 * QueryDepositRequestRequest is request type for the Query/DepositRequest RPC method.
 * </pre>
 *
 * Protobuf type {@code crescent.liquidity.v1beta1.QueryDepositRequestRequest}
 */
public final class QueryDepositRequestRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.liquidity.v1beta1.QueryDepositRequestRequest)
    QueryDepositRequestRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDepositRequestRequest.newBuilder() to construct.
  private QueryDepositRequestRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDepositRequestRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDepositRequestRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.liquidity.v1beta1.QueryProto.internal_static_crescent_liquidity_v1beta1_QueryDepositRequestRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.liquidity.v1beta1.QueryProto.internal_static_crescent_liquidity_v1beta1_QueryDepositRequestRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.liquidity.v1beta1.QueryDepositRequestRequest.class, com.crescent.liquidity.v1beta1.QueryDepositRequestRequest.Builder.class);
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

  public static final int ID_FIELD_NUMBER = 2;
  private long id_ = 0L;
  /**
   * <code>uint64 id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
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
    if (id_ != 0L) {
      output.writeUInt64(2, id_);
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
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, id_);
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
    if (!(obj instanceof com.crescent.liquidity.v1beta1.QueryDepositRequestRequest)) {
      return super.equals(obj);
    }
    com.crescent.liquidity.v1beta1.QueryDepositRequestRequest other = (com.crescent.liquidity.v1beta1.QueryDepositRequestRequest) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
    if (getId()
        != other.getId()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest parseFrom(
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
  public static Builder newBuilder(com.crescent.liquidity.v1beta1.QueryDepositRequestRequest prototype) {
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
   * QueryDepositRequestRequest is request type for the Query/DepositRequest RPC method.
   * </pre>
   *
   * Protobuf type {@code crescent.liquidity.v1beta1.QueryDepositRequestRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.liquidity.v1beta1.QueryDepositRequestRequest)
      com.crescent.liquidity.v1beta1.QueryDepositRequestRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.liquidity.v1beta1.QueryProto.internal_static_crescent_liquidity_v1beta1_QueryDepositRequestRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.liquidity.v1beta1.QueryProto.internal_static_crescent_liquidity_v1beta1_QueryDepositRequestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.liquidity.v1beta1.QueryDepositRequestRequest.class, com.crescent.liquidity.v1beta1.QueryDepositRequestRequest.Builder.class);
    }

    // Construct using com.crescent.liquidity.v1beta1.QueryDepositRequestRequest.newBuilder()
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
      id_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.crescent.liquidity.v1beta1.QueryProto.internal_static_crescent_liquidity_v1beta1_QueryDepositRequestRequest_descriptor;
    }

    @java.lang.Override
    public com.crescent.liquidity.v1beta1.QueryDepositRequestRequest getDefaultInstanceForType() {
      return com.crescent.liquidity.v1beta1.QueryDepositRequestRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.liquidity.v1beta1.QueryDepositRequestRequest build() {
      com.crescent.liquidity.v1beta1.QueryDepositRequestRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.liquidity.v1beta1.QueryDepositRequestRequest buildPartial() {
      com.crescent.liquidity.v1beta1.QueryDepositRequestRequest result = new com.crescent.liquidity.v1beta1.QueryDepositRequestRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.crescent.liquidity.v1beta1.QueryDepositRequestRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.id_ = id_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.liquidity.v1beta1.QueryDepositRequestRequest) {
        return mergeFrom((com.crescent.liquidity.v1beta1.QueryDepositRequestRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.liquidity.v1beta1.QueryDepositRequestRequest other) {
      if (other == com.crescent.liquidity.v1beta1.QueryDepositRequestRequest.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (other.getId() != 0L) {
        setId(other.getId());
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
            case 16: {
              id_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long id_ ;
    /**
     * <code>uint64 id = 2 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 2 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 2 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      id_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:crescent.liquidity.v1beta1.QueryDepositRequestRequest)
  }

  // @@protoc_insertion_point(class_scope:crescent.liquidity.v1beta1.QueryDepositRequestRequest)
  private static final com.crescent.liquidity.v1beta1.QueryDepositRequestRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.liquidity.v1beta1.QueryDepositRequestRequest();
  }

  public static com.crescent.liquidity.v1beta1.QueryDepositRequestRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDepositRequestRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryDepositRequestRequest>() {
    @java.lang.Override
    public QueryDepositRequestRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDepositRequestRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDepositRequestRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.liquidity.v1beta1.QueryDepositRequestRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

