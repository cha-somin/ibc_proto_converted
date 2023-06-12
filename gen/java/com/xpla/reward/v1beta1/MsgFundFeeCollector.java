// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xpla/reward/v1beta1/tx.proto

package com.xpla.reward.v1beta1;

/**
 * <pre>
 * MsgFundFeeCollector allows an account to directly
 * fund the fee collector.
 * </pre>
 *
 * Protobuf type {@code xpla.reward.v1beta1.MsgFundFeeCollector}
 */
public final class MsgFundFeeCollector extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xpla.reward.v1beta1.MsgFundFeeCollector)
    MsgFundFeeCollectorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgFundFeeCollector.newBuilder() to construct.
  private MsgFundFeeCollector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgFundFeeCollector() {
    amount_ = java.util.Collections.emptyList();
    depositor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgFundFeeCollector();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xpla.reward.v1beta1.TxProto.internal_static_xpla_reward_v1beta1_MsgFundFeeCollector_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xpla.reward.v1beta1.TxProto.internal_static_xpla_reward_v1beta1_MsgFundFeeCollector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xpla.reward.v1beta1.MsgFundFeeCollector.class, com.xpla.reward.v1beta1.MsgFundFeeCollector.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> amount_;
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getAmountList() {
    return amount_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getAmountOrBuilderList() {
    return amount_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public int getAmountCount() {
    return amount_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAmount(int index) {
    return amount_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder(
      int index) {
    return amount_.get(index);
  }

  public static final int DEPOSITOR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object depositor_ = "";
  /**
   * <code>string depositor = 2 [json_name = "depositor"];</code>
   * @return The depositor.
   */
  @java.lang.Override
  public java.lang.String getDepositor() {
    java.lang.Object ref = depositor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      depositor_ = s;
      return s;
    }
  }
  /**
   * <code>string depositor = 2 [json_name = "depositor"];</code>
   * @return The bytes for depositor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepositorBytes() {
    java.lang.Object ref = depositor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      depositor_ = b;
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
    for (int i = 0; i < amount_.size(); i++) {
      output.writeMessage(1, amount_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, depositor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < amount_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, amount_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, depositor_);
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
    if (!(obj instanceof com.xpla.reward.v1beta1.MsgFundFeeCollector)) {
      return super.equals(obj);
    }
    com.xpla.reward.v1beta1.MsgFundFeeCollector other = (com.xpla.reward.v1beta1.MsgFundFeeCollector) obj;

    if (!getAmountList()
        .equals(other.getAmountList())) return false;
    if (!getDepositor()
        .equals(other.getDepositor())) return false;
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
    if (getAmountCount() > 0) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmountList().hashCode();
    }
    hash = (37 * hash) + DEPOSITOR_FIELD_NUMBER;
    hash = (53 * hash) + getDepositor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xpla.reward.v1beta1.MsgFundFeeCollector parseFrom(
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
  public static Builder newBuilder(com.xpla.reward.v1beta1.MsgFundFeeCollector prototype) {
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
   * MsgFundFeeCollector allows an account to directly
   * fund the fee collector.
   * </pre>
   *
   * Protobuf type {@code xpla.reward.v1beta1.MsgFundFeeCollector}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xpla.reward.v1beta1.MsgFundFeeCollector)
      com.xpla.reward.v1beta1.MsgFundFeeCollectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xpla.reward.v1beta1.TxProto.internal_static_xpla_reward_v1beta1_MsgFundFeeCollector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xpla.reward.v1beta1.TxProto.internal_static_xpla_reward_v1beta1_MsgFundFeeCollector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xpla.reward.v1beta1.MsgFundFeeCollector.class, com.xpla.reward.v1beta1.MsgFundFeeCollector.Builder.class);
    }

    // Construct using com.xpla.reward.v1beta1.MsgFundFeeCollector.newBuilder()
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
      if (amountBuilder_ == null) {
        amount_ = java.util.Collections.emptyList();
      } else {
        amount_ = null;
        amountBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      depositor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xpla.reward.v1beta1.TxProto.internal_static_xpla_reward_v1beta1_MsgFundFeeCollector_descriptor;
    }

    @java.lang.Override
    public com.xpla.reward.v1beta1.MsgFundFeeCollector getDefaultInstanceForType() {
      return com.xpla.reward.v1beta1.MsgFundFeeCollector.getDefaultInstance();
    }

    @java.lang.Override
    public com.xpla.reward.v1beta1.MsgFundFeeCollector build() {
      com.xpla.reward.v1beta1.MsgFundFeeCollector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xpla.reward.v1beta1.MsgFundFeeCollector buildPartial() {
      com.xpla.reward.v1beta1.MsgFundFeeCollector result = new com.xpla.reward.v1beta1.MsgFundFeeCollector(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.xpla.reward.v1beta1.MsgFundFeeCollector result) {
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          amount_ = java.util.Collections.unmodifiableList(amount_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.amount_ = amount_;
      } else {
        result.amount_ = amountBuilder_.build();
      }
    }

    private void buildPartial0(com.xpla.reward.v1beta1.MsgFundFeeCollector result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.depositor_ = depositor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xpla.reward.v1beta1.MsgFundFeeCollector) {
        return mergeFrom((com.xpla.reward.v1beta1.MsgFundFeeCollector)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xpla.reward.v1beta1.MsgFundFeeCollector other) {
      if (other == com.xpla.reward.v1beta1.MsgFundFeeCollector.getDefaultInstance()) return this;
      if (amountBuilder_ == null) {
        if (!other.amount_.isEmpty()) {
          if (amount_.isEmpty()) {
            amount_ = other.amount_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAmountIsMutable();
            amount_.addAll(other.amount_);
          }
          onChanged();
        }
      } else {
        if (!other.amount_.isEmpty()) {
          if (amountBuilder_.isEmpty()) {
            amountBuilder_.dispose();
            amountBuilder_ = null;
            amount_ = other.amount_;
            bitField0_ = (bitField0_ & ~0x00000001);
            amountBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAmountFieldBuilder() : null;
          } else {
            amountBuilder_.addAllMessages(other.amount_);
          }
        }
      }
      if (!other.getDepositor().isEmpty()) {
        depositor_ = other.depositor_;
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
              com.cosmos.base.v1beta1.Coin m =
                  input.readMessage(
                      com.cosmos.base.v1beta1.Coin.parser(),
                      extensionRegistry);
              if (amountBuilder_ == null) {
                ensureAmountIsMutable();
                amount_.add(m);
              } else {
                amountBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              depositor_ = input.readStringRequireUtf8();
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

    private java.util.List<com.cosmos.base.v1beta1.Coin> amount_ =
      java.util.Collections.emptyList();
    private void ensureAmountIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        amount_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(amount_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> amountBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getAmountList() {
      if (amountBuilder_ == null) {
        return java.util.Collections.unmodifiableList(amount_);
      } else {
        return amountBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public int getAmountCount() {
      if (amountBuilder_ == null) {
        return amount_.size();
      } else {
        return amountBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin getAmount(int index) {
      if (amountBuilder_ == null) {
        return amount_.get(index);
      } else {
        return amountBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setAmount(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAmountIsMutable();
        amount_.set(index, value);
        onChanged();
      } else {
        amountBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setAmount(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        ensureAmountIsMutable();
        amount_.set(index, builderForValue.build());
        onChanged();
      } else {
        amountBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAmountIsMutable();
        amount_.add(value);
        onChanged();
      } else {
        amountBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAmount(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAmountIsMutable();
        amount_.add(index, value);
        onChanged();
      } else {
        amountBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAmount(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        ensureAmountIsMutable();
        amount_.add(builderForValue.build());
        onChanged();
      } else {
        amountBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAmount(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        ensureAmountIsMutable();
        amount_.add(index, builderForValue.build());
        onChanged();
      } else {
        amountBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAllAmount(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (amountBuilder_ == null) {
        ensureAmountIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, amount_);
        onChanged();
      } else {
        amountBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearAmount() {
      if (amountBuilder_ == null) {
        amount_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        amountBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder removeAmount(int index) {
      if (amountBuilder_ == null) {
        ensureAmountIsMutable();
        amount_.remove(index);
        onChanged();
      } else {
        amountBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAmountBuilder(
        int index) {
      return getAmountFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder(
        int index) {
      if (amountBuilder_ == null) {
        return amount_.get(index);  } else {
        return amountBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getAmountOrBuilderList() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(amount_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addAmountBuilder() {
      return getAmountFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addAmountBuilder(
        int index) {
      return getAmountFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getAmountBuilderList() {
      return getAmountFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                amount_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        amount_ = null;
      }
      return amountBuilder_;
    }

    private java.lang.Object depositor_ = "";
    /**
     * <code>string depositor = 2 [json_name = "depositor"];</code>
     * @return The depositor.
     */
    public java.lang.String getDepositor() {
      java.lang.Object ref = depositor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        depositor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string depositor = 2 [json_name = "depositor"];</code>
     * @return The bytes for depositor.
     */
    public com.google.protobuf.ByteString
        getDepositorBytes() {
      java.lang.Object ref = depositor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        depositor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string depositor = 2 [json_name = "depositor"];</code>
     * @param value The depositor to set.
     * @return This builder for chaining.
     */
    public Builder setDepositor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      depositor_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string depositor = 2 [json_name = "depositor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDepositor() {
      depositor_ = getDefaultInstance().getDepositor();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string depositor = 2 [json_name = "depositor"];</code>
     * @param value The bytes for depositor to set.
     * @return This builder for chaining.
     */
    public Builder setDepositorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      depositor_ = value;
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


    // @@protoc_insertion_point(builder_scope:xpla.reward.v1beta1.MsgFundFeeCollector)
  }

  // @@protoc_insertion_point(class_scope:xpla.reward.v1beta1.MsgFundFeeCollector)
  private static final com.xpla.reward.v1beta1.MsgFundFeeCollector DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xpla.reward.v1beta1.MsgFundFeeCollector();
  }

  public static com.xpla.reward.v1beta1.MsgFundFeeCollector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgFundFeeCollector>
      PARSER = new com.google.protobuf.AbstractParser<MsgFundFeeCollector>() {
    @java.lang.Override
    public MsgFundFeeCollector parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgFundFeeCollector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgFundFeeCollector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xpla.reward.v1beta1.MsgFundFeeCollector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

