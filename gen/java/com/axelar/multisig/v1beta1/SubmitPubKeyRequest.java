// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/multisig/v1beta1/tx.proto

package com.axelar.multisig.v1beta1;

/**
 * Protobuf type {@code axelar.multisig.v1beta1.SubmitPubKeyRequest}
 */
public final class SubmitPubKeyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.multisig.v1beta1.SubmitPubKeyRequest)
    SubmitPubKeyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubmitPubKeyRequest.newBuilder() to construct.
  private SubmitPubKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubmitPubKeyRequest() {
    sender_ = "";
    keyId_ = "";
    pubKey_ = com.google.protobuf.ByteString.EMPTY;
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubmitPubKeyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.multisig.v1beta1.TxProto.internal_static_axelar_multisig_v1beta1_SubmitPubKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.multisig.v1beta1.TxProto.internal_static_axelar_multisig_v1beta1_SubmitPubKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.multisig.v1beta1.SubmitPubKeyRequest.class, com.axelar.multisig.v1beta1.SubmitPubKeyRequest.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sender_ = "";
  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
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
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
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

  public static final int KEY_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object keyId_ = "";
  /**
   * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
   * @return The keyId.
   */
  @java.lang.Override
  public java.lang.String getKeyId() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyId_ = s;
      return s;
    }
  }
  /**
   * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
   * @return The bytes for keyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyIdBytes() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUB_KEY_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString pubKey_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes pub_key = 3 [json_name = "pubKey", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.PublicKey"];</code>
   * @return The pubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPubKey() {
    return pubKey_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes signature = 4 [json_name = "signature", (.gogoproto.casttype) = "Signature"];</code>
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyId_);
    }
    if (!pubKey_.isEmpty()) {
      output.writeBytes(3, pubKey_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(4, signature_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyId_);
    }
    if (!pubKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, pubKey_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, signature_);
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
    if (!(obj instanceof com.axelar.multisig.v1beta1.SubmitPubKeyRequest)) {
      return super.equals(obj);
    }
    com.axelar.multisig.v1beta1.SubmitPubKeyRequest other = (com.axelar.multisig.v1beta1.SubmitPubKeyRequest) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getKeyId()
        .equals(other.getKeyId())) return false;
    if (!getPubKey()
        .equals(other.getPubKey())) return false;
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
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    hash = (37 * hash) + KEY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getKeyId().hashCode();
    hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPubKey().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.multisig.v1beta1.SubmitPubKeyRequest prototype) {
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
   * Protobuf type {@code axelar.multisig.v1beta1.SubmitPubKeyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.multisig.v1beta1.SubmitPubKeyRequest)
      com.axelar.multisig.v1beta1.SubmitPubKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.multisig.v1beta1.TxProto.internal_static_axelar_multisig_v1beta1_SubmitPubKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.multisig.v1beta1.TxProto.internal_static_axelar_multisig_v1beta1_SubmitPubKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.multisig.v1beta1.SubmitPubKeyRequest.class, com.axelar.multisig.v1beta1.SubmitPubKeyRequest.Builder.class);
    }

    // Construct using com.axelar.multisig.v1beta1.SubmitPubKeyRequest.newBuilder()
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
      keyId_ = "";
      pubKey_ = com.google.protobuf.ByteString.EMPTY;
      signature_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.multisig.v1beta1.TxProto.internal_static_axelar_multisig_v1beta1_SubmitPubKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.multisig.v1beta1.SubmitPubKeyRequest getDefaultInstanceForType() {
      return com.axelar.multisig.v1beta1.SubmitPubKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.multisig.v1beta1.SubmitPubKeyRequest build() {
      com.axelar.multisig.v1beta1.SubmitPubKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.multisig.v1beta1.SubmitPubKeyRequest buildPartial() {
      com.axelar.multisig.v1beta1.SubmitPubKeyRequest result = new com.axelar.multisig.v1beta1.SubmitPubKeyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.multisig.v1beta1.SubmitPubKeyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.keyId_ = keyId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pubKey_ = pubKey_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.signature_ = signature_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.multisig.v1beta1.SubmitPubKeyRequest) {
        return mergeFrom((com.axelar.multisig.v1beta1.SubmitPubKeyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.multisig.v1beta1.SubmitPubKeyRequest other) {
      if (other == com.axelar.multisig.v1beta1.SubmitPubKeyRequest.getDefaultInstance()) return this;
      if (!other.getSender().isEmpty()) {
        sender_ = other.sender_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getKeyId().isEmpty()) {
        keyId_ = other.keyId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getPubKey() != com.google.protobuf.ByteString.EMPTY) {
        setPubKey(other.getPubKey());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
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
              keyId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              pubKey_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              signature_ = input.readBytes();
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
     * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
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
     * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
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
     * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
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
     * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      sender_ = getDefaultInstance().getSender();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
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

    private java.lang.Object keyId_ = "";
    /**
     * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
     * @return The keyId.
     */
    public java.lang.String getKeyId() {
      java.lang.Object ref = keyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
     * @return The bytes for keyId.
     */
    public com.google.protobuf.ByteString
        getKeyIdBytes() {
      java.lang.Object ref = keyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
     * @param value The keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyId() {
      keyId_ = getDefaultInstance().getKeyId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
     * @param value The bytes for keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString pubKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes pub_key = 3 [json_name = "pubKey", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.PublicKey"];</code>
     * @return The pubKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPubKey() {
      return pubKey_;
    }
    /**
     * <code>bytes pub_key = 3 [json_name = "pubKey", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.PublicKey"];</code>
     * @param value The pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      pubKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes pub_key = 3 [json_name = "pubKey", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.PublicKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPubKey() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pubKey_ = getDefaultInstance().getPubKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 4 [json_name = "signature", (.gogoproto.casttype) = "Signature"];</code>
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 4 [json_name = "signature", (.gogoproto.casttype) = "Signature"];</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 4 [json_name = "signature", (.gogoproto.casttype) = "Signature"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000008);
      signature_ = getDefaultInstance().getSignature();
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


    // @@protoc_insertion_point(builder_scope:axelar.multisig.v1beta1.SubmitPubKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.multisig.v1beta1.SubmitPubKeyRequest)
  private static final com.axelar.multisig.v1beta1.SubmitPubKeyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.multisig.v1beta1.SubmitPubKeyRequest();
  }

  public static com.axelar.multisig.v1beta1.SubmitPubKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitPubKeyRequest>
      PARSER = new com.google.protobuf.AbstractParser<SubmitPubKeyRequest>() {
    @java.lang.Override
    public SubmitPubKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubmitPubKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitPubKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.multisig.v1beta1.SubmitPubKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

