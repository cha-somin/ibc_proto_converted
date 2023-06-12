// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v2/models_params.proto

package com.desmos.profiles.v2;

/**
 * <pre>
 * NicknameParams defines the parameters related to the profiles nicknames
 * </pre>
 *
 * Protobuf type {@code desmos.profiles.v2.NicknameParams}
 */
public final class NicknameParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.profiles.v2.NicknameParams)
    NicknameParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NicknameParams.newBuilder() to construct.
  private NicknameParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NicknameParams() {
    minLength_ = com.google.protobuf.ByteString.EMPTY;
    maxLength_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NicknameParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.profiles.v2.ModelsParamsProto.internal_static_desmos_profiles_v2_NicknameParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.profiles.v2.ModelsParamsProto.internal_static_desmos_profiles_v2_NicknameParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.profiles.v2.NicknameParams.class, com.desmos.profiles.v2.NicknameParams.Builder.class);
  }

  public static final int MIN_LENGTH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString minLength_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes min_length = 1 [json_name = "minLength", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_length&#92;""];</code>
   * @return The minLength.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMinLength() {
    return minLength_;
  }

  public static final int MAX_LENGTH_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString maxLength_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes max_length = 2 [json_name = "maxLength", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_length&#92;""];</code>
   * @return The maxLength.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMaxLength() {
    return maxLength_;
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
    if (!minLength_.isEmpty()) {
      output.writeBytes(1, minLength_);
    }
    if (!maxLength_.isEmpty()) {
      output.writeBytes(2, maxLength_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!minLength_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, minLength_);
    }
    if (!maxLength_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, maxLength_);
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
    if (!(obj instanceof com.desmos.profiles.v2.NicknameParams)) {
      return super.equals(obj);
    }
    com.desmos.profiles.v2.NicknameParams other = (com.desmos.profiles.v2.NicknameParams) obj;

    if (!getMinLength()
        .equals(other.getMinLength())) return false;
    if (!getMaxLength()
        .equals(other.getMaxLength())) return false;
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
    hash = (37 * hash) + MIN_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getMinLength().hashCode();
    hash = (37 * hash) + MAX_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getMaxLength().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.profiles.v2.NicknameParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v2.NicknameParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v2.NicknameParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v2.NicknameParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v2.NicknameParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v2.NicknameParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v2.NicknameParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.profiles.v2.NicknameParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.profiles.v2.NicknameParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.profiles.v2.NicknameParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.profiles.v2.NicknameParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.profiles.v2.NicknameParams parseFrom(
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
  public static Builder newBuilder(com.desmos.profiles.v2.NicknameParams prototype) {
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
   * NicknameParams defines the parameters related to the profiles nicknames
   * </pre>
   *
   * Protobuf type {@code desmos.profiles.v2.NicknameParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.profiles.v2.NicknameParams)
      com.desmos.profiles.v2.NicknameParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.profiles.v2.ModelsParamsProto.internal_static_desmos_profiles_v2_NicknameParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.profiles.v2.ModelsParamsProto.internal_static_desmos_profiles_v2_NicknameParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.profiles.v2.NicknameParams.class, com.desmos.profiles.v2.NicknameParams.Builder.class);
    }

    // Construct using com.desmos.profiles.v2.NicknameParams.newBuilder()
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
      minLength_ = com.google.protobuf.ByteString.EMPTY;
      maxLength_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.profiles.v2.ModelsParamsProto.internal_static_desmos_profiles_v2_NicknameParams_descriptor;
    }

    @java.lang.Override
    public com.desmos.profiles.v2.NicknameParams getDefaultInstanceForType() {
      return com.desmos.profiles.v2.NicknameParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.profiles.v2.NicknameParams build() {
      com.desmos.profiles.v2.NicknameParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.profiles.v2.NicknameParams buildPartial() {
      com.desmos.profiles.v2.NicknameParams result = new com.desmos.profiles.v2.NicknameParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.profiles.v2.NicknameParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minLength_ = minLength_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxLength_ = maxLength_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.profiles.v2.NicknameParams) {
        return mergeFrom((com.desmos.profiles.v2.NicknameParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.profiles.v2.NicknameParams other) {
      if (other == com.desmos.profiles.v2.NicknameParams.getDefaultInstance()) return this;
      if (other.getMinLength() != com.google.protobuf.ByteString.EMPTY) {
        setMinLength(other.getMinLength());
      }
      if (other.getMaxLength() != com.google.protobuf.ByteString.EMPTY) {
        setMaxLength(other.getMaxLength());
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
              minLength_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              maxLength_ = input.readBytes();
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

    private com.google.protobuf.ByteString minLength_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes min_length = 1 [json_name = "minLength", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_length&#92;""];</code>
     * @return The minLength.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMinLength() {
      return minLength_;
    }
    /**
     * <code>bytes min_length = 1 [json_name = "minLength", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_length&#92;""];</code>
     * @param value The minLength to set.
     * @return This builder for chaining.
     */
    public Builder setMinLength(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      minLength_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes min_length = 1 [json_name = "minLength", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_length&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinLength() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minLength_ = getDefaultInstance().getMinLength();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString maxLength_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes max_length = 2 [json_name = "maxLength", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_length&#92;""];</code>
     * @return The maxLength.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMaxLength() {
      return maxLength_;
    }
    /**
     * <code>bytes max_length = 2 [json_name = "maxLength", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_length&#92;""];</code>
     * @param value The maxLength to set.
     * @return This builder for chaining.
     */
    public Builder setMaxLength(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      maxLength_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes max_length = 2 [json_name = "maxLength", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_length&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxLength() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxLength_ = getDefaultInstance().getMaxLength();
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


    // @@protoc_insertion_point(builder_scope:desmos.profiles.v2.NicknameParams)
  }

  // @@protoc_insertion_point(class_scope:desmos.profiles.v2.NicknameParams)
  private static final com.desmos.profiles.v2.NicknameParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.profiles.v2.NicknameParams();
  }

  public static com.desmos.profiles.v2.NicknameParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NicknameParams>
      PARSER = new com.google.protobuf.AbstractParser<NicknameParams>() {
    @java.lang.Override
    public NicknameParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<NicknameParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NicknameParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.profiles.v2.NicknameParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

