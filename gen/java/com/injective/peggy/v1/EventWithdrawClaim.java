// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/events.proto

package com.injective.peggy.v1;

/**
 * Protobuf type {@code injective.peggy.v1.EventWithdrawClaim}
 */
public final class EventWithdrawClaim extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.peggy.v1.EventWithdrawClaim)
    EventWithdrawClaimOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventWithdrawClaim.newBuilder() to construct.
  private EventWithdrawClaim(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventWithdrawClaim() {
    attestationId_ = com.google.protobuf.ByteString.EMPTY;
    tokenContract_ = "";
    orchestratorAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventWithdrawClaim();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.peggy.v1.EventsProto.internal_static_injective_peggy_v1_EventWithdrawClaim_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.peggy.v1.EventsProto.internal_static_injective_peggy_v1_EventWithdrawClaim_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.peggy.v1.EventWithdrawClaim.class, com.injective.peggy.v1.EventWithdrawClaim.Builder.class);
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

  public static final int EVENT_HEIGHT_FIELD_NUMBER = 2;
  private long eventHeight_ = 0L;
  /**
   * <code>uint64 event_height = 2 [json_name = "eventHeight"];</code>
   * @return The eventHeight.
   */
  @java.lang.Override
  public long getEventHeight() {
    return eventHeight_;
  }

  public static final int ATTESTATION_ID_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString attestationId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes attestation_id = 3 [json_name = "attestationId"];</code>
   * @return The attestationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAttestationId() {
    return attestationId_;
  }

  public static final int BATCH_NONCE_FIELD_NUMBER = 4;
  private long batchNonce_ = 0L;
  /**
   * <code>uint64 batch_nonce = 4 [json_name = "batchNonce"];</code>
   * @return The batchNonce.
   */
  @java.lang.Override
  public long getBatchNonce() {
    return batchNonce_;
  }

  public static final int TOKEN_CONTRACT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tokenContract_ = "";
  /**
   * <code>string token_contract = 5 [json_name = "tokenContract"];</code>
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
   * <code>string token_contract = 5 [json_name = "tokenContract"];</code>
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

  public static final int ORCHESTRATOR_ADDRESS_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orchestratorAddress_ = "";
  /**
   * <code>string orchestrator_address = 6 [json_name = "orchestratorAddress"];</code>
   * @return The orchestratorAddress.
   */
  @java.lang.Override
  public java.lang.String getOrchestratorAddress() {
    java.lang.Object ref = orchestratorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orchestratorAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string orchestrator_address = 6 [json_name = "orchestratorAddress"];</code>
   * @return The bytes for orchestratorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrchestratorAddressBytes() {
    java.lang.Object ref = orchestratorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orchestratorAddress_ = b;
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
    if (eventHeight_ != 0L) {
      output.writeUInt64(2, eventHeight_);
    }
    if (!attestationId_.isEmpty()) {
      output.writeBytes(3, attestationId_);
    }
    if (batchNonce_ != 0L) {
      output.writeUInt64(4, batchNonce_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tokenContract_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, tokenContract_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orchestratorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, orchestratorAddress_);
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
    if (eventHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, eventHeight_);
    }
    if (!attestationId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, attestationId_);
    }
    if (batchNonce_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, batchNonce_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tokenContract_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, tokenContract_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orchestratorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, orchestratorAddress_);
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
    if (!(obj instanceof com.injective.peggy.v1.EventWithdrawClaim)) {
      return super.equals(obj);
    }
    com.injective.peggy.v1.EventWithdrawClaim other = (com.injective.peggy.v1.EventWithdrawClaim) obj;

    if (getEventNonce()
        != other.getEventNonce()) return false;
    if (getEventHeight()
        != other.getEventHeight()) return false;
    if (!getAttestationId()
        .equals(other.getAttestationId())) return false;
    if (getBatchNonce()
        != other.getBatchNonce()) return false;
    if (!getTokenContract()
        .equals(other.getTokenContract())) return false;
    if (!getOrchestratorAddress()
        .equals(other.getOrchestratorAddress())) return false;
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
    hash = (37 * hash) + EVENT_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEventHeight());
    hash = (37 * hash) + ATTESTATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAttestationId().hashCode();
    hash = (37 * hash) + BATCH_NONCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBatchNonce());
    hash = (37 * hash) + TOKEN_CONTRACT_FIELD_NUMBER;
    hash = (53 * hash) + getTokenContract().hashCode();
    hash = (37 * hash) + ORCHESTRATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getOrchestratorAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.peggy.v1.EventWithdrawClaim parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.EventWithdrawClaim parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.EventWithdrawClaim parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.EventWithdrawClaim parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.EventWithdrawClaim parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.EventWithdrawClaim parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.EventWithdrawClaim parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.peggy.v1.EventWithdrawClaim parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.peggy.v1.EventWithdrawClaim parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.peggy.v1.EventWithdrawClaim parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.peggy.v1.EventWithdrawClaim parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.peggy.v1.EventWithdrawClaim parseFrom(
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
  public static Builder newBuilder(com.injective.peggy.v1.EventWithdrawClaim prototype) {
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
   * Protobuf type {@code injective.peggy.v1.EventWithdrawClaim}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.peggy.v1.EventWithdrawClaim)
      com.injective.peggy.v1.EventWithdrawClaimOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.peggy.v1.EventsProto.internal_static_injective_peggy_v1_EventWithdrawClaim_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.peggy.v1.EventsProto.internal_static_injective_peggy_v1_EventWithdrawClaim_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.peggy.v1.EventWithdrawClaim.class, com.injective.peggy.v1.EventWithdrawClaim.Builder.class);
    }

    // Construct using com.injective.peggy.v1.EventWithdrawClaim.newBuilder()
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
      eventHeight_ = 0L;
      attestationId_ = com.google.protobuf.ByteString.EMPTY;
      batchNonce_ = 0L;
      tokenContract_ = "";
      orchestratorAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.peggy.v1.EventsProto.internal_static_injective_peggy_v1_EventWithdrawClaim_descriptor;
    }

    @java.lang.Override
    public com.injective.peggy.v1.EventWithdrawClaim getDefaultInstanceForType() {
      return com.injective.peggy.v1.EventWithdrawClaim.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.peggy.v1.EventWithdrawClaim build() {
      com.injective.peggy.v1.EventWithdrawClaim result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.peggy.v1.EventWithdrawClaim buildPartial() {
      com.injective.peggy.v1.EventWithdrawClaim result = new com.injective.peggy.v1.EventWithdrawClaim(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.peggy.v1.EventWithdrawClaim result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eventNonce_ = eventNonce_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventHeight_ = eventHeight_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.attestationId_ = attestationId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.batchNonce_ = batchNonce_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.tokenContract_ = tokenContract_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.orchestratorAddress_ = orchestratorAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.peggy.v1.EventWithdrawClaim) {
        return mergeFrom((com.injective.peggy.v1.EventWithdrawClaim)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.peggy.v1.EventWithdrawClaim other) {
      if (other == com.injective.peggy.v1.EventWithdrawClaim.getDefaultInstance()) return this;
      if (other.getEventNonce() != 0L) {
        setEventNonce(other.getEventNonce());
      }
      if (other.getEventHeight() != 0L) {
        setEventHeight(other.getEventHeight());
      }
      if (other.getAttestationId() != com.google.protobuf.ByteString.EMPTY) {
        setAttestationId(other.getAttestationId());
      }
      if (other.getBatchNonce() != 0L) {
        setBatchNonce(other.getBatchNonce());
      }
      if (!other.getTokenContract().isEmpty()) {
        tokenContract_ = other.tokenContract_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getOrchestratorAddress().isEmpty()) {
        orchestratorAddress_ = other.orchestratorAddress_;
        bitField0_ |= 0x00000020;
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
              eventHeight_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              attestationId_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              batchNonce_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              tokenContract_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              orchestratorAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private long eventHeight_ ;
    /**
     * <code>uint64 event_height = 2 [json_name = "eventHeight"];</code>
     * @return The eventHeight.
     */
    @java.lang.Override
    public long getEventHeight() {
      return eventHeight_;
    }
    /**
     * <code>uint64 event_height = 2 [json_name = "eventHeight"];</code>
     * @param value The eventHeight to set.
     * @return This builder for chaining.
     */
    public Builder setEventHeight(long value) {

      eventHeight_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 event_height = 2 [json_name = "eventHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEventHeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eventHeight_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString attestationId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes attestation_id = 3 [json_name = "attestationId"];</code>
     * @return The attestationId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAttestationId() {
      return attestationId_;
    }
    /**
     * <code>bytes attestation_id = 3 [json_name = "attestationId"];</code>
     * @param value The attestationId to set.
     * @return This builder for chaining.
     */
    public Builder setAttestationId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      attestationId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes attestation_id = 3 [json_name = "attestationId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAttestationId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      attestationId_ = getDefaultInstance().getAttestationId();
      onChanged();
      return this;
    }

    private long batchNonce_ ;
    /**
     * <code>uint64 batch_nonce = 4 [json_name = "batchNonce"];</code>
     * @return The batchNonce.
     */
    @java.lang.Override
    public long getBatchNonce() {
      return batchNonce_;
    }
    /**
     * <code>uint64 batch_nonce = 4 [json_name = "batchNonce"];</code>
     * @param value The batchNonce to set.
     * @return This builder for chaining.
     */
    public Builder setBatchNonce(long value) {

      batchNonce_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 batch_nonce = 4 [json_name = "batchNonce"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBatchNonce() {
      bitField0_ = (bitField0_ & ~0x00000008);
      batchNonce_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object tokenContract_ = "";
    /**
     * <code>string token_contract = 5 [json_name = "tokenContract"];</code>
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
     * <code>string token_contract = 5 [json_name = "tokenContract"];</code>
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
     * <code>string token_contract = 5 [json_name = "tokenContract"];</code>
     * @param value The tokenContract to set.
     * @return This builder for chaining.
     */
    public Builder setTokenContract(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tokenContract_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string token_contract = 5 [json_name = "tokenContract"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTokenContract() {
      tokenContract_ = getDefaultInstance().getTokenContract();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string token_contract = 5 [json_name = "tokenContract"];</code>
     * @param value The bytes for tokenContract to set.
     * @return This builder for chaining.
     */
    public Builder setTokenContractBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tokenContract_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object orchestratorAddress_ = "";
    /**
     * <code>string orchestrator_address = 6 [json_name = "orchestratorAddress"];</code>
     * @return The orchestratorAddress.
     */
    public java.lang.String getOrchestratorAddress() {
      java.lang.Object ref = orchestratorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orchestratorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orchestrator_address = 6 [json_name = "orchestratorAddress"];</code>
     * @return The bytes for orchestratorAddress.
     */
    public com.google.protobuf.ByteString
        getOrchestratorAddressBytes() {
      java.lang.Object ref = orchestratorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orchestratorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orchestrator_address = 6 [json_name = "orchestratorAddress"];</code>
     * @param value The orchestratorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOrchestratorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orchestratorAddress_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>string orchestrator_address = 6 [json_name = "orchestratorAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrchestratorAddress() {
      orchestratorAddress_ = getDefaultInstance().getOrchestratorAddress();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <code>string orchestrator_address = 6 [json_name = "orchestratorAddress"];</code>
     * @param value The bytes for orchestratorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOrchestratorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orchestratorAddress_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:injective.peggy.v1.EventWithdrawClaim)
  }

  // @@protoc_insertion_point(class_scope:injective.peggy.v1.EventWithdrawClaim)
  private static final com.injective.peggy.v1.EventWithdrawClaim DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.peggy.v1.EventWithdrawClaim();
  }

  public static com.injective.peggy.v1.EventWithdrawClaim getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventWithdrawClaim>
      PARSER = new com.google.protobuf.AbstractParser<EventWithdrawClaim>() {
    @java.lang.Override
    public EventWithdrawClaim parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventWithdrawClaim> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventWithdrawClaim> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.peggy.v1.EventWithdrawClaim getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

