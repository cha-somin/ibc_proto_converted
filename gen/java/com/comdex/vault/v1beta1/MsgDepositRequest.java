// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/tx.proto

package com.comdex.vault.v1beta1;

/**
 * Protobuf type {@code comdex.vault.v1beta1.MsgDepositRequest}
 */
public final class MsgDepositRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.vault.v1beta1.MsgDepositRequest)
    MsgDepositRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDepositRequest.newBuilder() to construct.
  private MsgDepositRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDepositRequest() {
    from_ = "";
    amount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDepositRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.vault.v1beta1.TxProto.internal_static_comdex_vault_v1beta1_MsgDepositRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.vault.v1beta1.TxProto.internal_static_comdex_vault_v1beta1_MsgDepositRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.vault.v1beta1.MsgDepositRequest.class, com.comdex.vault.v1beta1.MsgDepositRequest.Builder.class);
  }

  public static final int FROM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object from_ = "";
  /**
   * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
   * @return The from.
   */
  @java.lang.Override
  public java.lang.String getFrom() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
   * @return The bytes for from.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromBytes() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      from_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_ID_FIELD_NUMBER = 2;
  private long appId_ = 0L;
  /**
   * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
   * @return The appId.
   */
  @java.lang.Override
  public long getAppId() {
    return appId_;
  }

  public static final int EXTENDED_PAIR_VAULT_ID_FIELD_NUMBER = 3;
  private long extendedPairVaultId_ = 0L;
  /**
   * <code>uint64 extended_pair_vault_id = 3 [json_name = "extendedPairVaultId", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_vault_id&#92;""];</code>
   * @return The extendedPairVaultId.
   */
  @java.lang.Override
  public long getExtendedPairVaultId() {
    return extendedPairVaultId_;
  }

  public static final int USER_VAULT_ID_FIELD_NUMBER = 4;
  private long userVaultId_ = 0L;
  /**
   * <code>uint64 user_vault_id = 4 [json_name = "userVaultId", (.gogoproto.moretags) = "yaml:&#92;"user_vault_id&#92;""];</code>
   * @return The userVaultId.
   */
  @java.lang.Override
  public long getUserVaultId() {
    return userVaultId_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object amount_ = "";
  /**
   * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   * @return The amount.
   */
  @java.lang.Override
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   * @return The bytes for amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, from_);
    }
    if (appId_ != 0L) {
      output.writeUInt64(2, appId_);
    }
    if (extendedPairVaultId_ != 0L) {
      output.writeUInt64(3, extendedPairVaultId_);
    }
    if (userVaultId_ != 0L) {
      output.writeUInt64(4, userVaultId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, amount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, from_);
    }
    if (appId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, appId_);
    }
    if (extendedPairVaultId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, extendedPairVaultId_);
    }
    if (userVaultId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, userVaultId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, amount_);
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
    if (!(obj instanceof com.comdex.vault.v1beta1.MsgDepositRequest)) {
      return super.equals(obj);
    }
    com.comdex.vault.v1beta1.MsgDepositRequest other = (com.comdex.vault.v1beta1.MsgDepositRequest) obj;

    if (!getFrom()
        .equals(other.getFrom())) return false;
    if (getAppId()
        != other.getAppId()) return false;
    if (getExtendedPairVaultId()
        != other.getExtendedPairVaultId()) return false;
    if (getUserVaultId()
        != other.getUserVaultId()) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
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
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppId());
    hash = (37 * hash) + EXTENDED_PAIR_VAULT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExtendedPairVaultId());
    hash = (37 * hash) + USER_VAULT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserVaultId());
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.vault.v1beta1.MsgDepositRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.MsgDepositRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.MsgDepositRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.MsgDepositRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.MsgDepositRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.MsgDepositRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.MsgDepositRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.vault.v1beta1.MsgDepositRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.vault.v1beta1.MsgDepositRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.vault.v1beta1.MsgDepositRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.MsgDepositRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.vault.v1beta1.MsgDepositRequest parseFrom(
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
  public static Builder newBuilder(com.comdex.vault.v1beta1.MsgDepositRequest prototype) {
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
   * Protobuf type {@code comdex.vault.v1beta1.MsgDepositRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.vault.v1beta1.MsgDepositRequest)
      com.comdex.vault.v1beta1.MsgDepositRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.vault.v1beta1.TxProto.internal_static_comdex_vault_v1beta1_MsgDepositRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.vault.v1beta1.TxProto.internal_static_comdex_vault_v1beta1_MsgDepositRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.vault.v1beta1.MsgDepositRequest.class, com.comdex.vault.v1beta1.MsgDepositRequest.Builder.class);
    }

    // Construct using com.comdex.vault.v1beta1.MsgDepositRequest.newBuilder()
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
      from_ = "";
      appId_ = 0L;
      extendedPairVaultId_ = 0L;
      userVaultId_ = 0L;
      amount_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.vault.v1beta1.TxProto.internal_static_comdex_vault_v1beta1_MsgDepositRequest_descriptor;
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.MsgDepositRequest getDefaultInstanceForType() {
      return com.comdex.vault.v1beta1.MsgDepositRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.MsgDepositRequest build() {
      com.comdex.vault.v1beta1.MsgDepositRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.MsgDepositRequest buildPartial() {
      com.comdex.vault.v1beta1.MsgDepositRequest result = new com.comdex.vault.v1beta1.MsgDepositRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.vault.v1beta1.MsgDepositRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.from_ = from_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.appId_ = appId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.extendedPairVaultId_ = extendedPairVaultId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.userVaultId_ = userVaultId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.amount_ = amount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.vault.v1beta1.MsgDepositRequest) {
        return mergeFrom((com.comdex.vault.v1beta1.MsgDepositRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.vault.v1beta1.MsgDepositRequest other) {
      if (other == com.comdex.vault.v1beta1.MsgDepositRequest.getDefaultInstance()) return this;
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAppId() != 0L) {
        setAppId(other.getAppId());
      }
      if (other.getExtendedPairVaultId() != 0L) {
        setExtendedPairVaultId(other.getExtendedPairVaultId());
      }
      if (other.getUserVaultId() != 0L) {
        setUserVaultId(other.getUserVaultId());
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
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
            case 10: {
              from_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              appId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              extendedPairVaultId_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              userVaultId_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              amount_ = input.readStringRequireUtf8();
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

    private java.lang.Object from_ = "";
    /**
     * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
     * @return The from.
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      from_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      from_ = getDefaultInstance().getFrom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
     * @param value The bytes for from to set.
     * @return This builder for chaining.
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      from_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long appId_ ;
    /**
     * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
     * @return The appId.
     */
    @java.lang.Override
    public long getAppId() {
      return appId_;
    }
    /**
     * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
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
     * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      appId_ = 0L;
      onChanged();
      return this;
    }

    private long extendedPairVaultId_ ;
    /**
     * <code>uint64 extended_pair_vault_id = 3 [json_name = "extendedPairVaultId", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_vault_id&#92;""];</code>
     * @return The extendedPairVaultId.
     */
    @java.lang.Override
    public long getExtendedPairVaultId() {
      return extendedPairVaultId_;
    }
    /**
     * <code>uint64 extended_pair_vault_id = 3 [json_name = "extendedPairVaultId", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_vault_id&#92;""];</code>
     * @param value The extendedPairVaultId to set.
     * @return This builder for chaining.
     */
    public Builder setExtendedPairVaultId(long value) {

      extendedPairVaultId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 extended_pair_vault_id = 3 [json_name = "extendedPairVaultId", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_vault_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearExtendedPairVaultId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      extendedPairVaultId_ = 0L;
      onChanged();
      return this;
    }

    private long userVaultId_ ;
    /**
     * <code>uint64 user_vault_id = 4 [json_name = "userVaultId", (.gogoproto.moretags) = "yaml:&#92;"user_vault_id&#92;""];</code>
     * @return The userVaultId.
     */
    @java.lang.Override
    public long getUserVaultId() {
      return userVaultId_;
    }
    /**
     * <code>uint64 user_vault_id = 4 [json_name = "userVaultId", (.gogoproto.moretags) = "yaml:&#92;"user_vault_id&#92;""];</code>
     * @param value The userVaultId to set.
     * @return This builder for chaining.
     */
    public Builder setUserVaultId(long value) {

      userVaultId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 user_vault_id = 4 [json_name = "userVaultId", (.gogoproto.moretags) = "yaml:&#92;"user_vault_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserVaultId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      userVaultId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     * @return The amount.
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     * @return The bytes for amount.
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      amount_ = getDefaultInstance().getAmount();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 5 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      amount_ = value;
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


    // @@protoc_insertion_point(builder_scope:comdex.vault.v1beta1.MsgDepositRequest)
  }

  // @@protoc_insertion_point(class_scope:comdex.vault.v1beta1.MsgDepositRequest)
  private static final com.comdex.vault.v1beta1.MsgDepositRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.vault.v1beta1.MsgDepositRequest();
  }

  public static com.comdex.vault.v1beta1.MsgDepositRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDepositRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgDepositRequest>() {
    @java.lang.Override
    public MsgDepositRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgDepositRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDepositRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.vault.v1beta1.MsgDepositRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

