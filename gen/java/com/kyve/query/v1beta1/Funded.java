// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/query/v1beta1/account.proto

package com.kyve.query.v1beta1;

/**
 * <pre>
 * Funded ...
 * </pre>
 *
 * Protobuf type {@code kyve.query.v1beta1.Funded}
 */
public final class Funded extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.query.v1beta1.Funded)
    FundedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Funded.newBuilder() to construct.
  private Funded(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Funded() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Funded();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.query.v1beta1.AccountProto.internal_static_kyve_query_v1beta1_Funded_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.query.v1beta1.AccountProto.internal_static_kyve_query_v1beta1_Funded_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.query.v1beta1.Funded.class, com.kyve.query.v1beta1.Funded.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  private long amount_ = 0L;
  /**
   * <pre>
   * amount ...
   * </pre>
   *
   * <code>uint64 amount = 1 [json_name = "amount"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public long getAmount() {
    return amount_;
  }

  public static final int POOL_FIELD_NUMBER = 2;
  private com.kyve.query.v1beta1.BasicPool pool_;
  /**
   * <pre>
   * pool ...
   * </pre>
   *
   * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
   * @return Whether the pool field is set.
   */
  @java.lang.Override
  public boolean hasPool() {
    return pool_ != null;
  }
  /**
   * <pre>
   * pool ...
   * </pre>
   *
   * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
   * @return The pool.
   */
  @java.lang.Override
  public com.kyve.query.v1beta1.BasicPool getPool() {
    return pool_ == null ? com.kyve.query.v1beta1.BasicPool.getDefaultInstance() : pool_;
  }
  /**
   * <pre>
   * pool ...
   * </pre>
   *
   * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
   */
  @java.lang.Override
  public com.kyve.query.v1beta1.BasicPoolOrBuilder getPoolOrBuilder() {
    return pool_ == null ? com.kyve.query.v1beta1.BasicPool.getDefaultInstance() : pool_;
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
    if (amount_ != 0L) {
      output.writeUInt64(1, amount_);
    }
    if (pool_ != null) {
      output.writeMessage(2, getPool());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (amount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, amount_);
    }
    if (pool_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPool());
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
    if (!(obj instanceof com.kyve.query.v1beta1.Funded)) {
      return super.equals(obj);
    }
    com.kyve.query.v1beta1.Funded other = (com.kyve.query.v1beta1.Funded) obj;

    if (getAmount()
        != other.getAmount()) return false;
    if (hasPool() != other.hasPool()) return false;
    if (hasPool()) {
      if (!getPool()
          .equals(other.getPool())) return false;
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
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAmount());
    if (hasPool()) {
      hash = (37 * hash) + POOL_FIELD_NUMBER;
      hash = (53 * hash) + getPool().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.query.v1beta1.Funded parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.Funded parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.Funded parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.Funded parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.Funded parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.Funded parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.Funded parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.query.v1beta1.Funded parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.query.v1beta1.Funded parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.query.v1beta1.Funded parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.Funded parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.query.v1beta1.Funded parseFrom(
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
  public static Builder newBuilder(com.kyve.query.v1beta1.Funded prototype) {
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
   * Funded ...
   * </pre>
   *
   * Protobuf type {@code kyve.query.v1beta1.Funded}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.query.v1beta1.Funded)
      com.kyve.query.v1beta1.FundedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.query.v1beta1.AccountProto.internal_static_kyve_query_v1beta1_Funded_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.query.v1beta1.AccountProto.internal_static_kyve_query_v1beta1_Funded_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.query.v1beta1.Funded.class, com.kyve.query.v1beta1.Funded.Builder.class);
    }

    // Construct using com.kyve.query.v1beta1.Funded.newBuilder()
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
      amount_ = 0L;
      pool_ = null;
      if (poolBuilder_ != null) {
        poolBuilder_.dispose();
        poolBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.query.v1beta1.AccountProto.internal_static_kyve_query_v1beta1_Funded_descriptor;
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.Funded getDefaultInstanceForType() {
      return com.kyve.query.v1beta1.Funded.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.Funded build() {
      com.kyve.query.v1beta1.Funded result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.Funded buildPartial() {
      com.kyve.query.v1beta1.Funded result = new com.kyve.query.v1beta1.Funded(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.query.v1beta1.Funded result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pool_ = poolBuilder_ == null
            ? pool_
            : poolBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.query.v1beta1.Funded) {
        return mergeFrom((com.kyve.query.v1beta1.Funded)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.query.v1beta1.Funded other) {
      if (other == com.kyve.query.v1beta1.Funded.getDefaultInstance()) return this;
      if (other.getAmount() != 0L) {
        setAmount(other.getAmount());
      }
      if (other.hasPool()) {
        mergePool(other.getPool());
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
              amount_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getPoolFieldBuilder().getBuilder(),
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

    private long amount_ ;
    /**
     * <pre>
     * amount ...
     * </pre>
     *
     * <code>uint64 amount = 1 [json_name = "amount"];</code>
     * @return The amount.
     */
    @java.lang.Override
    public long getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * amount ...
     * </pre>
     *
     * <code>uint64 amount = 1 [json_name = "amount"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(long value) {

      amount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * amount ...
     * </pre>
     *
     * <code>uint64 amount = 1 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      amount_ = 0L;
      onChanged();
      return this;
    }

    private com.kyve.query.v1beta1.BasicPool pool_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kyve.query.v1beta1.BasicPool, com.kyve.query.v1beta1.BasicPool.Builder, com.kyve.query.v1beta1.BasicPoolOrBuilder> poolBuilder_;
    /**
     * <pre>
     * pool ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
     * @return Whether the pool field is set.
     */
    public boolean hasPool() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pool ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
     * @return The pool.
     */
    public com.kyve.query.v1beta1.BasicPool getPool() {
      if (poolBuilder_ == null) {
        return pool_ == null ? com.kyve.query.v1beta1.BasicPool.getDefaultInstance() : pool_;
      } else {
        return poolBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pool ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
     */
    public Builder setPool(com.kyve.query.v1beta1.BasicPool value) {
      if (poolBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pool_ = value;
      } else {
        poolBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pool ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
     */
    public Builder setPool(
        com.kyve.query.v1beta1.BasicPool.Builder builderForValue) {
      if (poolBuilder_ == null) {
        pool_ = builderForValue.build();
      } else {
        poolBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pool ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
     */
    public Builder mergePool(com.kyve.query.v1beta1.BasicPool value) {
      if (poolBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pool_ != null &&
          pool_ != com.kyve.query.v1beta1.BasicPool.getDefaultInstance()) {
          getPoolBuilder().mergeFrom(value);
        } else {
          pool_ = value;
        }
      } else {
        poolBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pool ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
     */
    public Builder clearPool() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pool_ = null;
      if (poolBuilder_ != null) {
        poolBuilder_.dispose();
        poolBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pool ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
     */
    public com.kyve.query.v1beta1.BasicPool.Builder getPoolBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPoolFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pool ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
     */
    public com.kyve.query.v1beta1.BasicPoolOrBuilder getPoolOrBuilder() {
      if (poolBuilder_ != null) {
        return poolBuilder_.getMessageOrBuilder();
      } else {
        return pool_ == null ?
            com.kyve.query.v1beta1.BasicPool.getDefaultInstance() : pool_;
      }
    }
    /**
     * <pre>
     * pool ...
     * </pre>
     *
     * <code>.kyve.query.v1beta1.BasicPool pool = 2 [json_name = "pool"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kyve.query.v1beta1.BasicPool, com.kyve.query.v1beta1.BasicPool.Builder, com.kyve.query.v1beta1.BasicPoolOrBuilder> 
        getPoolFieldBuilder() {
      if (poolBuilder_ == null) {
        poolBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kyve.query.v1beta1.BasicPool, com.kyve.query.v1beta1.BasicPool.Builder, com.kyve.query.v1beta1.BasicPoolOrBuilder>(
                getPool(),
                getParentForChildren(),
                isClean());
        pool_ = null;
      }
      return poolBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kyve.query.v1beta1.Funded)
  }

  // @@protoc_insertion_point(class_scope:kyve.query.v1beta1.Funded)
  private static final com.kyve.query.v1beta1.Funded DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.query.v1beta1.Funded();
  }

  public static com.kyve.query.v1beta1.Funded getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Funded>
      PARSER = new com.google.protobuf.AbstractParser<Funded>() {
    @java.lang.Override
    public Funded parsePartialFrom(
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

  public static com.google.protobuf.Parser<Funded> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Funded> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.query.v1beta1.Funded getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

