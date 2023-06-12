// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/oracle/v1/tx.proto

package com.umee.oracle.v1;

/**
 * <pre>
 * MsgAggregateExchangeRateVote represents a message to submit anaggregate
 * exchange rate vote.
 * </pre>
 *
 * Protobuf type {@code umee.oracle.v1.MsgAggregateExchangeRateVote}
 */
public final class MsgAggregateExchangeRateVote extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:umee.oracle.v1.MsgAggregateExchangeRateVote)
    MsgAggregateExchangeRateVoteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAggregateExchangeRateVote.newBuilder() to construct.
  private MsgAggregateExchangeRateVote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAggregateExchangeRateVote() {
    salt_ = "";
    exchangeRates_ = "";
    feeder_ = "";
    validator_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAggregateExchangeRateVote();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umee.oracle.v1.TxProto.internal_static_umee_oracle_v1_MsgAggregateExchangeRateVote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umee.oracle.v1.TxProto.internal_static_umee_oracle_v1_MsgAggregateExchangeRateVote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umee.oracle.v1.MsgAggregateExchangeRateVote.class, com.umee.oracle.v1.MsgAggregateExchangeRateVote.Builder.class);
  }

  public static final int SALT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object salt_ = "";
  /**
   * <code>string salt = 1 [json_name = "salt", (.gogoproto.moretags) = "yaml:&#92;"salt&#92;""];</code>
   * @return The salt.
   */
  @java.lang.Override
  public java.lang.String getSalt() {
    java.lang.Object ref = salt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      salt_ = s;
      return s;
    }
  }
  /**
   * <code>string salt = 1 [json_name = "salt", (.gogoproto.moretags) = "yaml:&#92;"salt&#92;""];</code>
   * @return The bytes for salt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSaltBytes() {
    java.lang.Object ref = salt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      salt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXCHANGE_RATES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object exchangeRates_ = "";
  /**
   * <code>string exchange_rates = 2 [json_name = "exchangeRates", (.gogoproto.moretags) = "yaml:&#92;"exchange_rates&#92;""];</code>
   * @return The exchangeRates.
   */
  @java.lang.Override
  public java.lang.String getExchangeRates() {
    java.lang.Object ref = exchangeRates_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exchangeRates_ = s;
      return s;
    }
  }
  /**
   * <code>string exchange_rates = 2 [json_name = "exchangeRates", (.gogoproto.moretags) = "yaml:&#92;"exchange_rates&#92;""];</code>
   * @return The bytes for exchangeRates.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExchangeRatesBytes() {
    java.lang.Object ref = exchangeRates_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      exchangeRates_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEEDER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object feeder_ = "";
  /**
   * <pre>
   * Feeder is the author and the signer of the message.
   * </pre>
   *
   * <code>string feeder = 3 [json_name = "feeder", (.gogoproto.moretags) = "yaml:&#92;"feeder&#92;""];</code>
   * @return The feeder.
   */
  @java.lang.Override
  public java.lang.String getFeeder() {
    java.lang.Object ref = feeder_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      feeder_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Feeder is the author and the signer of the message.
   * </pre>
   *
   * <code>string feeder = 3 [json_name = "feeder", (.gogoproto.moretags) = "yaml:&#92;"feeder&#92;""];</code>
   * @return The bytes for feeder.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeederBytes() {
    java.lang.Object ref = feeder_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      feeder_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATOR_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object validator_ = "";
  /**
   * <code>string validator = 4 [json_name = "validator", (.gogoproto.moretags) = "yaml:&#92;"validator&#92;""];</code>
   * @return The validator.
   */
  @java.lang.Override
  public java.lang.String getValidator() {
    java.lang.Object ref = validator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validator_ = s;
      return s;
    }
  }
  /**
   * <code>string validator = 4 [json_name = "validator", (.gogoproto.moretags) = "yaml:&#92;"validator&#92;""];</code>
   * @return The bytes for validator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValidatorBytes() {
    java.lang.Object ref = validator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validator_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(salt_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, salt_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exchangeRates_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, exchangeRates_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feeder_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, feeder_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, validator_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(salt_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, salt_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exchangeRates_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, exchangeRates_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feeder_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, feeder_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, validator_);
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
    if (!(obj instanceof com.umee.oracle.v1.MsgAggregateExchangeRateVote)) {
      return super.equals(obj);
    }
    com.umee.oracle.v1.MsgAggregateExchangeRateVote other = (com.umee.oracle.v1.MsgAggregateExchangeRateVote) obj;

    if (!getSalt()
        .equals(other.getSalt())) return false;
    if (!getExchangeRates()
        .equals(other.getExchangeRates())) return false;
    if (!getFeeder()
        .equals(other.getFeeder())) return false;
    if (!getValidator()
        .equals(other.getValidator())) return false;
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
    hash = (37 * hash) + SALT_FIELD_NUMBER;
    hash = (53 * hash) + getSalt().hashCode();
    hash = (37 * hash) + EXCHANGE_RATES_FIELD_NUMBER;
    hash = (53 * hash) + getExchangeRates().hashCode();
    hash = (37 * hash) + FEEDER_FIELD_NUMBER;
    hash = (53 * hash) + getFeeder().hashCode();
    hash = (37 * hash) + VALIDATOR_FIELD_NUMBER;
    hash = (53 * hash) + getValidator().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote parseFrom(
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
  public static Builder newBuilder(com.umee.oracle.v1.MsgAggregateExchangeRateVote prototype) {
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
   * MsgAggregateExchangeRateVote represents a message to submit anaggregate
   * exchange rate vote.
   * </pre>
   *
   * Protobuf type {@code umee.oracle.v1.MsgAggregateExchangeRateVote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:umee.oracle.v1.MsgAggregateExchangeRateVote)
      com.umee.oracle.v1.MsgAggregateExchangeRateVoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umee.oracle.v1.TxProto.internal_static_umee_oracle_v1_MsgAggregateExchangeRateVote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umee.oracle.v1.TxProto.internal_static_umee_oracle_v1_MsgAggregateExchangeRateVote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umee.oracle.v1.MsgAggregateExchangeRateVote.class, com.umee.oracle.v1.MsgAggregateExchangeRateVote.Builder.class);
    }

    // Construct using com.umee.oracle.v1.MsgAggregateExchangeRateVote.newBuilder()
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
      salt_ = "";
      exchangeRates_ = "";
      feeder_ = "";
      validator_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.umee.oracle.v1.TxProto.internal_static_umee_oracle_v1_MsgAggregateExchangeRateVote_descriptor;
    }

    @java.lang.Override
    public com.umee.oracle.v1.MsgAggregateExchangeRateVote getDefaultInstanceForType() {
      return com.umee.oracle.v1.MsgAggregateExchangeRateVote.getDefaultInstance();
    }

    @java.lang.Override
    public com.umee.oracle.v1.MsgAggregateExchangeRateVote build() {
      com.umee.oracle.v1.MsgAggregateExchangeRateVote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umee.oracle.v1.MsgAggregateExchangeRateVote buildPartial() {
      com.umee.oracle.v1.MsgAggregateExchangeRateVote result = new com.umee.oracle.v1.MsgAggregateExchangeRateVote(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.umee.oracle.v1.MsgAggregateExchangeRateVote result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.salt_ = salt_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.exchangeRates_ = exchangeRates_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.feeder_ = feeder_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validator_ = validator_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umee.oracle.v1.MsgAggregateExchangeRateVote) {
        return mergeFrom((com.umee.oracle.v1.MsgAggregateExchangeRateVote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umee.oracle.v1.MsgAggregateExchangeRateVote other) {
      if (other == com.umee.oracle.v1.MsgAggregateExchangeRateVote.getDefaultInstance()) return this;
      if (!other.getSalt().isEmpty()) {
        salt_ = other.salt_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getExchangeRates().isEmpty()) {
        exchangeRates_ = other.exchangeRates_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFeeder().isEmpty()) {
        feeder_ = other.feeder_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getValidator().isEmpty()) {
        validator_ = other.validator_;
        bitField0_ |= 0x00000008;
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
              salt_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              exchangeRates_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              feeder_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              validator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object salt_ = "";
    /**
     * <code>string salt = 1 [json_name = "salt", (.gogoproto.moretags) = "yaml:&#92;"salt&#92;""];</code>
     * @return The salt.
     */
    public java.lang.String getSalt() {
      java.lang.Object ref = salt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        salt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string salt = 1 [json_name = "salt", (.gogoproto.moretags) = "yaml:&#92;"salt&#92;""];</code>
     * @return The bytes for salt.
     */
    public com.google.protobuf.ByteString
        getSaltBytes() {
      java.lang.Object ref = salt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        salt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string salt = 1 [json_name = "salt", (.gogoproto.moretags) = "yaml:&#92;"salt&#92;""];</code>
     * @param value The salt to set.
     * @return This builder for chaining.
     */
    public Builder setSalt(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      salt_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string salt = 1 [json_name = "salt", (.gogoproto.moretags) = "yaml:&#92;"salt&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSalt() {
      salt_ = getDefaultInstance().getSalt();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string salt = 1 [json_name = "salt", (.gogoproto.moretags) = "yaml:&#92;"salt&#92;""];</code>
     * @param value The bytes for salt to set.
     * @return This builder for chaining.
     */
    public Builder setSaltBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      salt_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object exchangeRates_ = "";
    /**
     * <code>string exchange_rates = 2 [json_name = "exchangeRates", (.gogoproto.moretags) = "yaml:&#92;"exchange_rates&#92;""];</code>
     * @return The exchangeRates.
     */
    public java.lang.String getExchangeRates() {
      java.lang.Object ref = exchangeRates_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exchangeRates_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string exchange_rates = 2 [json_name = "exchangeRates", (.gogoproto.moretags) = "yaml:&#92;"exchange_rates&#92;""];</code>
     * @return The bytes for exchangeRates.
     */
    public com.google.protobuf.ByteString
        getExchangeRatesBytes() {
      java.lang.Object ref = exchangeRates_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exchangeRates_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string exchange_rates = 2 [json_name = "exchangeRates", (.gogoproto.moretags) = "yaml:&#92;"exchange_rates&#92;""];</code>
     * @param value The exchangeRates to set.
     * @return This builder for chaining.
     */
    public Builder setExchangeRates(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      exchangeRates_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string exchange_rates = 2 [json_name = "exchangeRates", (.gogoproto.moretags) = "yaml:&#92;"exchange_rates&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearExchangeRates() {
      exchangeRates_ = getDefaultInstance().getExchangeRates();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string exchange_rates = 2 [json_name = "exchangeRates", (.gogoproto.moretags) = "yaml:&#92;"exchange_rates&#92;""];</code>
     * @param value The bytes for exchangeRates to set.
     * @return This builder for chaining.
     */
    public Builder setExchangeRatesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      exchangeRates_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object feeder_ = "";
    /**
     * <pre>
     * Feeder is the author and the signer of the message.
     * </pre>
     *
     * <code>string feeder = 3 [json_name = "feeder", (.gogoproto.moretags) = "yaml:&#92;"feeder&#92;""];</code>
     * @return The feeder.
     */
    public java.lang.String getFeeder() {
      java.lang.Object ref = feeder_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feeder_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Feeder is the author and the signer of the message.
     * </pre>
     *
     * <code>string feeder = 3 [json_name = "feeder", (.gogoproto.moretags) = "yaml:&#92;"feeder&#92;""];</code>
     * @return The bytes for feeder.
     */
    public com.google.protobuf.ByteString
        getFeederBytes() {
      java.lang.Object ref = feeder_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feeder_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Feeder is the author and the signer of the message.
     * </pre>
     *
     * <code>string feeder = 3 [json_name = "feeder", (.gogoproto.moretags) = "yaml:&#92;"feeder&#92;""];</code>
     * @param value The feeder to set.
     * @return This builder for chaining.
     */
    public Builder setFeeder(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      feeder_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Feeder is the author and the signer of the message.
     * </pre>
     *
     * <code>string feeder = 3 [json_name = "feeder", (.gogoproto.moretags) = "yaml:&#92;"feeder&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeeder() {
      feeder_ = getDefaultInstance().getFeeder();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Feeder is the author and the signer of the message.
     * </pre>
     *
     * <code>string feeder = 3 [json_name = "feeder", (.gogoproto.moretags) = "yaml:&#92;"feeder&#92;""];</code>
     * @param value The bytes for feeder to set.
     * @return This builder for chaining.
     */
    public Builder setFeederBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      feeder_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object validator_ = "";
    /**
     * <code>string validator = 4 [json_name = "validator", (.gogoproto.moretags) = "yaml:&#92;"validator&#92;""];</code>
     * @return The validator.
     */
    public java.lang.String getValidator() {
      java.lang.Object ref = validator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string validator = 4 [json_name = "validator", (.gogoproto.moretags) = "yaml:&#92;"validator&#92;""];</code>
     * @return The bytes for validator.
     */
    public com.google.protobuf.ByteString
        getValidatorBytes() {
      java.lang.Object ref = validator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string validator = 4 [json_name = "validator", (.gogoproto.moretags) = "yaml:&#92;"validator&#92;""];</code>
     * @param value The validator to set.
     * @return This builder for chaining.
     */
    public Builder setValidator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      validator_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string validator = 4 [json_name = "validator", (.gogoproto.moretags) = "yaml:&#92;"validator&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidator() {
      validator_ = getDefaultInstance().getValidator();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string validator = 4 [json_name = "validator", (.gogoproto.moretags) = "yaml:&#92;"validator&#92;""];</code>
     * @param value The bytes for validator to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      validator_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:umee.oracle.v1.MsgAggregateExchangeRateVote)
  }

  // @@protoc_insertion_point(class_scope:umee.oracle.v1.MsgAggregateExchangeRateVote)
  private static final com.umee.oracle.v1.MsgAggregateExchangeRateVote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umee.oracle.v1.MsgAggregateExchangeRateVote();
  }

  public static com.umee.oracle.v1.MsgAggregateExchangeRateVote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAggregateExchangeRateVote>
      PARSER = new com.google.protobuf.AbstractParser<MsgAggregateExchangeRateVote>() {
    @java.lang.Override
    public MsgAggregateExchangeRateVote parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgAggregateExchangeRateVote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAggregateExchangeRateVote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umee.oracle.v1.MsgAggregateExchangeRateVote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

