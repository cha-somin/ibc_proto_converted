// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/provider/v2/params.proto

package com.sentinel.provider.v2;

/**
 * Protobuf type {@code sentinel.provider.v2.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sentinel.provider.v2.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
    revenueShare_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sentinel.provider.v2.ParamsProto.internal_static_sentinel_provider_v2_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sentinel.provider.v2.ParamsProto.internal_static_sentinel_provider_v2_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sentinel.provider.v2.Params.class, com.sentinel.provider.v2.Params.Builder.class);
  }

  public static final int DEPOSIT_FIELD_NUMBER = 1;
  private com.cosmos.base.v1beta1.Coin deposit_;
  /**
   * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
   * @return Whether the deposit field is set.
   */
  @java.lang.Override
  public boolean hasDeposit() {
    return deposit_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
   * @return The deposit.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getDeposit() {
    return deposit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : deposit_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getDepositOrBuilder() {
    return deposit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : deposit_;
  }

  public static final int REVENUE_SHARE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object revenueShare_ = "";
  /**
   * <code>string revenue_share = 2 [json_name = "revenueShare", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The revenueShare.
   */
  @java.lang.Override
  public java.lang.String getRevenueShare() {
    java.lang.Object ref = revenueShare_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      revenueShare_ = s;
      return s;
    }
  }
  /**
   * <code>string revenue_share = 2 [json_name = "revenueShare", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for revenueShare.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRevenueShareBytes() {
    java.lang.Object ref = revenueShare_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      revenueShare_ = b;
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
    if (deposit_ != null) {
      output.writeMessage(1, getDeposit());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revenueShare_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, revenueShare_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deposit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeposit());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revenueShare_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, revenueShare_);
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
    if (!(obj instanceof com.sentinel.provider.v2.Params)) {
      return super.equals(obj);
    }
    com.sentinel.provider.v2.Params other = (com.sentinel.provider.v2.Params) obj;

    if (hasDeposit() != other.hasDeposit()) return false;
    if (hasDeposit()) {
      if (!getDeposit()
          .equals(other.getDeposit())) return false;
    }
    if (!getRevenueShare()
        .equals(other.getRevenueShare())) return false;
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
    if (hasDeposit()) {
      hash = (37 * hash) + DEPOSIT_FIELD_NUMBER;
      hash = (53 * hash) + getDeposit().hashCode();
    }
    hash = (37 * hash) + REVENUE_SHARE_FIELD_NUMBER;
    hash = (53 * hash) + getRevenueShare().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sentinel.provider.v2.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.provider.v2.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.provider.v2.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.provider.v2.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.provider.v2.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.provider.v2.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.provider.v2.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.provider.v2.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sentinel.provider.v2.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sentinel.provider.v2.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sentinel.provider.v2.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.provider.v2.Params parseFrom(
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
  public static Builder newBuilder(com.sentinel.provider.v2.Params prototype) {
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
   * Protobuf type {@code sentinel.provider.v2.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sentinel.provider.v2.Params)
      com.sentinel.provider.v2.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.provider.v2.ParamsProto.internal_static_sentinel_provider_v2_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.provider.v2.ParamsProto.internal_static_sentinel_provider_v2_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.provider.v2.Params.class, com.sentinel.provider.v2.Params.Builder.class);
    }

    // Construct using com.sentinel.provider.v2.Params.newBuilder()
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
      deposit_ = null;
      if (depositBuilder_ != null) {
        depositBuilder_.dispose();
        depositBuilder_ = null;
      }
      revenueShare_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sentinel.provider.v2.ParamsProto.internal_static_sentinel_provider_v2_Params_descriptor;
    }

    @java.lang.Override
    public com.sentinel.provider.v2.Params getDefaultInstanceForType() {
      return com.sentinel.provider.v2.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.sentinel.provider.v2.Params build() {
      com.sentinel.provider.v2.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sentinel.provider.v2.Params buildPartial() {
      com.sentinel.provider.v2.Params result = new com.sentinel.provider.v2.Params(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.sentinel.provider.v2.Params result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deposit_ = depositBuilder_ == null
            ? deposit_
            : depositBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.revenueShare_ = revenueShare_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sentinel.provider.v2.Params) {
        return mergeFrom((com.sentinel.provider.v2.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sentinel.provider.v2.Params other) {
      if (other == com.sentinel.provider.v2.Params.getDefaultInstance()) return this;
      if (other.hasDeposit()) {
        mergeDeposit(other.getDeposit());
      }
      if (!other.getRevenueShare().isEmpty()) {
        revenueShare_ = other.revenueShare_;
        bitField0_ |= 0x00000002;
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
              input.readMessage(
                  getDepositFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              revenueShare_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.cosmos.base.v1beta1.Coin deposit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> depositBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
     * @return Whether the deposit field is set.
     */
    public boolean hasDeposit() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
     * @return The deposit.
     */
    public com.cosmos.base.v1beta1.Coin getDeposit() {
      if (depositBuilder_ == null) {
        return deposit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : deposit_;
      } else {
        return depositBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
     */
    public Builder setDeposit(com.cosmos.base.v1beta1.Coin value) {
      if (depositBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deposit_ = value;
      } else {
        depositBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
     */
    public Builder setDeposit(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (depositBuilder_ == null) {
        deposit_ = builderForValue.build();
      } else {
        depositBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeDeposit(com.cosmos.base.v1beta1.Coin value) {
      if (depositBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          deposit_ != null &&
          deposit_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getDepositBuilder().mergeFrom(value);
        } else {
          deposit_ = value;
        }
      } else {
        depositBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearDeposit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      deposit_ = null;
      if (depositBuilder_ != null) {
        depositBuilder_.dispose();
        depositBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getDepositBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDepositFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getDepositOrBuilder() {
      if (depositBuilder_ != null) {
        return depositBuilder_.getMessageOrBuilder();
      } else {
        return deposit_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : deposit_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin deposit = 1 [json_name = "deposit", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getDepositFieldBuilder() {
      if (depositBuilder_ == null) {
        depositBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getDeposit(),
                getParentForChildren(),
                isClean());
        deposit_ = null;
      }
      return depositBuilder_;
    }

    private java.lang.Object revenueShare_ = "";
    /**
     * <code>string revenue_share = 2 [json_name = "revenueShare", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The revenueShare.
     */
    public java.lang.String getRevenueShare() {
      java.lang.Object ref = revenueShare_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revenueShare_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string revenue_share = 2 [json_name = "revenueShare", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for revenueShare.
     */
    public com.google.protobuf.ByteString
        getRevenueShareBytes() {
      java.lang.Object ref = revenueShare_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revenueShare_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string revenue_share = 2 [json_name = "revenueShare", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The revenueShare to set.
     * @return This builder for chaining.
     */
    public Builder setRevenueShare(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      revenueShare_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string revenue_share = 2 [json_name = "revenueShare", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRevenueShare() {
      revenueShare_ = getDefaultInstance().getRevenueShare();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string revenue_share = 2 [json_name = "revenueShare", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for revenueShare to set.
     * @return This builder for chaining.
     */
    public Builder setRevenueShareBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      revenueShare_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:sentinel.provider.v2.Params)
  }

  // @@protoc_insertion_point(class_scope:sentinel.provider.v2.Params)
  private static final com.sentinel.provider.v2.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sentinel.provider.v2.Params();
  }

  public static com.sentinel.provider.v2.Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params>
      PARSER = new com.google.protobuf.AbstractParser<Params>() {
    @java.lang.Override
    public Params parsePartialFrom(
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

  public static com.google.protobuf.Parser<Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sentinel.provider.v2.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

