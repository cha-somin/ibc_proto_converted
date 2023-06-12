// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/reactions/v1/models.proto

package com.desmos.reactions.v1;

/**
 * <pre>
 * RegisteredReactionValueParams contains the params for RegisteredReactionValue
 * based reactions
 * </pre>
 *
 * Protobuf type {@code desmos.reactions.v1.RegisteredReactionValueParams}
 */
public final class RegisteredReactionValueParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.reactions.v1.RegisteredReactionValueParams)
    RegisteredReactionValueParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisteredReactionValueParams.newBuilder() to construct.
  private RegisteredReactionValueParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisteredReactionValueParams() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisteredReactionValueParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.reactions.v1.ModelsProto.internal_static_desmos_reactions_v1_RegisteredReactionValueParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.reactions.v1.ModelsProto.internal_static_desmos_reactions_v1_RegisteredReactionValueParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.reactions.v1.RegisteredReactionValueParams.class, com.desmos.reactions.v1.RegisteredReactionValueParams.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;
  /**
   * <pre>
   * Whether RegisteredReactionValue reactions should be enabled
   * </pre>
   *
   * <code>bool enabled = 1 [json_name = "enabled", (.gogoproto.moretags) = "yaml:&#92;"enabled&#92;""];</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
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
    if (!(obj instanceof com.desmos.reactions.v1.RegisteredReactionValueParams)) {
      return super.equals(obj);
    }
    com.desmos.reactions.v1.RegisteredReactionValueParams other = (com.desmos.reactions.v1.RegisteredReactionValueParams) obj;

    if (getEnabled()
        != other.getEnabled()) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.reactions.v1.RegisteredReactionValueParams parseFrom(
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
  public static Builder newBuilder(com.desmos.reactions.v1.RegisteredReactionValueParams prototype) {
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
   * RegisteredReactionValueParams contains the params for RegisteredReactionValue
   * based reactions
   * </pre>
   *
   * Protobuf type {@code desmos.reactions.v1.RegisteredReactionValueParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.reactions.v1.RegisteredReactionValueParams)
      com.desmos.reactions.v1.RegisteredReactionValueParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.reactions.v1.ModelsProto.internal_static_desmos_reactions_v1_RegisteredReactionValueParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.reactions.v1.ModelsProto.internal_static_desmos_reactions_v1_RegisteredReactionValueParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.reactions.v1.RegisteredReactionValueParams.class, com.desmos.reactions.v1.RegisteredReactionValueParams.Builder.class);
    }

    // Construct using com.desmos.reactions.v1.RegisteredReactionValueParams.newBuilder()
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
      enabled_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.reactions.v1.ModelsProto.internal_static_desmos_reactions_v1_RegisteredReactionValueParams_descriptor;
    }

    @java.lang.Override
    public com.desmos.reactions.v1.RegisteredReactionValueParams getDefaultInstanceForType() {
      return com.desmos.reactions.v1.RegisteredReactionValueParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.reactions.v1.RegisteredReactionValueParams build() {
      com.desmos.reactions.v1.RegisteredReactionValueParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.reactions.v1.RegisteredReactionValueParams buildPartial() {
      com.desmos.reactions.v1.RegisteredReactionValueParams result = new com.desmos.reactions.v1.RegisteredReactionValueParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.reactions.v1.RegisteredReactionValueParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.reactions.v1.RegisteredReactionValueParams) {
        return mergeFrom((com.desmos.reactions.v1.RegisteredReactionValueParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.reactions.v1.RegisteredReactionValueParams other) {
      if (other == com.desmos.reactions.v1.RegisteredReactionValueParams.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
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
              enabled_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean enabled_ ;
    /**
     * <pre>
     * Whether RegisteredReactionValue reactions should be enabled
     * </pre>
     *
     * <code>bool enabled = 1 [json_name = "enabled", (.gogoproto.moretags) = "yaml:&#92;"enabled&#92;""];</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * Whether RegisteredReactionValue reactions should be enabled
     * </pre>
     *
     * <code>bool enabled = 1 [json_name = "enabled", (.gogoproto.moretags) = "yaml:&#92;"enabled&#92;""];</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether RegisteredReactionValue reactions should be enabled
     * </pre>
     *
     * <code>bool enabled = 1 [json_name = "enabled", (.gogoproto.moretags) = "yaml:&#92;"enabled&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:desmos.reactions.v1.RegisteredReactionValueParams)
  }

  // @@protoc_insertion_point(class_scope:desmos.reactions.v1.RegisteredReactionValueParams)
  private static final com.desmos.reactions.v1.RegisteredReactionValueParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.reactions.v1.RegisteredReactionValueParams();
  }

  public static com.desmos.reactions.v1.RegisteredReactionValueParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisteredReactionValueParams>
      PARSER = new com.google.protobuf.AbstractParser<RegisteredReactionValueParams>() {
    @java.lang.Override
    public RegisteredReactionValueParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisteredReactionValueParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisteredReactionValueParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.reactions.v1.RegisteredReactionValueParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

