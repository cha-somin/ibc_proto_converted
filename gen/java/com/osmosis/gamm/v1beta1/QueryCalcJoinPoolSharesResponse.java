// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/gamm/v1beta1/query.proto

package com.osmosis.gamm.v1beta1;

/**
 * Protobuf type {@code osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse}
 */
public final class QueryCalcJoinPoolSharesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse)
    QueryCalcJoinPoolSharesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryCalcJoinPoolSharesResponse.newBuilder() to construct.
  private QueryCalcJoinPoolSharesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryCalcJoinPoolSharesResponse() {
    shareOutAmount_ = "";
    tokensOut_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryCalcJoinPoolSharesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse.class, com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse.Builder.class);
  }

  public static final int SHARE_OUT_AMOUNT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object shareOutAmount_ = "";
  /**
   * <code>string share_out_amount = 1 [json_name = "shareOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"share_out_amount&#92;""];</code>
   * @return The shareOutAmount.
   */
  @java.lang.Override
  public java.lang.String getShareOutAmount() {
    java.lang.Object ref = shareOutAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shareOutAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string share_out_amount = 1 [json_name = "shareOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"share_out_amount&#92;""];</code>
   * @return The bytes for shareOutAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShareOutAmountBytes() {
    java.lang.Object ref = shareOutAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shareOutAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKENS_OUT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> tokensOut_;
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getTokensOutList() {
    return tokensOut_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getTokensOutOrBuilderList() {
    return tokensOut_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public int getTokensOutCount() {
    return tokensOut_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getTokensOut(int index) {
    return tokensOut_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getTokensOutOrBuilder(
      int index) {
    return tokensOut_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareOutAmount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, shareOutAmount_);
    }
    for (int i = 0; i < tokensOut_.size(); i++) {
      output.writeMessage(2, tokensOut_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareOutAmount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, shareOutAmount_);
    }
    for (int i = 0; i < tokensOut_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, tokensOut_.get(i));
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
    if (!(obj instanceof com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse)) {
      return super.equals(obj);
    }
    com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse other = (com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse) obj;

    if (!getShareOutAmount()
        .equals(other.getShareOutAmount())) return false;
    if (!getTokensOutList()
        .equals(other.getTokensOutList())) return false;
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
    hash = (37 * hash) + SHARE_OUT_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getShareOutAmount().hashCode();
    if (getTokensOutCount() > 0) {
      hash = (37 * hash) + TOKENS_OUT_FIELD_NUMBER;
      hash = (53 * hash) + getTokensOutList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse parseFrom(
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
  public static Builder newBuilder(com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse prototype) {
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
   * Protobuf type {@code osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse)
      com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse.class, com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse.Builder.class);
    }

    // Construct using com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse.newBuilder()
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
      shareOutAmount_ = "";
      if (tokensOutBuilder_ == null) {
        tokensOut_ = java.util.Collections.emptyList();
      } else {
        tokensOut_ = null;
        tokensOutBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesResponse_descriptor;
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse getDefaultInstanceForType() {
      return com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse build() {
      com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse buildPartial() {
      com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse result = new com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse result) {
      if (tokensOutBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          tokensOut_ = java.util.Collections.unmodifiableList(tokensOut_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.tokensOut_ = tokensOut_;
      } else {
        result.tokensOut_ = tokensOutBuilder_.build();
      }
    }

    private void buildPartial0(com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shareOutAmount_ = shareOutAmount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse) {
        return mergeFrom((com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse other) {
      if (other == com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse.getDefaultInstance()) return this;
      if (!other.getShareOutAmount().isEmpty()) {
        shareOutAmount_ = other.shareOutAmount_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (tokensOutBuilder_ == null) {
        if (!other.tokensOut_.isEmpty()) {
          if (tokensOut_.isEmpty()) {
            tokensOut_ = other.tokensOut_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTokensOutIsMutable();
            tokensOut_.addAll(other.tokensOut_);
          }
          onChanged();
        }
      } else {
        if (!other.tokensOut_.isEmpty()) {
          if (tokensOutBuilder_.isEmpty()) {
            tokensOutBuilder_.dispose();
            tokensOutBuilder_ = null;
            tokensOut_ = other.tokensOut_;
            bitField0_ = (bitField0_ & ~0x00000002);
            tokensOutBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTokensOutFieldBuilder() : null;
          } else {
            tokensOutBuilder_.addAllMessages(other.tokensOut_);
          }
        }
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
              shareOutAmount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.cosmos.base.v1beta1.Coin m =
                  input.readMessage(
                      com.cosmos.base.v1beta1.Coin.parser(),
                      extensionRegistry);
              if (tokensOutBuilder_ == null) {
                ensureTokensOutIsMutable();
                tokensOut_.add(m);
              } else {
                tokensOutBuilder_.addMessage(m);
              }
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

    private java.lang.Object shareOutAmount_ = "";
    /**
     * <code>string share_out_amount = 1 [json_name = "shareOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"share_out_amount&#92;""];</code>
     * @return The shareOutAmount.
     */
    public java.lang.String getShareOutAmount() {
      java.lang.Object ref = shareOutAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareOutAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string share_out_amount = 1 [json_name = "shareOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"share_out_amount&#92;""];</code>
     * @return The bytes for shareOutAmount.
     */
    public com.google.protobuf.ByteString
        getShareOutAmountBytes() {
      java.lang.Object ref = shareOutAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shareOutAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string share_out_amount = 1 [json_name = "shareOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"share_out_amount&#92;""];</code>
     * @param value The shareOutAmount to set.
     * @return This builder for chaining.
     */
    public Builder setShareOutAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      shareOutAmount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string share_out_amount = 1 [json_name = "shareOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"share_out_amount&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearShareOutAmount() {
      shareOutAmount_ = getDefaultInstance().getShareOutAmount();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string share_out_amount = 1 [json_name = "shareOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"share_out_amount&#92;""];</code>
     * @param value The bytes for shareOutAmount to set.
     * @return This builder for chaining.
     */
    public Builder setShareOutAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      shareOutAmount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.cosmos.base.v1beta1.Coin> tokensOut_ =
      java.util.Collections.emptyList();
    private void ensureTokensOutIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        tokensOut_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(tokensOut_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> tokensOutBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getTokensOutList() {
      if (tokensOutBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tokensOut_);
      } else {
        return tokensOutBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public int getTokensOutCount() {
      if (tokensOutBuilder_ == null) {
        return tokensOut_.size();
      } else {
        return tokensOutBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin getTokensOut(int index) {
      if (tokensOutBuilder_ == null) {
        return tokensOut_.get(index);
      } else {
        return tokensOutBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setTokensOut(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (tokensOutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokensOutIsMutable();
        tokensOut_.set(index, value);
        onChanged();
      } else {
        tokensOutBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setTokensOut(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (tokensOutBuilder_ == null) {
        ensureTokensOutIsMutable();
        tokensOut_.set(index, builderForValue.build());
        onChanged();
      } else {
        tokensOutBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addTokensOut(com.cosmos.base.v1beta1.Coin value) {
      if (tokensOutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokensOutIsMutable();
        tokensOut_.add(value);
        onChanged();
      } else {
        tokensOutBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addTokensOut(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (tokensOutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokensOutIsMutable();
        tokensOut_.add(index, value);
        onChanged();
      } else {
        tokensOutBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addTokensOut(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (tokensOutBuilder_ == null) {
        ensureTokensOutIsMutable();
        tokensOut_.add(builderForValue.build());
        onChanged();
      } else {
        tokensOutBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addTokensOut(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (tokensOutBuilder_ == null) {
        ensureTokensOutIsMutable();
        tokensOut_.add(index, builderForValue.build());
        onChanged();
      } else {
        tokensOutBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAllTokensOut(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (tokensOutBuilder_ == null) {
        ensureTokensOutIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tokensOut_);
        onChanged();
      } else {
        tokensOutBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearTokensOut() {
      if (tokensOutBuilder_ == null) {
        tokensOut_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        tokensOutBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder removeTokensOut(int index) {
      if (tokensOutBuilder_ == null) {
        ensureTokensOutIsMutable();
        tokensOut_.remove(index);
        onChanged();
      } else {
        tokensOutBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getTokensOutBuilder(
        int index) {
      return getTokensOutFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getTokensOutOrBuilder(
        int index) {
      if (tokensOutBuilder_ == null) {
        return tokensOut_.get(index);  } else {
        return tokensOutBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getTokensOutOrBuilderList() {
      if (tokensOutBuilder_ != null) {
        return tokensOutBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tokensOut_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addTokensOutBuilder() {
      return getTokensOutFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addTokensOutBuilder(
        int index) {
      return getTokensOutFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin tokens_out = 2 [json_name = "tokensOut", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getTokensOutBuilderList() {
      return getTokensOutFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getTokensOutFieldBuilder() {
      if (tokensOutBuilder_ == null) {
        tokensOutBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                tokensOut_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        tokensOut_ = null;
      }
      return tokensOutBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse)
  }

  // @@protoc_insertion_point(class_scope:osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse)
  private static final com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse();
  }

  public static com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryCalcJoinPoolSharesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryCalcJoinPoolSharesResponse>() {
    @java.lang.Override
    public QueryCalcJoinPoolSharesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryCalcJoinPoolSharesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryCalcJoinPoolSharesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

