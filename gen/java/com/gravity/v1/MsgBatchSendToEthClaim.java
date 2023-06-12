// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/msgs.proto

package com.gravity.v1;

/**
 * <pre>
 * BatchSendToEthClaim claims that a batch of send to eth
 * operations on the bridge contract was executed.
 * </pre>
 *
 * Protobuf type {@code gravity.v1.MsgBatchSendToEthClaim}
 */
public final class MsgBatchSendToEthClaim extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravity.v1.MsgBatchSendToEthClaim)
    MsgBatchSendToEthClaimOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgBatchSendToEthClaim.newBuilder() to construct.
  private MsgBatchSendToEthClaim(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgBatchSendToEthClaim() {
    tokenContract_ = "";
    orchestrator_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgBatchSendToEthClaim();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gravity.v1.MsgsProto.internal_static_gravity_v1_MsgBatchSendToEthClaim_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravity.v1.MsgsProto.internal_static_gravity_v1_MsgBatchSendToEthClaim_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravity.v1.MsgBatchSendToEthClaim.class, com.gravity.v1.MsgBatchSendToEthClaim.Builder.class);
  }

  public static final int EVENT_NONCE_FIELD_NUMBER = 1;
  private long eventNonce_ = 0L;
  /**
   * <code>uint64 event_nonce = 1 [json_name = "eventNonce"];</code>
   * @return The eventNonce.
   */
  @java.lang.Override
  public long getEventNonce() {
    return eventNonce_;
  }

  public static final int ETH_BLOCK_HEIGHT_FIELD_NUMBER = 2;
  private long ethBlockHeight_ = 0L;
  /**
   * <code>uint64 eth_block_height = 2 [json_name = "ethBlockHeight"];</code>
   * @return The ethBlockHeight.
   */
  @java.lang.Override
  public long getEthBlockHeight() {
    return ethBlockHeight_;
  }

  public static final int BATCH_NONCE_FIELD_NUMBER = 3;
  private long batchNonce_ = 0L;
  /**
   * <code>uint64 batch_nonce = 3 [json_name = "batchNonce"];</code>
   * @return The batchNonce.
   */
  @java.lang.Override
  public long getBatchNonce() {
    return batchNonce_;
  }

  public static final int TOKEN_CONTRACT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tokenContract_ = "";
  /**
   * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
   * @return The tokenContract.
   */
  @java.lang.Override
  public java.lang.String getTokenContract() {
    java.lang.Object ref = tokenContract_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tokenContract_ = s;
      return s;
    }
  }
  /**
   * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
   * @return The bytes for tokenContract.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTokenContractBytes() {
    java.lang.Object ref = tokenContract_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tokenContract_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORCHESTRATOR_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orchestrator_ = "";
  /**
   * <code>string orchestrator = 5 [json_name = "orchestrator"];</code>
   * @return The orchestrator.
   */
  @java.lang.Override
  public java.lang.String getOrchestrator() {
    java.lang.Object ref = orchestrator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orchestrator_ = s;
      return s;
    }
  }
  /**
   * <code>string orchestrator = 5 [json_name = "orchestrator"];</code>
   * @return The bytes for orchestrator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrchestratorBytes() {
    java.lang.Object ref = orchestrator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orchestrator_ = b;
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
    if (eventNonce_ != 0L) {
      output.writeUInt64(1, eventNonce_);
    }
    if (ethBlockHeight_ != 0L) {
      output.writeUInt64(2, ethBlockHeight_);
    }
    if (batchNonce_ != 0L) {
      output.writeUInt64(3, batchNonce_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tokenContract_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, tokenContract_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orchestrator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, orchestrator_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eventNonce_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, eventNonce_);
    }
    if (ethBlockHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, ethBlockHeight_);
    }
    if (batchNonce_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, batchNonce_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tokenContract_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, tokenContract_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orchestrator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, orchestrator_);
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
    if (!(obj instanceof com.gravity.v1.MsgBatchSendToEthClaim)) {
      return super.equals(obj);
    }
    com.gravity.v1.MsgBatchSendToEthClaim other = (com.gravity.v1.MsgBatchSendToEthClaim) obj;

    if (getEventNonce()
        != other.getEventNonce()) return false;
    if (getEthBlockHeight()
        != other.getEthBlockHeight()) return false;
    if (getBatchNonce()
        != other.getBatchNonce()) return false;
    if (!getTokenContract()
        .equals(other.getTokenContract())) return false;
    if (!getOrchestrator()
        .equals(other.getOrchestrator())) return false;
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
    hash = (37 * hash) + EVENT_NONCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEventNonce());
    hash = (37 * hash) + ETH_BLOCK_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEthBlockHeight());
    hash = (37 * hash) + BATCH_NONCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBatchNonce());
    hash = (37 * hash) + TOKEN_CONTRACT_FIELD_NUMBER;
    hash = (53 * hash) + getTokenContract().hashCode();
    hash = (37 * hash) + ORCHESTRATOR_FIELD_NUMBER;
    hash = (53 * hash) + getOrchestrator().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravity.v1.MsgBatchSendToEthClaim parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.MsgBatchSendToEthClaim parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.MsgBatchSendToEthClaim parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.MsgBatchSendToEthClaim parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.MsgBatchSendToEthClaim parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.MsgBatchSendToEthClaim parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.MsgBatchSendToEthClaim parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.MsgBatchSendToEthClaim parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.gravity.v1.MsgBatchSendToEthClaim parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.gravity.v1.MsgBatchSendToEthClaim parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravity.v1.MsgBatchSendToEthClaim parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.MsgBatchSendToEthClaim parseFrom(
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
  public static Builder newBuilder(com.gravity.v1.MsgBatchSendToEthClaim prototype) {
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
   * BatchSendToEthClaim claims that a batch of send to eth
   * operations on the bridge contract was executed.
   * </pre>
   *
   * Protobuf type {@code gravity.v1.MsgBatchSendToEthClaim}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravity.v1.MsgBatchSendToEthClaim)
      com.gravity.v1.MsgBatchSendToEthClaimOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravity.v1.MsgsProto.internal_static_gravity_v1_MsgBatchSendToEthClaim_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravity.v1.MsgsProto.internal_static_gravity_v1_MsgBatchSendToEthClaim_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravity.v1.MsgBatchSendToEthClaim.class, com.gravity.v1.MsgBatchSendToEthClaim.Builder.class);
    }

    // Construct using com.gravity.v1.MsgBatchSendToEthClaim.newBuilder()
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
      eventNonce_ = 0L;
      ethBlockHeight_ = 0L;
      batchNonce_ = 0L;
      tokenContract_ = "";
      orchestrator_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravity.v1.MsgsProto.internal_static_gravity_v1_MsgBatchSendToEthClaim_descriptor;
    }

    @java.lang.Override
    public com.gravity.v1.MsgBatchSendToEthClaim getDefaultInstanceForType() {
      return com.gravity.v1.MsgBatchSendToEthClaim.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravity.v1.MsgBatchSendToEthClaim build() {
      com.gravity.v1.MsgBatchSendToEthClaim result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravity.v1.MsgBatchSendToEthClaim buildPartial() {
      com.gravity.v1.MsgBatchSendToEthClaim result = new com.gravity.v1.MsgBatchSendToEthClaim(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.gravity.v1.MsgBatchSendToEthClaim result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eventNonce_ = eventNonce_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ethBlockHeight_ = ethBlockHeight_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.batchNonce_ = batchNonce_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.tokenContract_ = tokenContract_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.orchestrator_ = orchestrator_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gravity.v1.MsgBatchSendToEthClaim) {
        return mergeFrom((com.gravity.v1.MsgBatchSendToEthClaim)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravity.v1.MsgBatchSendToEthClaim other) {
      if (other == com.gravity.v1.MsgBatchSendToEthClaim.getDefaultInstance()) return this;
      if (other.getEventNonce() != 0L) {
        setEventNonce(other.getEventNonce());
      }
      if (other.getEthBlockHeight() != 0L) {
        setEthBlockHeight(other.getEthBlockHeight());
      }
      if (other.getBatchNonce() != 0L) {
        setBatchNonce(other.getBatchNonce());
      }
      if (!other.getTokenContract().isEmpty()) {
        tokenContract_ = other.tokenContract_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getOrchestrator().isEmpty()) {
        orchestrator_ = other.orchestrator_;
        bitField0_ |= 0x00000010;
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
              eventNonce_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              ethBlockHeight_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              batchNonce_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              tokenContract_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              orchestrator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private long eventNonce_ ;
    /**
     * <code>uint64 event_nonce = 1 [json_name = "eventNonce"];</code>
     * @return The eventNonce.
     */
    @java.lang.Override
    public long getEventNonce() {
      return eventNonce_;
    }
    /**
     * <code>uint64 event_nonce = 1 [json_name = "eventNonce"];</code>
     * @param value The eventNonce to set.
     * @return This builder for chaining.
     */
    public Builder setEventNonce(long value) {

      eventNonce_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 event_nonce = 1 [json_name = "eventNonce"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEventNonce() {
      bitField0_ = (bitField0_ & ~0x00000001);
      eventNonce_ = 0L;
      onChanged();
      return this;
    }

    private long ethBlockHeight_ ;
    /**
     * <code>uint64 eth_block_height = 2 [json_name = "ethBlockHeight"];</code>
     * @return The ethBlockHeight.
     */
    @java.lang.Override
    public long getEthBlockHeight() {
      return ethBlockHeight_;
    }
    /**
     * <code>uint64 eth_block_height = 2 [json_name = "ethBlockHeight"];</code>
     * @param value The ethBlockHeight to set.
     * @return This builder for chaining.
     */
    public Builder setEthBlockHeight(long value) {

      ethBlockHeight_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 eth_block_height = 2 [json_name = "ethBlockHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEthBlockHeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ethBlockHeight_ = 0L;
      onChanged();
      return this;
    }

    private long batchNonce_ ;
    /**
     * <code>uint64 batch_nonce = 3 [json_name = "batchNonce"];</code>
     * @return The batchNonce.
     */
    @java.lang.Override
    public long getBatchNonce() {
      return batchNonce_;
    }
    /**
     * <code>uint64 batch_nonce = 3 [json_name = "batchNonce"];</code>
     * @param value The batchNonce to set.
     * @return This builder for chaining.
     */
    public Builder setBatchNonce(long value) {

      batchNonce_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 batch_nonce = 3 [json_name = "batchNonce"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBatchNonce() {
      bitField0_ = (bitField0_ & ~0x00000004);
      batchNonce_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object tokenContract_ = "";
    /**
     * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
     * @return The tokenContract.
     */
    public java.lang.String getTokenContract() {
      java.lang.Object ref = tokenContract_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tokenContract_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
     * @return The bytes for tokenContract.
     */
    public com.google.protobuf.ByteString
        getTokenContractBytes() {
      java.lang.Object ref = tokenContract_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tokenContract_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
     * @param value The tokenContract to set.
     * @return This builder for chaining.
     */
    public Builder setTokenContract(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tokenContract_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTokenContract() {
      tokenContract_ = getDefaultInstance().getTokenContract();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
     * @param value The bytes for tokenContract to set.
     * @return This builder for chaining.
     */
    public Builder setTokenContractBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tokenContract_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object orchestrator_ = "";
    /**
     * <code>string orchestrator = 5 [json_name = "orchestrator"];</code>
     * @return The orchestrator.
     */
    public java.lang.String getOrchestrator() {
      java.lang.Object ref = orchestrator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orchestrator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orchestrator = 5 [json_name = "orchestrator"];</code>
     * @return The bytes for orchestrator.
     */
    public com.google.protobuf.ByteString
        getOrchestratorBytes() {
      java.lang.Object ref = orchestrator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orchestrator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orchestrator = 5 [json_name = "orchestrator"];</code>
     * @param value The orchestrator to set.
     * @return This builder for chaining.
     */
    public Builder setOrchestrator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orchestrator_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string orchestrator = 5 [json_name = "orchestrator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrchestrator() {
      orchestrator_ = getDefaultInstance().getOrchestrator();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string orchestrator = 5 [json_name = "orchestrator"];</code>
     * @param value The bytes for orchestrator to set.
     * @return This builder for chaining.
     */
    public Builder setOrchestratorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orchestrator_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:gravity.v1.MsgBatchSendToEthClaim)
  }

  // @@protoc_insertion_point(class_scope:gravity.v1.MsgBatchSendToEthClaim)
  private static final com.gravity.v1.MsgBatchSendToEthClaim DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravity.v1.MsgBatchSendToEthClaim();
  }

  public static com.gravity.v1.MsgBatchSendToEthClaim getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgBatchSendToEthClaim>
      PARSER = new com.google.protobuf.AbstractParser<MsgBatchSendToEthClaim>() {
    @java.lang.Override
    public MsgBatchSendToEthClaim parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgBatchSendToEthClaim> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgBatchSendToEthClaim> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravity.v1.MsgBatchSendToEthClaim getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

