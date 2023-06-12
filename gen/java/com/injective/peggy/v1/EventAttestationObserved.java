// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/events.proto

package com.injective.peggy.v1;

/**
 * Protobuf type {@code injective.peggy.v1.EventAttestationObserved}
 */
public final class EventAttestationObserved extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.peggy.v1.EventAttestationObserved)
    EventAttestationObservedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventAttestationObserved.newBuilder() to construct.
  private EventAttestationObserved(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventAttestationObserved() {
    attestationType_ = 0;
    bridgeContract_ = "";
    attestationId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventAttestationObserved();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.peggy.v1.EventsProto.internal_static_injective_peggy_v1_EventAttestationObserved_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.peggy.v1.EventsProto.internal_static_injective_peggy_v1_EventAttestationObserved_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.peggy.v1.EventAttestationObserved.class, com.injective.peggy.v1.EventAttestationObserved.Builder.class);
  }

  public static final int ATTESTATION_TYPE_FIELD_NUMBER = 1;
  private int attestationType_ = 0;
  /**
   * <code>.injective.peggy.v1.ClaimType attestation_type = 1 [json_name = "attestationType"];</code>
   * @return The enum numeric value on the wire for attestationType.
   */
  @java.lang.Override public int getAttestationTypeValue() {
    return attestationType_;
  }
  /**
   * <code>.injective.peggy.v1.ClaimType attestation_type = 1 [json_name = "attestationType"];</code>
   * @return The attestationType.
   */
  @java.lang.Override public com.injective.peggy.v1.ClaimType getAttestationType() {
    com.injective.peggy.v1.ClaimType result = com.injective.peggy.v1.ClaimType.forNumber(attestationType_);
    return result == null ? com.injective.peggy.v1.ClaimType.UNRECOGNIZED : result;
  }

  public static final int BRIDGE_CONTRACT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bridgeContract_ = "";
  /**
   * <code>string bridge_contract = 2 [json_name = "bridgeContract"];</code>
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
   * <code>string bridge_contract = 2 [json_name = "bridgeContract"];</code>
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

  public static final int BRIDGE_CHAIN_ID_FIELD_NUMBER = 3;
  private long bridgeChainId_ = 0L;
  /**
   * <code>uint64 bridge_chain_id = 3 [json_name = "bridgeChainId"];</code>
   * @return The bridgeChainId.
   */
  @java.lang.Override
  public long getBridgeChainId() {
    return bridgeChainId_;
  }

  public static final int ATTESTATION_ID_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString attestationId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes attestation_id = 4 [json_name = "attestationId"];</code>
   * @return The attestationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAttestationId() {
    return attestationId_;
  }

  public static final int NONCE_FIELD_NUMBER = 5;
  private long nonce_ = 0L;
  /**
   * <code>uint64 nonce = 5 [json_name = "nonce"];</code>
   * @return The nonce.
   */
  @java.lang.Override
  public long getNonce() {
    return nonce_;
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
    if (attestationType_ != com.injective.peggy.v1.ClaimType.CLAIM_TYPE_UNKNOWN.getNumber()) {
      output.writeEnum(1, attestationType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgeContract_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bridgeContract_);
    }
    if (bridgeChainId_ != 0L) {
      output.writeUInt64(3, bridgeChainId_);
    }
    if (!attestationId_.isEmpty()) {
      output.writeBytes(4, attestationId_);
    }
    if (nonce_ != 0L) {
      output.writeUInt64(5, nonce_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attestationType_ != com.injective.peggy.v1.ClaimType.CLAIM_TYPE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, attestationType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgeContract_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bridgeContract_);
    }
    if (bridgeChainId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, bridgeChainId_);
    }
    if (!attestationId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, attestationId_);
    }
    if (nonce_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, nonce_);
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
    if (!(obj instanceof com.injective.peggy.v1.EventAttestationObserved)) {
      return super.equals(obj);
    }
    com.injective.peggy.v1.EventAttestationObserved other = (com.injective.peggy.v1.EventAttestationObserved) obj;

    if (attestationType_ != other.attestationType_) return false;
    if (!getBridgeContract()
        .equals(other.getBridgeContract())) return false;
    if (getBridgeChainId()
        != other.getBridgeChainId()) return false;
    if (!getAttestationId()
        .equals(other.getAttestationId())) return false;
    if (getNonce()
        != other.getNonce()) return false;
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
    hash = (37 * hash) + ATTESTATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + attestationType_;
    hash = (37 * hash) + BRIDGE_CONTRACT_FIELD_NUMBER;
    hash = (53 * hash) + getBridgeContract().hashCode();
    hash = (37 * hash) + BRIDGE_CHAIN_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBridgeChainId());
    hash = (37 * hash) + ATTESTATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAttestationId().hashCode();
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNonce());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.peggy.v1.EventAttestationObserved parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.EventAttestationObserved parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.EventAttestationObserved parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.EventAttestationObserved parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.EventAttestationObserved parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.EventAttestationObserved parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.EventAttestationObserved parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.peggy.v1.EventAttestationObserved parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.peggy.v1.EventAttestationObserved parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.peggy.v1.EventAttestationObserved parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.peggy.v1.EventAttestationObserved parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.peggy.v1.EventAttestationObserved parseFrom(
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
  public static Builder newBuilder(com.injective.peggy.v1.EventAttestationObserved prototype) {
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
   * Protobuf type {@code injective.peggy.v1.EventAttestationObserved}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.peggy.v1.EventAttestationObserved)
      com.injective.peggy.v1.EventAttestationObservedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.peggy.v1.EventsProto.internal_static_injective_peggy_v1_EventAttestationObserved_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.peggy.v1.EventsProto.internal_static_injective_peggy_v1_EventAttestationObserved_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.peggy.v1.EventAttestationObserved.class, com.injective.peggy.v1.EventAttestationObserved.Builder.class);
    }

    // Construct using com.injective.peggy.v1.EventAttestationObserved.newBuilder()
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
      attestationType_ = 0;
      bridgeContract_ = "";
      bridgeChainId_ = 0L;
      attestationId_ = com.google.protobuf.ByteString.EMPTY;
      nonce_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.peggy.v1.EventsProto.internal_static_injective_peggy_v1_EventAttestationObserved_descriptor;
    }

    @java.lang.Override
    public com.injective.peggy.v1.EventAttestationObserved getDefaultInstanceForType() {
      return com.injective.peggy.v1.EventAttestationObserved.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.peggy.v1.EventAttestationObserved build() {
      com.injective.peggy.v1.EventAttestationObserved result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.peggy.v1.EventAttestationObserved buildPartial() {
      com.injective.peggy.v1.EventAttestationObserved result = new com.injective.peggy.v1.EventAttestationObserved(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.peggy.v1.EventAttestationObserved result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attestationType_ = attestationType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bridgeContract_ = bridgeContract_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.bridgeChainId_ = bridgeChainId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.attestationId_ = attestationId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.nonce_ = nonce_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.peggy.v1.EventAttestationObserved) {
        return mergeFrom((com.injective.peggy.v1.EventAttestationObserved)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.peggy.v1.EventAttestationObserved other) {
      if (other == com.injective.peggy.v1.EventAttestationObserved.getDefaultInstance()) return this;
      if (other.attestationType_ != 0) {
        setAttestationTypeValue(other.getAttestationTypeValue());
      }
      if (!other.getBridgeContract().isEmpty()) {
        bridgeContract_ = other.bridgeContract_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getBridgeChainId() != 0L) {
        setBridgeChainId(other.getBridgeChainId());
      }
      if (other.getAttestationId() != com.google.protobuf.ByteString.EMPTY) {
        setAttestationId(other.getAttestationId());
      }
      if (other.getNonce() != 0L) {
        setNonce(other.getNonce());
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
              attestationType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              bridgeContract_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              bridgeChainId_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              attestationId_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              nonce_ = input.readUInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private int attestationType_ = 0;
    /**
     * <code>.injective.peggy.v1.ClaimType attestation_type = 1 [json_name = "attestationType"];</code>
     * @return The enum numeric value on the wire for attestationType.
     */
    @java.lang.Override public int getAttestationTypeValue() {
      return attestationType_;
    }
    /**
     * <code>.injective.peggy.v1.ClaimType attestation_type = 1 [json_name = "attestationType"];</code>
     * @param value The enum numeric value on the wire for attestationType to set.
     * @return This builder for chaining.
     */
    public Builder setAttestationTypeValue(int value) {
      attestationType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.peggy.v1.ClaimType attestation_type = 1 [json_name = "attestationType"];</code>
     * @return The attestationType.
     */
    @java.lang.Override
    public com.injective.peggy.v1.ClaimType getAttestationType() {
      com.injective.peggy.v1.ClaimType result = com.injective.peggy.v1.ClaimType.forNumber(attestationType_);
      return result == null ? com.injective.peggy.v1.ClaimType.UNRECOGNIZED : result;
    }
    /**
     * <code>.injective.peggy.v1.ClaimType attestation_type = 1 [json_name = "attestationType"];</code>
     * @param value The attestationType to set.
     * @return This builder for chaining.
     */
    public Builder setAttestationType(com.injective.peggy.v1.ClaimType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      attestationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.injective.peggy.v1.ClaimType attestation_type = 1 [json_name = "attestationType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAttestationType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attestationType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object bridgeContract_ = "";
    /**
     * <code>string bridge_contract = 2 [json_name = "bridgeContract"];</code>
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
     * <code>string bridge_contract = 2 [json_name = "bridgeContract"];</code>
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
     * <code>string bridge_contract = 2 [json_name = "bridgeContract"];</code>
     * @param value The bridgeContract to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeContract(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bridgeContract_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string bridge_contract = 2 [json_name = "bridgeContract"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBridgeContract() {
      bridgeContract_ = getDefaultInstance().getBridgeContract();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string bridge_contract = 2 [json_name = "bridgeContract"];</code>
     * @param value The bytes for bridgeContract to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeContractBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bridgeContract_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long bridgeChainId_ ;
    /**
     * <code>uint64 bridge_chain_id = 3 [json_name = "bridgeChainId"];</code>
     * @return The bridgeChainId.
     */
    @java.lang.Override
    public long getBridgeChainId() {
      return bridgeChainId_;
    }
    /**
     * <code>uint64 bridge_chain_id = 3 [json_name = "bridgeChainId"];</code>
     * @param value The bridgeChainId to set.
     * @return This builder for chaining.
     */
    public Builder setBridgeChainId(long value) {

      bridgeChainId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 bridge_chain_id = 3 [json_name = "bridgeChainId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBridgeChainId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      bridgeChainId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString attestationId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes attestation_id = 4 [json_name = "attestationId"];</code>
     * @return The attestationId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAttestationId() {
      return attestationId_;
    }
    /**
     * <code>bytes attestation_id = 4 [json_name = "attestationId"];</code>
     * @param value The attestationId to set.
     * @return This builder for chaining.
     */
    public Builder setAttestationId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      attestationId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes attestation_id = 4 [json_name = "attestationId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAttestationId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      attestationId_ = getDefaultInstance().getAttestationId();
      onChanged();
      return this;
    }

    private long nonce_ ;
    /**
     * <code>uint64 nonce = 5 [json_name = "nonce"];</code>
     * @return The nonce.
     */
    @java.lang.Override
    public long getNonce() {
      return nonce_;
    }
    /**
     * <code>uint64 nonce = 5 [json_name = "nonce"];</code>
     * @param value The nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonce(long value) {

      nonce_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 nonce = 5 [json_name = "nonce"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNonce() {
      bitField0_ = (bitField0_ & ~0x00000010);
      nonce_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:injective.peggy.v1.EventAttestationObserved)
  }

  // @@protoc_insertion_point(class_scope:injective.peggy.v1.EventAttestationObserved)
  private static final com.injective.peggy.v1.EventAttestationObserved DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.peggy.v1.EventAttestationObserved();
  }

  public static com.injective.peggy.v1.EventAttestationObserved getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventAttestationObserved>
      PARSER = new com.google.protobuf.AbstractParser<EventAttestationObserved>() {
    @java.lang.Override
    public EventAttestationObserved parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventAttestationObserved> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventAttestationObserved> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.peggy.v1.EventAttestationObserved getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

