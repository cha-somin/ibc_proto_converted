// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cryptoorg/icaauth/v1/params.proto

package com.chainmain.icaauth.v1;

/**
 * <pre>
 * Params defines the parameters for the module.
 * </pre>
 *
 * Protobuf type {@code chainmain.icaauth.v1.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chainmain.icaauth.v1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.chainmain.icaauth.v1.ParamsProto.internal_static_chainmain_icaauth_v1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.chainmain.icaauth.v1.ParamsProto.internal_static_chainmain_icaauth_v1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.chainmain.icaauth.v1.Params.class, com.chainmain.icaauth.v1.Params.Builder.class);
  }

  public static final int MINTIMEOUTDURATION_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration minTimeoutDuration_;
  /**
   * <pre>
   * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
   * behalf of interchain account
   * </pre>
   *
   * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return Whether the minTimeoutDuration field is set.
   */
  @java.lang.Override
  public boolean hasMinTimeoutDuration() {
    return minTimeoutDuration_ != null;
  }
  /**
   * <pre>
   * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
   * behalf of interchain account
   * </pre>
   *
   * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return The minTimeoutDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getMinTimeoutDuration() {
    return minTimeoutDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : minTimeoutDuration_;
  }
  /**
   * <pre>
   * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
   * behalf of interchain account
   * </pre>
   *
   * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getMinTimeoutDurationOrBuilder() {
    return minTimeoutDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : minTimeoutDuration_;
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
    if (minTimeoutDuration_ != null) {
      output.writeMessage(1, getMinTimeoutDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minTimeoutDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMinTimeoutDuration());
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
    if (!(obj instanceof com.chainmain.icaauth.v1.Params)) {
      return super.equals(obj);
    }
    com.chainmain.icaauth.v1.Params other = (com.chainmain.icaauth.v1.Params) obj;

    if (hasMinTimeoutDuration() != other.hasMinTimeoutDuration()) return false;
    if (hasMinTimeoutDuration()) {
      if (!getMinTimeoutDuration()
          .equals(other.getMinTimeoutDuration())) return false;
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
    if (hasMinTimeoutDuration()) {
      hash = (37 * hash) + MINTIMEOUTDURATION_FIELD_NUMBER;
      hash = (53 * hash) + getMinTimeoutDuration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.chainmain.icaauth.v1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainmain.icaauth.v1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainmain.icaauth.v1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainmain.icaauth.v1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainmain.icaauth.v1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainmain.icaauth.v1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainmain.icaauth.v1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.chainmain.icaauth.v1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.chainmain.icaauth.v1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.chainmain.icaauth.v1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.chainmain.icaauth.v1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.chainmain.icaauth.v1.Params parseFrom(
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
  public static Builder newBuilder(com.chainmain.icaauth.v1.Params prototype) {
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
   * Params defines the parameters for the module.
   * </pre>
   *
   * Protobuf type {@code chainmain.icaauth.v1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chainmain.icaauth.v1.Params)
      com.chainmain.icaauth.v1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chainmain.icaauth.v1.ParamsProto.internal_static_chainmain_icaauth_v1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chainmain.icaauth.v1.ParamsProto.internal_static_chainmain_icaauth_v1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chainmain.icaauth.v1.Params.class, com.chainmain.icaauth.v1.Params.Builder.class);
    }

    // Construct using com.chainmain.icaauth.v1.Params.newBuilder()
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
      minTimeoutDuration_ = null;
      if (minTimeoutDurationBuilder_ != null) {
        minTimeoutDurationBuilder_.dispose();
        minTimeoutDurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.chainmain.icaauth.v1.ParamsProto.internal_static_chainmain_icaauth_v1_Params_descriptor;
    }

    @java.lang.Override
    public com.chainmain.icaauth.v1.Params getDefaultInstanceForType() {
      return com.chainmain.icaauth.v1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.chainmain.icaauth.v1.Params build() {
      com.chainmain.icaauth.v1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.chainmain.icaauth.v1.Params buildPartial() {
      com.chainmain.icaauth.v1.Params result = new com.chainmain.icaauth.v1.Params(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.chainmain.icaauth.v1.Params result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minTimeoutDuration_ = minTimeoutDurationBuilder_ == null
            ? minTimeoutDuration_
            : minTimeoutDurationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.chainmain.icaauth.v1.Params) {
        return mergeFrom((com.chainmain.icaauth.v1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.chainmain.icaauth.v1.Params other) {
      if (other == com.chainmain.icaauth.v1.Params.getDefaultInstance()) return this;
      if (other.hasMinTimeoutDuration()) {
        mergeMinTimeoutDuration(other.getMinTimeoutDuration());
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
              input.readMessage(
                  getMinTimeoutDurationFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.protobuf.Duration minTimeoutDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> minTimeoutDurationBuilder_;
    /**
     * <pre>
     * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
     * behalf of interchain account
     * </pre>
     *
     * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     * @return Whether the minTimeoutDuration field is set.
     */
    public boolean hasMinTimeoutDuration() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
     * behalf of interchain account
     * </pre>
     *
     * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     * @return The minTimeoutDuration.
     */
    public com.google.protobuf.Duration getMinTimeoutDuration() {
      if (minTimeoutDurationBuilder_ == null) {
        return minTimeoutDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : minTimeoutDuration_;
      } else {
        return minTimeoutDurationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
     * behalf of interchain account
     * </pre>
     *
     * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder setMinTimeoutDuration(com.google.protobuf.Duration value) {
      if (minTimeoutDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minTimeoutDuration_ = value;
      } else {
        minTimeoutDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
     * behalf of interchain account
     * </pre>
     *
     * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder setMinTimeoutDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (minTimeoutDurationBuilder_ == null) {
        minTimeoutDuration_ = builderForValue.build();
      } else {
        minTimeoutDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
     * behalf of interchain account
     * </pre>
     *
     * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder mergeMinTimeoutDuration(com.google.protobuf.Duration value) {
      if (minTimeoutDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          minTimeoutDuration_ != null &&
          minTimeoutDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getMinTimeoutDurationBuilder().mergeFrom(value);
        } else {
          minTimeoutDuration_ = value;
        }
      } else {
        minTimeoutDurationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
     * behalf of interchain account
     * </pre>
     *
     * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder clearMinTimeoutDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minTimeoutDuration_ = null;
      if (minTimeoutDurationBuilder_ != null) {
        minTimeoutDurationBuilder_.dispose();
        minTimeoutDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
     * behalf of interchain account
     * </pre>
     *
     * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration.Builder getMinTimeoutDurationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMinTimeoutDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
     * behalf of interchain account
     * </pre>
     *
     * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.DurationOrBuilder getMinTimeoutDurationOrBuilder() {
      if (minTimeoutDurationBuilder_ != null) {
        return minTimeoutDurationBuilder_.getMessageOrBuilder();
      } else {
        return minTimeoutDuration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : minTimeoutDuration_;
      }
    }
    /**
     * <pre>
     * minTimeoutDuration defines the minimum value of packet timeout when submitting transactions to host chain on
     * behalf of interchain account
     * </pre>
     *
     * <code>.google.protobuf.Duration minTimeoutDuration = 1 [json_name = "minTimeoutDuration", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"min_timeout_duration&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getMinTimeoutDurationFieldBuilder() {
      if (minTimeoutDurationBuilder_ == null) {
        minTimeoutDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getMinTimeoutDuration(),
                getParentForChildren(),
                isClean());
        minTimeoutDuration_ = null;
      }
      return minTimeoutDurationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chainmain.icaauth.v1.Params)
  }

  // @@protoc_insertion_point(class_scope:chainmain.icaauth.v1.Params)
  private static final com.chainmain.icaauth.v1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.chainmain.icaauth.v1.Params();
  }

  public static com.chainmain.icaauth.v1.Params getDefaultInstance() {
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
  public com.chainmain.icaauth.v1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

