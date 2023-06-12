// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/tss/tofnd/v1beta1/multisig.proto

package com.axelar.tss.tofnd.v1beta1;

/**
 * Protobuf type {@code axelar.tss.tofnd.v1beta1.SignRequest}
 */
public final class SignRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.tss.tofnd.v1beta1.SignRequest)
    SignRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SignRequest.newBuilder() to construct.
  private SignRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignRequest() {
    keyUid_ = "";
    msgToSign_ = com.google.protobuf.ByteString.EMPTY;
    partyUid_ = "";
    pubKey_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SignRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.tss.tofnd.v1beta1.MultisigProto.internal_static_axelar_tss_tofnd_v1beta1_SignRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.tss.tofnd.v1beta1.MultisigProto.internal_static_axelar_tss_tofnd_v1beta1_SignRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.tss.tofnd.v1beta1.SignRequest.class, com.axelar.tss.tofnd.v1beta1.SignRequest.Builder.class);
  }

  public static final int KEY_UID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object keyUid_ = "";
  /**
   * <code>string key_uid = 1 [json_name = "keyUid"];</code>
   * @return The keyUid.
   */
  @java.lang.Override
  public java.lang.String getKeyUid() {
    java.lang.Object ref = keyUid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyUid_ = s;
      return s;
    }
  }
  /**
   * <code>string key_uid = 1 [json_name = "keyUid"];</code>
   * @return The bytes for keyUid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyUidBytes() {
    java.lang.Object ref = keyUid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyUid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSG_TO_SIGN_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString msgToSign_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * 32-byte pre-hashed message digest
   * </pre>
   *
   * <code>bytes msg_to_sign = 2 [json_name = "msgToSign"];</code>
   * @return The msgToSign.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMsgToSign() {
    return msgToSign_;
  }

  public static final int PARTY_UID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object partyUid_ = "";
  /**
   * <pre>
   * used only for logging
   * </pre>
   *
   * <code>string party_uid = 3 [json_name = "partyUid"];</code>
   * @return The partyUid.
   */
  @java.lang.Override
  public java.lang.String getPartyUid() {
    java.lang.Object ref = partyUid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partyUid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * used only for logging
   * </pre>
   *
   * <code>string party_uid = 3 [json_name = "partyUid"];</code>
   * @return The bytes for partyUid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPartyUidBytes() {
    java.lang.Object ref = partyUid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      partyUid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUB_KEY_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString pubKey_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * SEC1-encoded compressed pub key bytes to find the right
   * </pre>
   *
   * <code>bytes pub_key = 4 [json_name = "pubKey"];</code>
   * @return The pubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPubKey() {
    return pubKey_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyUid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keyUid_);
    }
    if (!msgToSign_.isEmpty()) {
      output.writeBytes(2, msgToSign_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(partyUid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, partyUid_);
    }
    if (!pubKey_.isEmpty()) {
      output.writeBytes(4, pubKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyUid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keyUid_);
    }
    if (!msgToSign_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, msgToSign_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(partyUid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, partyUid_);
    }
    if (!pubKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, pubKey_);
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
    if (!(obj instanceof com.axelar.tss.tofnd.v1beta1.SignRequest)) {
      return super.equals(obj);
    }
    com.axelar.tss.tofnd.v1beta1.SignRequest other = (com.axelar.tss.tofnd.v1beta1.SignRequest) obj;

    if (!getKeyUid()
        .equals(other.getKeyUid())) return false;
    if (!getMsgToSign()
        .equals(other.getMsgToSign())) return false;
    if (!getPartyUid()
        .equals(other.getPartyUid())) return false;
    if (!getPubKey()
        .equals(other.getPubKey())) return false;
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
    hash = (37 * hash) + KEY_UID_FIELD_NUMBER;
    hash = (53 * hash) + getKeyUid().hashCode();
    hash = (37 * hash) + MSG_TO_SIGN_FIELD_NUMBER;
    hash = (53 * hash) + getMsgToSign().hashCode();
    hash = (37 * hash) + PARTY_UID_FIELD_NUMBER;
    hash = (53 * hash) + getPartyUid().hashCode();
    hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPubKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.tss.tofnd.v1beta1.SignRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.tss.tofnd.v1beta1.SignRequest prototype) {
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
   * Protobuf type {@code axelar.tss.tofnd.v1beta1.SignRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.tss.tofnd.v1beta1.SignRequest)
      com.axelar.tss.tofnd.v1beta1.SignRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.tss.tofnd.v1beta1.MultisigProto.internal_static_axelar_tss_tofnd_v1beta1_SignRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.tss.tofnd.v1beta1.MultisigProto.internal_static_axelar_tss_tofnd_v1beta1_SignRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.tss.tofnd.v1beta1.SignRequest.class, com.axelar.tss.tofnd.v1beta1.SignRequest.Builder.class);
    }

    // Construct using com.axelar.tss.tofnd.v1beta1.SignRequest.newBuilder()
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
      keyUid_ = "";
      msgToSign_ = com.google.protobuf.ByteString.EMPTY;
      partyUid_ = "";
      pubKey_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.tss.tofnd.v1beta1.MultisigProto.internal_static_axelar_tss_tofnd_v1beta1_SignRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.tss.tofnd.v1beta1.SignRequest getDefaultInstanceForType() {
      return com.axelar.tss.tofnd.v1beta1.SignRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.tss.tofnd.v1beta1.SignRequest build() {
      com.axelar.tss.tofnd.v1beta1.SignRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.tss.tofnd.v1beta1.SignRequest buildPartial() {
      com.axelar.tss.tofnd.v1beta1.SignRequest result = new com.axelar.tss.tofnd.v1beta1.SignRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.tss.tofnd.v1beta1.SignRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.keyUid_ = keyUid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.msgToSign_ = msgToSign_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.partyUid_ = partyUid_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pubKey_ = pubKey_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.tss.tofnd.v1beta1.SignRequest) {
        return mergeFrom((com.axelar.tss.tofnd.v1beta1.SignRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.tss.tofnd.v1beta1.SignRequest other) {
      if (other == com.axelar.tss.tofnd.v1beta1.SignRequest.getDefaultInstance()) return this;
      if (!other.getKeyUid().isEmpty()) {
        keyUid_ = other.keyUid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getMsgToSign() != com.google.protobuf.ByteString.EMPTY) {
        setMsgToSign(other.getMsgToSign());
      }
      if (!other.getPartyUid().isEmpty()) {
        partyUid_ = other.partyUid_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getPubKey() != com.google.protobuf.ByteString.EMPTY) {
        setPubKey(other.getPubKey());
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
              keyUid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              msgToSign_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              partyUid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              pubKey_ = input.readBytes();
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

    private java.lang.Object keyUid_ = "";
    /**
     * <code>string key_uid = 1 [json_name = "keyUid"];</code>
     * @return The keyUid.
     */
    public java.lang.String getKeyUid() {
      java.lang.Object ref = keyUid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyUid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key_uid = 1 [json_name = "keyUid"];</code>
     * @return The bytes for keyUid.
     */
    public com.google.protobuf.ByteString
        getKeyUidBytes() {
      java.lang.Object ref = keyUid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyUid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key_uid = 1 [json_name = "keyUid"];</code>
     * @param value The keyUid to set.
     * @return This builder for chaining.
     */
    public Builder setKeyUid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keyUid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string key_uid = 1 [json_name = "keyUid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyUid() {
      keyUid_ = getDefaultInstance().getKeyUid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string key_uid = 1 [json_name = "keyUid"];</code>
     * @param value The bytes for keyUid to set.
     * @return This builder for chaining.
     */
    public Builder setKeyUidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keyUid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString msgToSign_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 32-byte pre-hashed message digest
     * </pre>
     *
     * <code>bytes msg_to_sign = 2 [json_name = "msgToSign"];</code>
     * @return The msgToSign.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMsgToSign() {
      return msgToSign_;
    }
    /**
     * <pre>
     * 32-byte pre-hashed message digest
     * </pre>
     *
     * <code>bytes msg_to_sign = 2 [json_name = "msgToSign"];</code>
     * @param value The msgToSign to set.
     * @return This builder for chaining.
     */
    public Builder setMsgToSign(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      msgToSign_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 32-byte pre-hashed message digest
     * </pre>
     *
     * <code>bytes msg_to_sign = 2 [json_name = "msgToSign"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgToSign() {
      bitField0_ = (bitField0_ & ~0x00000002);
      msgToSign_ = getDefaultInstance().getMsgToSign();
      onChanged();
      return this;
    }

    private java.lang.Object partyUid_ = "";
    /**
     * <pre>
     * used only for logging
     * </pre>
     *
     * <code>string party_uid = 3 [json_name = "partyUid"];</code>
     * @return The partyUid.
     */
    public java.lang.String getPartyUid() {
      java.lang.Object ref = partyUid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partyUid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * used only for logging
     * </pre>
     *
     * <code>string party_uid = 3 [json_name = "partyUid"];</code>
     * @return The bytes for partyUid.
     */
    public com.google.protobuf.ByteString
        getPartyUidBytes() {
      java.lang.Object ref = partyUid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partyUid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * used only for logging
     * </pre>
     *
     * <code>string party_uid = 3 [json_name = "partyUid"];</code>
     * @param value The partyUid to set.
     * @return This builder for chaining.
     */
    public Builder setPartyUid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      partyUid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * used only for logging
     * </pre>
     *
     * <code>string party_uid = 3 [json_name = "partyUid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPartyUid() {
      partyUid_ = getDefaultInstance().getPartyUid();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * used only for logging
     * </pre>
     *
     * <code>string party_uid = 3 [json_name = "partyUid"];</code>
     * @param value The bytes for partyUid to set.
     * @return This builder for chaining.
     */
    public Builder setPartyUidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      partyUid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString pubKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * SEC1-encoded compressed pub key bytes to find the right
     * </pre>
     *
     * <code>bytes pub_key = 4 [json_name = "pubKey"];</code>
     * @return The pubKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPubKey() {
      return pubKey_;
    }
    /**
     * <pre>
     * SEC1-encoded compressed pub key bytes to find the right
     * </pre>
     *
     * <code>bytes pub_key = 4 [json_name = "pubKey"];</code>
     * @param value The pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      pubKey_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SEC1-encoded compressed pub key bytes to find the right
     * </pre>
     *
     * <code>bytes pub_key = 4 [json_name = "pubKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPubKey() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pubKey_ = getDefaultInstance().getPubKey();
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


    // @@protoc_insertion_point(builder_scope:axelar.tss.tofnd.v1beta1.SignRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.tss.tofnd.v1beta1.SignRequest)
  private static final com.axelar.tss.tofnd.v1beta1.SignRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.tss.tofnd.v1beta1.SignRequest();
  }

  public static com.axelar.tss.tofnd.v1beta1.SignRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignRequest>
      PARSER = new com.google.protobuf.AbstractParser<SignRequest>() {
    @java.lang.Override
    public SignRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SignRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.tss.tofnd.v1beta1.SignRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

