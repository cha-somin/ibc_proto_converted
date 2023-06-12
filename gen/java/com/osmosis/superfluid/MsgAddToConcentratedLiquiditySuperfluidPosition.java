// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/superfluid/tx.proto

package com.osmosis.superfluid;

/**
 * <pre>
 * ===================== MsgAddToConcentratedLiquiditySuperfluidPosition
 * </pre>
 *
 * Protobuf type {@code osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition}
 */
public final class MsgAddToConcentratedLiquiditySuperfluidPosition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition)
    MsgAddToConcentratedLiquiditySuperfluidPositionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAddToConcentratedLiquiditySuperfluidPosition.newBuilder() to construct.
  private MsgAddToConcentratedLiquiditySuperfluidPosition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAddToConcentratedLiquiditySuperfluidPosition() {
    sender_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAddToConcentratedLiquiditySuperfluidPosition();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.superfluid.TxProto.internal_static_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPosition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.superfluid.TxProto.internal_static_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPosition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.class, com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.Builder.class);
  }

  public static final int POSITION_ID_FIELD_NUMBER = 1;
  private long positionId_ = 0L;
  /**
   * <code>uint64 position_id = 1 [json_name = "positionId", (.gogoproto.moretags) = "yaml:&#92;"position_id&#92;""];</code>
   * @return The positionId.
   */
  @java.lang.Override
  public long getPositionId() {
    return positionId_;
  }

  public static final int SENDER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sender_ = "";
  /**
   * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The sender.
   */
  @java.lang.Override
  public java.lang.String getSender() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sender_ = s;
      return s;
    }
  }
  /**
   * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The bytes for sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSenderBytes() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sender_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_DESIRED0_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin tokenDesired0_;
  /**
   * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
   * @return Whether the tokenDesired0 field is set.
   */
  @java.lang.Override
  public boolean hasTokenDesired0() {
    return tokenDesired0_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
   * @return The tokenDesired0.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getTokenDesired0() {
    return tokenDesired0_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenDesired0_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getTokenDesired0OrBuilder() {
    return tokenDesired0_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenDesired0_;
  }

  public static final int TOKEN_DESIRED1_FIELD_NUMBER = 4;
  private com.cosmos.base.v1beta1.Coin tokenDesired1_;
  /**
   * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
   * @return Whether the tokenDesired1 field is set.
   */
  @java.lang.Override
  public boolean hasTokenDesired1() {
    return tokenDesired1_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
   * @return The tokenDesired1.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getTokenDesired1() {
    return tokenDesired1_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenDesired1_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getTokenDesired1OrBuilder() {
    return tokenDesired1_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenDesired1_;
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
    if (positionId_ != 0L) {
      output.writeUInt64(1, positionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sender_);
    }
    if (tokenDesired0_ != null) {
      output.writeMessage(3, getTokenDesired0());
    }
    if (tokenDesired1_ != null) {
      output.writeMessage(4, getTokenDesired1());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (positionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, positionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sender_);
    }
    if (tokenDesired0_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTokenDesired0());
    }
    if (tokenDesired1_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTokenDesired1());
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
    if (!(obj instanceof com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition)) {
      return super.equals(obj);
    }
    com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition other = (com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition) obj;

    if (getPositionId()
        != other.getPositionId()) return false;
    if (!getSender()
        .equals(other.getSender())) return false;
    if (hasTokenDesired0() != other.hasTokenDesired0()) return false;
    if (hasTokenDesired0()) {
      if (!getTokenDesired0()
          .equals(other.getTokenDesired0())) return false;
    }
    if (hasTokenDesired1() != other.hasTokenDesired1()) return false;
    if (hasTokenDesired1()) {
      if (!getTokenDesired1()
          .equals(other.getTokenDesired1())) return false;
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
    hash = (37 * hash) + POSITION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPositionId());
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    if (hasTokenDesired0()) {
      hash = (37 * hash) + TOKEN_DESIRED0_FIELD_NUMBER;
      hash = (53 * hash) + getTokenDesired0().hashCode();
    }
    if (hasTokenDesired1()) {
      hash = (37 * hash) + TOKEN_DESIRED1_FIELD_NUMBER;
      hash = (53 * hash) + getTokenDesired1().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition parseFrom(
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
  public static Builder newBuilder(com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition prototype) {
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
   * ===================== MsgAddToConcentratedLiquiditySuperfluidPosition
   * </pre>
   *
   * Protobuf type {@code osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition)
      com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.superfluid.TxProto.internal_static_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPosition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.superfluid.TxProto.internal_static_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPosition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.class, com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.Builder.class);
    }

    // Construct using com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.newBuilder()
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
      positionId_ = 0L;
      sender_ = "";
      tokenDesired0_ = null;
      if (tokenDesired0Builder_ != null) {
        tokenDesired0Builder_.dispose();
        tokenDesired0Builder_ = null;
      }
      tokenDesired1_ = null;
      if (tokenDesired1Builder_ != null) {
        tokenDesired1Builder_.dispose();
        tokenDesired1Builder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.superfluid.TxProto.internal_static_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPosition_descriptor;
    }

    @java.lang.Override
    public com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition getDefaultInstanceForType() {
      return com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition build() {
      com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition buildPartial() {
      com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition result = new com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.positionId_ = positionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tokenDesired0_ = tokenDesired0Builder_ == null
            ? tokenDesired0_
            : tokenDesired0Builder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.tokenDesired1_ = tokenDesired1Builder_ == null
            ? tokenDesired1_
            : tokenDesired1Builder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition) {
        return mergeFrom((com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition other) {
      if (other == com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.getDefaultInstance()) return this;
      if (other.getPositionId() != 0L) {
        setPositionId(other.getPositionId());
      }
      if (!other.getSender().isEmpty()) {
        sender_ = other.sender_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasTokenDesired0()) {
        mergeTokenDesired0(other.getTokenDesired0());
      }
      if (other.hasTokenDesired1()) {
        mergeTokenDesired1(other.getTokenDesired1());
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
              positionId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              sender_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTokenDesired0FieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getTokenDesired1FieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private long positionId_ ;
    /**
     * <code>uint64 position_id = 1 [json_name = "positionId", (.gogoproto.moretags) = "yaml:&#92;"position_id&#92;""];</code>
     * @return The positionId.
     */
    @java.lang.Override
    public long getPositionId() {
      return positionId_;
    }
    /**
     * <code>uint64 position_id = 1 [json_name = "positionId", (.gogoproto.moretags) = "yaml:&#92;"position_id&#92;""];</code>
     * @param value The positionId to set.
     * @return This builder for chaining.
     */
    public Builder setPositionId(long value) {

      positionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 position_id = 1 [json_name = "positionId", (.gogoproto.moretags) = "yaml:&#92;"position_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearPositionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      positionId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object sender_ = "";
    /**
     * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     * @return The sender.
     */
    public java.lang.String getSender() {
      java.lang.Object ref = sender_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     * @return The bytes for sender.
     */
    public com.google.protobuf.ByteString
        getSenderBytes() {
      java.lang.Object ref = sender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      sender_ = getDefaultInstance().getSender();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     * @param value The bytes for sender to set.
     * @return This builder for chaining.
     */
    public Builder setSenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sender_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin tokenDesired0_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> tokenDesired0Builder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
     * @return Whether the tokenDesired0 field is set.
     */
    public boolean hasTokenDesired0() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
     * @return The tokenDesired0.
     */
    public com.cosmos.base.v1beta1.Coin getTokenDesired0() {
      if (tokenDesired0Builder_ == null) {
        return tokenDesired0_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenDesired0_;
      } else {
        return tokenDesired0Builder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
     */
    public Builder setTokenDesired0(com.cosmos.base.v1beta1.Coin value) {
      if (tokenDesired0Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokenDesired0_ = value;
      } else {
        tokenDesired0Builder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
     */
    public Builder setTokenDesired0(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (tokenDesired0Builder_ == null) {
        tokenDesired0_ = builderForValue.build();
      } else {
        tokenDesired0Builder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
     */
    public Builder mergeTokenDesired0(com.cosmos.base.v1beta1.Coin value) {
      if (tokenDesired0Builder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          tokenDesired0_ != null &&
          tokenDesired0_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getTokenDesired0Builder().mergeFrom(value);
        } else {
          tokenDesired0_ = value;
        }
      } else {
        tokenDesired0Builder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
     */
    public Builder clearTokenDesired0() {
      bitField0_ = (bitField0_ & ~0x00000004);
      tokenDesired0_ = null;
      if (tokenDesired0Builder_ != null) {
        tokenDesired0Builder_.dispose();
        tokenDesired0Builder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getTokenDesired0Builder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTokenDesired0FieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getTokenDesired0OrBuilder() {
      if (tokenDesired0Builder_ != null) {
        return tokenDesired0Builder_.getMessageOrBuilder();
      } else {
        return tokenDesired0_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenDesired0_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired0 = 3 [json_name = "tokenDesired0", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired0&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getTokenDesired0FieldBuilder() {
      if (tokenDesired0Builder_ == null) {
        tokenDesired0Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getTokenDesired0(),
                getParentForChildren(),
                isClean());
        tokenDesired0_ = null;
      }
      return tokenDesired0Builder_;
    }

    private com.cosmos.base.v1beta1.Coin tokenDesired1_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> tokenDesired1Builder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
     * @return Whether the tokenDesired1 field is set.
     */
    public boolean hasTokenDesired1() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
     * @return The tokenDesired1.
     */
    public com.cosmos.base.v1beta1.Coin getTokenDesired1() {
      if (tokenDesired1Builder_ == null) {
        return tokenDesired1_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenDesired1_;
      } else {
        return tokenDesired1Builder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
     */
    public Builder setTokenDesired1(com.cosmos.base.v1beta1.Coin value) {
      if (tokenDesired1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokenDesired1_ = value;
      } else {
        tokenDesired1Builder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
     */
    public Builder setTokenDesired1(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (tokenDesired1Builder_ == null) {
        tokenDesired1_ = builderForValue.build();
      } else {
        tokenDesired1Builder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
     */
    public Builder mergeTokenDesired1(com.cosmos.base.v1beta1.Coin value) {
      if (tokenDesired1Builder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          tokenDesired1_ != null &&
          tokenDesired1_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getTokenDesired1Builder().mergeFrom(value);
        } else {
          tokenDesired1_ = value;
        }
      } else {
        tokenDesired1Builder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
     */
    public Builder clearTokenDesired1() {
      bitField0_ = (bitField0_ & ~0x00000008);
      tokenDesired1_ = null;
      if (tokenDesired1Builder_ != null) {
        tokenDesired1Builder_.dispose();
        tokenDesired1Builder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getTokenDesired1Builder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getTokenDesired1FieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getTokenDesired1OrBuilder() {
      if (tokenDesired1Builder_ != null) {
        return tokenDesired1Builder_.getMessageOrBuilder();
      } else {
        return tokenDesired1_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenDesired1_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token_desired1 = 4 [json_name = "tokenDesired1", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_desired1&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getTokenDesired1FieldBuilder() {
      if (tokenDesired1Builder_ == null) {
        tokenDesired1Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getTokenDesired1(),
                getParentForChildren(),
                isClean());
        tokenDesired1_ = null;
      }
      return tokenDesired1Builder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition)
  }

  // @@protoc_insertion_point(class_scope:osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition)
  private static final com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition();
  }

  public static com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAddToConcentratedLiquiditySuperfluidPosition>
      PARSER = new com.google.protobuf.AbstractParser<MsgAddToConcentratedLiquiditySuperfluidPosition>() {
    @java.lang.Override
    public MsgAddToConcentratedLiquiditySuperfluidPosition parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgAddToConcentratedLiquiditySuperfluidPosition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAddToConcentratedLiquiditySuperfluidPosition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

