// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/pool.proto

package com.gravity.v1;

/**
 * Protobuf type {@code gravity.v1.EventWithdrawCanceled}
 */
public final class EventWithdrawCanceled extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravity.v1.EventWithdrawCanceled)
    EventWithdrawCanceledOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventWithdrawCanceled.newBuilder() to construct.
  private EventWithdrawCanceled(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventWithdrawCanceled() {
    sender_ = "";
    txId_ = "";
    bridgeContract_ = "";
    bridgeChainId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventWithdrawCanceled();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gravity.v1.PoolProto.internal_static_gravity_v1_EventWithdrawCanceled_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravity.v1.PoolProto.internal_static_gravity_v1_EventWithdrawCanceled_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravity.v1.EventWithdrawCanceled.class, com.gravity.v1.EventWithdrawCanceled.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sender_ = "";
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
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
   * <code>string sender = 1 [json_name = "sender"];</code>
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

  public static final int TX_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object txId_ = "";
  /**
   * <code>string tx_id = 2 [json_name = "txId"];</code>
   * @return The txId.
   */
  @java.lang.Override
  public java.lang.String getTxId() {
    java.lang.Object ref = txId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      txId_ = s;
      return s;
    }
  }
  /**
   * <code>string tx_id = 2 [json_name = "txId"];</code>
   * @return The bytes for txId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTxIdBytes() {
    java.lang.Object ref = txId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      txId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BRIDGE_CONTRACT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bridgeContract_ = "";
  /**
   * <code>string bridge_contract = 3 [json_name = "bridgeContract"];</code>
   * @return The bridgeContract.
   */
  @java.lang.Override
  public java.lang.String getBridgeContract() {
    java.lang.Object ref = bridgeContract_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bridgeContract_ = s;
      return s;
    }
  }
  /**
   * <code>string bridge_contract = 3 [json_name = "bridgeContract"];</code>
   * @return The bytes for bridgeContract.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBridgeContractBytes() {
    java.lang.Object ref = bridgeContract_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bridgeContract_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BRIDGE_CHAIN_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bridgeChainId_ = "";
  /**
   * <code>string bridge_chain_id = 4 [json_name = "bridgeChainId"];</code>
   * @return The bridgeChainId.
   */
  @java.lang.Override
  public java.lang.String getBridgeChainId() {
    java.lang.Object ref = bridgeChainId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bridgeChainId_ = s;
      return s;
    }
  }
  /**
   * <code>string bridge_chain_id = 4 [json_name = "bridgeChainId"];</code>
   * @return The bytes for bridgeChainId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBridgeChainIdBytes() {
    java.lang.Object ref = bridgeChainId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bridgeChainId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(txId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, txId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgeContract_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bridgeContract_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgeChainId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, bridgeChainId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(txId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, txId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgeContract_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bridgeContract_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgeChainId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, bridgeChainId_);
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
    if (!(obj instanceof com.gravity.v1.EventWithdrawCanceled)) {
      return super.equals(obj);
    }
    com.gravity.v1.EventWithdrawCanceled other = (com.gravity.v1.EventWithdrawCanceled) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getTxId()
        .equals(other.getTxId())) return false;
    if (!getBridgeContract()
        .equals(other.getBridgeContract())) return false;
    if (!getBridgeChainId()
        .equals(other.getBridgeChainId())) return false;
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
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    hash = (37 * hash) + TX_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTxId().hashCode();
    hash = (37 * hash) + BRIDGE_CONTRACT_FIELD_NUMBER;
    hash = (53 * hash) + getBridgeContract().hashCode();
    hash = (37 * hash) + BRIDGE_CHAIN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBridgeChainId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravity.v1.EventWithdrawCanceled parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.EventWithdrawCanceled parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.EventWithdrawCanceled parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.EventWithdrawCanceled parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.EventWithdrawCanceled parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.EventWithdrawCanceled parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.EventWithdrawCanceled parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.EventWithdrawCanceled parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.gravity.v1.EventWithdrawCanceled parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.gravity.v1.EventWithdrawCanceled parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravity.v1.EventWithdrawCanceled parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.EventWithdrawCanceled parseFrom(
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
  public static Builder newBuilder(com.gravity.v1.EventWithdrawCanceled prototype) {
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
   * Protobuf type {@code gravity.v1.EventWithdrawCanceled}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravity.v1.EventWithdrawCanceled)
      com.gravity.v1.EventWithdrawCanceledOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravity.v1.PoolProto.internal_static_gravity_v1_EventWithdrawCanceled_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravity.v1.PoolProto.internal_static_gravity_v1_EventWithdrawCanceled_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravity.v1.EventWithdrawCanceled.class, com.gravity.v1.EventWithdrawCanceled.Builder.class);
    }

    // Construct using com.gravity.v1.EventWithdrawCanceled.newBuilder()
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
      sender_ = "";
      txId_ = "";
      bridgeContract_ = "";
      bridgeChainId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravity.v1.PoolProto.internal_static_gravity_v1_EventWithdrawCanceled_descriptor;
    }

    @java.lang.Override
    public com.gravity.v1.EventWithdrawCanceled getDefaultInstanceForType() {
      return com.gravity.v1.EventWithdrawCanceled.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravity.v1.EventWithdrawCanceled build() {
      com.gravity.v1.EventWithdrawCanceled result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravity.v1.EventWithdrawCanceled buildPartial() {
      com.gravity.v1.EventWithdrawCanceled result = new com.gravity.v1.EventWithdrawCanceled(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.gravity.v1.EventWithdrawCanceled result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.txId_ = txId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.bridgeContract_ = bridgeContract_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.bridgeChainId_ = bridgeChainId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gravity.v1.EventWithdrawCanceled) {
        return mergeFrom((com.gravity.v1.EventWithdrawCanceled)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravity.v1.EventWithdrawCanceled other) {
      if (other == com.gravity.v1.EventWithdrawCanceled.getDefaultInstance()) return this;
      if (!other.getSender().isEmpty()) {
        sender_ = other.sender_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTxId().isEmpty()) {
        txId_ = other.txId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getBridgeContract().isEmpty()) {
        bridgeContract_ = other.bridgeContract_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getBridgeChainId().isEmpty()) {
        bridgeChainId_ = other.bridgeChainId_;
        bitField0_ |= 0x00000008;
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
            case 10: {
              sender_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              txId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              bridgeContract_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              bridgeChainId_ = input.readStringRequireUtf8();
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

    private java.lang.Object sender_ = "";
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
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
     * <code>string sender = 1 [json_name = "sender"];</code>
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
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      sender_ = getDefaultInstance().getSender();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @param value The bytes for sender to set.
     * @return This builder for chaining.
     */
    public Builder setSenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object txId_ = "";
    /**
     * <code>string tx_id = 2 [json_name = "txId"];</code>
     * @return The txId.
     */
    public java.lang.String getTxId() {
      java.lang.Object ref = txId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        txId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tx_id = 2 [json_name = "txId"];</code>
     * @return The bytes for txId.
     */
    public com.google.protobuf.ByteString
        getTxIdBytes() {
      java.lang.Object ref = txId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        txId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tx_id = 2 [json_name = "txId"];</code>
     * @param value The txId to set.
     * @return This builder for chaining.
     */
    public Builder setTxId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      txId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string tx_id = 2 [json_name = "txId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxId() {
      txId_ = getDefaultInstance().getTxId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string tx_id = 2 [json_name = "txId"];</code>
     * @param value The bytes for txId to set.
     * @return This builder for chaining.
     */
    public Builder setTxIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      txId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object bridgeContract_ = "";
    /**
     * <code>string bridge_contract = 3 [json_name = "bridgeContract"];</code>
     * @return The bridgeContract.
     */
    public java.lang.String getBridgeContract() {
      java.lang.Object ref = bridgeContract_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bridgeContract_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bridge_contract = 3 [json_name = "bridgeContract"];</code>
     * @return The bytes for bridgeContract.
     */
    public com.google.protobuf.ByteString
        getBridgeContractBytes() {
      java.lang.Object ref = bridgeContract_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bridgeContract_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bridge_contract = 3 [json_name = "bridgeContract"];</code>
     * @param value The bridgeContract to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeContract(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bridgeContract_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string bridge_contract = 3 [json_name = "bridgeContract"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBridgeContract() {
      bridgeContract_ = getDefaultInstance().getBridgeContract();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string bridge_contract = 3 [json_name = "bridgeContract"];</code>
     * @param value The bytes for bridgeContract to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeContractBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bridgeContract_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object bridgeChainId_ = "";
    /**
     * <code>string bridge_chain_id = 4 [json_name = "bridgeChainId"];</code>
     * @return The bridgeChainId.
     */
    public java.lang.String getBridgeChainId() {
      java.lang.Object ref = bridgeChainId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bridgeChainId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bridge_chain_id = 4 [json_name = "bridgeChainId"];</code>
     * @return The bytes for bridgeChainId.
     */
    public com.google.protobuf.ByteString
        getBridgeChainIdBytes() {
      java.lang.Object ref = bridgeChainId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bridgeChainId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bridge_chain_id = 4 [json_name = "bridgeChainId"];</code>
     * @param value The bridgeChainId to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeChainId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bridgeChainId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string bridge_chain_id = 4 [json_name = "bridgeChainId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBridgeChainId() {
      bridgeChainId_ = getDefaultInstance().getBridgeChainId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string bridge_chain_id = 4 [json_name = "bridgeChainId"];</code>
     * @param value The bytes for bridgeChainId to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeChainIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bridgeChainId_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:gravity.v1.EventWithdrawCanceled)
  }

  // @@protoc_insertion_point(class_scope:gravity.v1.EventWithdrawCanceled)
  private static final com.gravity.v1.EventWithdrawCanceled DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravity.v1.EventWithdrawCanceled();
  }

  public static com.gravity.v1.EventWithdrawCanceled getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventWithdrawCanceled>
      PARSER = new com.google.protobuf.AbstractParser<EventWithdrawCanceled>() {
    @java.lang.Override
    public EventWithdrawCanceled parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventWithdrawCanceled> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventWithdrawCanceled> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravity.v1.EventWithdrawCanceled getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

