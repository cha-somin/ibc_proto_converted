// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/iid/v1beta1/tx.proto

package com.ixo.iid.v1beta1;

/**
 * Protobuf type {@code ixo.iid.v1beta1.MsgDeleteLinkedClaim}
 */
public final class MsgDeleteLinkedClaim extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ixo.iid.v1beta1.MsgDeleteLinkedClaim)
    MsgDeleteLinkedClaimOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDeleteLinkedClaim.newBuilder() to construct.
  private MsgDeleteLinkedClaim(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDeleteLinkedClaim() {
    id_ = "";
    claimId_ = "";
    signer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDeleteLinkedClaim();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ixo.iid.v1beta1.TxProto.internal_static_ixo_iid_v1beta1_MsgDeleteLinkedClaim_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ixo.iid.v1beta1.TxProto.internal_static_ixo_iid_v1beta1_MsgDeleteLinkedClaim_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ixo.iid.v1beta1.MsgDeleteLinkedClaim.class, com.ixo.iid.v1beta1.MsgDeleteLinkedClaim.Builder.class);
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

  public static final int CLAIM_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object claimId_ = "";
  /**
   * <pre>
   * the claim id
   * </pre>
   *
   * <code>string claim_id = 2 [json_name = "claimId"];</code>
   * @return The claimId.
   */
  @java.lang.Override
  public java.lang.String getClaimId() {
    java.lang.Object ref = claimId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      claimId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the claim id
   * </pre>
   *
   * <code>string claim_id = 2 [json_name = "claimId"];</code>
   * @return The bytes for claimId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClaimIdBytes() {
    java.lang.Object ref = claimId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      claimId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(claimId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, claimId_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(claimId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, claimId_);
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
    if (!(obj instanceof com.ixo.iid.v1beta1.MsgDeleteLinkedClaim)) {
      return super.equals(obj);
    }
    com.ixo.iid.v1beta1.MsgDeleteLinkedClaim other = (com.ixo.iid.v1beta1.MsgDeleteLinkedClaim) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getClaimId()
        .equals(other.getClaimId())) return false;
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
    hash = (37 * hash) + CLAIM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClaimId().hashCode();
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim parseFrom(
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
  public static Builder newBuilder(com.ixo.iid.v1beta1.MsgDeleteLinkedClaim prototype) {
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
   * Protobuf type {@code ixo.iid.v1beta1.MsgDeleteLinkedClaim}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ixo.iid.v1beta1.MsgDeleteLinkedClaim)
      com.ixo.iid.v1beta1.MsgDeleteLinkedClaimOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.iid.v1beta1.TxProto.internal_static_ixo_iid_v1beta1_MsgDeleteLinkedClaim_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.iid.v1beta1.TxProto.internal_static_ixo_iid_v1beta1_MsgDeleteLinkedClaim_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.iid.v1beta1.MsgDeleteLinkedClaim.class, com.ixo.iid.v1beta1.MsgDeleteLinkedClaim.Builder.class);
    }

    // Construct using com.ixo.iid.v1beta1.MsgDeleteLinkedClaim.newBuilder()
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
      claimId_ = "";
      signer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ixo.iid.v1beta1.TxProto.internal_static_ixo_iid_v1beta1_MsgDeleteLinkedClaim_descriptor;
    }

    @java.lang.Override
    public com.ixo.iid.v1beta1.MsgDeleteLinkedClaim getDefaultInstanceForType() {
      return com.ixo.iid.v1beta1.MsgDeleteLinkedClaim.getDefaultInstance();
    }

    @java.lang.Override
    public com.ixo.iid.v1beta1.MsgDeleteLinkedClaim build() {
      com.ixo.iid.v1beta1.MsgDeleteLinkedClaim result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ixo.iid.v1beta1.MsgDeleteLinkedClaim buildPartial() {
      com.ixo.iid.v1beta1.MsgDeleteLinkedClaim result = new com.ixo.iid.v1beta1.MsgDeleteLinkedClaim(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ixo.iid.v1beta1.MsgDeleteLinkedClaim result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.claimId_ = claimId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.signer_ = signer_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ixo.iid.v1beta1.MsgDeleteLinkedClaim) {
        return mergeFrom((com.ixo.iid.v1beta1.MsgDeleteLinkedClaim)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ixo.iid.v1beta1.MsgDeleteLinkedClaim other) {
      if (other == com.ixo.iid.v1beta1.MsgDeleteLinkedClaim.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClaimId().isEmpty()) {
        claimId_ = other.claimId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              claimId_ = input.readStringRequireUtf8();
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

    private java.lang.Object claimId_ = "";
    /**
     * <pre>
     * the claim id
     * </pre>
     *
     * <code>string claim_id = 2 [json_name = "claimId"];</code>
     * @return The claimId.
     */
    public java.lang.String getClaimId() {
      java.lang.Object ref = claimId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        claimId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the claim id
     * </pre>
     *
     * <code>string claim_id = 2 [json_name = "claimId"];</code>
     * @return The bytes for claimId.
     */
    public com.google.protobuf.ByteString
        getClaimIdBytes() {
      java.lang.Object ref = claimId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        claimId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the claim id
     * </pre>
     *
     * <code>string claim_id = 2 [json_name = "claimId"];</code>
     * @param value The claimId to set.
     * @return This builder for chaining.
     */
    public Builder setClaimId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      claimId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the claim id
     * </pre>
     *
     * <code>string claim_id = 2 [json_name = "claimId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClaimId() {
      claimId_ = getDefaultInstance().getClaimId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the claim id
     * </pre>
     *
     * <code>string claim_id = 2 [json_name = "claimId"];</code>
     * @param value The bytes for claimId to set.
     * @return This builder for chaining.
     */
    public Builder setClaimIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      claimId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:ixo.iid.v1beta1.MsgDeleteLinkedClaim)
  }

  // @@protoc_insertion_point(class_scope:ixo.iid.v1beta1.MsgDeleteLinkedClaim)
  private static final com.ixo.iid.v1beta1.MsgDeleteLinkedClaim DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ixo.iid.v1beta1.MsgDeleteLinkedClaim();
  }

  public static com.ixo.iid.v1beta1.MsgDeleteLinkedClaim getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDeleteLinkedClaim>
      PARSER = new com.google.protobuf.AbstractParser<MsgDeleteLinkedClaim>() {
    @java.lang.Override
    public MsgDeleteLinkedClaim parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgDeleteLinkedClaim> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDeleteLinkedClaim> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ixo.iid.v1beta1.MsgDeleteLinkedClaim getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

