// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/tokenfactory/v1beta1/params.proto

package com.injective.tokenfactory.v1beta1;

/**
 * <pre>
 * Params defines the parameters for the tokenfactory module.
 * </pre>
 *
 * Protobuf type {@code injective.tokenfactory.v1beta1.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.tokenfactory.v1beta1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
    denomCreationFee_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.tokenfactory.v1beta1.ParamsProto.internal_static_injective_tokenfactory_v1beta1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.tokenfactory.v1beta1.ParamsProto.internal_static_injective_tokenfactory_v1beta1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.tokenfactory.v1beta1.Params.class, com.injective.tokenfactory.v1beta1.Params.Builder.class);
  }

  public static final int DENOM_CREATION_FEE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> denomCreationFee_;
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getDenomCreationFeeList() {
    return denomCreationFee_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getDenomCreationFeeOrBuilderList() {
    return denomCreationFee_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public int getDenomCreationFeeCount() {
    return denomCreationFee_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getDenomCreationFee(int index) {
    return denomCreationFee_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getDenomCreationFeeOrBuilder(
      int index) {
    return denomCreationFee_.get(index);
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
    for (int i = 0; i < denomCreationFee_.size(); i++) {
      output.writeMessage(1, denomCreationFee_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < denomCreationFee_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, denomCreationFee_.get(i));
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
    if (!(obj instanceof com.injective.tokenfactory.v1beta1.Params)) {
      return super.equals(obj);
    }
    com.injective.tokenfactory.v1beta1.Params other = (com.injective.tokenfactory.v1beta1.Params) obj;

    if (!getDenomCreationFeeList()
        .equals(other.getDenomCreationFeeList())) return false;
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
    if (getDenomCreationFeeCount() > 0) {
      hash = (37 * hash) + DENOM_CREATION_FEE_FIELD_NUMBER;
      hash = (53 * hash) + getDenomCreationFeeList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.tokenfactory.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.tokenfactory.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.tokenfactory.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.tokenfactory.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.tokenfactory.v1beta1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.tokenfactory.v1beta1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.tokenfactory.v1beta1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.tokenfactory.v1beta1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.tokenfactory.v1beta1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.tokenfactory.v1beta1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.tokenfactory.v1beta1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.tokenfactory.v1beta1.Params parseFrom(
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
  public static Builder newBuilder(com.injective.tokenfactory.v1beta1.Params prototype) {
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
   * Params defines the parameters for the tokenfactory module.
   * </pre>
   *
   * Protobuf type {@code injective.tokenfactory.v1beta1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.tokenfactory.v1beta1.Params)
      com.injective.tokenfactory.v1beta1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.tokenfactory.v1beta1.ParamsProto.internal_static_injective_tokenfactory_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.tokenfactory.v1beta1.ParamsProto.internal_static_injective_tokenfactory_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.tokenfactory.v1beta1.Params.class, com.injective.tokenfactory.v1beta1.Params.Builder.class);
    }

    // Construct using com.injective.tokenfactory.v1beta1.Params.newBuilder()
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
      if (denomCreationFeeBuilder_ == null) {
        denomCreationFee_ = java.util.Collections.emptyList();
      } else {
        denomCreationFee_ = null;
        denomCreationFeeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.tokenfactory.v1beta1.ParamsProto.internal_static_injective_tokenfactory_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    public com.injective.tokenfactory.v1beta1.Params getDefaultInstanceForType() {
      return com.injective.tokenfactory.v1beta1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.tokenfactory.v1beta1.Params build() {
      com.injective.tokenfactory.v1beta1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.tokenfactory.v1beta1.Params buildPartial() {
      com.injective.tokenfactory.v1beta1.Params result = new com.injective.tokenfactory.v1beta1.Params(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.injective.tokenfactory.v1beta1.Params result) {
      if (denomCreationFeeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          denomCreationFee_ = java.util.Collections.unmodifiableList(denomCreationFee_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.denomCreationFee_ = denomCreationFee_;
      } else {
        result.denomCreationFee_ = denomCreationFeeBuilder_.build();
      }
    }

    private void buildPartial0(com.injective.tokenfactory.v1beta1.Params result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.tokenfactory.v1beta1.Params) {
        return mergeFrom((com.injective.tokenfactory.v1beta1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.tokenfactory.v1beta1.Params other) {
      if (other == com.injective.tokenfactory.v1beta1.Params.getDefaultInstance()) return this;
      if (denomCreationFeeBuilder_ == null) {
        if (!other.denomCreationFee_.isEmpty()) {
          if (denomCreationFee_.isEmpty()) {
            denomCreationFee_ = other.denomCreationFee_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDenomCreationFeeIsMutable();
            denomCreationFee_.addAll(other.denomCreationFee_);
          }
          onChanged();
        }
      } else {
        if (!other.denomCreationFee_.isEmpty()) {
          if (denomCreationFeeBuilder_.isEmpty()) {
            denomCreationFeeBuilder_.dispose();
            denomCreationFeeBuilder_ = null;
            denomCreationFee_ = other.denomCreationFee_;
            bitField0_ = (bitField0_ & ~0x00000001);
            denomCreationFeeBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDenomCreationFeeFieldBuilder() : null;
          } else {
            denomCreationFeeBuilder_.addAllMessages(other.denomCreationFee_);
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
              if (denomCreationFeeBuilder_ == null) {
                ensureDenomCreationFeeIsMutable();
                denomCreationFee_.add(m);
              } else {
                denomCreationFeeBuilder_.addMessage(m);
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

    private java.util.List<com.cosmos.base.v1beta1.Coin> denomCreationFee_ =
      java.util.Collections.emptyList();
    private void ensureDenomCreationFeeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        denomCreationFee_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(denomCreationFee_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> denomCreationFeeBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getDenomCreationFeeList() {
      if (denomCreationFeeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(denomCreationFee_);
      } else {
        return denomCreationFeeBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public int getDenomCreationFeeCount() {
      if (denomCreationFeeBuilder_ == null) {
        return denomCreationFee_.size();
      } else {
        return denomCreationFeeBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin getDenomCreationFee(int index) {
      if (denomCreationFeeBuilder_ == null) {
        return denomCreationFee_.get(index);
      } else {
        return denomCreationFeeBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setDenomCreationFee(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (denomCreationFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDenomCreationFeeIsMutable();
        denomCreationFee_.set(index, value);
        onChanged();
      } else {
        denomCreationFeeBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setDenomCreationFee(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (denomCreationFeeBuilder_ == null) {
        ensureDenomCreationFeeIsMutable();
        denomCreationFee_.set(index, builderForValue.build());
        onChanged();
      } else {
        denomCreationFeeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addDenomCreationFee(com.cosmos.base.v1beta1.Coin value) {
      if (denomCreationFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDenomCreationFeeIsMutable();
        denomCreationFee_.add(value);
        onChanged();
      } else {
        denomCreationFeeBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addDenomCreationFee(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (denomCreationFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDenomCreationFeeIsMutable();
        denomCreationFee_.add(index, value);
        onChanged();
      } else {
        denomCreationFeeBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addDenomCreationFee(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (denomCreationFeeBuilder_ == null) {
        ensureDenomCreationFeeIsMutable();
        denomCreationFee_.add(builderForValue.build());
        onChanged();
      } else {
        denomCreationFeeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addDenomCreationFee(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (denomCreationFeeBuilder_ == null) {
        ensureDenomCreationFeeIsMutable();
        denomCreationFee_.add(index, builderForValue.build());
        onChanged();
      } else {
        denomCreationFeeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAllDenomCreationFee(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (denomCreationFeeBuilder_ == null) {
        ensureDenomCreationFeeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, denomCreationFee_);
        onChanged();
      } else {
        denomCreationFeeBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearDenomCreationFee() {
      if (denomCreationFeeBuilder_ == null) {
        denomCreationFee_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        denomCreationFeeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder removeDenomCreationFee(int index) {
      if (denomCreationFeeBuilder_ == null) {
        ensureDenomCreationFeeIsMutable();
        denomCreationFee_.remove(index);
        onChanged();
      } else {
        denomCreationFeeBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getDenomCreationFeeBuilder(
        int index) {
      return getDenomCreationFeeFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getDenomCreationFeeOrBuilder(
        int index) {
      if (denomCreationFeeBuilder_ == null) {
        return denomCreationFee_.get(index);  } else {
        return denomCreationFeeBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getDenomCreationFeeOrBuilderList() {
      if (denomCreationFeeBuilder_ != null) {
        return denomCreationFeeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(denomCreationFee_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addDenomCreationFeeBuilder() {
      return getDenomCreationFeeFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addDenomCreationFeeBuilder(
        int index) {
      return getDenomCreationFeeFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin denom_creation_fee = 1 [json_name = "denomCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"denom_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getDenomCreationFeeBuilderList() {
      return getDenomCreationFeeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getDenomCreationFeeFieldBuilder() {
      if (denomCreationFeeBuilder_ == null) {
        denomCreationFeeBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                denomCreationFee_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        denomCreationFee_ = null;
      }
      return denomCreationFeeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:injective.tokenfactory.v1beta1.Params)
  }

  // @@protoc_insertion_point(class_scope:injective.tokenfactory.v1beta1.Params)
  private static final com.injective.tokenfactory.v1beta1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.tokenfactory.v1beta1.Params();
  }

  public static com.injective.tokenfactory.v1beta1.Params getDefaultInstance() {
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
  public com.injective.tokenfactory.v1beta1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

