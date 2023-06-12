// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

/**
 * <pre>
 * QueryTradeRewardPointsResponse is the response type for the
 * Query/TradeRewardPoints RPC method.
 * </pre>
 *
 * Protobuf type {@code injective.exchange.v1beta1.QueryTradeRewardPointsResponse}
 */
public final class QueryTradeRewardPointsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.QueryTradeRewardPointsResponse)
    QueryTradeRewardPointsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTradeRewardPointsResponse.newBuilder() to construct.
  private QueryTradeRewardPointsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTradeRewardPointsResponse() {
    accountTradeRewardPoints_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTradeRewardPointsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryTradeRewardPointsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryTradeRewardPointsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.class, com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.Builder.class);
  }

  public static final int ACCOUNT_TRADE_REWARD_POINTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList accountTradeRewardPoints_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return A list containing the accountTradeRewardPoints.
   */
  public com.google.protobuf.ProtocolStringList
      getAccountTradeRewardPointsList() {
    return accountTradeRewardPoints_;
  }
  /**
   * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The count of accountTradeRewardPoints.
   */
  public int getAccountTradeRewardPointsCount() {
    return accountTradeRewardPoints_.size();
  }
  /**
   * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @param index The index of the element to return.
   * @return The accountTradeRewardPoints at the given index.
   */
  public java.lang.String getAccountTradeRewardPoints(int index) {
    return accountTradeRewardPoints_.get(index);
  }
  /**
   * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the accountTradeRewardPoints at the given index.
   */
  public com.google.protobuf.ByteString
      getAccountTradeRewardPointsBytes(int index) {
    return accountTradeRewardPoints_.getByteString(index);
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
    for (int i = 0; i < accountTradeRewardPoints_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accountTradeRewardPoints_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < accountTradeRewardPoints_.size(); i++) {
        dataSize += computeStringSizeNoTag(accountTradeRewardPoints_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAccountTradeRewardPointsList().size();
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
    if (!(obj instanceof com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse other = (com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse) obj;

    if (!getAccountTradeRewardPointsList()
        .equals(other.getAccountTradeRewardPointsList())) return false;
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
    if (getAccountTradeRewardPointsCount() > 0) {
      hash = (37 * hash) + ACCOUNT_TRADE_REWARD_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getAccountTradeRewardPointsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse prototype) {
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
   * QueryTradeRewardPointsResponse is the response type for the
   * Query/TradeRewardPoints RPC method.
   * </pre>
   *
   * Protobuf type {@code injective.exchange.v1beta1.QueryTradeRewardPointsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.QueryTradeRewardPointsResponse)
      com.injective.exchange.v1beta1.QueryTradeRewardPointsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryTradeRewardPointsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryTradeRewardPointsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.class, com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.newBuilder()
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
      accountTradeRewardPoints_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryTradeRewardPointsResponse_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse build() {
      com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse buildPartial() {
      com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse result = new com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        accountTradeRewardPoints_.makeImmutable();
        result.accountTradeRewardPoints_ = accountTradeRewardPoints_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse) {
        return mergeFrom((com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse other) {
      if (other == com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.getDefaultInstance()) return this;
      if (!other.accountTradeRewardPoints_.isEmpty()) {
        if (accountTradeRewardPoints_.isEmpty()) {
          accountTradeRewardPoints_ = other.accountTradeRewardPoints_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAccountTradeRewardPointsIsMutable();
          accountTradeRewardPoints_.addAll(other.accountTradeRewardPoints_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureAccountTradeRewardPointsIsMutable();
              accountTradeRewardPoints_.add(s);
              break;
            } // case 10
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

    private com.google.protobuf.LazyStringArrayList accountTradeRewardPoints_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAccountTradeRewardPointsIsMutable() {
      if (!accountTradeRewardPoints_.isModifiable()) {
        accountTradeRewardPoints_ = new com.google.protobuf.LazyStringArrayList(accountTradeRewardPoints_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return A list containing the accountTradeRewardPoints.
     */
    public com.google.protobuf.ProtocolStringList
        getAccountTradeRewardPointsList() {
      accountTradeRewardPoints_.makeImmutable();
      return accountTradeRewardPoints_;
    }
    /**
     * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The count of accountTradeRewardPoints.
     */
    public int getAccountTradeRewardPointsCount() {
      return accountTradeRewardPoints_.size();
    }
    /**
     * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param index The index of the element to return.
     * @return The accountTradeRewardPoints at the given index.
     */
    public java.lang.String getAccountTradeRewardPoints(int index) {
      return accountTradeRewardPoints_.get(index);
    }
    /**
     * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the accountTradeRewardPoints at the given index.
     */
    public com.google.protobuf.ByteString
        getAccountTradeRewardPointsBytes(int index) {
      return accountTradeRewardPoints_.getByteString(index);
    }
    /**
     * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param index The index to set the value at.
     * @param value The accountTradeRewardPoints to set.
     * @return This builder for chaining.
     */
    public Builder setAccountTradeRewardPoints(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAccountTradeRewardPointsIsMutable();
      accountTradeRewardPoints_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The accountTradeRewardPoints to add.
     * @return This builder for chaining.
     */
    public Builder addAccountTradeRewardPoints(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAccountTradeRewardPointsIsMutable();
      accountTradeRewardPoints_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param values The accountTradeRewardPoints to add.
     * @return This builder for chaining.
     */
    public Builder addAllAccountTradeRewardPoints(
        java.lang.Iterable<java.lang.String> values) {
      ensureAccountTradeRewardPointsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, accountTradeRewardPoints_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountTradeRewardPoints() {
      accountTradeRewardPoints_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string account_trade_reward_points = 1 [json_name = "accountTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes of the accountTradeRewardPoints to add.
     * @return This builder for chaining.
     */
    public Builder addAccountTradeRewardPointsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAccountTradeRewardPointsIsMutable();
      accountTradeRewardPoints_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.QueryTradeRewardPointsResponse)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.QueryTradeRewardPointsResponse)
  private static final com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse();
  }

  public static com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTradeRewardPointsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTradeRewardPointsResponse>() {
    @java.lang.Override
    public QueryTradeRewardPointsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTradeRewardPointsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTradeRewardPointsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

