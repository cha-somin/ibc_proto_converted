// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/liquidity/v1beta1/tx.proto

package com.crescent.liquidity.v1beta1;

/**
 * <pre>
 * MsgCancelOrder defines an SDK message for cancelling an order
 * </pre>
 *
 * Protobuf type {@code crescent.liquidity.v1beta1.MsgCancelOrder}
 */
public final class MsgCancelOrder extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.liquidity.v1beta1.MsgCancelOrder)
    MsgCancelOrderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCancelOrder.newBuilder() to construct.
  private MsgCancelOrder(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCancelOrder() {
    orderer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCancelOrder();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.liquidity.v1beta1.TxProto.internal_static_crescent_liquidity_v1beta1_MsgCancelOrder_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.liquidity.v1beta1.TxProto.internal_static_crescent_liquidity_v1beta1_MsgCancelOrder_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.liquidity.v1beta1.MsgCancelOrder.class, com.crescent.liquidity.v1beta1.MsgCancelOrder.Builder.class);
  }

  public static final int ORDERER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orderer_ = "";
  /**
   * <pre>
   * orderer specifies the bech32-encoded address that makes an order
   * </pre>
   *
   * <code>string orderer = 1 [json_name = "orderer"];</code>
   * @return The orderer.
   */
  @java.lang.Override
  public java.lang.String getOrderer() {
    java.lang.Object ref = orderer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * orderer specifies the bech32-encoded address that makes an order
   * </pre>
   *
   * <code>string orderer = 1 [json_name = "orderer"];</code>
   * @return The bytes for orderer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrdererBytes() {
    java.lang.Object ref = orderer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAIR_ID_FIELD_NUMBER = 2;
  private long pairId_ = 0L;
  /**
   * <pre>
   * pair_id specifies the pair id
   * </pre>
   *
   * <code>uint64 pair_id = 2 [json_name = "pairId"];</code>
   * @return The pairId.
   */
  @java.lang.Override
  public long getPairId() {
    return pairId_;
  }

  public static final int ORDER_ID_FIELD_NUMBER = 3;
  private long orderId_ = 0L;
  /**
   * <pre>
   * order_id specifies the order id
   * </pre>
   *
   * <code>uint64 order_id = 3 [json_name = "orderId"];</code>
   * @return The orderId.
   */
  @java.lang.Override
  public long getOrderId() {
    return orderId_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderer_);
    }
    if (pairId_ != 0L) {
      output.writeUInt64(2, pairId_);
    }
    if (orderId_ != 0L) {
      output.writeUInt64(3, orderId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderer_);
    }
    if (pairId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, pairId_);
    }
    if (orderId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, orderId_);
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
    if (!(obj instanceof com.crescent.liquidity.v1beta1.MsgCancelOrder)) {
      return super.equals(obj);
    }
    com.crescent.liquidity.v1beta1.MsgCancelOrder other = (com.crescent.liquidity.v1beta1.MsgCancelOrder) obj;

    if (!getOrderer()
        .equals(other.getOrderer())) return false;
    if (getPairId()
        != other.getPairId()) return false;
    if (getOrderId()
        != other.getOrderId()) return false;
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
    hash = (37 * hash) + ORDERER_FIELD_NUMBER;
    hash = (53 * hash) + getOrderer().hashCode();
    hash = (37 * hash) + PAIR_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPairId());
    hash = (37 * hash) + ORDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOrderId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.liquidity.v1beta1.MsgCancelOrder parseFrom(
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
  public static Builder newBuilder(com.crescent.liquidity.v1beta1.MsgCancelOrder prototype) {
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
   * MsgCancelOrder defines an SDK message for cancelling an order
   * </pre>
   *
   * Protobuf type {@code crescent.liquidity.v1beta1.MsgCancelOrder}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.liquidity.v1beta1.MsgCancelOrder)
      com.crescent.liquidity.v1beta1.MsgCancelOrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.liquidity.v1beta1.TxProto.internal_static_crescent_liquidity_v1beta1_MsgCancelOrder_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.liquidity.v1beta1.TxProto.internal_static_crescent_liquidity_v1beta1_MsgCancelOrder_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.liquidity.v1beta1.MsgCancelOrder.class, com.crescent.liquidity.v1beta1.MsgCancelOrder.Builder.class);
    }

    // Construct using com.crescent.liquidity.v1beta1.MsgCancelOrder.newBuilder()
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
      orderer_ = "";
      pairId_ = 0L;
      orderId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.crescent.liquidity.v1beta1.TxProto.internal_static_crescent_liquidity_v1beta1_MsgCancelOrder_descriptor;
    }

    @java.lang.Override
    public com.crescent.liquidity.v1beta1.MsgCancelOrder getDefaultInstanceForType() {
      return com.crescent.liquidity.v1beta1.MsgCancelOrder.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.liquidity.v1beta1.MsgCancelOrder build() {
      com.crescent.liquidity.v1beta1.MsgCancelOrder result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.liquidity.v1beta1.MsgCancelOrder buildPartial() {
      com.crescent.liquidity.v1beta1.MsgCancelOrder result = new com.crescent.liquidity.v1beta1.MsgCancelOrder(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.crescent.liquidity.v1beta1.MsgCancelOrder result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orderer_ = orderer_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pairId_ = pairId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.orderId_ = orderId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.liquidity.v1beta1.MsgCancelOrder) {
        return mergeFrom((com.crescent.liquidity.v1beta1.MsgCancelOrder)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.liquidity.v1beta1.MsgCancelOrder other) {
      if (other == com.crescent.liquidity.v1beta1.MsgCancelOrder.getDefaultInstance()) return this;
      if (!other.getOrderer().isEmpty()) {
        orderer_ = other.orderer_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPairId() != 0L) {
        setPairId(other.getPairId());
      }
      if (other.getOrderId() != 0L) {
        setOrderId(other.getOrderId());
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
              orderer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              pairId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              orderId_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object orderer_ = "";
    /**
     * <pre>
     * orderer specifies the bech32-encoded address that makes an order
     * </pre>
     *
     * <code>string orderer = 1 [json_name = "orderer"];</code>
     * @return The orderer.
     */
    public java.lang.String getOrderer() {
      java.lang.Object ref = orderer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * orderer specifies the bech32-encoded address that makes an order
     * </pre>
     *
     * <code>string orderer = 1 [json_name = "orderer"];</code>
     * @return The bytes for orderer.
     */
    public com.google.protobuf.ByteString
        getOrdererBytes() {
      java.lang.Object ref = orderer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * orderer specifies the bech32-encoded address that makes an order
     * </pre>
     *
     * <code>string orderer = 1 [json_name = "orderer"];</code>
     * @param value The orderer to set.
     * @return This builder for chaining.
     */
    public Builder setOrderer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orderer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * orderer specifies the bech32-encoded address that makes an order
     * </pre>
     *
     * <code>string orderer = 1 [json_name = "orderer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderer() {
      orderer_ = getDefaultInstance().getOrderer();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * orderer specifies the bech32-encoded address that makes an order
     * </pre>
     *
     * <code>string orderer = 1 [json_name = "orderer"];</code>
     * @param value The bytes for orderer to set.
     * @return This builder for chaining.
     */
    public Builder setOrdererBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orderer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long pairId_ ;
    /**
     * <pre>
     * pair_id specifies the pair id
     * </pre>
     *
     * <code>uint64 pair_id = 2 [json_name = "pairId"];</code>
     * @return The pairId.
     */
    @java.lang.Override
    public long getPairId() {
      return pairId_;
    }
    /**
     * <pre>
     * pair_id specifies the pair id
     * </pre>
     *
     * <code>uint64 pair_id = 2 [json_name = "pairId"];</code>
     * @param value The pairId to set.
     * @return This builder for chaining.
     */
    public Builder setPairId(long value) {

      pairId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pair_id specifies the pair id
     * </pre>
     *
     * <code>uint64 pair_id = 2 [json_name = "pairId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPairId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pairId_ = 0L;
      onChanged();
      return this;
    }

    private long orderId_ ;
    /**
     * <pre>
     * order_id specifies the order id
     * </pre>
     *
     * <code>uint64 order_id = 3 [json_name = "orderId"];</code>
     * @return The orderId.
     */
    @java.lang.Override
    public long getOrderId() {
      return orderId_;
    }
    /**
     * <pre>
     * order_id specifies the order id
     * </pre>
     *
     * <code>uint64 order_id = 3 [json_name = "orderId"];</code>
     * @param value The orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderId(long value) {

      orderId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * order_id specifies the order id
     * </pre>
     *
     * <code>uint64 order_id = 3 [json_name = "orderId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      orderId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:crescent.liquidity.v1beta1.MsgCancelOrder)
  }

  // @@protoc_insertion_point(class_scope:crescent.liquidity.v1beta1.MsgCancelOrder)
  private static final com.crescent.liquidity.v1beta1.MsgCancelOrder DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.liquidity.v1beta1.MsgCancelOrder();
  }

  public static com.crescent.liquidity.v1beta1.MsgCancelOrder getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCancelOrder>
      PARSER = new com.google.protobuf.AbstractParser<MsgCancelOrder>() {
    @java.lang.Override
    public MsgCancelOrder parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCancelOrder> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCancelOrder> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.liquidity.v1beta1.MsgCancelOrder getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

