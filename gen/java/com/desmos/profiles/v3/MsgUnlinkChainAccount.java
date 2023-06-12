// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/msgs_chain_links.proto

package com.desmos.profiles.v3;

/**
 * <pre>
 * MsgUnlinkChainAccount represents a message to unlink an account from a
 * profile.
 * </pre>
 *
 * Protobuf type {@code desmos.profiles.v3.MsgUnlinkChainAccount}
 */
public final class MsgUnlinkChainAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.profiles.v3.MsgUnlinkChainAccount)
    MsgUnlinkChainAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUnlinkChainAccount.newBuilder() to construct.
  private MsgUnlinkChainAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUnlinkChainAccount() {
    owner_ = "";
    chainName_ = "";
    target_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUnlinkChainAccount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.profiles.v3.MsgsChainLinksProto.internal_static_desmos_profiles_v3_MsgUnlinkChainAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.profiles.v3.MsgsChainLinksProto.internal_static_desmos_profiles_v3_MsgUnlinkChainAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.profiles.v3.MsgUnlinkChainAccount.class, com.desmos.profiles.v3.MsgUnlinkChainAccount.Builder.class);
  }

  public static final int OWNER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object owner_ = "";
  /**
   * <pre>
   * Owner represents the Desmos profile from which to remove the link
   * </pre>
   *
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  @java.lang.Override
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Owner represents the Desmos profile from which to remove the link
   * </pre>
   *
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      owner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHAIN_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object chainName_ = "";
  /**
   * <pre>
   * ChainName represents the name of the chain to which the link to remove is
   * associated
   * </pre>
   *
   * <code>string chain_name = 2 [json_name = "chainName", (.gogoproto.moretags) = "yaml:&#92;"chain_name&#92;""];</code>
   * @return The chainName.
   */
  @java.lang.Override
  public java.lang.String getChainName() {
    java.lang.Object ref = chainName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chainName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ChainName represents the name of the chain to which the link to remove is
   * associated
   * </pre>
   *
   * <code>string chain_name = 2 [json_name = "chainName", (.gogoproto.moretags) = "yaml:&#92;"chain_name&#92;""];</code>
   * @return The bytes for chainName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChainNameBytes() {
    java.lang.Object ref = chainName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chainName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object target_ = "";
  /**
   * <pre>
   * Target represents the external address to be removed
   * </pre>
   *
   * <code>string target = 3 [json_name = "target", (.gogoproto.moretags) = "yaml:&#92;"target&#92;""];</code>
   * @return The target.
   */
  @java.lang.Override
  public java.lang.String getTarget() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      target_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Target represents the external address to be removed
   * </pre>
   *
   * <code>string target = 3 [json_name = "target", (.gogoproto.moretags) = "yaml:&#92;"target&#92;""];</code>
   * @return The bytes for target.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetBytes() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      target_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, owner_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chainName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, chainName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(target_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, target_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, owner_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chainName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, chainName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(target_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, target_);
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
    if (!(obj instanceof com.desmos.profiles.v3.MsgUnlinkChainAccount)) {
      return super.equals(obj);
    }
    com.desmos.profiles.v3.MsgUnlinkChainAccount other = (com.desmos.profiles.v3.MsgUnlinkChainAccount) obj;

    if (!getOwner()
        .equals(other.getOwner())) return false;
    if (!getChainName()
        .equals(other.getChainName())) return false;
    if (!getTarget()
        .equals(other.getTarget())) return false;
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
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    hash = (37 * hash) + CHAIN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getChainName().hashCode();
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.profiles.v3.MsgUnlinkChainAccount parseFrom(
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
  public static Builder newBuilder(com.desmos.profiles.v3.MsgUnlinkChainAccount prototype) {
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
   * MsgUnlinkChainAccount represents a message to unlink an account from a
   * profile.
   * </pre>
   *
   * Protobuf type {@code desmos.profiles.v3.MsgUnlinkChainAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.profiles.v3.MsgUnlinkChainAccount)
      com.desmos.profiles.v3.MsgUnlinkChainAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.profiles.v3.MsgsChainLinksProto.internal_static_desmos_profiles_v3_MsgUnlinkChainAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.profiles.v3.MsgsChainLinksProto.internal_static_desmos_profiles_v3_MsgUnlinkChainAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.profiles.v3.MsgUnlinkChainAccount.class, com.desmos.profiles.v3.MsgUnlinkChainAccount.Builder.class);
    }

    // Construct using com.desmos.profiles.v3.MsgUnlinkChainAccount.newBuilder()
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
      owner_ = "";
      chainName_ = "";
      target_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.profiles.v3.MsgsChainLinksProto.internal_static_desmos_profiles_v3_MsgUnlinkChainAccount_descriptor;
    }

    @java.lang.Override
    public com.desmos.profiles.v3.MsgUnlinkChainAccount getDefaultInstanceForType() {
      return com.desmos.profiles.v3.MsgUnlinkChainAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.profiles.v3.MsgUnlinkChainAccount build() {
      com.desmos.profiles.v3.MsgUnlinkChainAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.profiles.v3.MsgUnlinkChainAccount buildPartial() {
      com.desmos.profiles.v3.MsgUnlinkChainAccount result = new com.desmos.profiles.v3.MsgUnlinkChainAccount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.profiles.v3.MsgUnlinkChainAccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.owner_ = owner_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.chainName_ = chainName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.target_ = target_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.profiles.v3.MsgUnlinkChainAccount) {
        return mergeFrom((com.desmos.profiles.v3.MsgUnlinkChainAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.profiles.v3.MsgUnlinkChainAccount other) {
      if (other == com.desmos.profiles.v3.MsgUnlinkChainAccount.getDefaultInstance()) return this;
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getChainName().isEmpty()) {
        chainName_ = other.chainName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTarget().isEmpty()) {
        target_ = other.target_;
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
              owner_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              chainName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              target_ = input.readStringRequireUtf8();
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

    private java.lang.Object owner_ = "";
    /**
     * <pre>
     * Owner represents the Desmos profile from which to remove the link
     * </pre>
     *
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @return The owner.
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Owner represents the Desmos profile from which to remove the link
     * </pre>
     *
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @return The bytes for owner.
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Owner represents the Desmos profile from which to remove the link
     * </pre>
     *
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      owner_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Owner represents the Desmos profile from which to remove the link
     * </pre>
     *
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      owner_ = getDefaultInstance().getOwner();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Owner represents the Desmos profile from which to remove the link
     * </pre>
     *
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @param value The bytes for owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      owner_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object chainName_ = "";
    /**
     * <pre>
     * ChainName represents the name of the chain to which the link to remove is
     * associated
     * </pre>
     *
     * <code>string chain_name = 2 [json_name = "chainName", (.gogoproto.moretags) = "yaml:&#92;"chain_name&#92;""];</code>
     * @return The chainName.
     */
    public java.lang.String getChainName() {
      java.lang.Object ref = chainName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chainName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ChainName represents the name of the chain to which the link to remove is
     * associated
     * </pre>
     *
     * <code>string chain_name = 2 [json_name = "chainName", (.gogoproto.moretags) = "yaml:&#92;"chain_name&#92;""];</code>
     * @return The bytes for chainName.
     */
    public com.google.protobuf.ByteString
        getChainNameBytes() {
      java.lang.Object ref = chainName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chainName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ChainName represents the name of the chain to which the link to remove is
     * associated
     * </pre>
     *
     * <code>string chain_name = 2 [json_name = "chainName", (.gogoproto.moretags) = "yaml:&#92;"chain_name&#92;""];</code>
     * @param value The chainName to set.
     * @return This builder for chaining.
     */
    public Builder setChainName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      chainName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ChainName represents the name of the chain to which the link to remove is
     * associated
     * </pre>
     *
     * <code>string chain_name = 2 [json_name = "chainName", (.gogoproto.moretags) = "yaml:&#92;"chain_name&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearChainName() {
      chainName_ = getDefaultInstance().getChainName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ChainName represents the name of the chain to which the link to remove is
     * associated
     * </pre>
     *
     * <code>string chain_name = 2 [json_name = "chainName", (.gogoproto.moretags) = "yaml:&#92;"chain_name&#92;""];</code>
     * @param value The bytes for chainName to set.
     * @return This builder for chaining.
     */
    public Builder setChainNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      chainName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object target_ = "";
    /**
     * <pre>
     * Target represents the external address to be removed
     * </pre>
     *
     * <code>string target = 3 [json_name = "target", (.gogoproto.moretags) = "yaml:&#92;"target&#92;""];</code>
     * @return The target.
     */
    public java.lang.String getTarget() {
      java.lang.Object ref = target_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        target_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Target represents the external address to be removed
     * </pre>
     *
     * <code>string target = 3 [json_name = "target", (.gogoproto.moretags) = "yaml:&#92;"target&#92;""];</code>
     * @return The bytes for target.
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      java.lang.Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Target represents the external address to be removed
     * </pre>
     *
     * <code>string target = 3 [json_name = "target", (.gogoproto.moretags) = "yaml:&#92;"target&#92;""];</code>
     * @param value The target to set.
     * @return This builder for chaining.
     */
    public Builder setTarget(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      target_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target represents the external address to be removed
     * </pre>
     *
     * <code>string target = 3 [json_name = "target", (.gogoproto.moretags) = "yaml:&#92;"target&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearTarget() {
      target_ = getDefaultInstance().getTarget();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target represents the external address to be removed
     * </pre>
     *
     * <code>string target = 3 [json_name = "target", (.gogoproto.moretags) = "yaml:&#92;"target&#92;""];</code>
     * @param value The bytes for target to set.
     * @return This builder for chaining.
     */
    public Builder setTargetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      target_ = value;
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


    // @@protoc_insertion_point(builder_scope:desmos.profiles.v3.MsgUnlinkChainAccount)
  }

  // @@protoc_insertion_point(class_scope:desmos.profiles.v3.MsgUnlinkChainAccount)
  private static final com.desmos.profiles.v3.MsgUnlinkChainAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.profiles.v3.MsgUnlinkChainAccount();
  }

  public static com.desmos.profiles.v3.MsgUnlinkChainAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUnlinkChainAccount>
      PARSER = new com.google.protobuf.AbstractParser<MsgUnlinkChainAccount>() {
    @java.lang.Override
    public MsgUnlinkChainAccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUnlinkChainAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUnlinkChainAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.profiles.v3.MsgUnlinkChainAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

