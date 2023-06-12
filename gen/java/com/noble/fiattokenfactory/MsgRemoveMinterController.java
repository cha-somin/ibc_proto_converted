// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/fiattokenfactory/tx.proto

package com.noble.fiattokenfactory;

/**
 * Protobuf type {@code noble.fiattokenfactory.MsgRemoveMinterController}
 */
public final class MsgRemoveMinterController extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:noble.fiattokenfactory.MsgRemoveMinterController)
    MsgRemoveMinterControllerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgRemoveMinterController.newBuilder() to construct.
  private MsgRemoveMinterController(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgRemoveMinterController() {
    from_ = "";
    controller_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgRemoveMinterController();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.noble.fiattokenfactory.TxProto.internal_static_noble_fiattokenfactory_MsgRemoveMinterController_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.noble.fiattokenfactory.TxProto.internal_static_noble_fiattokenfactory_MsgRemoveMinterController_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.noble.fiattokenfactory.MsgRemoveMinterController.class, com.noble.fiattokenfactory.MsgRemoveMinterController.Builder.class);
  }

  public static final int FROM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object from_ = "";
  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The from.
   */
  @java.lang.Override
  public java.lang.String getFrom() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The bytes for from.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromBytes() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      from_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTROLLER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object controller_ = "";
  /**
   * <code>string controller = 2 [json_name = "controller"];</code>
   * @return The controller.
   */
  @java.lang.Override
  public java.lang.String getController() {
    java.lang.Object ref = controller_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      controller_ = s;
      return s;
    }
  }
  /**
   * <code>string controller = 2 [json_name = "controller"];</code>
   * @return The bytes for controller.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getControllerBytes() {
    java.lang.Object ref = controller_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      controller_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, from_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(controller_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, controller_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, from_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(controller_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, controller_);
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
    if (!(obj instanceof com.noble.fiattokenfactory.MsgRemoveMinterController)) {
      return super.equals(obj);
    }
    com.noble.fiattokenfactory.MsgRemoveMinterController other = (com.noble.fiattokenfactory.MsgRemoveMinterController) obj;

    if (!getFrom()
        .equals(other.getFrom())) return false;
    if (!getController()
        .equals(other.getController())) return false;
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
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (37 * hash) + CONTROLLER_FIELD_NUMBER;
    hash = (53 * hash) + getController().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noble.fiattokenfactory.MsgRemoveMinterController parseFrom(
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
  public static Builder newBuilder(com.noble.fiattokenfactory.MsgRemoveMinterController prototype) {
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
   * Protobuf type {@code noble.fiattokenfactory.MsgRemoveMinterController}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:noble.fiattokenfactory.MsgRemoveMinterController)
      com.noble.fiattokenfactory.MsgRemoveMinterControllerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.noble.fiattokenfactory.TxProto.internal_static_noble_fiattokenfactory_MsgRemoveMinterController_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.noble.fiattokenfactory.TxProto.internal_static_noble_fiattokenfactory_MsgRemoveMinterController_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.noble.fiattokenfactory.MsgRemoveMinterController.class, com.noble.fiattokenfactory.MsgRemoveMinterController.Builder.class);
    }

    // Construct using com.noble.fiattokenfactory.MsgRemoveMinterController.newBuilder()
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
      from_ = "";
      controller_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.noble.fiattokenfactory.TxProto.internal_static_noble_fiattokenfactory_MsgRemoveMinterController_descriptor;
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.MsgRemoveMinterController getDefaultInstanceForType() {
      return com.noble.fiattokenfactory.MsgRemoveMinterController.getDefaultInstance();
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.MsgRemoveMinterController build() {
      com.noble.fiattokenfactory.MsgRemoveMinterController result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.MsgRemoveMinterController buildPartial() {
      com.noble.fiattokenfactory.MsgRemoveMinterController result = new com.noble.fiattokenfactory.MsgRemoveMinterController(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.noble.fiattokenfactory.MsgRemoveMinterController result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.from_ = from_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.controller_ = controller_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.noble.fiattokenfactory.MsgRemoveMinterController) {
        return mergeFrom((com.noble.fiattokenfactory.MsgRemoveMinterController)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.noble.fiattokenfactory.MsgRemoveMinterController other) {
      if (other == com.noble.fiattokenfactory.MsgRemoveMinterController.getDefaultInstance()) return this;
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getController().isEmpty()) {
        controller_ = other.controller_;
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
              from_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              controller_ = input.readStringRequireUtf8();
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

    private java.lang.Object from_ = "";
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @return The from.
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      from_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      from_ = getDefaultInstance().getFrom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @param value The bytes for from to set.
     * @return This builder for chaining.
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      from_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object controller_ = "";
    /**
     * <code>string controller = 2 [json_name = "controller"];</code>
     * @return The controller.
     */
    public java.lang.String getController() {
      java.lang.Object ref = controller_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        controller_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string controller = 2 [json_name = "controller"];</code>
     * @return The bytes for controller.
     */
    public com.google.protobuf.ByteString
        getControllerBytes() {
      java.lang.Object ref = controller_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        controller_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string controller = 2 [json_name = "controller"];</code>
     * @param value The controller to set.
     * @return This builder for chaining.
     */
    public Builder setController(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      controller_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string controller = 2 [json_name = "controller"];</code>
     * @return This builder for chaining.
     */
    public Builder clearController() {
      controller_ = getDefaultInstance().getController();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string controller = 2 [json_name = "controller"];</code>
     * @param value The bytes for controller to set.
     * @return This builder for chaining.
     */
    public Builder setControllerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      controller_ = value;
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


    // @@protoc_insertion_point(builder_scope:noble.fiattokenfactory.MsgRemoveMinterController)
  }

  // @@protoc_insertion_point(class_scope:noble.fiattokenfactory.MsgRemoveMinterController)
  private static final com.noble.fiattokenfactory.MsgRemoveMinterController DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.noble.fiattokenfactory.MsgRemoveMinterController();
  }

  public static com.noble.fiattokenfactory.MsgRemoveMinterController getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgRemoveMinterController>
      PARSER = new com.google.protobuf.AbstractParser<MsgRemoveMinterController>() {
    @java.lang.Override
    public MsgRemoveMinterController parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgRemoveMinterController> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgRemoveMinterController> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.noble.fiattokenfactory.MsgRemoveMinterController getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

