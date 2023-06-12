// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: onomyprotocol/dao/v1/query.proto

package com.onomyprotocol.dao.v1;

/**
 * <pre>
 * QueryTreasuryResponse is response type for the Query/Treasury RPC method.
 * </pre>
 *
 * Protobuf type {@code onomyprotocol.dao.v1.QueryTreasuryResponse}
 */
public final class QueryTreasuryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:onomyprotocol.dao.v1.QueryTreasuryResponse)
    QueryTreasuryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTreasuryResponse.newBuilder() to construct.
  private QueryTreasuryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTreasuryResponse() {
    treasuryBalance_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTreasuryResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.onomyprotocol.dao.v1.QueryProto.internal_static_onomyprotocol_dao_v1_QueryTreasuryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.onomyprotocol.dao.v1.QueryProto.internal_static_onomyprotocol_dao_v1_QueryTreasuryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.onomyprotocol.dao.v1.QueryTreasuryResponse.class, com.onomyprotocol.dao.v1.QueryTreasuryResponse.Builder.class);
  }

  public static final int TREASURY_BALANCE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> treasuryBalance_;
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getTreasuryBalanceList() {
    return treasuryBalance_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getTreasuryBalanceOrBuilderList() {
    return treasuryBalance_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public int getTreasuryBalanceCount() {
    return treasuryBalance_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getTreasuryBalance(int index) {
    return treasuryBalance_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getTreasuryBalanceOrBuilder(
      int index) {
    return treasuryBalance_.get(index);
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
    for (int i = 0; i < treasuryBalance_.size(); i++) {
      output.writeMessage(1, treasuryBalance_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < treasuryBalance_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, treasuryBalance_.get(i));
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
    if (!(obj instanceof com.onomyprotocol.dao.v1.QueryTreasuryResponse)) {
      return super.equals(obj);
    }
    com.onomyprotocol.dao.v1.QueryTreasuryResponse other = (com.onomyprotocol.dao.v1.QueryTreasuryResponse) obj;

    if (!getTreasuryBalanceList()
        .equals(other.getTreasuryBalanceList())) return false;
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
    if (getTreasuryBalanceCount() > 0) {
      hash = (37 * hash) + TREASURY_BALANCE_FIELD_NUMBER;
      hash = (53 * hash) + getTreasuryBalanceList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse parseFrom(
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
  public static Builder newBuilder(com.onomyprotocol.dao.v1.QueryTreasuryResponse prototype) {
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
   * QueryTreasuryResponse is response type for the Query/Treasury RPC method.
   * </pre>
   *
   * Protobuf type {@code onomyprotocol.dao.v1.QueryTreasuryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:onomyprotocol.dao.v1.QueryTreasuryResponse)
      com.onomyprotocol.dao.v1.QueryTreasuryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.onomyprotocol.dao.v1.QueryProto.internal_static_onomyprotocol_dao_v1_QueryTreasuryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.onomyprotocol.dao.v1.QueryProto.internal_static_onomyprotocol_dao_v1_QueryTreasuryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.onomyprotocol.dao.v1.QueryTreasuryResponse.class, com.onomyprotocol.dao.v1.QueryTreasuryResponse.Builder.class);
    }

    // Construct using com.onomyprotocol.dao.v1.QueryTreasuryResponse.newBuilder()
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
      if (treasuryBalanceBuilder_ == null) {
        treasuryBalance_ = java.util.Collections.emptyList();
      } else {
        treasuryBalance_ = null;
        treasuryBalanceBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.onomyprotocol.dao.v1.QueryProto.internal_static_onomyprotocol_dao_v1_QueryTreasuryResponse_descriptor;
    }

    @java.lang.Override
    public com.onomyprotocol.dao.v1.QueryTreasuryResponse getDefaultInstanceForType() {
      return com.onomyprotocol.dao.v1.QueryTreasuryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.onomyprotocol.dao.v1.QueryTreasuryResponse build() {
      com.onomyprotocol.dao.v1.QueryTreasuryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.onomyprotocol.dao.v1.QueryTreasuryResponse buildPartial() {
      com.onomyprotocol.dao.v1.QueryTreasuryResponse result = new com.onomyprotocol.dao.v1.QueryTreasuryResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.onomyprotocol.dao.v1.QueryTreasuryResponse result) {
      if (treasuryBalanceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          treasuryBalance_ = java.util.Collections.unmodifiableList(treasuryBalance_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.treasuryBalance_ = treasuryBalance_;
      } else {
        result.treasuryBalance_ = treasuryBalanceBuilder_.build();
      }
    }

    private void buildPartial0(com.onomyprotocol.dao.v1.QueryTreasuryResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.onomyprotocol.dao.v1.QueryTreasuryResponse) {
        return mergeFrom((com.onomyprotocol.dao.v1.QueryTreasuryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.onomyprotocol.dao.v1.QueryTreasuryResponse other) {
      if (other == com.onomyprotocol.dao.v1.QueryTreasuryResponse.getDefaultInstance()) return this;
      if (treasuryBalanceBuilder_ == null) {
        if (!other.treasuryBalance_.isEmpty()) {
          if (treasuryBalance_.isEmpty()) {
            treasuryBalance_ = other.treasuryBalance_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTreasuryBalanceIsMutable();
            treasuryBalance_.addAll(other.treasuryBalance_);
          }
          onChanged();
        }
      } else {
        if (!other.treasuryBalance_.isEmpty()) {
          if (treasuryBalanceBuilder_.isEmpty()) {
            treasuryBalanceBuilder_.dispose();
            treasuryBalanceBuilder_ = null;
            treasuryBalance_ = other.treasuryBalance_;
            bitField0_ = (bitField0_ & ~0x00000001);
            treasuryBalanceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTreasuryBalanceFieldBuilder() : null;
          } else {
            treasuryBalanceBuilder_.addAllMessages(other.treasuryBalance_);
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
              com.cosmos.base.v1beta1.Coin m =
                  input.readMessage(
                      com.cosmos.base.v1beta1.Coin.parser(),
                      extensionRegistry);
              if (treasuryBalanceBuilder_ == null) {
                ensureTreasuryBalanceIsMutable();
                treasuryBalance_.add(m);
              } else {
                treasuryBalanceBuilder_.addMessage(m);
              }
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

    private java.util.List<com.cosmos.base.v1beta1.Coin> treasuryBalance_ =
      java.util.Collections.emptyList();
    private void ensureTreasuryBalanceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        treasuryBalance_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(treasuryBalance_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> treasuryBalanceBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getTreasuryBalanceList() {
      if (treasuryBalanceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(treasuryBalance_);
      } else {
        return treasuryBalanceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public int getTreasuryBalanceCount() {
      if (treasuryBalanceBuilder_ == null) {
        return treasuryBalance_.size();
      } else {
        return treasuryBalanceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin getTreasuryBalance(int index) {
      if (treasuryBalanceBuilder_ == null) {
        return treasuryBalance_.get(index);
      } else {
        return treasuryBalanceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setTreasuryBalance(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (treasuryBalanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTreasuryBalanceIsMutable();
        treasuryBalance_.set(index, value);
        onChanged();
      } else {
        treasuryBalanceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setTreasuryBalance(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (treasuryBalanceBuilder_ == null) {
        ensureTreasuryBalanceIsMutable();
        treasuryBalance_.set(index, builderForValue.build());
        onChanged();
      } else {
        treasuryBalanceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addTreasuryBalance(com.cosmos.base.v1beta1.Coin value) {
      if (treasuryBalanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTreasuryBalanceIsMutable();
        treasuryBalance_.add(value);
        onChanged();
      } else {
        treasuryBalanceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addTreasuryBalance(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (treasuryBalanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTreasuryBalanceIsMutable();
        treasuryBalance_.add(index, value);
        onChanged();
      } else {
        treasuryBalanceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addTreasuryBalance(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (treasuryBalanceBuilder_ == null) {
        ensureTreasuryBalanceIsMutable();
        treasuryBalance_.add(builderForValue.build());
        onChanged();
      } else {
        treasuryBalanceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addTreasuryBalance(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (treasuryBalanceBuilder_ == null) {
        ensureTreasuryBalanceIsMutable();
        treasuryBalance_.add(index, builderForValue.build());
        onChanged();
      } else {
        treasuryBalanceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAllTreasuryBalance(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (treasuryBalanceBuilder_ == null) {
        ensureTreasuryBalanceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, treasuryBalance_);
        onChanged();
      } else {
        treasuryBalanceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearTreasuryBalance() {
      if (treasuryBalanceBuilder_ == null) {
        treasuryBalance_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        treasuryBalanceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder removeTreasuryBalance(int index) {
      if (treasuryBalanceBuilder_ == null) {
        ensureTreasuryBalanceIsMutable();
        treasuryBalance_.remove(index);
        onChanged();
      } else {
        treasuryBalanceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getTreasuryBalanceBuilder(
        int index) {
      return getTreasuryBalanceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getTreasuryBalanceOrBuilder(
        int index) {
      if (treasuryBalanceBuilder_ == null) {
        return treasuryBalance_.get(index);  } else {
        return treasuryBalanceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getTreasuryBalanceOrBuilderList() {
      if (treasuryBalanceBuilder_ != null) {
        return treasuryBalanceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(treasuryBalance_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addTreasuryBalanceBuilder() {
      return getTreasuryBalanceFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addTreasuryBalanceBuilder(
        int index) {
      return getTreasuryBalanceFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getTreasuryBalanceBuilderList() {
      return getTreasuryBalanceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getTreasuryBalanceFieldBuilder() {
      if (treasuryBalanceBuilder_ == null) {
        treasuryBalanceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                treasuryBalance_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        treasuryBalance_ = null;
      }
      return treasuryBalanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:onomyprotocol.dao.v1.QueryTreasuryResponse)
  }

  // @@protoc_insertion_point(class_scope:onomyprotocol.dao.v1.QueryTreasuryResponse)
  private static final com.onomyprotocol.dao.v1.QueryTreasuryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.onomyprotocol.dao.v1.QueryTreasuryResponse();
  }

  public static com.onomyprotocol.dao.v1.QueryTreasuryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTreasuryResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTreasuryResponse>() {
    @java.lang.Override
    public QueryTreasuryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTreasuryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTreasuryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.onomyprotocol.dao.v1.QueryTreasuryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

