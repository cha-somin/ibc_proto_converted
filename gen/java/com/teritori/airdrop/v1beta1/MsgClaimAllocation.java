// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: teritori/airdrop/v1beta1/tx.proto

package com.teritori.airdrop.v1beta1;

/**
 * <pre>
 * MsgClaimAllocation defines an sdk.Msg type that claims airdrop allocation
 * </pre>
 *
 * Protobuf type {@code teritori.airdrop.v1beta1.MsgClaimAllocation}
 */
public final class MsgClaimAllocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:teritori.airdrop.v1beta1.MsgClaimAllocation)
    MsgClaimAllocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgClaimAllocation.newBuilder() to construct.
  private MsgClaimAllocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgClaimAllocation() {
    address_ = "";
    pubKey_ = "";
    rewardAddress_ = "";
    signature_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgClaimAllocation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.teritori.airdrop.v1beta1.TxProto.internal_static_teritori_airdrop_v1beta1_MsgClaimAllocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.teritori.airdrop.v1beta1.TxProto.internal_static_teritori_airdrop_v1beta1_MsgClaimAllocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.teritori.airdrop.v1beta1.MsgClaimAllocation.class, com.teritori.airdrop.v1beta1.MsgClaimAllocation.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUB_KEY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pubKey_ = "";
  /**
   * <code>string pub_key = 2 [json_name = "pubKey"];</code>
   * @return The pubKey.
   */
  @java.lang.Override
  public java.lang.String getPubKey() {
    java.lang.Object ref = pubKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pubKey_ = s;
      return s;
    }
  }
  /**
   * <code>string pub_key = 2 [json_name = "pubKey"];</code>
   * @return The bytes for pubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPubKeyBytes() {
    java.lang.Object ref = pubKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pubKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REWARD_ADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rewardAddress_ = "";
  /**
   * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
   * @return The rewardAddress.
   */
  @java.lang.Override
  public java.lang.String getRewardAddress() {
    java.lang.Object ref = rewardAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
   * @return The bytes for rewardAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardAddressBytes() {
    java.lang.Object ref = rewardAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIGNATURE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signature_ = "";
  /**
   * <code>string signature = 4 [json_name = "signature"];</code>
   * @return The signature.
   */
  @java.lang.Override
  public java.lang.String getSignature() {
    java.lang.Object ref = signature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signature_ = s;
      return s;
    }
  }
  /**
   * <code>string signature = 4 [json_name = "signature"];</code>
   * @return The bytes for signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignatureBytes() {
    java.lang.Object ref = signature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signature_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pubKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, rewardAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signature_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, signature_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pubKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, rewardAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signature_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, signature_);
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
    if (!(obj instanceof com.teritori.airdrop.v1beta1.MsgClaimAllocation)) {
      return super.equals(obj);
    }
    com.teritori.airdrop.v1beta1.MsgClaimAllocation other = (com.teritori.airdrop.v1beta1.MsgClaimAllocation) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getPubKey()
        .equals(other.getPubKey())) return false;
    if (!getRewardAddress()
        .equals(other.getRewardAddress())) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPubKey().hashCode();
    hash = (37 * hash) + REWARD_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getRewardAddress().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation parseFrom(
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
  public static Builder newBuilder(com.teritori.airdrop.v1beta1.MsgClaimAllocation prototype) {
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
   * MsgClaimAllocation defines an sdk.Msg type that claims airdrop allocation
   * </pre>
   *
   * Protobuf type {@code teritori.airdrop.v1beta1.MsgClaimAllocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:teritori.airdrop.v1beta1.MsgClaimAllocation)
      com.teritori.airdrop.v1beta1.MsgClaimAllocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.teritori.airdrop.v1beta1.TxProto.internal_static_teritori_airdrop_v1beta1_MsgClaimAllocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.teritori.airdrop.v1beta1.TxProto.internal_static_teritori_airdrop_v1beta1_MsgClaimAllocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.teritori.airdrop.v1beta1.MsgClaimAllocation.class, com.teritori.airdrop.v1beta1.MsgClaimAllocation.Builder.class);
    }

    // Construct using com.teritori.airdrop.v1beta1.MsgClaimAllocation.newBuilder()
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
      address_ = "";
      pubKey_ = "";
      rewardAddress_ = "";
      signature_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.teritori.airdrop.v1beta1.TxProto.internal_static_teritori_airdrop_v1beta1_MsgClaimAllocation_descriptor;
    }

    @java.lang.Override
    public com.teritori.airdrop.v1beta1.MsgClaimAllocation getDefaultInstanceForType() {
      return com.teritori.airdrop.v1beta1.MsgClaimAllocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.teritori.airdrop.v1beta1.MsgClaimAllocation build() {
      com.teritori.airdrop.v1beta1.MsgClaimAllocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.teritori.airdrop.v1beta1.MsgClaimAllocation buildPartial() {
      com.teritori.airdrop.v1beta1.MsgClaimAllocation result = new com.teritori.airdrop.v1beta1.MsgClaimAllocation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.teritori.airdrop.v1beta1.MsgClaimAllocation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pubKey_ = pubKey_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rewardAddress_ = rewardAddress_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.signature_ = signature_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.teritori.airdrop.v1beta1.MsgClaimAllocation) {
        return mergeFrom((com.teritori.airdrop.v1beta1.MsgClaimAllocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.teritori.airdrop.v1beta1.MsgClaimAllocation other) {
      if (other == com.teritori.airdrop.v1beta1.MsgClaimAllocation.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPubKey().isEmpty()) {
        pubKey_ = other.pubKey_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getRewardAddress().isEmpty()) {
        rewardAddress_ = other.rewardAddress_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getSignature().isEmpty()) {
        signature_ = other.signature_;
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
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              pubKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              rewardAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              signature_ = input.readStringRequireUtf8();
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

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object pubKey_ = "";
    /**
     * <code>string pub_key = 2 [json_name = "pubKey"];</code>
     * @return The pubKey.
     */
    public java.lang.String getPubKey() {
      java.lang.Object ref = pubKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pubKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pub_key = 2 [json_name = "pubKey"];</code>
     * @return The bytes for pubKey.
     */
    public com.google.protobuf.ByteString
        getPubKeyBytes() {
      java.lang.Object ref = pubKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pubKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pub_key = 2 [json_name = "pubKey"];</code>
     * @param value The pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pubKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string pub_key = 2 [json_name = "pubKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPubKey() {
      pubKey_ = getDefaultInstance().getPubKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string pub_key = 2 [json_name = "pubKey"];</code>
     * @param value The bytes for pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pubKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object rewardAddress_ = "";
    /**
     * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
     * @return The rewardAddress.
     */
    public java.lang.String getRewardAddress() {
      java.lang.Object ref = rewardAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
     * @return The bytes for rewardAddress.
     */
    public com.google.protobuf.ByteString
        getRewardAddressBytes() {
      java.lang.Object ref = rewardAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
     * @param value The rewardAddress to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rewardAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardAddress() {
      rewardAddress_ = getDefaultInstance().getRewardAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
     * @param value The bytes for rewardAddress to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rewardAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object signature_ = "";
    /**
     * <code>string signature = 4 [json_name = "signature"];</code>
     * @return The signature.
     */
    public java.lang.String getSignature() {
      java.lang.Object ref = signature_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string signature = 4 [json_name = "signature"];</code>
     * @return The bytes for signature.
     */
    public com.google.protobuf.ByteString
        getSignatureBytes() {
      java.lang.Object ref = signature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signature = 4 [json_name = "signature"];</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string signature = 4 [json_name = "signature"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      signature_ = getDefaultInstance().getSignature();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string signature = 4 [json_name = "signature"];</code>
     * @param value The bytes for signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signature_ = value;
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


    // @@protoc_insertion_point(builder_scope:teritori.airdrop.v1beta1.MsgClaimAllocation)
  }

  // @@protoc_insertion_point(class_scope:teritori.airdrop.v1beta1.MsgClaimAllocation)
  private static final com.teritori.airdrop.v1beta1.MsgClaimAllocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.teritori.airdrop.v1beta1.MsgClaimAllocation();
  }

  public static com.teritori.airdrop.v1beta1.MsgClaimAllocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgClaimAllocation>
      PARSER = new com.google.protobuf.AbstractParser<MsgClaimAllocation>() {
    @java.lang.Override
    public MsgClaimAllocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgClaimAllocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgClaimAllocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.teritori.airdrop.v1beta1.MsgClaimAllocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

