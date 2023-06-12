// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rdex/tx.proto

package com.stafihub.stafihub.rdex;

/**
 * Protobuf type {@code stafihub.stafihub.rdex.MsgCreatePool}
 */
public final class MsgCreatePool extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.rdex.MsgCreatePool)
    MsgCreatePoolOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreatePool.newBuilder() to construct.
  private MsgCreatePool(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreatePool() {
    creator_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreatePool();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.rdex.TxProto.internal_static_stafihub_stafihub_rdex_MsgCreatePool_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.rdex.TxProto.internal_static_stafihub_stafihub_rdex_MsgCreatePool_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.rdex.MsgCreatePool.class, com.stafihub.stafihub.rdex.MsgCreatePool.Builder.class);
  }

  public static final int CREATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object creator_ = "";
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  @java.lang.Override
  public java.lang.String getCreator() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creator_ = s;
      return s;
    }
  }
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreatorBytes() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN0_FIELD_NUMBER = 2;
  private com.cosmos.base.v1beta1.Coin token0_;
  /**
   * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the token0 field is set.
   */
  @java.lang.Override
  public boolean hasToken0() {
    return token0_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The token0.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getToken0() {
    return token0_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : token0_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getToken0OrBuilder() {
    return token0_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : token0_;
  }

  public static final int TOKEN1_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin token1_;
  /**
   * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the token1 field is set.
   */
  @java.lang.Override
  public boolean hasToken1() {
    return token1_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The token1.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getToken1() {
    return token1_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : token1_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getToken1OrBuilder() {
    return token1_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : token1_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, creator_);
    }
    if (token0_ != null) {
      output.writeMessage(2, getToken0());
    }
    if (token1_ != null) {
      output.writeMessage(3, getToken1());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, creator_);
    }
    if (token0_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getToken0());
    }
    if (token1_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getToken1());
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
    if (!(obj instanceof com.stafihub.stafihub.rdex.MsgCreatePool)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.rdex.MsgCreatePool other = (com.stafihub.stafihub.rdex.MsgCreatePool) obj;

    if (!getCreator()
        .equals(other.getCreator())) return false;
    if (hasToken0() != other.hasToken0()) return false;
    if (hasToken0()) {
      if (!getToken0()
          .equals(other.getToken0())) return false;
    }
    if (hasToken1() != other.hasToken1()) return false;
    if (hasToken1()) {
      if (!getToken1()
          .equals(other.getToken1())) return false;
    }
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
    hash = (37 * hash) + CREATOR_FIELD_NUMBER;
    hash = (53 * hash) + getCreator().hashCode();
    if (hasToken0()) {
      hash = (37 * hash) + TOKEN0_FIELD_NUMBER;
      hash = (53 * hash) + getToken0().hashCode();
    }
    if (hasToken1()) {
      hash = (37 * hash) + TOKEN1_FIELD_NUMBER;
      hash = (53 * hash) + getToken1().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.rdex.MsgCreatePool parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rdex.MsgCreatePool parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rdex.MsgCreatePool parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rdex.MsgCreatePool parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rdex.MsgCreatePool parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rdex.MsgCreatePool parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rdex.MsgCreatePool parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rdex.MsgCreatePool parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.rdex.MsgCreatePool parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.rdex.MsgCreatePool parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.rdex.MsgCreatePool parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rdex.MsgCreatePool parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.rdex.MsgCreatePool prototype) {
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
   * Protobuf type {@code stafihub.stafihub.rdex.MsgCreatePool}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.rdex.MsgCreatePool)
      com.stafihub.stafihub.rdex.MsgCreatePoolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.rdex.TxProto.internal_static_stafihub_stafihub_rdex_MsgCreatePool_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.rdex.TxProto.internal_static_stafihub_stafihub_rdex_MsgCreatePool_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.rdex.MsgCreatePool.class, com.stafihub.stafihub.rdex.MsgCreatePool.Builder.class);
    }

    // Construct using com.stafihub.stafihub.rdex.MsgCreatePool.newBuilder()
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
      creator_ = "";
      token0_ = null;
      if (token0Builder_ != null) {
        token0Builder_.dispose();
        token0Builder_ = null;
      }
      token1_ = null;
      if (token1Builder_ != null) {
        token1Builder_.dispose();
        token1Builder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.rdex.TxProto.internal_static_stafihub_stafihub_rdex_MsgCreatePool_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rdex.MsgCreatePool getDefaultInstanceForType() {
      return com.stafihub.stafihub.rdex.MsgCreatePool.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.rdex.MsgCreatePool build() {
      com.stafihub.stafihub.rdex.MsgCreatePool result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rdex.MsgCreatePool buildPartial() {
      com.stafihub.stafihub.rdex.MsgCreatePool result = new com.stafihub.stafihub.rdex.MsgCreatePool(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.rdex.MsgCreatePool result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.creator_ = creator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.token0_ = token0Builder_ == null
            ? token0_
            : token0Builder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.token1_ = token1Builder_ == null
            ? token1_
            : token1Builder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.rdex.MsgCreatePool) {
        return mergeFrom((com.stafihub.stafihub.rdex.MsgCreatePool)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.rdex.MsgCreatePool other) {
      if (other == com.stafihub.stafihub.rdex.MsgCreatePool.getDefaultInstance()) return this;
      if (!other.getCreator().isEmpty()) {
        creator_ = other.creator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasToken0()) {
        mergeToken0(other.getToken0());
      }
      if (other.hasToken1()) {
        mergeToken1(other.getToken1());
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
              creator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getToken0FieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getToken1FieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object creator_ = "";
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The creator.
     */
    public java.lang.String getCreator() {
      java.lang.Object ref = creator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The bytes for creator.
     */
    public com.google.protobuf.ByteString
        getCreatorBytes() {
      java.lang.Object ref = creator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreator() {
      creator_ = getDefaultInstance().getCreator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The bytes for creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin token0_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> token0Builder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return Whether the token0 field is set.
     */
    public boolean hasToken0() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return The token0.
     */
    public com.cosmos.base.v1beta1.Coin getToken0() {
      if (token0Builder_ == null) {
        return token0_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : token0_;
      } else {
        return token0Builder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setToken0(com.cosmos.base.v1beta1.Coin value) {
      if (token0Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        token0_ = value;
      } else {
        token0Builder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setToken0(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (token0Builder_ == null) {
        token0_ = builderForValue.build();
      } else {
        token0Builder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder mergeToken0(com.cosmos.base.v1beta1.Coin value) {
      if (token0Builder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          token0_ != null &&
          token0_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getToken0Builder().mergeFrom(value);
        } else {
          token0_ = value;
        }
      } else {
        token0Builder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder clearToken0() {
      bitField0_ = (bitField0_ & ~0x00000002);
      token0_ = null;
      if (token0Builder_ != null) {
        token0Builder_.dispose();
        token0Builder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getToken0Builder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getToken0FieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getToken0OrBuilder() {
      if (token0Builder_ != null) {
        return token0Builder_.getMessageOrBuilder();
      } else {
        return token0_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : token0_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token0 = 2 [json_name = "token0", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getToken0FieldBuilder() {
      if (token0Builder_ == null) {
        token0Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getToken0(),
                getParentForChildren(),
                isClean());
        token0_ = null;
      }
      return token0Builder_;
    }

    private com.cosmos.base.v1beta1.Coin token1_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> token1Builder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return Whether the token1 field is set.
     */
    public boolean hasToken1() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return The token1.
     */
    public com.cosmos.base.v1beta1.Coin getToken1() {
      if (token1Builder_ == null) {
        return token1_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : token1_;
      } else {
        return token1Builder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setToken1(com.cosmos.base.v1beta1.Coin value) {
      if (token1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        token1_ = value;
      } else {
        token1Builder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setToken1(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (token1Builder_ == null) {
        token1_ = builderForValue.build();
      } else {
        token1Builder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder mergeToken1(com.cosmos.base.v1beta1.Coin value) {
      if (token1Builder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          token1_ != null &&
          token1_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getToken1Builder().mergeFrom(value);
        } else {
          token1_ = value;
        }
      } else {
        token1Builder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder clearToken1() {
      bitField0_ = (bitField0_ & ~0x00000004);
      token1_ = null;
      if (token1Builder_ != null) {
        token1Builder_.dispose();
        token1Builder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getToken1Builder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getToken1FieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getToken1OrBuilder() {
      if (token1Builder_ != null) {
        return token1Builder_.getMessageOrBuilder();
      } else {
        return token1_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : token1_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin token1 = 3 [json_name = "token1", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getToken1FieldBuilder() {
      if (token1Builder_ == null) {
        token1Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getToken1(),
                getParentForChildren(),
                isClean());
        token1_ = null;
      }
      return token1Builder_;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.rdex.MsgCreatePool)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.rdex.MsgCreatePool)
  private static final com.stafihub.stafihub.rdex.MsgCreatePool DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.rdex.MsgCreatePool();
  }

  public static com.stafihub.stafihub.rdex.MsgCreatePool getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreatePool>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreatePool>() {
    @java.lang.Override
    public MsgCreatePool parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreatePool> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreatePool> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.rdex.MsgCreatePool getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

