// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/iid/v1beta1/tx.proto

package com.ixo.iid.v1beta1;

/**
 * Protobuf type {@code ixo.iid.v1beta1.MsgAddVerification}
 */
public final class MsgAddVerification extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ixo.iid.v1beta1.MsgAddVerification)
    MsgAddVerificationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAddVerification.newBuilder() to construct.
  private MsgAddVerification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAddVerification() {
    id_ = "";
    signer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAddVerification();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ixo.iid.v1beta1.TxProto.internal_static_ixo_iid_v1beta1_MsgAddVerification_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ixo.iid.v1beta1.TxProto.internal_static_ixo_iid_v1beta1_MsgAddVerification_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ixo.iid.v1beta1.MsgAddVerification.class, com.ixo.iid.v1beta1.MsgAddVerification.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   * the did
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the did
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERIFICATION_FIELD_NUMBER = 2;
  private com.ixo.iid.v1beta1.Verification verification_;
  /**
   * <pre>
   * the verification to add
   * </pre>
   *
   * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
   * @return Whether the verification field is set.
   */
  @java.lang.Override
  public boolean hasVerification() {
    return verification_ != null;
  }
  /**
   * <pre>
   * the verification to add
   * </pre>
   *
   * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
   * @return The verification.
   */
  @java.lang.Override
  public com.ixo.iid.v1beta1.Verification getVerification() {
    return verification_ == null ? com.ixo.iid.v1beta1.Verification.getDefaultInstance() : verification_;
  }
  /**
   * <pre>
   * the verification to add
   * </pre>
   *
   * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
   */
  @java.lang.Override
  public com.ixo.iid.v1beta1.VerificationOrBuilder getVerificationOrBuilder() {
    return verification_ == null ? com.ixo.iid.v1beta1.Verification.getDefaultInstance() : verification_;
  }

  public static final int SIGNER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signer_ = "";
  /**
   * <pre>
   * address of the account signing the message
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The signer.
   */
  @java.lang.Override
  public java.lang.String getSigner() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * address of the account signing the message
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignerBytes() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signer_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (verification_ != null) {
      output.writeMessage(2, getVerification());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, signer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (verification_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVerification());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, signer_);
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
    if (!(obj instanceof com.ixo.iid.v1beta1.MsgAddVerification)) {
      return super.equals(obj);
    }
    com.ixo.iid.v1beta1.MsgAddVerification other = (com.ixo.iid.v1beta1.MsgAddVerification) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (hasVerification() != other.hasVerification()) return false;
    if (hasVerification()) {
      if (!getVerification()
          .equals(other.getVerification())) return false;
    }
    if (!getSigner()
        .equals(other.getSigner())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasVerification()) {
      hash = (37 * hash) + VERIFICATION_FIELD_NUMBER;
      hash = (53 * hash) + getVerification().hashCode();
    }
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ixo.iid.v1beta1.MsgAddVerification parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.iid.v1beta1.MsgAddVerification parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.iid.v1beta1.MsgAddVerification parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.iid.v1beta1.MsgAddVerification parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.iid.v1beta1.MsgAddVerification parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.iid.v1beta1.MsgAddVerification parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.iid.v1beta1.MsgAddVerification parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.iid.v1beta1.MsgAddVerification parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ixo.iid.v1beta1.MsgAddVerification parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ixo.iid.v1beta1.MsgAddVerification parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ixo.iid.v1beta1.MsgAddVerification parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.iid.v1beta1.MsgAddVerification parseFrom(
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
  public static Builder newBuilder(com.ixo.iid.v1beta1.MsgAddVerification prototype) {
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
   * Protobuf type {@code ixo.iid.v1beta1.MsgAddVerification}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ixo.iid.v1beta1.MsgAddVerification)
      com.ixo.iid.v1beta1.MsgAddVerificationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.iid.v1beta1.TxProto.internal_static_ixo_iid_v1beta1_MsgAddVerification_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.iid.v1beta1.TxProto.internal_static_ixo_iid_v1beta1_MsgAddVerification_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.iid.v1beta1.MsgAddVerification.class, com.ixo.iid.v1beta1.MsgAddVerification.Builder.class);
    }

    // Construct using com.ixo.iid.v1beta1.MsgAddVerification.newBuilder()
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
      id_ = "";
      verification_ = null;
      if (verificationBuilder_ != null) {
        verificationBuilder_.dispose();
        verificationBuilder_ = null;
      }
      signer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ixo.iid.v1beta1.TxProto.internal_static_ixo_iid_v1beta1_MsgAddVerification_descriptor;
    }

    @java.lang.Override
    public com.ixo.iid.v1beta1.MsgAddVerification getDefaultInstanceForType() {
      return com.ixo.iid.v1beta1.MsgAddVerification.getDefaultInstance();
    }

    @java.lang.Override
    public com.ixo.iid.v1beta1.MsgAddVerification build() {
      com.ixo.iid.v1beta1.MsgAddVerification result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ixo.iid.v1beta1.MsgAddVerification buildPartial() {
      com.ixo.iid.v1beta1.MsgAddVerification result = new com.ixo.iid.v1beta1.MsgAddVerification(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ixo.iid.v1beta1.MsgAddVerification result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.verification_ = verificationBuilder_ == null
            ? verification_
            : verificationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.signer_ = signer_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ixo.iid.v1beta1.MsgAddVerification) {
        return mergeFrom((com.ixo.iid.v1beta1.MsgAddVerification)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ixo.iid.v1beta1.MsgAddVerification other) {
      if (other == com.ixo.iid.v1beta1.MsgAddVerification.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasVerification()) {
        mergeVerification(other.getVerification());
      }
      if (!other.getSigner().isEmpty()) {
        signer_ = other.signer_;
        bitField0_ |= 0x00000004;
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
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getVerificationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              signer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * the did
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the did
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the did
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the did
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the did
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.ixo.iid.v1beta1.Verification verification_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.iid.v1beta1.Verification, com.ixo.iid.v1beta1.Verification.Builder, com.ixo.iid.v1beta1.VerificationOrBuilder> verificationBuilder_;
    /**
     * <pre>
     * the verification to add
     * </pre>
     *
     * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
     * @return Whether the verification field is set.
     */
    public boolean hasVerification() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * the verification to add
     * </pre>
     *
     * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
     * @return The verification.
     */
    public com.ixo.iid.v1beta1.Verification getVerification() {
      if (verificationBuilder_ == null) {
        return verification_ == null ? com.ixo.iid.v1beta1.Verification.getDefaultInstance() : verification_;
      } else {
        return verificationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the verification to add
     * </pre>
     *
     * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
     */
    public Builder setVerification(com.ixo.iid.v1beta1.Verification value) {
      if (verificationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        verification_ = value;
      } else {
        verificationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the verification to add
     * </pre>
     *
     * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
     */
    public Builder setVerification(
        com.ixo.iid.v1beta1.Verification.Builder builderForValue) {
      if (verificationBuilder_ == null) {
        verification_ = builderForValue.build();
      } else {
        verificationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the verification to add
     * </pre>
     *
     * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
     */
    public Builder mergeVerification(com.ixo.iid.v1beta1.Verification value) {
      if (verificationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          verification_ != null &&
          verification_ != com.ixo.iid.v1beta1.Verification.getDefaultInstance()) {
          getVerificationBuilder().mergeFrom(value);
        } else {
          verification_ = value;
        }
      } else {
        verificationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the verification to add
     * </pre>
     *
     * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
     */
    public Builder clearVerification() {
      bitField0_ = (bitField0_ & ~0x00000002);
      verification_ = null;
      if (verificationBuilder_ != null) {
        verificationBuilder_.dispose();
        verificationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the verification to add
     * </pre>
     *
     * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
     */
    public com.ixo.iid.v1beta1.Verification.Builder getVerificationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getVerificationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the verification to add
     * </pre>
     *
     * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
     */
    public com.ixo.iid.v1beta1.VerificationOrBuilder getVerificationOrBuilder() {
      if (verificationBuilder_ != null) {
        return verificationBuilder_.getMessageOrBuilder();
      } else {
        return verification_ == null ?
            com.ixo.iid.v1beta1.Verification.getDefaultInstance() : verification_;
      }
    }
    /**
     * <pre>
     * the verification to add
     * </pre>
     *
     * <code>.ixo.iid.v1beta1.Verification verification = 2 [json_name = "verification"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.iid.v1beta1.Verification, com.ixo.iid.v1beta1.Verification.Builder, com.ixo.iid.v1beta1.VerificationOrBuilder> 
        getVerificationFieldBuilder() {
      if (verificationBuilder_ == null) {
        verificationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ixo.iid.v1beta1.Verification, com.ixo.iid.v1beta1.Verification.Builder, com.ixo.iid.v1beta1.VerificationOrBuilder>(
                getVerification(),
                getParentForChildren(),
                isClean());
        verification_ = null;
      }
      return verificationBuilder_;
    }

    private java.lang.Object signer_ = "";
    /**
     * <pre>
     * address of the account signing the message
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     * @return The signer.
     */
    public java.lang.String getSigner() {
      java.lang.Object ref = signer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * address of the account signing the message
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     * @return The bytes for signer.
     */
    public com.google.protobuf.ByteString
        getSignerBytes() {
      java.lang.Object ref = signer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * address of the account signing the message
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     * @param value The signer to set.
     * @return This builder for chaining.
     */
    public Builder setSigner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address of the account signing the message
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSigner() {
      signer_ = getDefaultInstance().getSigner();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address of the account signing the message
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     * @param value The bytes for signer to set.
     * @return This builder for chaining.
     */
    public Builder setSignerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signer_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:ixo.iid.v1beta1.MsgAddVerification)
  }

  // @@protoc_insertion_point(class_scope:ixo.iid.v1beta1.MsgAddVerification)
  private static final com.ixo.iid.v1beta1.MsgAddVerification DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ixo.iid.v1beta1.MsgAddVerification();
  }

  public static com.ixo.iid.v1beta1.MsgAddVerification getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAddVerification>
      PARSER = new com.google.protobuf.AbstractParser<MsgAddVerification>() {
    @java.lang.Override
    public MsgAddVerification parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgAddVerification> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAddVerification> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ixo.iid.v1beta1.MsgAddVerification getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

