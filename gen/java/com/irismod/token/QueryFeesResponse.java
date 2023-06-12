// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/token/query.proto

package com.irismod.token;

/**
 * <pre>
 * QueryFeesResponse is response type for the Query/Fees RPC method
 * </pre>
 *
 * Protobuf type {@code irismod.token.QueryFeesResponse}
 */
public final class QueryFeesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:irismod.token.QueryFeesResponse)
    QueryFeesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryFeesResponse.newBuilder() to construct.
  private QueryFeesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryFeesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryFeesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.irismod.token.QueryProto.internal_static_irismod_token_QueryFeesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.irismod.token.QueryProto.internal_static_irismod_token_QueryFeesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.irismod.token.QueryFeesResponse.class, com.irismod.token.QueryFeesResponse.Builder.class);
  }

  public static final int EXIST_FIELD_NUMBER = 1;
  private boolean exist_ = false;
  /**
   * <code>bool exist = 1 [json_name = "exist"];</code>
   * @return The exist.
   */
  @java.lang.Override
  public boolean getExist() {
    return exist_;
  }

  public static final int ISSUE_FEE_FIELD_NUMBER = 2;
  private com.cosmos.base.v1beta1.Coin issueFee_;
  /**
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the issueFee field is set.
   */
  @java.lang.Override
  public boolean hasIssueFee() {
    return issueFee_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The issueFee.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getIssueFee() {
    return issueFee_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : issueFee_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getIssueFeeOrBuilder() {
    return issueFee_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : issueFee_;
  }

  public static final int MINT_FEE_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin mintFee_;
  /**
   * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the mintFee field is set.
   */
  @java.lang.Override
  public boolean hasMintFee() {
    return mintFee_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The mintFee.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getMintFee() {
    return mintFee_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : mintFee_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getMintFeeOrBuilder() {
    return mintFee_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : mintFee_;
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
    if (exist_ != false) {
      output.writeBool(1, exist_);
    }
    if (issueFee_ != null) {
      output.writeMessage(2, getIssueFee());
    }
    if (mintFee_ != null) {
      output.writeMessage(3, getMintFee());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (exist_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, exist_);
    }
    if (issueFee_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIssueFee());
    }
    if (mintFee_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMintFee());
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
    if (!(obj instanceof com.irismod.token.QueryFeesResponse)) {
      return super.equals(obj);
    }
    com.irismod.token.QueryFeesResponse other = (com.irismod.token.QueryFeesResponse) obj;

    if (getExist()
        != other.getExist()) return false;
    if (hasIssueFee() != other.hasIssueFee()) return false;
    if (hasIssueFee()) {
      if (!getIssueFee()
          .equals(other.getIssueFee())) return false;
    }
    if (hasMintFee() != other.hasMintFee()) return false;
    if (hasMintFee()) {
      if (!getMintFee()
          .equals(other.getMintFee())) return false;
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
    hash = (37 * hash) + EXIST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getExist());
    if (hasIssueFee()) {
      hash = (37 * hash) + ISSUE_FEE_FIELD_NUMBER;
      hash = (53 * hash) + getIssueFee().hashCode();
    }
    if (hasMintFee()) {
      hash = (37 * hash) + MINT_FEE_FIELD_NUMBER;
      hash = (53 * hash) + getMintFee().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.irismod.token.QueryFeesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.token.QueryFeesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.token.QueryFeesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.token.QueryFeesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.token.QueryFeesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.token.QueryFeesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.token.QueryFeesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.token.QueryFeesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.irismod.token.QueryFeesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.irismod.token.QueryFeesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.irismod.token.QueryFeesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.token.QueryFeesResponse parseFrom(
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
  public static Builder newBuilder(com.irismod.token.QueryFeesResponse prototype) {
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
   * QueryFeesResponse is response type for the Query/Fees RPC method
   * </pre>
   *
   * Protobuf type {@code irismod.token.QueryFeesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:irismod.token.QueryFeesResponse)
      com.irismod.token.QueryFeesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irismod.token.QueryProto.internal_static_irismod_token_QueryFeesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irismod.token.QueryProto.internal_static_irismod_token_QueryFeesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irismod.token.QueryFeesResponse.class, com.irismod.token.QueryFeesResponse.Builder.class);
    }

    // Construct using com.irismod.token.QueryFeesResponse.newBuilder()
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
      exist_ = false;
      issueFee_ = null;
      if (issueFeeBuilder_ != null) {
        issueFeeBuilder_.dispose();
        issueFeeBuilder_ = null;
      }
      mintFee_ = null;
      if (mintFeeBuilder_ != null) {
        mintFeeBuilder_.dispose();
        mintFeeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.irismod.token.QueryProto.internal_static_irismod_token_QueryFeesResponse_descriptor;
    }

    @java.lang.Override
    public com.irismod.token.QueryFeesResponse getDefaultInstanceForType() {
      return com.irismod.token.QueryFeesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.irismod.token.QueryFeesResponse build() {
      com.irismod.token.QueryFeesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.irismod.token.QueryFeesResponse buildPartial() {
      com.irismod.token.QueryFeesResponse result = new com.irismod.token.QueryFeesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.irismod.token.QueryFeesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.exist_ = exist_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.issueFee_ = issueFeeBuilder_ == null
            ? issueFee_
            : issueFeeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.mintFee_ = mintFeeBuilder_ == null
            ? mintFee_
            : mintFeeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.irismod.token.QueryFeesResponse) {
        return mergeFrom((com.irismod.token.QueryFeesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.irismod.token.QueryFeesResponse other) {
      if (other == com.irismod.token.QueryFeesResponse.getDefaultInstance()) return this;
      if (other.getExist() != false) {
        setExist(other.getExist());
      }
      if (other.hasIssueFee()) {
        mergeIssueFee(other.getIssueFee());
      }
      if (other.hasMintFee()) {
        mergeMintFee(other.getMintFee());
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
            case 8: {
              exist_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getIssueFeeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getMintFeeFieldBuilder().getBuilder(),
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

    private boolean exist_ ;
    /**
     * <code>bool exist = 1 [json_name = "exist"];</code>
     * @return The exist.
     */
    @java.lang.Override
    public boolean getExist() {
      return exist_;
    }
    /**
     * <code>bool exist = 1 [json_name = "exist"];</code>
     * @param value The exist to set.
     * @return This builder for chaining.
     */
    public Builder setExist(boolean value) {

      exist_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool exist = 1 [json_name = "exist"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExist() {
      bitField0_ = (bitField0_ & ~0x00000001);
      exist_ = false;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin issueFee_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> issueFeeBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return Whether the issueFee field is set.
     */
    public boolean hasIssueFee() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return The issueFee.
     */
    public com.cosmos.base.v1beta1.Coin getIssueFee() {
      if (issueFeeBuilder_ == null) {
        return issueFee_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : issueFee_;
      } else {
        return issueFeeBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setIssueFee(com.cosmos.base.v1beta1.Coin value) {
      if (issueFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        issueFee_ = value;
      } else {
        issueFeeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setIssueFee(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (issueFeeBuilder_ == null) {
        issueFee_ = builderForValue.build();
      } else {
        issueFeeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder mergeIssueFee(com.cosmos.base.v1beta1.Coin value) {
      if (issueFeeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          issueFee_ != null &&
          issueFee_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getIssueFeeBuilder().mergeFrom(value);
        } else {
          issueFee_ = value;
        }
      } else {
        issueFeeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder clearIssueFee() {
      bitField0_ = (bitField0_ & ~0x00000002);
      issueFee_ = null;
      if (issueFeeBuilder_ != null) {
        issueFeeBuilder_.dispose();
        issueFeeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getIssueFeeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getIssueFeeFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getIssueFeeOrBuilder() {
      if (issueFeeBuilder_ != null) {
        return issueFeeBuilder_.getMessageOrBuilder();
      } else {
        return issueFee_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : issueFee_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin issue_fee = 2 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getIssueFeeFieldBuilder() {
      if (issueFeeBuilder_ == null) {
        issueFeeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getIssueFee(),
                getParentForChildren(),
                isClean());
        issueFee_ = null;
      }
      return issueFeeBuilder_;
    }

    private com.cosmos.base.v1beta1.Coin mintFee_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> mintFeeBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return Whether the mintFee field is set.
     */
    public boolean hasMintFee() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return The mintFee.
     */
    public com.cosmos.base.v1beta1.Coin getMintFee() {
      if (mintFeeBuilder_ == null) {
        return mintFee_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : mintFee_;
      } else {
        return mintFeeBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setMintFee(com.cosmos.base.v1beta1.Coin value) {
      if (mintFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mintFee_ = value;
      } else {
        mintFeeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setMintFee(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (mintFeeBuilder_ == null) {
        mintFee_ = builderForValue.build();
      } else {
        mintFeeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder mergeMintFee(com.cosmos.base.v1beta1.Coin value) {
      if (mintFeeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          mintFee_ != null &&
          mintFee_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getMintFeeBuilder().mergeFrom(value);
        } else {
          mintFee_ = value;
        }
      } else {
        mintFeeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder clearMintFee() {
      bitField0_ = (bitField0_ & ~0x00000004);
      mintFee_ = null;
      if (mintFeeBuilder_ != null) {
        mintFeeBuilder_.dispose();
        mintFeeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getMintFeeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getMintFeeFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getMintFeeOrBuilder() {
      if (mintFeeBuilder_ != null) {
        return mintFeeBuilder_.getMessageOrBuilder();
      } else {
        return mintFee_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : mintFee_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin mint_fee = 3 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getMintFeeFieldBuilder() {
      if (mintFeeBuilder_ == null) {
        mintFeeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getMintFee(),
                getParentForChildren(),
                isClean());
        mintFee_ = null;
      }
      return mintFeeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:irismod.token.QueryFeesResponse)
  }

  // @@protoc_insertion_point(class_scope:irismod.token.QueryFeesResponse)
  private static final com.irismod.token.QueryFeesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.irismod.token.QueryFeesResponse();
  }

  public static com.irismod.token.QueryFeesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryFeesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryFeesResponse>() {
    @java.lang.Override
    public QueryFeesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryFeesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryFeesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.irismod.token.QueryFeesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

