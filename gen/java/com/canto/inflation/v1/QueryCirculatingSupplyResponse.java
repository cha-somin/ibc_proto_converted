// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/inflation/v1/query.proto

package com.canto.inflation.v1;

/**
 * <pre>
 * QueryCirculatingSupplyResponse is the response type for the
 * Query/CirculatingSupply RPC method.
 * </pre>
 *
 * Protobuf type {@code canto.inflation.v1.QueryCirculatingSupplyResponse}
 */
public final class QueryCirculatingSupplyResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:canto.inflation.v1.QueryCirculatingSupplyResponse)
    QueryCirculatingSupplyResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryCirculatingSupplyResponse.newBuilder() to construct.
  private QueryCirculatingSupplyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryCirculatingSupplyResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryCirculatingSupplyResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.canto.inflation.v1.QueryProto.internal_static_canto_inflation_v1_QueryCirculatingSupplyResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.canto.inflation.v1.QueryProto.internal_static_canto_inflation_v1_QueryCirculatingSupplyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.canto.inflation.v1.QueryCirculatingSupplyResponse.class, com.canto.inflation.v1.QueryCirculatingSupplyResponse.Builder.class);
  }

  public static final int CIRCULATING_SUPPLY_FIELD_NUMBER = 1;
  private com.cosmos.base.v1beta1.DecCoin circulatingSupply_;
  /**
   * <pre>
   * total amount of coins in circulation
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   * @return Whether the circulatingSupply field is set.
   */
  @java.lang.Override
  public boolean hasCirculatingSupply() {
    return circulatingSupply_ != null;
  }
  /**
   * <pre>
   * total amount of coins in circulation
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   * @return The circulatingSupply.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.DecCoin getCirculatingSupply() {
    return circulatingSupply_ == null ? com.cosmos.base.v1beta1.DecCoin.getDefaultInstance() : circulatingSupply_;
  }
  /**
   * <pre>
   * total amount of coins in circulation
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.DecCoinOrBuilder getCirculatingSupplyOrBuilder() {
    return circulatingSupply_ == null ? com.cosmos.base.v1beta1.DecCoin.getDefaultInstance() : circulatingSupply_;
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
    if (circulatingSupply_ != null) {
      output.writeMessage(1, getCirculatingSupply());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (circulatingSupply_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCirculatingSupply());
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
    if (!(obj instanceof com.canto.inflation.v1.QueryCirculatingSupplyResponse)) {
      return super.equals(obj);
    }
    com.canto.inflation.v1.QueryCirculatingSupplyResponse other = (com.canto.inflation.v1.QueryCirculatingSupplyResponse) obj;

    if (hasCirculatingSupply() != other.hasCirculatingSupply()) return false;
    if (hasCirculatingSupply()) {
      if (!getCirculatingSupply()
          .equals(other.getCirculatingSupply())) return false;
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
    if (hasCirculatingSupply()) {
      hash = (37 * hash) + CIRCULATING_SUPPLY_FIELD_NUMBER;
      hash = (53 * hash) + getCirculatingSupply().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse parseFrom(
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
  public static Builder newBuilder(com.canto.inflation.v1.QueryCirculatingSupplyResponse prototype) {
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
   * QueryCirculatingSupplyResponse is the response type for the
   * Query/CirculatingSupply RPC method.
   * </pre>
   *
   * Protobuf type {@code canto.inflation.v1.QueryCirculatingSupplyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:canto.inflation.v1.QueryCirculatingSupplyResponse)
      com.canto.inflation.v1.QueryCirculatingSupplyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.canto.inflation.v1.QueryProto.internal_static_canto_inflation_v1_QueryCirculatingSupplyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.canto.inflation.v1.QueryProto.internal_static_canto_inflation_v1_QueryCirculatingSupplyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.canto.inflation.v1.QueryCirculatingSupplyResponse.class, com.canto.inflation.v1.QueryCirculatingSupplyResponse.Builder.class);
    }

    // Construct using com.canto.inflation.v1.QueryCirculatingSupplyResponse.newBuilder()
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
      circulatingSupply_ = null;
      if (circulatingSupplyBuilder_ != null) {
        circulatingSupplyBuilder_.dispose();
        circulatingSupplyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.canto.inflation.v1.QueryProto.internal_static_canto_inflation_v1_QueryCirculatingSupplyResponse_descriptor;
    }

    @java.lang.Override
    public com.canto.inflation.v1.QueryCirculatingSupplyResponse getDefaultInstanceForType() {
      return com.canto.inflation.v1.QueryCirculatingSupplyResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.canto.inflation.v1.QueryCirculatingSupplyResponse build() {
      com.canto.inflation.v1.QueryCirculatingSupplyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.canto.inflation.v1.QueryCirculatingSupplyResponse buildPartial() {
      com.canto.inflation.v1.QueryCirculatingSupplyResponse result = new com.canto.inflation.v1.QueryCirculatingSupplyResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.canto.inflation.v1.QueryCirculatingSupplyResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.circulatingSupply_ = circulatingSupplyBuilder_ == null
            ? circulatingSupply_
            : circulatingSupplyBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.canto.inflation.v1.QueryCirculatingSupplyResponse) {
        return mergeFrom((com.canto.inflation.v1.QueryCirculatingSupplyResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.canto.inflation.v1.QueryCirculatingSupplyResponse other) {
      if (other == com.canto.inflation.v1.QueryCirculatingSupplyResponse.getDefaultInstance()) return this;
      if (other.hasCirculatingSupply()) {
        mergeCirculatingSupply(other.getCirculatingSupply());
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
                  getCirculatingSupplyFieldBuilder().getBuilder(),
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

    private com.cosmos.base.v1beta1.DecCoin circulatingSupply_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.DecCoin, com.cosmos.base.v1beta1.DecCoin.Builder, com.cosmos.base.v1beta1.DecCoinOrBuilder> circulatingSupplyBuilder_;
    /**
     * <pre>
     * total amount of coins in circulation
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @return Whether the circulatingSupply field is set.
     */
    public boolean hasCirculatingSupply() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * total amount of coins in circulation
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @return The circulatingSupply.
     */
    public com.cosmos.base.v1beta1.DecCoin getCirculatingSupply() {
      if (circulatingSupplyBuilder_ == null) {
        return circulatingSupply_ == null ? com.cosmos.base.v1beta1.DecCoin.getDefaultInstance() : circulatingSupply_;
      } else {
        return circulatingSupplyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * total amount of coins in circulation
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder setCirculatingSupply(com.cosmos.base.v1beta1.DecCoin value) {
      if (circulatingSupplyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        circulatingSupply_ = value;
      } else {
        circulatingSupplyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total amount of coins in circulation
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder setCirculatingSupply(
        com.cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (circulatingSupplyBuilder_ == null) {
        circulatingSupply_ = builderForValue.build();
      } else {
        circulatingSupplyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total amount of coins in circulation
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder mergeCirculatingSupply(com.cosmos.base.v1beta1.DecCoin value) {
      if (circulatingSupplyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          circulatingSupply_ != null &&
          circulatingSupply_ != com.cosmos.base.v1beta1.DecCoin.getDefaultInstance()) {
          getCirculatingSupplyBuilder().mergeFrom(value);
        } else {
          circulatingSupply_ = value;
        }
      } else {
        circulatingSupplyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total amount of coins in circulation
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder clearCirculatingSupply() {
      bitField0_ = (bitField0_ & ~0x00000001);
      circulatingSupply_ = null;
      if (circulatingSupplyBuilder_ != null) {
        circulatingSupplyBuilder_.dispose();
        circulatingSupplyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total amount of coins in circulation
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoin.Builder getCirculatingSupplyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCirculatingSupplyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * total amount of coins in circulation
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoinOrBuilder getCirculatingSupplyOrBuilder() {
      if (circulatingSupplyBuilder_ != null) {
        return circulatingSupplyBuilder_.getMessageOrBuilder();
      } else {
        return circulatingSupply_ == null ?
            com.cosmos.base.v1beta1.DecCoin.getDefaultInstance() : circulatingSupply_;
      }
    }
    /**
     * <pre>
     * total amount of coins in circulation
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.DecCoin circulating_supply = 1 [json_name = "circulatingSupply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.DecCoin, com.cosmos.base.v1beta1.DecCoin.Builder, com.cosmos.base.v1beta1.DecCoinOrBuilder> 
        getCirculatingSupplyFieldBuilder() {
      if (circulatingSupplyBuilder_ == null) {
        circulatingSupplyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.DecCoin, com.cosmos.base.v1beta1.DecCoin.Builder, com.cosmos.base.v1beta1.DecCoinOrBuilder>(
                getCirculatingSupply(),
                getParentForChildren(),
                isClean());
        circulatingSupply_ = null;
      }
      return circulatingSupplyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:canto.inflation.v1.QueryCirculatingSupplyResponse)
  }

  // @@protoc_insertion_point(class_scope:canto.inflation.v1.QueryCirculatingSupplyResponse)
  private static final com.canto.inflation.v1.QueryCirculatingSupplyResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.canto.inflation.v1.QueryCirculatingSupplyResponse();
  }

  public static com.canto.inflation.v1.QueryCirculatingSupplyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryCirculatingSupplyResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryCirculatingSupplyResponse>() {
    @java.lang.Override
    public QueryCirculatingSupplyResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryCirculatingSupplyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryCirculatingSupplyResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.canto.inflation.v1.QueryCirculatingSupplyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

