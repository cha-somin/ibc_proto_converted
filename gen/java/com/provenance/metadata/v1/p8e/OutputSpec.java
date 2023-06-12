// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/p8e/p8e.proto

package com.provenance.metadata.v1.p8e;

/**
 * <pre>
 * Deprecated: Do not use.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.p8e.OutputSpec}
 */
@java.lang.Deprecated public final class OutputSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.p8e.OutputSpec)
    OutputSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OutputSpec.newBuilder() to construct.
  private OutputSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OutputSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OutputSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_OutputSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_OutputSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.p8e.OutputSpec.class, com.provenance.metadata.v1.p8e.OutputSpec.Builder.class);
  }

  public static final int SPEC_FIELD_NUMBER = 1;
  private com.provenance.metadata.v1.p8e.DefinitionSpec spec_;
  /**
   * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
   * @return Whether the spec field is set.
   */
  @java.lang.Override
  public boolean hasSpec() {
    return spec_ != null;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
   * @return The spec.
   */
  @java.lang.Override
  public com.provenance.metadata.v1.p8e.DefinitionSpec getSpec() {
    return spec_ == null ? com.provenance.metadata.v1.p8e.DefinitionSpec.getDefaultInstance() : spec_;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
   */
  @java.lang.Override
  public com.provenance.metadata.v1.p8e.DefinitionSpecOrBuilder getSpecOrBuilder() {
    return spec_ == null ? com.provenance.metadata.v1.p8e.DefinitionSpec.getDefaultInstance() : spec_;
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
    if (spec_ != null) {
      output.writeMessage(1, getSpec());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (spec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSpec());
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
    if (!(obj instanceof com.provenance.metadata.v1.p8e.OutputSpec)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.p8e.OutputSpec other = (com.provenance.metadata.v1.p8e.OutputSpec) obj;

    if (hasSpec() != other.hasSpec()) return false;
    if (hasSpec()) {
      if (!getSpec()
          .equals(other.getSpec())) return false;
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
    if (hasSpec()) {
      hash = (37 * hash) + SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSpec().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.p8e.OutputSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.p8e.OutputSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.OutputSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.p8e.OutputSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.OutputSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.p8e.OutputSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.OutputSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.p8e.OutputSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.p8e.OutputSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.p8e.OutputSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.OutputSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.p8e.OutputSpec parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.p8e.OutputSpec prototype) {
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
   * Deprecated: Do not use.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.p8e.OutputSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.p8e.OutputSpec)
      com.provenance.metadata.v1.p8e.OutputSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_OutputSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_OutputSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.p8e.OutputSpec.class, com.provenance.metadata.v1.p8e.OutputSpec.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.p8e.OutputSpec.newBuilder()
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
      spec_ = null;
      if (specBuilder_ != null) {
        specBuilder_.dispose();
        specBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_OutputSpec_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.p8e.OutputSpec getDefaultInstanceForType() {
      return com.provenance.metadata.v1.p8e.OutputSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.p8e.OutputSpec build() {
      com.provenance.metadata.v1.p8e.OutputSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.p8e.OutputSpec buildPartial() {
      com.provenance.metadata.v1.p8e.OutputSpec result = new com.provenance.metadata.v1.p8e.OutputSpec(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.metadata.v1.p8e.OutputSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.spec_ = specBuilder_ == null
            ? spec_
            : specBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.p8e.OutputSpec) {
        return mergeFrom((com.provenance.metadata.v1.p8e.OutputSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.p8e.OutputSpec other) {
      if (other == com.provenance.metadata.v1.p8e.OutputSpec.getDefaultInstance()) return this;
      if (other.hasSpec()) {
        mergeSpec(other.getSpec());
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
                  getSpecFieldBuilder().getBuilder(),
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

    private com.provenance.metadata.v1.p8e.DefinitionSpec spec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.p8e.DefinitionSpec, com.provenance.metadata.v1.p8e.DefinitionSpec.Builder, com.provenance.metadata.v1.p8e.DefinitionSpecOrBuilder> specBuilder_;
    /**
     * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
     * @return The spec.
     */
    public com.provenance.metadata.v1.p8e.DefinitionSpec getSpec() {
      if (specBuilder_ == null) {
        return spec_ == null ? com.provenance.metadata.v1.p8e.DefinitionSpec.getDefaultInstance() : spec_;
      } else {
        return specBuilder_.getMessage();
      }
    }
    /**
     * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
     */
    public Builder setSpec(com.provenance.metadata.v1.p8e.DefinitionSpec value) {
      if (specBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spec_ = value;
      } else {
        specBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
     */
    public Builder setSpec(
        com.provenance.metadata.v1.p8e.DefinitionSpec.Builder builderForValue) {
      if (specBuilder_ == null) {
        spec_ = builderForValue.build();
      } else {
        specBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
     */
    public Builder mergeSpec(com.provenance.metadata.v1.p8e.DefinitionSpec value) {
      if (specBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          spec_ != null &&
          spec_ != com.provenance.metadata.v1.p8e.DefinitionSpec.getDefaultInstance()) {
          getSpecBuilder().mergeFrom(value);
        } else {
          spec_ = value;
        }
      } else {
        specBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
     */
    public Builder clearSpec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      spec_ = null;
      if (specBuilder_ != null) {
        specBuilder_.dispose();
        specBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
     */
    public com.provenance.metadata.v1.p8e.DefinitionSpec.Builder getSpecBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSpecFieldBuilder().getBuilder();
    }
    /**
     * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
     */
    public com.provenance.metadata.v1.p8e.DefinitionSpecOrBuilder getSpecOrBuilder() {
      if (specBuilder_ != null) {
        return specBuilder_.getMessageOrBuilder();
      } else {
        return spec_ == null ?
            com.provenance.metadata.v1.p8e.DefinitionSpec.getDefaultInstance() : spec_;
      }
    }
    /**
     * <code>.provenance.metadata.v1.p8e.DefinitionSpec spec = 1 [json_name = "spec"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.p8e.DefinitionSpec, com.provenance.metadata.v1.p8e.DefinitionSpec.Builder, com.provenance.metadata.v1.p8e.DefinitionSpecOrBuilder> 
        getSpecFieldBuilder() {
      if (specBuilder_ == null) {
        specBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.metadata.v1.p8e.DefinitionSpec, com.provenance.metadata.v1.p8e.DefinitionSpec.Builder, com.provenance.metadata.v1.p8e.DefinitionSpecOrBuilder>(
                getSpec(),
                getParentForChildren(),
                isClean());
        spec_ = null;
      }
      return specBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.p8e.OutputSpec)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.p8e.OutputSpec)
  private static final com.provenance.metadata.v1.p8e.OutputSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.p8e.OutputSpec();
  }

  public static com.provenance.metadata.v1.p8e.OutputSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OutputSpec>
      PARSER = new com.google.protobuf.AbstractParser<OutputSpec>() {
    @java.lang.Override
    public OutputSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<OutputSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OutputSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.p8e.OutputSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

