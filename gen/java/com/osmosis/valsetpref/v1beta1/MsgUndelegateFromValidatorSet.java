// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/valset-pref/v1beta1/tx.proto

package com.osmosis.valsetpref.v1beta1;

/**
 * Protobuf type {@code osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet}
 */
public final class MsgUndelegateFromValidatorSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet)
    MsgUndelegateFromValidatorSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUndelegateFromValidatorSet.newBuilder() to construct.
  private MsgUndelegateFromValidatorSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUndelegateFromValidatorSet() {
    delegator_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUndelegateFromValidatorSet();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet.class, com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet.Builder.class);
  }

  public static final int DELEGATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object delegator_ = "";
  /**
   * <pre>
   * delegator is the user who is trying to undelegate.
   * </pre>
   *
   * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
   * @return The delegator.
   */
  @java.lang.Override
  public java.lang.String getDelegator() {
    java.lang.Object ref = delegator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delegator_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * delegator is the user who is trying to undelegate.
   * </pre>
   *
   * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
   * @return The bytes for delegator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDelegatorBytes() {
    java.lang.Object ref = delegator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delegator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COIN_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin coin_;
  /**
   * <pre>
   * the amount the user wants to undelegate
   * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
   * ValC
   * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
   * 3osmo from B, 2osmo from C
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the coin field is set.
   */
  @java.lang.Override
  public boolean hasCoin() {
    return coin_ != null;
  }
  /**
   * <pre>
   * the amount the user wants to undelegate
   * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
   * ValC
   * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
   * 3osmo from B, 2osmo from C
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The coin.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getCoin() {
    return coin_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : coin_;
  }
  /**
   * <pre>
   * the amount the user wants to undelegate
   * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
   * ValC
   * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
   * 3osmo from B, 2osmo from C
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getCoinOrBuilder() {
    return coin_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : coin_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, delegator_);
    }
    if (coin_ != null) {
      output.writeMessage(3, getCoin());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, delegator_);
    }
    if (coin_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCoin());
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
    if (!(obj instanceof com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet)) {
      return super.equals(obj);
    }
    com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet other = (com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet) obj;

    if (!getDelegator()
        .equals(other.getDelegator())) return false;
    if (hasCoin() != other.hasCoin()) return false;
    if (hasCoin()) {
      if (!getCoin()
          .equals(other.getCoin())) return false;
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
    hash = (37 * hash) + DELEGATOR_FIELD_NUMBER;
    hash = (53 * hash) + getDelegator().hashCode();
    if (hasCoin()) {
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet parseFrom(
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
  public static Builder newBuilder(com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet prototype) {
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
   * Protobuf type {@code osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet)
      com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet.class, com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet.Builder.class);
    }

    // Construct using com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet.newBuilder()
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
      delegator_ = "";
      coin_ = null;
      if (coinBuilder_ != null) {
        coinBuilder_.dispose();
        coinBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSet_descriptor;
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet getDefaultInstanceForType() {
      return com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet build() {
      com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet buildPartial() {
      com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet result = new com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.delegator_ = delegator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.coin_ = coinBuilder_ == null
            ? coin_
            : coinBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet) {
        return mergeFrom((com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet other) {
      if (other == com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet.getDefaultInstance()) return this;
      if (!other.getDelegator().isEmpty()) {
        delegator_ = other.delegator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCoin()) {
        mergeCoin(other.getCoin());
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
              delegator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 26: {
              input.readMessage(
                  getCoinFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private java.lang.Object delegator_ = "";
    /**
     * <pre>
     * delegator is the user who is trying to undelegate.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @return The delegator.
     */
    public java.lang.String getDelegator() {
      java.lang.Object ref = delegator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delegator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * delegator is the user who is trying to undelegate.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @return The bytes for delegator.
     */
    public com.google.protobuf.ByteString
        getDelegatorBytes() {
      java.lang.Object ref = delegator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delegator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * delegator is the user who is trying to undelegate.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @param value The delegator to set.
     * @return This builder for chaining.
     */
    public Builder setDelegator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      delegator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * delegator is the user who is trying to undelegate.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelegator() {
      delegator_ = getDefaultInstance().getDelegator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * delegator is the user who is trying to undelegate.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @param value The bytes for delegator to set.
     * @return This builder for chaining.
     */
    public Builder setDelegatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      delegator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin coin_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> coinBuilder_;
    /**
     * <pre>
     * the amount the user wants to undelegate
     * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
     * ValC
     * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
     * 3osmo from B, 2osmo from C
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return Whether the coin field is set.
     */
    public boolean hasCoin() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * the amount the user wants to undelegate
     * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
     * ValC
     * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
     * 3osmo from B, 2osmo from C
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return The coin.
     */
    public com.cosmos.base.v1beta1.Coin getCoin() {
      if (coinBuilder_ == null) {
        return coin_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : coin_;
      } else {
        return coinBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the amount the user wants to undelegate
     * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
     * ValC
     * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
     * 3osmo from B, 2osmo from C
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setCoin(com.cosmos.base.v1beta1.Coin value) {
      if (coinBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coin_ = value;
      } else {
        coinBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the amount the user wants to undelegate
     * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
     * ValC
     * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
     * 3osmo from B, 2osmo from C
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setCoin(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (coinBuilder_ == null) {
        coin_ = builderForValue.build();
      } else {
        coinBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the amount the user wants to undelegate
     * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
     * ValC
     * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
     * 3osmo from B, 2osmo from C
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder mergeCoin(com.cosmos.base.v1beta1.Coin value) {
      if (coinBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          coin_ != null &&
          coin_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getCoinBuilder().mergeFrom(value);
        } else {
          coin_ = value;
        }
      } else {
        coinBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the amount the user wants to undelegate
     * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
     * ValC
     * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
     * 3osmo from B, 2osmo from C
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder clearCoin() {
      bitField0_ = (bitField0_ & ~0x00000002);
      coin_ = null;
      if (coinBuilder_ != null) {
        coinBuilder_.dispose();
        coinBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the amount the user wants to undelegate
     * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
     * ValC
     * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
     * 3osmo from B, 2osmo from C
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getCoinBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCoinFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the amount the user wants to undelegate
     * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
     * ValC
     * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
     * 3osmo from B, 2osmo from C
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getCoinOrBuilder() {
      if (coinBuilder_ != null) {
        return coinBuilder_.getMessageOrBuilder();
      } else {
        return coin_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : coin_;
      }
    }
    /**
     * <pre>
     * the amount the user wants to undelegate
     * For ex: Undelegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3,
     * ValC
     * -&gt; 0.2} our undelegate logic would attempt to undelegate 5osmo from A ,
     * 3osmo from B, 2osmo from C
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getCoinFieldBuilder() {
      if (coinBuilder_ == null) {
        coinBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getCoin(),
                getParentForChildren(),
                isClean());
        coin_ = null;
      }
      return coinBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet)
  }

  // @@protoc_insertion_point(class_scope:osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet)
  private static final com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet();
  }

  public static com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUndelegateFromValidatorSet>
      PARSER = new com.google.protobuf.AbstractParser<MsgUndelegateFromValidatorSet>() {
    @java.lang.Override
    public MsgUndelegateFromValidatorSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUndelegateFromValidatorSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUndelegateFromValidatorSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

