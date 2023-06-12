// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/customparams/v1/params.proto

package com.coreum.customparams.v1;

/**
 * <pre>
 * StakingParams defines the set of additional staking params for the staking module wrapper.
 * </pre>
 *
 * Protobuf type {@code coreum.customparams.v1.StakingParams}
 */
public final class StakingParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:coreum.customparams.v1.StakingParams)
    StakingParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StakingParams.newBuilder() to construct.
  private StakingParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StakingParams() {
    minSelfDelegation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StakingParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coreum.customparams.v1.ParamsProto.internal_static_coreum_customparams_v1_StakingParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coreum.customparams.v1.ParamsProto.internal_static_coreum_customparams_v1_StakingParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.coreum.customparams.v1.StakingParams.class, com.coreum.customparams.v1.StakingParams.Builder.class);
  }

  public static final int MIN_SELF_DELEGATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object minSelfDelegation_ = "";
  /**
   * <pre>
   * min_self_delegation is the validators global self declared minimum for delegation.
   * </pre>
   *
   * <code>string min_self_delegation = 1 [json_name = "minSelfDelegation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
   * @return The minSelfDelegation.
   */
  @java.lang.Override
  public java.lang.String getMinSelfDelegation() {
    java.lang.Object ref = minSelfDelegation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      minSelfDelegation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * min_self_delegation is the validators global self declared minimum for delegation.
   * </pre>
   *
   * <code>string min_self_delegation = 1 [json_name = "minSelfDelegation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
   * @return The bytes for minSelfDelegation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMinSelfDelegationBytes() {
    java.lang.Object ref = minSelfDelegation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      minSelfDelegation_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minSelfDelegation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, minSelfDelegation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minSelfDelegation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, minSelfDelegation_);
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
    if (!(obj instanceof com.coreum.customparams.v1.StakingParams)) {
      return super.equals(obj);
    }
    com.coreum.customparams.v1.StakingParams other = (com.coreum.customparams.v1.StakingParams) obj;

    if (!getMinSelfDelegation()
        .equals(other.getMinSelfDelegation())) return false;
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
    hash = (37 * hash) + MIN_SELF_DELEGATION_FIELD_NUMBER;
    hash = (53 * hash) + getMinSelfDelegation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.coreum.customparams.v1.StakingParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.customparams.v1.StakingParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.customparams.v1.StakingParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.customparams.v1.StakingParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.customparams.v1.StakingParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.customparams.v1.StakingParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.customparams.v1.StakingParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreum.customparams.v1.StakingParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.coreum.customparams.v1.StakingParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.coreum.customparams.v1.StakingParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreum.customparams.v1.StakingParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreum.customparams.v1.StakingParams parseFrom(
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
  public static Builder newBuilder(com.coreum.customparams.v1.StakingParams prototype) {
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
   * StakingParams defines the set of additional staking params for the staking module wrapper.
   * </pre>
   *
   * Protobuf type {@code coreum.customparams.v1.StakingParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:coreum.customparams.v1.StakingParams)
      com.coreum.customparams.v1.StakingParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coreum.customparams.v1.ParamsProto.internal_static_coreum_customparams_v1_StakingParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coreum.customparams.v1.ParamsProto.internal_static_coreum_customparams_v1_StakingParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.coreum.customparams.v1.StakingParams.class, com.coreum.customparams.v1.StakingParams.Builder.class);
    }

    // Construct using com.coreum.customparams.v1.StakingParams.newBuilder()
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
      minSelfDelegation_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coreum.customparams.v1.ParamsProto.internal_static_coreum_customparams_v1_StakingParams_descriptor;
    }

    @java.lang.Override
    public com.coreum.customparams.v1.StakingParams getDefaultInstanceForType() {
      return com.coreum.customparams.v1.StakingParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.coreum.customparams.v1.StakingParams build() {
      com.coreum.customparams.v1.StakingParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.coreum.customparams.v1.StakingParams buildPartial() {
      com.coreum.customparams.v1.StakingParams result = new com.coreum.customparams.v1.StakingParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.coreum.customparams.v1.StakingParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minSelfDelegation_ = minSelfDelegation_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.coreum.customparams.v1.StakingParams) {
        return mergeFrom((com.coreum.customparams.v1.StakingParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.coreum.customparams.v1.StakingParams other) {
      if (other == com.coreum.customparams.v1.StakingParams.getDefaultInstance()) return this;
      if (!other.getMinSelfDelegation().isEmpty()) {
        minSelfDelegation_ = other.minSelfDelegation_;
        bitField0_ |= 0x00000001;
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
              minSelfDelegation_ = input.readStringRequireUtf8();
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

    private java.lang.Object minSelfDelegation_ = "";
    /**
     * <pre>
     * min_self_delegation is the validators global self declared minimum for delegation.
     * </pre>
     *
     * <code>string min_self_delegation = 1 [json_name = "minSelfDelegation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
     * @return The minSelfDelegation.
     */
    public java.lang.String getMinSelfDelegation() {
      java.lang.Object ref = minSelfDelegation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        minSelfDelegation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * min_self_delegation is the validators global self declared minimum for delegation.
     * </pre>
     *
     * <code>string min_self_delegation = 1 [json_name = "minSelfDelegation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
     * @return The bytes for minSelfDelegation.
     */
    public com.google.protobuf.ByteString
        getMinSelfDelegationBytes() {
      java.lang.Object ref = minSelfDelegation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        minSelfDelegation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * min_self_delegation is the validators global self declared minimum for delegation.
     * </pre>
     *
     * <code>string min_self_delegation = 1 [json_name = "minSelfDelegation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
     * @param value The minSelfDelegation to set.
     * @return This builder for chaining.
     */
    public Builder setMinSelfDelegation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      minSelfDelegation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * min_self_delegation is the validators global self declared minimum for delegation.
     * </pre>
     *
     * <code>string min_self_delegation = 1 [json_name = "minSelfDelegation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinSelfDelegation() {
      minSelfDelegation_ = getDefaultInstance().getMinSelfDelegation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * min_self_delegation is the validators global self declared minimum for delegation.
     * </pre>
     *
     * <code>string min_self_delegation = 1 [json_name = "minSelfDelegation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
     * @param value The bytes for minSelfDelegation to set.
     * @return This builder for chaining.
     */
    public Builder setMinSelfDelegationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      minSelfDelegation_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:coreum.customparams.v1.StakingParams)
  }

  // @@protoc_insertion_point(class_scope:coreum.customparams.v1.StakingParams)
  private static final com.coreum.customparams.v1.StakingParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.coreum.customparams.v1.StakingParams();
  }

  public static com.coreum.customparams.v1.StakingParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StakingParams>
      PARSER = new com.google.protobuf.AbstractParser<StakingParams>() {
    @java.lang.Override
    public StakingParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<StakingParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StakingParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.coreum.customparams.v1.StakingParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

