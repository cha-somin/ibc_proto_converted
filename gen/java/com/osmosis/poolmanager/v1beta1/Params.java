// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/poolmanager/v1beta1/genesis.proto

package com.osmosis.poolmanager.v1beta1;

/**
 * <pre>
 * Params holds parameters for the poolmanager module
 * </pre>
 *
 * Protobuf type {@code osmosis.poolmanager.v1beta1.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.poolmanager.v1beta1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
    poolCreationFee_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.poolmanager.v1beta1.GenesisProto.internal_static_osmosis_poolmanager_v1beta1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.poolmanager.v1beta1.GenesisProto.internal_static_osmosis_poolmanager_v1beta1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.poolmanager.v1beta1.Params.class, com.osmosis.poolmanager.v1beta1.Params.Builder.class);
  }

  public static final int POOL_CREATION_FEE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> poolCreationFee_;
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getPoolCreationFeeList() {
    return poolCreationFee_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getPoolCreationFeeOrBuilderList() {
    return poolCreationFee_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public int getPoolCreationFeeCount() {
    return poolCreationFee_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getPoolCreationFee(int index) {
    return poolCreationFee_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getPoolCreationFeeOrBuilder(
      int index) {
    return poolCreationFee_.get(index);
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
    for (int i = 0; i < poolCreationFee_.size(); i++) {
      output.writeMessage(1, poolCreationFee_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < poolCreationFee_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, poolCreationFee_.get(i));
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
    if (!(obj instanceof com.osmosis.poolmanager.v1beta1.Params)) {
      return super.equals(obj);
    }
    com.osmosis.poolmanager.v1beta1.Params other = (com.osmosis.poolmanager.v1beta1.Params) obj;

    if (!getPoolCreationFeeList()
        .equals(other.getPoolCreationFeeList())) return false;
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
    if (getPoolCreationFeeCount() > 0) {
      hash = (37 * hash) + POOL_CREATION_FEE_FIELD_NUMBER;
      hash = (53 * hash) + getPoolCreationFeeList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.poolmanager.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.poolmanager.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.poolmanager.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.poolmanager.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.poolmanager.v1beta1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.poolmanager.v1beta1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.poolmanager.v1beta1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.poolmanager.v1beta1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.poolmanager.v1beta1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.poolmanager.v1beta1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.poolmanager.v1beta1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.poolmanager.v1beta1.Params parseFrom(
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
  public static Builder newBuilder(com.osmosis.poolmanager.v1beta1.Params prototype) {
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
   * Params holds parameters for the poolmanager module
   * </pre>
   *
   * Protobuf type {@code osmosis.poolmanager.v1beta1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.poolmanager.v1beta1.Params)
      com.osmosis.poolmanager.v1beta1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.poolmanager.v1beta1.GenesisProto.internal_static_osmosis_poolmanager_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.poolmanager.v1beta1.GenesisProto.internal_static_osmosis_poolmanager_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.poolmanager.v1beta1.Params.class, com.osmosis.poolmanager.v1beta1.Params.Builder.class);
    }

    // Construct using com.osmosis.poolmanager.v1beta1.Params.newBuilder()
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
      if (poolCreationFeeBuilder_ == null) {
        poolCreationFee_ = java.util.Collections.emptyList();
      } else {
        poolCreationFee_ = null;
        poolCreationFeeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.poolmanager.v1beta1.GenesisProto.internal_static_osmosis_poolmanager_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    public com.osmosis.poolmanager.v1beta1.Params getDefaultInstanceForType() {
      return com.osmosis.poolmanager.v1beta1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.poolmanager.v1beta1.Params build() {
      com.osmosis.poolmanager.v1beta1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.poolmanager.v1beta1.Params buildPartial() {
      com.osmosis.poolmanager.v1beta1.Params result = new com.osmosis.poolmanager.v1beta1.Params(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.osmosis.poolmanager.v1beta1.Params result) {
      if (poolCreationFeeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          poolCreationFee_ = java.util.Collections.unmodifiableList(poolCreationFee_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.poolCreationFee_ = poolCreationFee_;
      } else {
        result.poolCreationFee_ = poolCreationFeeBuilder_.build();
      }
    }

    private void buildPartial0(com.osmosis.poolmanager.v1beta1.Params result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.poolmanager.v1beta1.Params) {
        return mergeFrom((com.osmosis.poolmanager.v1beta1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.poolmanager.v1beta1.Params other) {
      if (other == com.osmosis.poolmanager.v1beta1.Params.getDefaultInstance()) return this;
      if (poolCreationFeeBuilder_ == null) {
        if (!other.poolCreationFee_.isEmpty()) {
          if (poolCreationFee_.isEmpty()) {
            poolCreationFee_ = other.poolCreationFee_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePoolCreationFeeIsMutable();
            poolCreationFee_.addAll(other.poolCreationFee_);
          }
          onChanged();
        }
      } else {
        if (!other.poolCreationFee_.isEmpty()) {
          if (poolCreationFeeBuilder_.isEmpty()) {
            poolCreationFeeBuilder_.dispose();
            poolCreationFeeBuilder_ = null;
            poolCreationFee_ = other.poolCreationFee_;
            bitField0_ = (bitField0_ & ~0x00000001);
            poolCreationFeeBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPoolCreationFeeFieldBuilder() : null;
          } else {
            poolCreationFeeBuilder_.addAllMessages(other.poolCreationFee_);
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
              if (poolCreationFeeBuilder_ == null) {
                ensurePoolCreationFeeIsMutable();
                poolCreationFee_.add(m);
              } else {
                poolCreationFeeBuilder_.addMessage(m);
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

    private java.util.List<com.cosmos.base.v1beta1.Coin> poolCreationFee_ =
      java.util.Collections.emptyList();
    private void ensurePoolCreationFeeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        poolCreationFee_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(poolCreationFee_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> poolCreationFeeBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getPoolCreationFeeList() {
      if (poolCreationFeeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(poolCreationFee_);
      } else {
        return poolCreationFeeBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public int getPoolCreationFeeCount() {
      if (poolCreationFeeBuilder_ == null) {
        return poolCreationFee_.size();
      } else {
        return poolCreationFeeBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin getPoolCreationFee(int index) {
      if (poolCreationFeeBuilder_ == null) {
        return poolCreationFee_.get(index);
      } else {
        return poolCreationFeeBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setPoolCreationFee(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (poolCreationFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoolCreationFeeIsMutable();
        poolCreationFee_.set(index, value);
        onChanged();
      } else {
        poolCreationFeeBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setPoolCreationFee(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (poolCreationFeeBuilder_ == null) {
        ensurePoolCreationFeeIsMutable();
        poolCreationFee_.set(index, builderForValue.build());
        onChanged();
      } else {
        poolCreationFeeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addPoolCreationFee(com.cosmos.base.v1beta1.Coin value) {
      if (poolCreationFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoolCreationFeeIsMutable();
        poolCreationFee_.add(value);
        onChanged();
      } else {
        poolCreationFeeBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addPoolCreationFee(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (poolCreationFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoolCreationFeeIsMutable();
        poolCreationFee_.add(index, value);
        onChanged();
      } else {
        poolCreationFeeBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addPoolCreationFee(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (poolCreationFeeBuilder_ == null) {
        ensurePoolCreationFeeIsMutable();
        poolCreationFee_.add(builderForValue.build());
        onChanged();
      } else {
        poolCreationFeeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addPoolCreationFee(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (poolCreationFeeBuilder_ == null) {
        ensurePoolCreationFeeIsMutable();
        poolCreationFee_.add(index, builderForValue.build());
        onChanged();
      } else {
        poolCreationFeeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAllPoolCreationFee(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (poolCreationFeeBuilder_ == null) {
        ensurePoolCreationFeeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, poolCreationFee_);
        onChanged();
      } else {
        poolCreationFeeBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearPoolCreationFee() {
      if (poolCreationFeeBuilder_ == null) {
        poolCreationFee_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        poolCreationFeeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder removePoolCreationFee(int index) {
      if (poolCreationFeeBuilder_ == null) {
        ensurePoolCreationFeeIsMutable();
        poolCreationFee_.remove(index);
        onChanged();
      } else {
        poolCreationFeeBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getPoolCreationFeeBuilder(
        int index) {
      return getPoolCreationFeeFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getPoolCreationFeeOrBuilder(
        int index) {
      if (poolCreationFeeBuilder_ == null) {
        return poolCreationFee_.get(index);  } else {
        return poolCreationFeeBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getPoolCreationFeeOrBuilderList() {
      if (poolCreationFeeBuilder_ != null) {
        return poolCreationFeeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(poolCreationFee_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addPoolCreationFeeBuilder() {
      return getPoolCreationFeeFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addPoolCreationFeeBuilder(
        int index) {
      return getPoolCreationFeeFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin pool_creation_fee = 1 [json_name = "poolCreationFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_creation_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getPoolCreationFeeBuilderList() {
      return getPoolCreationFeeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getPoolCreationFeeFieldBuilder() {
      if (poolCreationFeeBuilder_ == null) {
        poolCreationFeeBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                poolCreationFee_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        poolCreationFee_ = null;
      }
      return poolCreationFeeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.poolmanager.v1beta1.Params)
  }

  // @@protoc_insertion_point(class_scope:osmosis.poolmanager.v1beta1.Params)
  private static final com.osmosis.poolmanager.v1beta1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.poolmanager.v1beta1.Params();
  }

  public static com.osmosis.poolmanager.v1beta1.Params getDefaultInstance() {
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
  public com.osmosis.poolmanager.v1beta1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

