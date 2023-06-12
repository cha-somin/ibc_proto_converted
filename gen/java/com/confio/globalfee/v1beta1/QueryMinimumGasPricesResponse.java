// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/globalfee/v1beta1/query.proto

package com.confio.globalfee.v1beta1;

/**
 * <pre>
 * QueryMinimumGasPricesResponse is the response type for the
 * Query/MinimumGasPrices RPC method.
 * </pre>
 *
 * Protobuf type {@code confio.globalfee.v1beta1.QueryMinimumGasPricesResponse}
 */
public final class QueryMinimumGasPricesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:confio.globalfee.v1beta1.QueryMinimumGasPricesResponse)
    QueryMinimumGasPricesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryMinimumGasPricesResponse.newBuilder() to construct.
  private QueryMinimumGasPricesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryMinimumGasPricesResponse() {
    minimumGasPrices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryMinimumGasPricesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.confio.globalfee.v1beta1.QueryProto.internal_static_confio_globalfee_v1beta1_QueryMinimumGasPricesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.confio.globalfee.v1beta1.QueryProto.internal_static_confio_globalfee_v1beta1_QueryMinimumGasPricesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse.class, com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse.Builder.class);
  }

  public static final int MINIMUM_GAS_PRICES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.DecCoin> minimumGasPrices_;
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.DecCoin> getMinimumGasPricesList() {
    return minimumGasPrices_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.DecCoinOrBuilder> 
      getMinimumGasPricesOrBuilderList() {
    return minimumGasPrices_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public int getMinimumGasPricesCount() {
    return minimumGasPrices_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.DecCoin getMinimumGasPrices(int index) {
    return minimumGasPrices_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.DecCoinOrBuilder getMinimumGasPricesOrBuilder(
      int index) {
    return minimumGasPrices_.get(index);
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
    for (int i = 0; i < minimumGasPrices_.size(); i++) {
      output.writeMessage(1, minimumGasPrices_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < minimumGasPrices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, minimumGasPrices_.get(i));
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
    if (!(obj instanceof com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse)) {
      return super.equals(obj);
    }
    com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse other = (com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse) obj;

    if (!getMinimumGasPricesList()
        .equals(other.getMinimumGasPricesList())) return false;
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
    if (getMinimumGasPricesCount() > 0) {
      hash = (37 * hash) + MINIMUM_GAS_PRICES_FIELD_NUMBER;
      hash = (53 * hash) + getMinimumGasPricesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse parseFrom(
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
  public static Builder newBuilder(com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse prototype) {
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
   * QueryMinimumGasPricesResponse is the response type for the
   * Query/MinimumGasPrices RPC method.
   * </pre>
   *
   * Protobuf type {@code confio.globalfee.v1beta1.QueryMinimumGasPricesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:confio.globalfee.v1beta1.QueryMinimumGasPricesResponse)
      com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.confio.globalfee.v1beta1.QueryProto.internal_static_confio_globalfee_v1beta1_QueryMinimumGasPricesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.confio.globalfee.v1beta1.QueryProto.internal_static_confio_globalfee_v1beta1_QueryMinimumGasPricesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse.class, com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse.Builder.class);
    }

    // Construct using com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse.newBuilder()
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
      if (minimumGasPricesBuilder_ == null) {
        minimumGasPrices_ = java.util.Collections.emptyList();
      } else {
        minimumGasPrices_ = null;
        minimumGasPricesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.confio.globalfee.v1beta1.QueryProto.internal_static_confio_globalfee_v1beta1_QueryMinimumGasPricesResponse_descriptor;
    }

    @java.lang.Override
    public com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse getDefaultInstanceForType() {
      return com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse build() {
      com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse buildPartial() {
      com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse result = new com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse result) {
      if (minimumGasPricesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          minimumGasPrices_ = java.util.Collections.unmodifiableList(minimumGasPrices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.minimumGasPrices_ = minimumGasPrices_;
      } else {
        result.minimumGasPrices_ = minimumGasPricesBuilder_.build();
      }
    }

    private void buildPartial0(com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse) {
        return mergeFrom((com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse other) {
      if (other == com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse.getDefaultInstance()) return this;
      if (minimumGasPricesBuilder_ == null) {
        if (!other.minimumGasPrices_.isEmpty()) {
          if (minimumGasPrices_.isEmpty()) {
            minimumGasPrices_ = other.minimumGasPrices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMinimumGasPricesIsMutable();
            minimumGasPrices_.addAll(other.minimumGasPrices_);
          }
          onChanged();
        }
      } else {
        if (!other.minimumGasPrices_.isEmpty()) {
          if (minimumGasPricesBuilder_.isEmpty()) {
            minimumGasPricesBuilder_.dispose();
            minimumGasPricesBuilder_ = null;
            minimumGasPrices_ = other.minimumGasPrices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            minimumGasPricesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMinimumGasPricesFieldBuilder() : null;
          } else {
            minimumGasPricesBuilder_.addAllMessages(other.minimumGasPrices_);
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
              com.cosmos.base.v1beta1.DecCoin m =
                  input.readMessage(
                      com.cosmos.base.v1beta1.DecCoin.parser(),
                      extensionRegistry);
              if (minimumGasPricesBuilder_ == null) {
                ensureMinimumGasPricesIsMutable();
                minimumGasPrices_.add(m);
              } else {
                minimumGasPricesBuilder_.addMessage(m);
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

    private java.util.List<com.cosmos.base.v1beta1.DecCoin> minimumGasPrices_ =
      java.util.Collections.emptyList();
    private void ensureMinimumGasPricesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        minimumGasPrices_ = new java.util.ArrayList<com.cosmos.base.v1beta1.DecCoin>(minimumGasPrices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.DecCoin, com.cosmos.base.v1beta1.DecCoin.Builder, com.cosmos.base.v1beta1.DecCoinOrBuilder> minimumGasPricesBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.DecCoin> getMinimumGasPricesList() {
      if (minimumGasPricesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(minimumGasPrices_);
      } else {
        return minimumGasPricesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public int getMinimumGasPricesCount() {
      if (minimumGasPricesBuilder_ == null) {
        return minimumGasPrices_.size();
      } else {
        return minimumGasPricesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoin getMinimumGasPrices(int index) {
      if (minimumGasPricesBuilder_ == null) {
        return minimumGasPrices_.get(index);
      } else {
        return minimumGasPricesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder setMinimumGasPrices(
        int index, com.cosmos.base.v1beta1.DecCoin value) {
      if (minimumGasPricesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMinimumGasPricesIsMutable();
        minimumGasPrices_.set(index, value);
        onChanged();
      } else {
        minimumGasPricesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder setMinimumGasPrices(
        int index, com.cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (minimumGasPricesBuilder_ == null) {
        ensureMinimumGasPricesIsMutable();
        minimumGasPrices_.set(index, builderForValue.build());
        onChanged();
      } else {
        minimumGasPricesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addMinimumGasPrices(com.cosmos.base.v1beta1.DecCoin value) {
      if (minimumGasPricesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMinimumGasPricesIsMutable();
        minimumGasPrices_.add(value);
        onChanged();
      } else {
        minimumGasPricesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addMinimumGasPrices(
        int index, com.cosmos.base.v1beta1.DecCoin value) {
      if (minimumGasPricesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMinimumGasPricesIsMutable();
        minimumGasPrices_.add(index, value);
        onChanged();
      } else {
        minimumGasPricesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addMinimumGasPrices(
        com.cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (minimumGasPricesBuilder_ == null) {
        ensureMinimumGasPricesIsMutable();
        minimumGasPrices_.add(builderForValue.build());
        onChanged();
      } else {
        minimumGasPricesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addMinimumGasPrices(
        int index, com.cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (minimumGasPricesBuilder_ == null) {
        ensureMinimumGasPricesIsMutable();
        minimumGasPrices_.add(index, builderForValue.build());
        onChanged();
      } else {
        minimumGasPricesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addAllMinimumGasPrices(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.DecCoin> values) {
      if (minimumGasPricesBuilder_ == null) {
        ensureMinimumGasPricesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, minimumGasPrices_);
        onChanged();
      } else {
        minimumGasPricesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder clearMinimumGasPrices() {
      if (minimumGasPricesBuilder_ == null) {
        minimumGasPrices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        minimumGasPricesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder removeMinimumGasPrices(int index) {
      if (minimumGasPricesBuilder_ == null) {
        ensureMinimumGasPricesIsMutable();
        minimumGasPrices_.remove(index);
        onChanged();
      } else {
        minimumGasPricesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoin.Builder getMinimumGasPricesBuilder(
        int index) {
      return getMinimumGasPricesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoinOrBuilder getMinimumGasPricesOrBuilder(
        int index) {
      if (minimumGasPricesBuilder_ == null) {
        return minimumGasPrices_.get(index);  } else {
        return minimumGasPricesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.DecCoinOrBuilder> 
         getMinimumGasPricesOrBuilderList() {
      if (minimumGasPricesBuilder_ != null) {
        return minimumGasPricesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(minimumGasPrices_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoin.Builder addMinimumGasPricesBuilder() {
      return getMinimumGasPricesFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.DecCoin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoin.Builder addMinimumGasPricesBuilder(
        int index) {
      return getMinimumGasPricesFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.DecCoin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1 [json_name = "minimumGasPrices", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "minimum_gas_prices,omitempty", (.gogoproto.moretags) = "yaml:&#92;"minimum_gas_prices&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.DecCoin.Builder> 
         getMinimumGasPricesBuilderList() {
      return getMinimumGasPricesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.DecCoin, com.cosmos.base.v1beta1.DecCoin.Builder, com.cosmos.base.v1beta1.DecCoinOrBuilder> 
        getMinimumGasPricesFieldBuilder() {
      if (minimumGasPricesBuilder_ == null) {
        minimumGasPricesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.DecCoin, com.cosmos.base.v1beta1.DecCoin.Builder, com.cosmos.base.v1beta1.DecCoinOrBuilder>(
                minimumGasPrices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        minimumGasPrices_ = null;
      }
      return minimumGasPricesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:confio.globalfee.v1beta1.QueryMinimumGasPricesResponse)
  }

  // @@protoc_insertion_point(class_scope:confio.globalfee.v1beta1.QueryMinimumGasPricesResponse)
  private static final com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse();
  }

  public static com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryMinimumGasPricesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryMinimumGasPricesResponse>() {
    @java.lang.Override
    public QueryMinimumGasPricesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryMinimumGasPricesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryMinimumGasPricesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.confio.globalfee.v1beta1.QueryMinimumGasPricesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

