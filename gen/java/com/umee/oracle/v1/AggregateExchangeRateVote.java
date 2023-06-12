// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/oracle/v1/oracle.proto

package com.umee.oracle.v1;

/**
 * <pre>
 * AggregateExchangeRateVote - struct for voting on
 * the exchange rates of USD denominated in various assets.
 * </pre>
 *
 * Protobuf type {@code umee.oracle.v1.AggregateExchangeRateVote}
 */
public final class AggregateExchangeRateVote extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:umee.oracle.v1.AggregateExchangeRateVote)
    AggregateExchangeRateVoteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AggregateExchangeRateVote.newBuilder() to construct.
  private AggregateExchangeRateVote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AggregateExchangeRateVote() {
    exchangeRateTuples_ = java.util.Collections.emptyList();
    voter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AggregateExchangeRateVote();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umee.oracle.v1.OracleProto.internal_static_umee_oracle_v1_AggregateExchangeRateVote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umee.oracle.v1.OracleProto.internal_static_umee_oracle_v1_AggregateExchangeRateVote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umee.oracle.v1.AggregateExchangeRateVote.class, com.umee.oracle.v1.AggregateExchangeRateVote.Builder.class);
  }

  public static final int EXCHANGE_RATE_TUPLES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.umee.oracle.v1.ExchangeRateTuple> exchangeRateTuples_;
  /**
   * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
   */
  @java.lang.Override
  public java.util.List<com.umee.oracle.v1.ExchangeRateTuple> getExchangeRateTuplesList() {
    return exchangeRateTuples_;
  }
  /**
   * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.umee.oracle.v1.ExchangeRateTupleOrBuilder> 
      getExchangeRateTuplesOrBuilderList() {
    return exchangeRateTuples_;
  }
  /**
   * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
   */
  @java.lang.Override
  public int getExchangeRateTuplesCount() {
    return exchangeRateTuples_.size();
  }
  /**
   * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
   */
  @java.lang.Override
  public com.umee.oracle.v1.ExchangeRateTuple getExchangeRateTuples(int index) {
    return exchangeRateTuples_.get(index);
  }
  /**
   * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
   */
  @java.lang.Override
  public com.umee.oracle.v1.ExchangeRateTupleOrBuilder getExchangeRateTuplesOrBuilder(
      int index) {
    return exchangeRateTuples_.get(index);
  }

  public static final int VOTER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object voter_ = "";
  /**
   * <code>string voter = 2 [json_name = "voter", (.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
   * @return The voter.
   */
  @java.lang.Override
  public java.lang.String getVoter() {
    java.lang.Object ref = voter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      voter_ = s;
      return s;
    }
  }
  /**
   * <code>string voter = 2 [json_name = "voter", (.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
   * @return The bytes for voter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVoterBytes() {
    java.lang.Object ref = voter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      voter_ = b;
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
    for (int i = 0; i < exchangeRateTuples_.size(); i++) {
      output.writeMessage(1, exchangeRateTuples_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(voter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, voter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < exchangeRateTuples_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, exchangeRateTuples_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(voter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, voter_);
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
    if (!(obj instanceof com.umee.oracle.v1.AggregateExchangeRateVote)) {
      return super.equals(obj);
    }
    com.umee.oracle.v1.AggregateExchangeRateVote other = (com.umee.oracle.v1.AggregateExchangeRateVote) obj;

    if (!getExchangeRateTuplesList()
        .equals(other.getExchangeRateTuplesList())) return false;
    if (!getVoter()
        .equals(other.getVoter())) return false;
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
    if (getExchangeRateTuplesCount() > 0) {
      hash = (37 * hash) + EXCHANGE_RATE_TUPLES_FIELD_NUMBER;
      hash = (53 * hash) + getExchangeRateTuplesList().hashCode();
    }
    hash = (37 * hash) + VOTER_FIELD_NUMBER;
    hash = (53 * hash) + getVoter().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umee.oracle.v1.AggregateExchangeRateVote parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.oracle.v1.AggregateExchangeRateVote parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.oracle.v1.AggregateExchangeRateVote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.oracle.v1.AggregateExchangeRateVote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.oracle.v1.AggregateExchangeRateVote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.oracle.v1.AggregateExchangeRateVote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.oracle.v1.AggregateExchangeRateVote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.oracle.v1.AggregateExchangeRateVote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umee.oracle.v1.AggregateExchangeRateVote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umee.oracle.v1.AggregateExchangeRateVote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umee.oracle.v1.AggregateExchangeRateVote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.oracle.v1.AggregateExchangeRateVote parseFrom(
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
  public static Builder newBuilder(com.umee.oracle.v1.AggregateExchangeRateVote prototype) {
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
   * AggregateExchangeRateVote - struct for voting on
   * the exchange rates of USD denominated in various assets.
   * </pre>
   *
   * Protobuf type {@code umee.oracle.v1.AggregateExchangeRateVote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:umee.oracle.v1.AggregateExchangeRateVote)
      com.umee.oracle.v1.AggregateExchangeRateVoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umee.oracle.v1.OracleProto.internal_static_umee_oracle_v1_AggregateExchangeRateVote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umee.oracle.v1.OracleProto.internal_static_umee_oracle_v1_AggregateExchangeRateVote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umee.oracle.v1.AggregateExchangeRateVote.class, com.umee.oracle.v1.AggregateExchangeRateVote.Builder.class);
    }

    // Construct using com.umee.oracle.v1.AggregateExchangeRateVote.newBuilder()
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
      if (exchangeRateTuplesBuilder_ == null) {
        exchangeRateTuples_ = java.util.Collections.emptyList();
      } else {
        exchangeRateTuples_ = null;
        exchangeRateTuplesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      voter_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.umee.oracle.v1.OracleProto.internal_static_umee_oracle_v1_AggregateExchangeRateVote_descriptor;
    }

    @java.lang.Override
    public com.umee.oracle.v1.AggregateExchangeRateVote getDefaultInstanceForType() {
      return com.umee.oracle.v1.AggregateExchangeRateVote.getDefaultInstance();
    }

    @java.lang.Override
    public com.umee.oracle.v1.AggregateExchangeRateVote build() {
      com.umee.oracle.v1.AggregateExchangeRateVote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umee.oracle.v1.AggregateExchangeRateVote buildPartial() {
      com.umee.oracle.v1.AggregateExchangeRateVote result = new com.umee.oracle.v1.AggregateExchangeRateVote(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.umee.oracle.v1.AggregateExchangeRateVote result) {
      if (exchangeRateTuplesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          exchangeRateTuples_ = java.util.Collections.unmodifiableList(exchangeRateTuples_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.exchangeRateTuples_ = exchangeRateTuples_;
      } else {
        result.exchangeRateTuples_ = exchangeRateTuplesBuilder_.build();
      }
    }

    private void buildPartial0(com.umee.oracle.v1.AggregateExchangeRateVote result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.voter_ = voter_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umee.oracle.v1.AggregateExchangeRateVote) {
        return mergeFrom((com.umee.oracle.v1.AggregateExchangeRateVote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umee.oracle.v1.AggregateExchangeRateVote other) {
      if (other == com.umee.oracle.v1.AggregateExchangeRateVote.getDefaultInstance()) return this;
      if (exchangeRateTuplesBuilder_ == null) {
        if (!other.exchangeRateTuples_.isEmpty()) {
          if (exchangeRateTuples_.isEmpty()) {
            exchangeRateTuples_ = other.exchangeRateTuples_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExchangeRateTuplesIsMutable();
            exchangeRateTuples_.addAll(other.exchangeRateTuples_);
          }
          onChanged();
        }
      } else {
        if (!other.exchangeRateTuples_.isEmpty()) {
          if (exchangeRateTuplesBuilder_.isEmpty()) {
            exchangeRateTuplesBuilder_.dispose();
            exchangeRateTuplesBuilder_ = null;
            exchangeRateTuples_ = other.exchangeRateTuples_;
            bitField0_ = (bitField0_ & ~0x00000001);
            exchangeRateTuplesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExchangeRateTuplesFieldBuilder() : null;
          } else {
            exchangeRateTuplesBuilder_.addAllMessages(other.exchangeRateTuples_);
          }
        }
      }
      if (!other.getVoter().isEmpty()) {
        voter_ = other.voter_;
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
              com.umee.oracle.v1.ExchangeRateTuple m =
                  input.readMessage(
                      com.umee.oracle.v1.ExchangeRateTuple.parser(),
                      extensionRegistry);
              if (exchangeRateTuplesBuilder_ == null) {
                ensureExchangeRateTuplesIsMutable();
                exchangeRateTuples_.add(m);
              } else {
                exchangeRateTuplesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              voter_ = input.readStringRequireUtf8();
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

    private java.util.List<com.umee.oracle.v1.ExchangeRateTuple> exchangeRateTuples_ =
      java.util.Collections.emptyList();
    private void ensureExchangeRateTuplesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        exchangeRateTuples_ = new java.util.ArrayList<com.umee.oracle.v1.ExchangeRateTuple>(exchangeRateTuples_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.umee.oracle.v1.ExchangeRateTuple, com.umee.oracle.v1.ExchangeRateTuple.Builder, com.umee.oracle.v1.ExchangeRateTupleOrBuilder> exchangeRateTuplesBuilder_;

    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public java.util.List<com.umee.oracle.v1.ExchangeRateTuple> getExchangeRateTuplesList() {
      if (exchangeRateTuplesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(exchangeRateTuples_);
      } else {
        return exchangeRateTuplesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public int getExchangeRateTuplesCount() {
      if (exchangeRateTuplesBuilder_ == null) {
        return exchangeRateTuples_.size();
      } else {
        return exchangeRateTuplesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public com.umee.oracle.v1.ExchangeRateTuple getExchangeRateTuples(int index) {
      if (exchangeRateTuplesBuilder_ == null) {
        return exchangeRateTuples_.get(index);
      } else {
        return exchangeRateTuplesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public Builder setExchangeRateTuples(
        int index, com.umee.oracle.v1.ExchangeRateTuple value) {
      if (exchangeRateTuplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExchangeRateTuplesIsMutable();
        exchangeRateTuples_.set(index, value);
        onChanged();
      } else {
        exchangeRateTuplesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public Builder setExchangeRateTuples(
        int index, com.umee.oracle.v1.ExchangeRateTuple.Builder builderForValue) {
      if (exchangeRateTuplesBuilder_ == null) {
        ensureExchangeRateTuplesIsMutable();
        exchangeRateTuples_.set(index, builderForValue.build());
        onChanged();
      } else {
        exchangeRateTuplesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public Builder addExchangeRateTuples(com.umee.oracle.v1.ExchangeRateTuple value) {
      if (exchangeRateTuplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExchangeRateTuplesIsMutable();
        exchangeRateTuples_.add(value);
        onChanged();
      } else {
        exchangeRateTuplesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public Builder addExchangeRateTuples(
        int index, com.umee.oracle.v1.ExchangeRateTuple value) {
      if (exchangeRateTuplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExchangeRateTuplesIsMutable();
        exchangeRateTuples_.add(index, value);
        onChanged();
      } else {
        exchangeRateTuplesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public Builder addExchangeRateTuples(
        com.umee.oracle.v1.ExchangeRateTuple.Builder builderForValue) {
      if (exchangeRateTuplesBuilder_ == null) {
        ensureExchangeRateTuplesIsMutable();
        exchangeRateTuples_.add(builderForValue.build());
        onChanged();
      } else {
        exchangeRateTuplesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public Builder addExchangeRateTuples(
        int index, com.umee.oracle.v1.ExchangeRateTuple.Builder builderForValue) {
      if (exchangeRateTuplesBuilder_ == null) {
        ensureExchangeRateTuplesIsMutable();
        exchangeRateTuples_.add(index, builderForValue.build());
        onChanged();
      } else {
        exchangeRateTuplesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public Builder addAllExchangeRateTuples(
        java.lang.Iterable<? extends com.umee.oracle.v1.ExchangeRateTuple> values) {
      if (exchangeRateTuplesBuilder_ == null) {
        ensureExchangeRateTuplesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, exchangeRateTuples_);
        onChanged();
      } else {
        exchangeRateTuplesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public Builder clearExchangeRateTuples() {
      if (exchangeRateTuplesBuilder_ == null) {
        exchangeRateTuples_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        exchangeRateTuplesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public Builder removeExchangeRateTuples(int index) {
      if (exchangeRateTuplesBuilder_ == null) {
        ensureExchangeRateTuplesIsMutable();
        exchangeRateTuples_.remove(index);
        onChanged();
      } else {
        exchangeRateTuplesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public com.umee.oracle.v1.ExchangeRateTuple.Builder getExchangeRateTuplesBuilder(
        int index) {
      return getExchangeRateTuplesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public com.umee.oracle.v1.ExchangeRateTupleOrBuilder getExchangeRateTuplesOrBuilder(
        int index) {
      if (exchangeRateTuplesBuilder_ == null) {
        return exchangeRateTuples_.get(index);  } else {
        return exchangeRateTuplesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public java.util.List<? extends com.umee.oracle.v1.ExchangeRateTupleOrBuilder> 
         getExchangeRateTuplesOrBuilderList() {
      if (exchangeRateTuplesBuilder_ != null) {
        return exchangeRateTuplesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(exchangeRateTuples_);
      }
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public com.umee.oracle.v1.ExchangeRateTuple.Builder addExchangeRateTuplesBuilder() {
      return getExchangeRateTuplesFieldBuilder().addBuilder(
          com.umee.oracle.v1.ExchangeRateTuple.getDefaultInstance());
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public com.umee.oracle.v1.ExchangeRateTuple.Builder addExchangeRateTuplesBuilder(
        int index) {
      return getExchangeRateTuplesFieldBuilder().addBuilder(
          index, com.umee.oracle.v1.ExchangeRateTuple.getDefaultInstance());
    }
    /**
     * <code>repeated .umee.oracle.v1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    public java.util.List<com.umee.oracle.v1.ExchangeRateTuple.Builder> 
         getExchangeRateTuplesBuilderList() {
      return getExchangeRateTuplesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.umee.oracle.v1.ExchangeRateTuple, com.umee.oracle.v1.ExchangeRateTuple.Builder, com.umee.oracle.v1.ExchangeRateTupleOrBuilder> 
        getExchangeRateTuplesFieldBuilder() {
      if (exchangeRateTuplesBuilder_ == null) {
        exchangeRateTuplesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.umee.oracle.v1.ExchangeRateTuple, com.umee.oracle.v1.ExchangeRateTuple.Builder, com.umee.oracle.v1.ExchangeRateTupleOrBuilder>(
                exchangeRateTuples_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        exchangeRateTuples_ = null;
      }
      return exchangeRateTuplesBuilder_;
    }

    private java.lang.Object voter_ = "";
    /**
     * <code>string voter = 2 [json_name = "voter", (.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
     * @return The voter.
     */
    public java.lang.String getVoter() {
      java.lang.Object ref = voter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        voter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string voter = 2 [json_name = "voter", (.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
     * @return The bytes for voter.
     */
    public com.google.protobuf.ByteString
        getVoterBytes() {
      java.lang.Object ref = voter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        voter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string voter = 2 [json_name = "voter", (.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
     * @param value The voter to set.
     * @return This builder for chaining.
     */
    public Builder setVoter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      voter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string voter = 2 [json_name = "voter", (.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearVoter() {
      voter_ = getDefaultInstance().getVoter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string voter = 2 [json_name = "voter", (.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
     * @param value The bytes for voter to set.
     * @return This builder for chaining.
     */
    public Builder setVoterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      voter_ = value;
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


    // @@protoc_insertion_point(builder_scope:umee.oracle.v1.AggregateExchangeRateVote)
  }

  // @@protoc_insertion_point(class_scope:umee.oracle.v1.AggregateExchangeRateVote)
  private static final com.umee.oracle.v1.AggregateExchangeRateVote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umee.oracle.v1.AggregateExchangeRateVote();
  }

  public static com.umee.oracle.v1.AggregateExchangeRateVote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AggregateExchangeRateVote>
      PARSER = new com.google.protobuf.AbstractParser<AggregateExchangeRateVote>() {
    @java.lang.Override
    public AggregateExchangeRateVote parsePartialFrom(
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

  public static com.google.protobuf.Parser<AggregateExchangeRateVote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AggregateExchangeRateVote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umee.oracle.v1.AggregateExchangeRateVote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

