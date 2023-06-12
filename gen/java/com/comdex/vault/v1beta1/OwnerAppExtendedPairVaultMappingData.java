// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/vault.proto

package com.comdex.vault.v1beta1;

/**
 * Protobuf type {@code comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData}
 */
public final class OwnerAppExtendedPairVaultMappingData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData)
    OwnerAppExtendedPairVaultMappingDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OwnerAppExtendedPairVaultMappingData.newBuilder() to construct.
  private OwnerAppExtendedPairVaultMappingData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OwnerAppExtendedPairVaultMappingData() {
    owner_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OwnerAppExtendedPairVaultMappingData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.vault.v1beta1.VaultProto.internal_static_comdex_vault_v1beta1_OwnerAppExtendedPairVaultMappingData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.vault.v1beta1.VaultProto.internal_static_comdex_vault_v1beta1_OwnerAppExtendedPairVaultMappingData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData.class, com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData.Builder.class);
  }

  public static final int OWNER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object owner_ = "";
  /**
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

  public static final int APP_ID_FIELD_NUMBER = 2;
  private long appId_ = 0L;
  /**
   * <code>uint64 app_id = 2 [json_name = "appId"];</code>
   * @return The appId.
   */
  @java.lang.Override
  public long getAppId() {
    return appId_;
  }

  public static final int EXTENDED_PAIR_ID_FIELD_NUMBER = 3;
  private long extendedPairId_ = 0L;
  /**
   * <code>uint64 extended_pair_id = 3 [json_name = "extendedPairId"];</code>
   * @return The extendedPairId.
   */
  @java.lang.Override
  public long getExtendedPairId() {
    return extendedPairId_;
  }

  public static final int VAULT_ID_FIELD_NUMBER = 4;
  private long vaultId_ = 0L;
  /**
   * <code>uint64 vault_id = 4 [json_name = "vaultId", (.gogoproto.moretags) = "yaml:&#92;"vault_id&#92;""];</code>
   * @return The vaultId.
   */
  @java.lang.Override
  public long getVaultId() {
    return vaultId_;
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
    if (appId_ != 0L) {
      output.writeUInt64(2, appId_);
    }
    if (extendedPairId_ != 0L) {
      output.writeUInt64(3, extendedPairId_);
    }
    if (vaultId_ != 0L) {
      output.writeUInt64(4, vaultId_);
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
    if (appId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, appId_);
    }
    if (extendedPairId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, extendedPairId_);
    }
    if (vaultId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, vaultId_);
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
    if (!(obj instanceof com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData)) {
      return super.equals(obj);
    }
    com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData other = (com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData) obj;

    if (!getOwner()
        .equals(other.getOwner())) return false;
    if (getAppId()
        != other.getAppId()) return false;
    if (getExtendedPairId()
        != other.getExtendedPairId()) return false;
    if (getVaultId()
        != other.getVaultId()) return false;
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
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppId());
    hash = (37 * hash) + EXTENDED_PAIR_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExtendedPairId());
    hash = (37 * hash) + VAULT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVaultId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData parseFrom(
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
  public static Builder newBuilder(com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData prototype) {
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
   * Protobuf type {@code comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData)
      com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.vault.v1beta1.VaultProto.internal_static_comdex_vault_v1beta1_OwnerAppExtendedPairVaultMappingData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.vault.v1beta1.VaultProto.internal_static_comdex_vault_v1beta1_OwnerAppExtendedPairVaultMappingData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData.class, com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData.Builder.class);
    }

    // Construct using com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData.newBuilder()
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
      appId_ = 0L;
      extendedPairId_ = 0L;
      vaultId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.vault.v1beta1.VaultProto.internal_static_comdex_vault_v1beta1_OwnerAppExtendedPairVaultMappingData_descriptor;
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData getDefaultInstanceForType() {
      return com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData build() {
      com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData buildPartial() {
      com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData result = new com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.owner_ = owner_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.appId_ = appId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.extendedPairId_ = extendedPairId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.vaultId_ = vaultId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData) {
        return mergeFrom((com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData other) {
      if (other == com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData.getDefaultInstance()) return this;
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAppId() != 0L) {
        setAppId(other.getAppId());
      }
      if (other.getExtendedPairId() != 0L) {
        setExtendedPairId(other.getExtendedPairId());
      }
      if (other.getVaultId() != 0L) {
        setVaultId(other.getVaultId());
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
            case 16: {
              appId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              extendedPairId_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              vaultId_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private long appId_ ;
    /**
     * <code>uint64 app_id = 2 [json_name = "appId"];</code>
     * @return The appId.
     */
    @java.lang.Override
    public long getAppId() {
      return appId_;
    }
    /**
     * <code>uint64 app_id = 2 [json_name = "appId"];</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(long value) {

      appId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 app_id = 2 [json_name = "appId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      appId_ = 0L;
      onChanged();
      return this;
    }

    private long extendedPairId_ ;
    /**
     * <code>uint64 extended_pair_id = 3 [json_name = "extendedPairId"];</code>
     * @return The extendedPairId.
     */
    @java.lang.Override
    public long getExtendedPairId() {
      return extendedPairId_;
    }
    /**
     * <code>uint64 extended_pair_id = 3 [json_name = "extendedPairId"];</code>
     * @param value The extendedPairId to set.
     * @return This builder for chaining.
     */
    public Builder setExtendedPairId(long value) {

      extendedPairId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 extended_pair_id = 3 [json_name = "extendedPairId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExtendedPairId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      extendedPairId_ = 0L;
      onChanged();
      return this;
    }

    private long vaultId_ ;
    /**
     * <code>uint64 vault_id = 4 [json_name = "vaultId", (.gogoproto.moretags) = "yaml:&#92;"vault_id&#92;""];</code>
     * @return The vaultId.
     */
    @java.lang.Override
    public long getVaultId() {
      return vaultId_;
    }
    /**
     * <code>uint64 vault_id = 4 [json_name = "vaultId", (.gogoproto.moretags) = "yaml:&#92;"vault_id&#92;""];</code>
     * @param value The vaultId to set.
     * @return This builder for chaining.
     */
    public Builder setVaultId(long value) {

      vaultId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 vault_id = 4 [json_name = "vaultId", (.gogoproto.moretags) = "yaml:&#92;"vault_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearVaultId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      vaultId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData)
  }

  // @@protoc_insertion_point(class_scope:comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData)
  private static final com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData();
  }

  public static com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OwnerAppExtendedPairVaultMappingData>
      PARSER = new com.google.protobuf.AbstractParser<OwnerAppExtendedPairVaultMappingData>() {
    @java.lang.Override
    public OwnerAppExtendedPairVaultMappingData parsePartialFrom(
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

  public static com.google.protobuf.Parser<OwnerAppExtendedPairVaultMappingData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OwnerAppExtendedPairVaultMappingData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

