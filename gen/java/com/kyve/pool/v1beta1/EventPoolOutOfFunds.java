// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/pool/v1beta1/events.proto

package com.kyve.pool.v1beta1;

/**
 * <pre>
 * EventPoolOutOfFunds is an event emitted when a pool has run out of funds
 * emitted_by: MsgSubmitBundleProposal
 * </pre>
 *
 * Protobuf type {@code kyve.pool.v1beta1.EventPoolOutOfFunds}
 */
public final class EventPoolOutOfFunds extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.pool.v1beta1.EventPoolOutOfFunds)
    EventPoolOutOfFundsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventPoolOutOfFunds.newBuilder() to construct.
  private EventPoolOutOfFunds(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventPoolOutOfFunds() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventPoolOutOfFunds();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.pool.v1beta1.EventsProto.internal_static_kyve_pool_v1beta1_EventPoolOutOfFunds_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.pool.v1beta1.EventsProto.internal_static_kyve_pool_v1beta1_EventPoolOutOfFunds_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.pool.v1beta1.EventPoolOutOfFunds.class, com.kyve.pool.v1beta1.EventPoolOutOfFunds.Builder.class);
  }

  public static final int POOL_ID_FIELD_NUMBER = 1;
  private long poolId_ = 0L;
  /**
   * <pre>
   * pool_id is the unique ID of the pool.
   * </pre>
   *
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
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
    if (!(obj instanceof com.kyve.pool.v1beta1.EventPoolOutOfFunds)) {
      return super.equals(obj);
    }
    com.kyve.pool.v1beta1.EventPoolOutOfFunds other = (com.kyve.pool.v1beta1.EventPoolOutOfFunds) obj;

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

  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds parseFrom(
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
  public static Builder newBuilder(com.kyve.pool.v1beta1.EventPoolOutOfFunds prototype) {
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
   * EventPoolOutOfFunds is an event emitted when a pool has run out of funds
   * emitted_by: MsgSubmitBundleProposal
   * </pre>
   *
   * Protobuf type {@code kyve.pool.v1beta1.EventPoolOutOfFunds}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.pool.v1beta1.EventPoolOutOfFunds)
      com.kyve.pool.v1beta1.EventPoolOutOfFundsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.pool.v1beta1.EventsProto.internal_static_kyve_pool_v1beta1_EventPoolOutOfFunds_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.pool.v1beta1.EventsProto.internal_static_kyve_pool_v1beta1_EventPoolOutOfFunds_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.pool.v1beta1.EventPoolOutOfFunds.class, com.kyve.pool.v1beta1.EventPoolOutOfFunds.Builder.class);
    }

    // Construct using com.kyve.pool.v1beta1.EventPoolOutOfFunds.newBuilder()
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
      return com.kyve.pool.v1beta1.EventsProto.internal_static_kyve_pool_v1beta1_EventPoolOutOfFunds_descriptor;
    }

    @java.lang.Override
    public com.kyve.pool.v1beta1.EventPoolOutOfFunds getDefaultInstanceForType() {
      return com.kyve.pool.v1beta1.EventPoolOutOfFunds.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.pool.v1beta1.EventPoolOutOfFunds build() {
      com.kyve.pool.v1beta1.EventPoolOutOfFunds result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.pool.v1beta1.EventPoolOutOfFunds buildPartial() {
      com.kyve.pool.v1beta1.EventPoolOutOfFunds result = new com.kyve.pool.v1beta1.EventPoolOutOfFunds(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.pool.v1beta1.EventPoolOutOfFunds result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.pool.v1beta1.EventPoolOutOfFunds) {
        return mergeFrom((com.kyve.pool.v1beta1.EventPoolOutOfFunds)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.pool.v1beta1.EventPoolOutOfFunds other) {
      if (other == com.kyve.pool.v1beta1.EventPoolOutOfFunds.getDefaultInstance()) return this;
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
     * <pre>
     * pool_id is the unique ID of the pool.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <pre>
     * pool_id is the unique ID of the pool.
     * </pre>
     *
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
     * <pre>
     * pool_id is the unique ID of the pool.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
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


    // @@protoc_insertion_point(builder_scope:kyve.pool.v1beta1.EventPoolOutOfFunds)
  }

  // @@protoc_insertion_point(class_scope:kyve.pool.v1beta1.EventPoolOutOfFunds)
  private static final com.kyve.pool.v1beta1.EventPoolOutOfFunds DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.pool.v1beta1.EventPoolOutOfFunds();
  }

  public static com.kyve.pool.v1beta1.EventPoolOutOfFunds getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventPoolOutOfFunds>
      PARSER = new com.google.protobuf.AbstractParser<EventPoolOutOfFunds>() {
    @java.lang.Override
    public EventPoolOutOfFunds parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventPoolOutOfFunds> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventPoolOutOfFunds> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.pool.v1beta1.EventPoolOutOfFunds getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

