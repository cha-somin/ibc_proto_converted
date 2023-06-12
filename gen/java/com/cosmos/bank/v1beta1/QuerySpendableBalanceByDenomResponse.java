// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package com.cosmos.bank.v1beta1;

/**
 * <pre>
 * QuerySpendableBalanceByDenomResponse defines the gRPC response structure for
 * querying an account's spendable balance for a specific denom.
 *
 * Since: cosmos-sdk 0.47
 * </pre>
 *
 * Protobuf type {@code cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse}
 */
public final class QuerySpendableBalanceByDenomResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse)
    QuerySpendableBalanceByDenomResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySpendableBalanceByDenomResponse.newBuilder() to construct.
  private QuerySpendableBalanceByDenomResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySpendableBalanceByDenomResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuerySpendableBalanceByDenomResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.bank.v1beta1.QueryProto.internal_static_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.bank.v1beta1.QueryProto.internal_static_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse.class, com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse.Builder.class);
  }

  public static final int BALANCE_FIELD_NUMBER = 1;
  private com.cosmos.base.v1beta1.Coin balance_;
  /**
   * <pre>
   * balance is the balance of the coin.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
   * @return Whether the balance field is set.
   */
  @java.lang.Override
  public boolean hasBalance() {
    return balance_ != null;
  }
  /**
   * <pre>
   * balance is the balance of the coin.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
   * @return The balance.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getBalance() {
    return balance_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : balance_;
  }
  /**
   * <pre>
   * balance is the balance of the coin.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getBalanceOrBuilder() {
    return balance_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : balance_;
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
    if (balance_ != null) {
      output.writeMessage(1, getBalance());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (balance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBalance());
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
    if (!(obj instanceof com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse)) {
      return super.equals(obj);
    }
    com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse other = (com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse) obj;

    if (hasBalance() != other.hasBalance()) return false;
    if (hasBalance()) {
      if (!getBalance()
          .equals(other.getBalance())) return false;
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
    if (hasBalance()) {
      hash = (37 * hash) + BALANCE_FIELD_NUMBER;
      hash = (53 * hash) + getBalance().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse prototype) {
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
   * QuerySpendableBalanceByDenomResponse defines the gRPC response structure for
   * querying an account's spendable balance for a specific denom.
   *
   * Since: cosmos-sdk 0.47
   * </pre>
   *
   * Protobuf type {@code cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse)
      com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.bank.v1beta1.QueryProto.internal_static_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.bank.v1beta1.QueryProto.internal_static_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse.class, com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse.Builder.class);
    }

    // Construct using com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse.newBuilder()
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
      balance_ = null;
      if (balanceBuilder_ != null) {
        balanceBuilder_.dispose();
        balanceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.bank.v1beta1.QueryProto.internal_static_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse getDefaultInstanceForType() {
      return com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse build() {
      com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse buildPartial() {
      com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse result = new com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.balance_ = balanceBuilder_ == null
            ? balance_
            : balanceBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse) {
        return mergeFrom((com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse other) {
      if (other == com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse.getDefaultInstance()) return this;
      if (other.hasBalance()) {
        mergeBalance(other.getBalance());
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
                  getBalanceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.cosmos.base.v1beta1.Coin balance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> balanceBuilder_;
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
     * @return Whether the balance field is set.
     */
    public boolean hasBalance() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
     * @return The balance.
     */
    public com.cosmos.base.v1beta1.Coin getBalance() {
      if (balanceBuilder_ == null) {
        return balance_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : balance_;
      } else {
        return balanceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
     */
    public Builder setBalance(com.cosmos.base.v1beta1.Coin value) {
      if (balanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        balance_ = value;
      } else {
        balanceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
     */
    public Builder setBalance(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (balanceBuilder_ == null) {
        balance_ = builderForValue.build();
      } else {
        balanceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
     */
    public Builder mergeBalance(com.cosmos.base.v1beta1.Coin value) {
      if (balanceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          balance_ != null &&
          balance_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getBalanceBuilder().mergeFrom(value);
        } else {
          balance_ = value;
        }
      } else {
        balanceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
     */
    public Builder clearBalance() {
      bitField0_ = (bitField0_ & ~0x00000001);
      balance_ = null;
      if (balanceBuilder_ != null) {
        balanceBuilder_.dispose();
        balanceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getBalanceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBalanceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getBalanceOrBuilder() {
      if (balanceBuilder_ != null) {
        return balanceBuilder_.getMessageOrBuilder();
      } else {
        return balance_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : balance_;
      }
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getBalanceFieldBuilder() {
      if (balanceBuilder_ == null) {
        balanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getBalance(),
                getParentForChildren(),
                isClean());
        balance_ = null;
      }
      return balanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse)
  private static final com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse();
  }

  public static com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySpendableBalanceByDenomResponse>
      PARSER = new com.google.protobuf.AbstractParser<QuerySpendableBalanceByDenomResponse>() {
    @java.lang.Override
    public QuerySpendableBalanceByDenomResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuerySpendableBalanceByDenomResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySpendableBalanceByDenomResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

