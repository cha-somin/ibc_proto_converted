// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/batch.proto

package com.gravity.v1;

/**
 * Protobuf type {@code gravity.v1.EventOutgoingBatch}
 */
public final class EventOutgoingBatch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravity.v1.EventOutgoingBatch)
    EventOutgoingBatchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventOutgoingBatch.newBuilder() to construct.
  private EventOutgoingBatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventOutgoingBatch() {
    bridgeContract_ = "";
    bridgeChainId_ = "";
    batchId_ = "";
    nonce_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventOutgoingBatch();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gravity.v1.BatchProto.internal_static_gravity_v1_EventOutgoingBatch_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravity.v1.BatchProto.internal_static_gravity_v1_EventOutgoingBatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravity.v1.EventOutgoingBatch.class, com.gravity.v1.EventOutgoingBatch.Builder.class);
  }

  public static final int BRIDGE_CONTRACT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bridgeContract_ = "";
  /**
   * <code>string bridge_contract = 1 [json_name = "bridgeContract"];</code>
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
   * <code>string bridge_contract = 1 [json_name = "bridgeContract"];</code>
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

  public static final int BRIDGE_CHAIN_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bridgeChainId_ = "";
  /**
   * <code>string bridge_chain_id = 2 [json_name = "bridgeChainId"];</code>
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
   * <code>string bridge_chain_id = 2 [json_name = "bridgeChainId"];</code>
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

  public static final int BATCH_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object batchId_ = "";
  /**
   * <code>string batch_id = 3 [json_name = "batchId"];</code>
   * @return The batchId.
   */
  @java.lang.Override
  public java.lang.String getBatchId() {
    java.lang.Object ref = batchId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      batchId_ = s;
      return s;
    }
  }
  /**
   * <code>string batch_id = 3 [json_name = "batchId"];</code>
   * @return The bytes for batchId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBatchIdBytes() {
    java.lang.Object ref = batchId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      batchId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NONCE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nonce_ = "";
  /**
   * <code>string nonce = 4 [json_name = "nonce"];</code>
   * @return The nonce.
   */
  @java.lang.Override
  public java.lang.String getNonce() {
    java.lang.Object ref = nonce_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nonce_ = s;
      return s;
    }
  }
  /**
   * <code>string nonce = 4 [json_name = "nonce"];</code>
   * @return The bytes for nonce.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNonceBytes() {
    java.lang.Object ref = nonce_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nonce_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgeContract_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bridgeContract_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgeChainId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bridgeChainId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(batchId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, batchId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nonce_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nonce_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgeContract_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bridgeContract_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgeChainId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bridgeChainId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(batchId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, batchId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nonce_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nonce_);
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
    if (!(obj instanceof com.gravity.v1.EventOutgoingBatch)) {
      return super.equals(obj);
    }
    com.gravity.v1.EventOutgoingBatch other = (com.gravity.v1.EventOutgoingBatch) obj;

    if (!getBridgeContract()
        .equals(other.getBridgeContract())) return false;
    if (!getBridgeChainId()
        .equals(other.getBridgeChainId())) return false;
    if (!getBatchId()
        .equals(other.getBatchId())) return false;
    if (!getNonce()
        .equals(other.getNonce())) return false;
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
    hash = (37 * hash) + BRIDGE_CONTRACT_FIELD_NUMBER;
    hash = (53 * hash) + getBridgeContract().hashCode();
    hash = (37 * hash) + BRIDGE_CHAIN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBridgeChainId().hashCode();
    hash = (37 * hash) + BATCH_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBatchId().hashCode();
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + getNonce().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravity.v1.EventOutgoingBatch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.EventOutgoingBatch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.EventOutgoingBatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.EventOutgoingBatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.EventOutgoingBatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.EventOutgoingBatch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.EventOutgoingBatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.EventOutgoingBatch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.gravity.v1.EventOutgoingBatch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.gravity.v1.EventOutgoingBatch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravity.v1.EventOutgoingBatch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.EventOutgoingBatch parseFrom(
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
  public static Builder newBuilder(com.gravity.v1.EventOutgoingBatch prototype) {
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
   * Protobuf type {@code gravity.v1.EventOutgoingBatch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravity.v1.EventOutgoingBatch)
      com.gravity.v1.EventOutgoingBatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravity.v1.BatchProto.internal_static_gravity_v1_EventOutgoingBatch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravity.v1.BatchProto.internal_static_gravity_v1_EventOutgoingBatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravity.v1.EventOutgoingBatch.class, com.gravity.v1.EventOutgoingBatch.Builder.class);
    }

    // Construct using com.gravity.v1.EventOutgoingBatch.newBuilder()
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
      bridgeContract_ = "";
      bridgeChainId_ = "";
      batchId_ = "";
      nonce_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravity.v1.BatchProto.internal_static_gravity_v1_EventOutgoingBatch_descriptor;
    }

    @java.lang.Override
    public com.gravity.v1.EventOutgoingBatch getDefaultInstanceForType() {
      return com.gravity.v1.EventOutgoingBatch.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravity.v1.EventOutgoingBatch build() {
      com.gravity.v1.EventOutgoingBatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravity.v1.EventOutgoingBatch buildPartial() {
      com.gravity.v1.EventOutgoingBatch result = new com.gravity.v1.EventOutgoingBatch(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.gravity.v1.EventOutgoingBatch result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bridgeContract_ = bridgeContract_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bridgeChainId_ = bridgeChainId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.batchId_ = batchId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.nonce_ = nonce_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gravity.v1.EventOutgoingBatch) {
        return mergeFrom((com.gravity.v1.EventOutgoingBatch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravity.v1.EventOutgoingBatch other) {
      if (other == com.gravity.v1.EventOutgoingBatch.getDefaultInstance()) return this;
      if (!other.getBridgeContract().isEmpty()) {
        bridgeContract_ = other.bridgeContract_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBridgeChainId().isEmpty()) {
        bridgeChainId_ = other.bridgeChainId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getBatchId().isEmpty()) {
        batchId_ = other.batchId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getNonce().isEmpty()) {
        nonce_ = other.nonce_;
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
              bridgeContract_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              bridgeChainId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              batchId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              nonce_ = input.readStringRequireUtf8();
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

    private java.lang.Object bridgeContract_ = "";
    /**
     * <code>string bridge_contract = 1 [json_name = "bridgeContract"];</code>
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
     * <code>string bridge_contract = 1 [json_name = "bridgeContract"];</code>
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
     * <code>string bridge_contract = 1 [json_name = "bridgeContract"];</code>
     * @param value The bridgeContract to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeContract(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bridgeContract_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string bridge_contract = 1 [json_name = "bridgeContract"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBridgeContract() {
      bridgeContract_ = getDefaultInstance().getBridgeContract();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string bridge_contract = 1 [json_name = "bridgeContract"];</code>
     * @param value The bytes for bridgeContract to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeContractBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bridgeContract_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object bridgeChainId_ = "";
    /**
     * <code>string bridge_chain_id = 2 [json_name = "bridgeChainId"];</code>
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
     * <code>string bridge_chain_id = 2 [json_name = "bridgeChainId"];</code>
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
     * <code>string bridge_chain_id = 2 [json_name = "bridgeChainId"];</code>
     * @param value The bridgeChainId to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeChainId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bridgeChainId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string bridge_chain_id = 2 [json_name = "bridgeChainId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBridgeChainId() {
      bridgeChainId_ = getDefaultInstance().getBridgeChainId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string bridge_chain_id = 2 [json_name = "bridgeChainId"];</code>
     * @param value The bytes for bridgeChainId to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeChainIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bridgeChainId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object batchId_ = "";
    /**
     * <code>string batch_id = 3 [json_name = "batchId"];</code>
     * @return The batchId.
     */
    public java.lang.String getBatchId() {
      java.lang.Object ref = batchId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        batchId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string batch_id = 3 [json_name = "batchId"];</code>
     * @return The bytes for batchId.
     */
    public com.google.protobuf.ByteString
        getBatchIdBytes() {
      java.lang.Object ref = batchId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        batchId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string batch_id = 3 [json_name = "batchId"];</code>
     * @param value The batchId to set.
     * @return This builder for chaining.
     */
    public Builder setBatchId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      batchId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string batch_id = 3 [json_name = "batchId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBatchId() {
      batchId_ = getDefaultInstance().getBatchId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string batch_id = 3 [json_name = "batchId"];</code>
     * @param value The bytes for batchId to set.
     * @return This builder for chaining.
     */
    public Builder setBatchIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      batchId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object nonce_ = "";
    /**
     * <code>string nonce = 4 [json_name = "nonce"];</code>
     * @return The nonce.
     */
    public java.lang.String getNonce() {
      java.lang.Object ref = nonce_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nonce_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nonce = 4 [json_name = "nonce"];</code>
     * @return The bytes for nonce.
     */
    public com.google.protobuf.ByteString
        getNonceBytes() {
      java.lang.Object ref = nonce_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nonce_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nonce = 4 [json_name = "nonce"];</code>
     * @param value The nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonce(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nonce_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string nonce = 4 [json_name = "nonce"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNonce() {
      nonce_ = getDefaultInstance().getNonce();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string nonce = 4 [json_name = "nonce"];</code>
     * @param value The bytes for nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nonce_ = value;
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


    // @@protoc_insertion_point(builder_scope:gravity.v1.EventOutgoingBatch)
  }

  // @@protoc_insertion_point(class_scope:gravity.v1.EventOutgoingBatch)
  private static final com.gravity.v1.EventOutgoingBatch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravity.v1.EventOutgoingBatch();
  }

  public static com.gravity.v1.EventOutgoingBatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventOutgoingBatch>
      PARSER = new com.google.protobuf.AbstractParser<EventOutgoingBatch>() {
    @java.lang.Override
    public EventOutgoingBatch parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventOutgoingBatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventOutgoingBatch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravity.v1.EventOutgoingBatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

