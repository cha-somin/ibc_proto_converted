// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/slashing/module/v1/module.proto

package com.cosmos.slashing.module.v1;

/**
 * <pre>
 * Module is the config object of the slashing module.
 * </pre>
 *
 * Protobuf type {@code cosmos.slashing.module.v1.Module}
 */
public final class Module extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.slashing.module.v1.Module)
    ModuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Module.newBuilder() to construct.
  private Module(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Module() {
    authority_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Module();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.slashing.module.v1.ModuleProto.internal_static_cosmos_slashing_module_v1_Module_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.slashing.module.v1.ModuleProto.internal_static_cosmos_slashing_module_v1_Module_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.slashing.module.v1.Module.class, com.cosmos.slashing.module.v1.Module.Builder.class);
  }

  public static final int AUTHORITY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object authority_ = "";
  /**
   * <pre>
   * authority defines the custom module authority. If not set, defaults to the governance module.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority"];</code>
   * @return The authority.
   */
  @java.lang.Override
  public java.lang.String getAuthority() {
    java.lang.Object ref = authority_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authority_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * authority defines the custom module authority. If not set, defaults to the governance module.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority"];</code>
   * @return The bytes for authority.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuthorityBytes() {
    java.lang.Object ref = authority_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authority_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, authority_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, authority_);
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
    if (!(obj instanceof com.cosmos.slashing.module.v1.Module)) {
      return super.equals(obj);
    }
    com.cosmos.slashing.module.v1.Module other = (com.cosmos.slashing.module.v1.Module) obj;

    if (!getAuthority()
        .equals(other.getAuthority())) return false;
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
    hash = (37 * hash) + AUTHORITY_FIELD_NUMBER;
    hash = (53 * hash) + getAuthority().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.slashing.module.v1.Module parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.slashing.module.v1.Module parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.slashing.module.v1.Module parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.slashing.module.v1.Module parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.slashing.module.v1.Module parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.slashing.module.v1.Module parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.slashing.module.v1.Module parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.slashing.module.v1.Module parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.slashing.module.v1.Module parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.slashing.module.v1.Module parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.slashing.module.v1.Module parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.slashing.module.v1.Module parseFrom(
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
  public static Builder newBuilder(com.cosmos.slashing.module.v1.Module prototype) {
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
   * Module is the config object of the slashing module.
   * </pre>
   *
   * Protobuf type {@code cosmos.slashing.module.v1.Module}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.slashing.module.v1.Module)
      com.cosmos.slashing.module.v1.ModuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.slashing.module.v1.ModuleProto.internal_static_cosmos_slashing_module_v1_Module_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.slashing.module.v1.ModuleProto.internal_static_cosmos_slashing_module_v1_Module_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.slashing.module.v1.Module.class, com.cosmos.slashing.module.v1.Module.Builder.class);
    }

    // Construct using com.cosmos.slashing.module.v1.Module.newBuilder()
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
      authority_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.slashing.module.v1.ModuleProto.internal_static_cosmos_slashing_module_v1_Module_descriptor;
    }

    @java.lang.Override
    public com.cosmos.slashing.module.v1.Module getDefaultInstanceForType() {
      return com.cosmos.slashing.module.v1.Module.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.slashing.module.v1.Module build() {
      com.cosmos.slashing.module.v1.Module result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.slashing.module.v1.Module buildPartial() {
      com.cosmos.slashing.module.v1.Module result = new com.cosmos.slashing.module.v1.Module(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.slashing.module.v1.Module result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authority_ = authority_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.slashing.module.v1.Module) {
        return mergeFrom((com.cosmos.slashing.module.v1.Module)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.slashing.module.v1.Module other) {
      if (other == com.cosmos.slashing.module.v1.Module.getDefaultInstance()) return this;
      if (!other.getAuthority().isEmpty()) {
        authority_ = other.authority_;
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
              authority_ = input.readStringRequireUtf8();
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

    private java.lang.Object authority_ = "";
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority"];</code>
     * @return The authority.
     */
    public java.lang.String getAuthority() {
      java.lang.Object ref = authority_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authority_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority"];</code>
     * @return The bytes for authority.
     */
    public com.google.protobuf.ByteString
        getAuthorityBytes() {
      java.lang.Object ref = authority_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authority_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority"];</code>
     * @param value The authority to set.
     * @return This builder for chaining.
     */
    public Builder setAuthority(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      authority_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthority() {
      authority_ = getDefaultInstance().getAuthority();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority"];</code>
     * @param value The bytes for authority to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      authority_ = value;
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


    // @@protoc_insertion_point(builder_scope:cosmos.slashing.module.v1.Module)
  }

  // @@protoc_insertion_point(class_scope:cosmos.slashing.module.v1.Module)
  private static final com.cosmos.slashing.module.v1.Module DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.slashing.module.v1.Module();
  }

  public static com.cosmos.slashing.module.v1.Module getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Module>
      PARSER = new com.google.protobuf.AbstractParser<Module>() {
    @java.lang.Override
    public Module parsePartialFrom(
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

  public static com.google.protobuf.Parser<Module> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Module> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.slashing.module.v1.Module getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

