// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package com.provenance.metadata.v1;

/**
 * <pre>
 * MsgModifyOSLocatorResponse is the response type for the Msg/ModifyOSLocator RPC method.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.MsgModifyOSLocatorResponse}
 */
public final class MsgModifyOSLocatorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.MsgModifyOSLocatorResponse)
    MsgModifyOSLocatorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgModifyOSLocatorResponse.newBuilder() to construct.
  private MsgModifyOSLocatorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgModifyOSLocatorResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgModifyOSLocatorResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgModifyOSLocatorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgModifyOSLocatorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.MsgModifyOSLocatorResponse.class, com.provenance.metadata.v1.MsgModifyOSLocatorResponse.Builder.class);
  }

  public static final int LOCATOR_FIELD_NUMBER = 1;
  private com.provenance.metadata.v1.ObjectStoreLocator locator_;
  /**
   * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
   * @return Whether the locator field is set.
   */
  @java.lang.Override
  public boolean hasLocator() {
    return locator_ != null;
  }
  /**
   * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
   * @return The locator.
   */
  @java.lang.Override
  public com.provenance.metadata.v1.ObjectStoreLocator getLocator() {
    return locator_ == null ? com.provenance.metadata.v1.ObjectStoreLocator.getDefaultInstance() : locator_;
  }
  /**
   * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.provenance.metadata.v1.ObjectStoreLocatorOrBuilder getLocatorOrBuilder() {
    return locator_ == null ? com.provenance.metadata.v1.ObjectStoreLocator.getDefaultInstance() : locator_;
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
    if (locator_ != null) {
      output.writeMessage(1, getLocator());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (locator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocator());
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
    if (!(obj instanceof com.provenance.metadata.v1.MsgModifyOSLocatorResponse)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.MsgModifyOSLocatorResponse other = (com.provenance.metadata.v1.MsgModifyOSLocatorResponse) obj;

    if (hasLocator() != other.hasLocator()) return false;
    if (hasLocator()) {
      if (!getLocator()
          .equals(other.getLocator())) return false;
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
    if (hasLocator()) {
      hash = (37 * hash) + LOCATOR_FIELD_NUMBER;
      hash = (53 * hash) + getLocator().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.MsgModifyOSLocatorResponse prototype) {
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
   * MsgModifyOSLocatorResponse is the response type for the Msg/ModifyOSLocator RPC method.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.MsgModifyOSLocatorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.MsgModifyOSLocatorResponse)
      com.provenance.metadata.v1.MsgModifyOSLocatorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgModifyOSLocatorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgModifyOSLocatorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.MsgModifyOSLocatorResponse.class, com.provenance.metadata.v1.MsgModifyOSLocatorResponse.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.MsgModifyOSLocatorResponse.newBuilder()
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
      locator_ = null;
      if (locatorBuilder_ != null) {
        locatorBuilder_.dispose();
        locatorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgModifyOSLocatorResponse_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgModifyOSLocatorResponse getDefaultInstanceForType() {
      return com.provenance.metadata.v1.MsgModifyOSLocatorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgModifyOSLocatorResponse build() {
      com.provenance.metadata.v1.MsgModifyOSLocatorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgModifyOSLocatorResponse buildPartial() {
      com.provenance.metadata.v1.MsgModifyOSLocatorResponse result = new com.provenance.metadata.v1.MsgModifyOSLocatorResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.metadata.v1.MsgModifyOSLocatorResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.locator_ = locatorBuilder_ == null
            ? locator_
            : locatorBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.MsgModifyOSLocatorResponse) {
        return mergeFrom((com.provenance.metadata.v1.MsgModifyOSLocatorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.MsgModifyOSLocatorResponse other) {
      if (other == com.provenance.metadata.v1.MsgModifyOSLocatorResponse.getDefaultInstance()) return this;
      if (other.hasLocator()) {
        mergeLocator(other.getLocator());
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
                  getLocatorFieldBuilder().getBuilder(),
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

    private com.provenance.metadata.v1.ObjectStoreLocator locator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.ObjectStoreLocator, com.provenance.metadata.v1.ObjectStoreLocator.Builder, com.provenance.metadata.v1.ObjectStoreLocatorOrBuilder> locatorBuilder_;
    /**
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
     * @return Whether the locator field is set.
     */
    public boolean hasLocator() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
     * @return The locator.
     */
    public com.provenance.metadata.v1.ObjectStoreLocator getLocator() {
      if (locatorBuilder_ == null) {
        return locator_ == null ? com.provenance.metadata.v1.ObjectStoreLocator.getDefaultInstance() : locator_;
      } else {
        return locatorBuilder_.getMessage();
      }
    }
    /**
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
     */
    public Builder setLocator(com.provenance.metadata.v1.ObjectStoreLocator value) {
      if (locatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        locator_ = value;
      } else {
        locatorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
     */
    public Builder setLocator(
        com.provenance.metadata.v1.ObjectStoreLocator.Builder builderForValue) {
      if (locatorBuilder_ == null) {
        locator_ = builderForValue.build();
      } else {
        locatorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeLocator(com.provenance.metadata.v1.ObjectStoreLocator value) {
      if (locatorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          locator_ != null &&
          locator_ != com.provenance.metadata.v1.ObjectStoreLocator.getDefaultInstance()) {
          getLocatorBuilder().mergeFrom(value);
        } else {
          locator_ = value;
        }
      } else {
        locatorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearLocator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      locator_ = null;
      if (locatorBuilder_ != null) {
        locatorBuilder_.dispose();
        locatorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.metadata.v1.ObjectStoreLocator.Builder getLocatorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLocatorFieldBuilder().getBuilder();
    }
    /**
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.metadata.v1.ObjectStoreLocatorOrBuilder getLocatorOrBuilder() {
      if (locatorBuilder_ != null) {
        return locatorBuilder_.getMessageOrBuilder();
      } else {
        return locator_ == null ?
            com.provenance.metadata.v1.ObjectStoreLocator.getDefaultInstance() : locator_;
      }
    }
    /**
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.ObjectStoreLocator, com.provenance.metadata.v1.ObjectStoreLocator.Builder, com.provenance.metadata.v1.ObjectStoreLocatorOrBuilder> 
        getLocatorFieldBuilder() {
      if (locatorBuilder_ == null) {
        locatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.metadata.v1.ObjectStoreLocator, com.provenance.metadata.v1.ObjectStoreLocator.Builder, com.provenance.metadata.v1.ObjectStoreLocatorOrBuilder>(
                getLocator(),
                getParentForChildren(),
                isClean());
        locator_ = null;
      }
      return locatorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.MsgModifyOSLocatorResponse)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.MsgModifyOSLocatorResponse)
  private static final com.provenance.metadata.v1.MsgModifyOSLocatorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.MsgModifyOSLocatorResponse();
  }

  public static com.provenance.metadata.v1.MsgModifyOSLocatorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgModifyOSLocatorResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgModifyOSLocatorResponse>() {
    @java.lang.Override
    public MsgModifyOSLocatorResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgModifyOSLocatorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgModifyOSLocatorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.MsgModifyOSLocatorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

