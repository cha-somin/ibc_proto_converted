// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/stakers/v1beta1/events.proto

package com.kyve.stakers.v1beta1;

/**
 * <pre>
 * EventLeavePool ...
 * emitted_by: EndBlock
 * </pre>
 *
 * Protobuf type {@code kyve.stakers.v1beta1.EventLeavePool}
 */
public final class EventLeavePool extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.stakers.v1beta1.EventLeavePool)
    EventLeavePoolOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventLeavePool.newBuilder() to construct.
  private EventLeavePool(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventLeavePool() {
    staker_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventLeavePool();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.stakers.v1beta1.EventsProto.internal_static_kyve_stakers_v1beta1_EventLeavePool_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.stakers.v1beta1.EventsProto.internal_static_kyve_stakers_v1beta1_EventLeavePool_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.stakers.v1beta1.EventLeavePool.class, com.kyve.stakers.v1beta1.EventLeavePool.Builder.class);
  }

  public static final int POOL_ID_FIELD_NUMBER = 1;
  private long poolId_ = 0L;
  /**
   * <pre>
   * pool_id ...
   * </pre>
   *
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
  }

  public static final int STAKER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object staker_ = "";
  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The staker.
   */
  @java.lang.Override
  public java.lang.String getStaker() {
    java.lang.Object ref = staker_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      staker_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The bytes for staker.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStakerBytes() {
    java.lang.Object ref = staker_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      staker_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(staker_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, staker_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(staker_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, staker_);
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
    if (!(obj instanceof com.kyve.stakers.v1beta1.EventLeavePool)) {
      return super.equals(obj);
    }
    com.kyve.stakers.v1beta1.EventLeavePool other = (com.kyve.stakers.v1beta1.EventLeavePool) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
    if (!getStaker()
        .equals(other.getStaker())) return false;
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
    hash = (37 * hash) + STAKER_FIELD_NUMBER;
    hash = (53 * hash) + getStaker().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.stakers.v1beta1.EventLeavePool parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.stakers.v1beta1.EventLeavePool parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.stakers.v1beta1.EventLeavePool parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.stakers.v1beta1.EventLeavePool parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.stakers.v1beta1.EventLeavePool parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.stakers.v1beta1.EventLeavePool parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.stakers.v1beta1.EventLeavePool parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.stakers.v1beta1.EventLeavePool parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.stakers.v1beta1.EventLeavePool parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.stakers.v1beta1.EventLeavePool parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.stakers.v1beta1.EventLeavePool parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.stakers.v1beta1.EventLeavePool parseFrom(
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
  public static Builder newBuilder(com.kyve.stakers.v1beta1.EventLeavePool prototype) {
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
   * EventLeavePool ...
   * emitted_by: EndBlock
   * </pre>
   *
   * Protobuf type {@code kyve.stakers.v1beta1.EventLeavePool}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.stakers.v1beta1.EventLeavePool)
      com.kyve.stakers.v1beta1.EventLeavePoolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.stakers.v1beta1.EventsProto.internal_static_kyve_stakers_v1beta1_EventLeavePool_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.stakers.v1beta1.EventsProto.internal_static_kyve_stakers_v1beta1_EventLeavePool_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.stakers.v1beta1.EventLeavePool.class, com.kyve.stakers.v1beta1.EventLeavePool.Builder.class);
    }

    // Construct using com.kyve.stakers.v1beta1.EventLeavePool.newBuilder()
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
      staker_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.stakers.v1beta1.EventsProto.internal_static_kyve_stakers_v1beta1_EventLeavePool_descriptor;
    }

    @java.lang.Override
    public com.kyve.stakers.v1beta1.EventLeavePool getDefaultInstanceForType() {
      return com.kyve.stakers.v1beta1.EventLeavePool.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.stakers.v1beta1.EventLeavePool build() {
      com.kyve.stakers.v1beta1.EventLeavePool result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.stakers.v1beta1.EventLeavePool buildPartial() {
      com.kyve.stakers.v1beta1.EventLeavePool result = new com.kyve.stakers.v1beta1.EventLeavePool(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.stakers.v1beta1.EventLeavePool result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.staker_ = staker_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.stakers.v1beta1.EventLeavePool) {
        return mergeFrom((com.kyve.stakers.v1beta1.EventLeavePool)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.stakers.v1beta1.EventLeavePool other) {
      if (other == com.kyve.stakers.v1beta1.EventLeavePool.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (!other.getStaker().isEmpty()) {
        staker_ = other.staker_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              staker_ = input.readStringRequireUtf8();
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

    private long poolId_ ;
    /**
     * <pre>
     * pool_id ...
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
     * pool_id ...
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
     * pool_id ...
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

    private java.lang.Object staker_ = "";
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @return The staker.
     */
    public java.lang.String getStaker() {
      java.lang.Object ref = staker_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        staker_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @return The bytes for staker.
     */
    public com.google.protobuf.ByteString
        getStakerBytes() {
      java.lang.Object ref = staker_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        staker_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @param value The staker to set.
     * @return This builder for chaining.
     */
    public Builder setStaker(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      staker_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStaker() {
      staker_ = getDefaultInstance().getStaker();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * staker ...
     * </pre>
     *
     * <code>string staker = 2 [json_name = "staker"];</code>
     * @param value The bytes for staker to set.
     * @return This builder for chaining.
     */
    public Builder setStakerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      staker_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:kyve.stakers.v1beta1.EventLeavePool)
  }

  // @@protoc_insertion_point(class_scope:kyve.stakers.v1beta1.EventLeavePool)
  private static final com.kyve.stakers.v1beta1.EventLeavePool DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.stakers.v1beta1.EventLeavePool();
  }

  public static com.kyve.stakers.v1beta1.EventLeavePool getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventLeavePool>
      PARSER = new com.google.protobuf.AbstractParser<EventLeavePool>() {
    @java.lang.Override
    public EventLeavePool parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventLeavePool> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventLeavePool> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.stakers.v1beta1.EventLeavePool getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

