// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rstaking/query.proto

package com.stafihub.stafihub.rstaking;

/**
 * Protobuf type {@code stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse}
 */
public final class QueryDelegatorWhitelistSwitchResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse)
    QueryDelegatorWhitelistSwitchResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDelegatorWhitelistSwitchResponse.newBuilder() to construct.
  private QueryDelegatorWhitelistSwitchResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDelegatorWhitelistSwitchResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDelegatorWhitelistSwitchResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.rstaking.QueryProto.internal_static_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.rstaking.QueryProto.internal_static_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse.class, com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse.Builder.class);
  }

  public static final int ISOPEN_FIELD_NUMBER = 1;
  private boolean isOpen_ = false;
  /**
   * <code>bool isOpen = 1 [json_name = "isOpen"];</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
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
    if (isOpen_ != false) {
      output.writeBool(1, isOpen_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isOpen_);
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
    if (!(obj instanceof com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse other = (com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse) obj;

    if (getIsOpen()
        != other.getIsOpen()) return false;
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
    hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse prototype) {
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
   * Protobuf type {@code stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse)
      com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.rstaking.QueryProto.internal_static_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.rstaking.QueryProto.internal_static_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse.class, com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse.Builder.class);
    }

    // Construct using com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse.newBuilder()
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
      isOpen_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.rstaking.QueryProto.internal_static_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchResponse_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse getDefaultInstanceForType() {
      return com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse build() {
      com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse buildPartial() {
      com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse result = new com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isOpen_ = isOpen_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse) {
        return mergeFrom((com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse other) {
      if (other == com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse.getDefaultInstance()) return this;
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
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
              isOpen_ = input.readBool();
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

    private boolean isOpen_ ;
    /**
     * <code>bool isOpen = 1 [json_name = "isOpen"];</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool isOpen = 1 [json_name = "isOpen"];</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {

      isOpen_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool isOpen = 1 [json_name = "isOpen"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isOpen_ = false;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse)
  private static final com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse();
  }

  public static com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDelegatorWhitelistSwitchResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDelegatorWhitelistSwitchResponse>() {
    @java.lang.Override
    public QueryDelegatorWhitelistSwitchResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDelegatorWhitelistSwitchResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDelegatorWhitelistSwitchResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

