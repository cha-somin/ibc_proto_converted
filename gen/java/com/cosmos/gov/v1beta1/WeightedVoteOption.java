// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/gov.proto

package com.cosmos.gov.v1beta1;

/**
 * <pre>
 * WeightedVoteOption defines a unit of vote for vote split.
 *
 * Since: cosmos-sdk 0.43
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1beta1.WeightedVoteOption}
 */
public final class WeightedVoteOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1beta1.WeightedVoteOption)
    WeightedVoteOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeightedVoteOption.newBuilder() to construct.
  private WeightedVoteOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeightedVoteOption() {
    option_ = 0;
    weight_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeightedVoteOption();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.gov.v1beta1.GovProto.internal_static_cosmos_gov_v1beta1_WeightedVoteOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.gov.v1beta1.GovProto.internal_static_cosmos_gov_v1beta1_WeightedVoteOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.gov.v1beta1.WeightedVoteOption.class, com.cosmos.gov.v1beta1.WeightedVoteOption.Builder.class);
  }

  public static final int OPTION_FIELD_NUMBER = 1;
  private int option_ = 0;
  /**
   * <pre>
   * option defines the valid vote options, it must not contain duplicate vote options.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.VoteOption option = 1 [json_name = "option"];</code>
   * @return The enum numeric value on the wire for option.
   */
  @java.lang.Override public int getOptionValue() {
    return option_;
  }
  /**
   * <pre>
   * option defines the valid vote options, it must not contain duplicate vote options.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.VoteOption option = 1 [json_name = "option"];</code>
   * @return The option.
   */
  @java.lang.Override public com.cosmos.gov.v1beta1.VoteOption getOption() {
    com.cosmos.gov.v1beta1.VoteOption result = com.cosmos.gov.v1beta1.VoteOption.forNumber(option_);
    return result == null ? com.cosmos.gov.v1beta1.VoteOption.UNRECOGNIZED : result;
  }

  public static final int WEIGHT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object weight_ = "";
  /**
   * <pre>
   * weight is the vote weight associated with the vote option.
   * </pre>
   *
   * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec", (.amino.dont_omitempty) = true];</code>
   * @return The weight.
   */
  @java.lang.Override
  public java.lang.String getWeight() {
    java.lang.Object ref = weight_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      weight_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * weight is the vote weight associated with the vote option.
   * </pre>
   *
   * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec", (.amino.dont_omitempty) = true];</code>
   * @return The bytes for weight.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWeightBytes() {
    java.lang.Object ref = weight_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      weight_ = b;
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
    if (option_ != com.cosmos.gov.v1beta1.VoteOption.VOTE_OPTION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, option_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(weight_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, weight_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (option_ != com.cosmos.gov.v1beta1.VoteOption.VOTE_OPTION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, option_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(weight_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, weight_);
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
    if (!(obj instanceof com.cosmos.gov.v1beta1.WeightedVoteOption)) {
      return super.equals(obj);
    }
    com.cosmos.gov.v1beta1.WeightedVoteOption other = (com.cosmos.gov.v1beta1.WeightedVoteOption) obj;

    if (option_ != other.option_) return false;
    if (!getWeight()
        .equals(other.getWeight())) return false;
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
    hash = (37 * hash) + OPTION_FIELD_NUMBER;
    hash = (53 * hash) + option_;
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getWeight().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1beta1.WeightedVoteOption parseFrom(
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
  public static Builder newBuilder(com.cosmos.gov.v1beta1.WeightedVoteOption prototype) {
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
   * WeightedVoteOption defines a unit of vote for vote split.
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1beta1.WeightedVoteOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1beta1.WeightedVoteOption)
      com.cosmos.gov.v1beta1.WeightedVoteOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.gov.v1beta1.GovProto.internal_static_cosmos_gov_v1beta1_WeightedVoteOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.gov.v1beta1.GovProto.internal_static_cosmos_gov_v1beta1_WeightedVoteOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.gov.v1beta1.WeightedVoteOption.class, com.cosmos.gov.v1beta1.WeightedVoteOption.Builder.class);
    }

    // Construct using com.cosmos.gov.v1beta1.WeightedVoteOption.newBuilder()
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
      option_ = 0;
      weight_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.gov.v1beta1.GovProto.internal_static_cosmos_gov_v1beta1_WeightedVoteOption_descriptor;
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.WeightedVoteOption getDefaultInstanceForType() {
      return com.cosmos.gov.v1beta1.WeightedVoteOption.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.WeightedVoteOption build() {
      com.cosmos.gov.v1beta1.WeightedVoteOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.WeightedVoteOption buildPartial() {
      com.cosmos.gov.v1beta1.WeightedVoteOption result = new com.cosmos.gov.v1beta1.WeightedVoteOption(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.gov.v1beta1.WeightedVoteOption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.option_ = option_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.weight_ = weight_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.gov.v1beta1.WeightedVoteOption) {
        return mergeFrom((com.cosmos.gov.v1beta1.WeightedVoteOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.gov.v1beta1.WeightedVoteOption other) {
      if (other == com.cosmos.gov.v1beta1.WeightedVoteOption.getDefaultInstance()) return this;
      if (other.option_ != 0) {
        setOptionValue(other.getOptionValue());
      }
      if (!other.getWeight().isEmpty()) {
        weight_ = other.weight_;
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
            case 8: {
              option_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              weight_ = input.readStringRequireUtf8();
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

    private int option_ = 0;
    /**
     * <pre>
     * option defines the valid vote options, it must not contain duplicate vote options.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VoteOption option = 1 [json_name = "option"];</code>
     * @return The enum numeric value on the wire for option.
     */
    @java.lang.Override public int getOptionValue() {
      return option_;
    }
    /**
     * <pre>
     * option defines the valid vote options, it must not contain duplicate vote options.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VoteOption option = 1 [json_name = "option"];</code>
     * @param value The enum numeric value on the wire for option to set.
     * @return This builder for chaining.
     */
    public Builder setOptionValue(int value) {
      option_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * option defines the valid vote options, it must not contain duplicate vote options.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VoteOption option = 1 [json_name = "option"];</code>
     * @return The option.
     */
    @java.lang.Override
    public com.cosmos.gov.v1beta1.VoteOption getOption() {
      com.cosmos.gov.v1beta1.VoteOption result = com.cosmos.gov.v1beta1.VoteOption.forNumber(option_);
      return result == null ? com.cosmos.gov.v1beta1.VoteOption.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * option defines the valid vote options, it must not contain duplicate vote options.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VoteOption option = 1 [json_name = "option"];</code>
     * @param value The option to set.
     * @return This builder for chaining.
     */
    public Builder setOption(com.cosmos.gov.v1beta1.VoteOption value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      option_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * option defines the valid vote options, it must not contain duplicate vote options.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.VoteOption option = 1 [json_name = "option"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOption() {
      bitField0_ = (bitField0_ & ~0x00000001);
      option_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object weight_ = "";
    /**
     * <pre>
     * weight is the vote weight associated with the vote option.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec", (.amino.dont_omitempty) = true];</code>
     * @return The weight.
     */
    public java.lang.String getWeight() {
      java.lang.Object ref = weight_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        weight_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * weight is the vote weight associated with the vote option.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec", (.amino.dont_omitempty) = true];</code>
     * @return The bytes for weight.
     */
    public com.google.protobuf.ByteString
        getWeightBytes() {
      java.lang.Object ref = weight_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        weight_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * weight is the vote weight associated with the vote option.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec", (.amino.dont_omitempty) = true];</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      weight_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * weight is the vote weight associated with the vote option.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec", (.amino.dont_omitempty) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      weight_ = getDefaultInstance().getWeight();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * weight is the vote weight associated with the vote option.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec", (.amino.dont_omitempty) = true];</code>
     * @param value The bytes for weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeightBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      weight_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1beta1.WeightedVoteOption)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1beta1.WeightedVoteOption)
  private static final com.cosmos.gov.v1beta1.WeightedVoteOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.gov.v1beta1.WeightedVoteOption();
  }

  public static com.cosmos.gov.v1beta1.WeightedVoteOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeightedVoteOption>
      PARSER = new com.google.protobuf.AbstractParser<WeightedVoteOption>() {
    @java.lang.Override
    public WeightedVoteOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<WeightedVoteOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeightedVoteOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.gov.v1beta1.WeightedVoteOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

