// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/fiattokenfactory/query.proto

package com.noble.fiattokenfactory;

/**
 * Protobuf type {@code noble.fiattokenfactory.QueryGetBlacklisterResponse}
 */
public final class QueryGetBlacklisterResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:noble.fiattokenfactory.QueryGetBlacklisterResponse)
    QueryGetBlacklisterResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetBlacklisterResponse.newBuilder() to construct.
  private QueryGetBlacklisterResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetBlacklisterResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGetBlacklisterResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryGetBlacklisterResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryGetBlacklisterResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.noble.fiattokenfactory.QueryGetBlacklisterResponse.class, com.noble.fiattokenfactory.QueryGetBlacklisterResponse.Builder.class);
  }

  public static final int BLACKLISTER_FIELD_NUMBER = 1;
  private com.noble.fiattokenfactory.Blacklister blacklister_;
  /**
   * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
   * @return Whether the blacklister field is set.
   */
  @java.lang.Override
  public boolean hasBlacklister() {
    return blacklister_ != null;
  }
  /**
   * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
   * @return The blacklister.
   */
  @java.lang.Override
  public com.noble.fiattokenfactory.Blacklister getBlacklister() {
    return blacklister_ == null ? com.noble.fiattokenfactory.Blacklister.getDefaultInstance() : blacklister_;
  }
  /**
   * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.noble.fiattokenfactory.BlacklisterOrBuilder getBlacklisterOrBuilder() {
    return blacklister_ == null ? com.noble.fiattokenfactory.Blacklister.getDefaultInstance() : blacklister_;
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
    if (blacklister_ != null) {
      output.writeMessage(1, getBlacklister());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blacklister_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBlacklister());
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
    if (!(obj instanceof com.noble.fiattokenfactory.QueryGetBlacklisterResponse)) {
      return super.equals(obj);
    }
    com.noble.fiattokenfactory.QueryGetBlacklisterResponse other = (com.noble.fiattokenfactory.QueryGetBlacklisterResponse) obj;

    if (hasBlacklister() != other.hasBlacklister()) return false;
    if (hasBlacklister()) {
      if (!getBlacklister()
          .equals(other.getBlacklister())) return false;
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
    if (hasBlacklister()) {
      hash = (37 * hash) + BLACKLISTER_FIELD_NUMBER;
      hash = (53 * hash) + getBlacklister().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse parseFrom(
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
  public static Builder newBuilder(com.noble.fiattokenfactory.QueryGetBlacklisterResponse prototype) {
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
   * Protobuf type {@code noble.fiattokenfactory.QueryGetBlacklisterResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:noble.fiattokenfactory.QueryGetBlacklisterResponse)
      com.noble.fiattokenfactory.QueryGetBlacklisterResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryGetBlacklisterResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryGetBlacklisterResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.noble.fiattokenfactory.QueryGetBlacklisterResponse.class, com.noble.fiattokenfactory.QueryGetBlacklisterResponse.Builder.class);
    }

    // Construct using com.noble.fiattokenfactory.QueryGetBlacklisterResponse.newBuilder()
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
      blacklister_ = null;
      if (blacklisterBuilder_ != null) {
        blacklisterBuilder_.dispose();
        blacklisterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryGetBlacklisterResponse_descriptor;
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.QueryGetBlacklisterResponse getDefaultInstanceForType() {
      return com.noble.fiattokenfactory.QueryGetBlacklisterResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.QueryGetBlacklisterResponse build() {
      com.noble.fiattokenfactory.QueryGetBlacklisterResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.QueryGetBlacklisterResponse buildPartial() {
      com.noble.fiattokenfactory.QueryGetBlacklisterResponse result = new com.noble.fiattokenfactory.QueryGetBlacklisterResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.noble.fiattokenfactory.QueryGetBlacklisterResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.blacklister_ = blacklisterBuilder_ == null
            ? blacklister_
            : blacklisterBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.noble.fiattokenfactory.QueryGetBlacklisterResponse) {
        return mergeFrom((com.noble.fiattokenfactory.QueryGetBlacklisterResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.noble.fiattokenfactory.QueryGetBlacklisterResponse other) {
      if (other == com.noble.fiattokenfactory.QueryGetBlacklisterResponse.getDefaultInstance()) return this;
      if (other.hasBlacklister()) {
        mergeBlacklister(other.getBlacklister());
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
                  getBlacklisterFieldBuilder().getBuilder(),
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

    private com.noble.fiattokenfactory.Blacklister blacklister_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.noble.fiattokenfactory.Blacklister, com.noble.fiattokenfactory.Blacklister.Builder, com.noble.fiattokenfactory.BlacklisterOrBuilder> blacklisterBuilder_;
    /**
     * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
     * @return Whether the blacklister field is set.
     */
    public boolean hasBlacklister() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
     * @return The blacklister.
     */
    public com.noble.fiattokenfactory.Blacklister getBlacklister() {
      if (blacklisterBuilder_ == null) {
        return blacklister_ == null ? com.noble.fiattokenfactory.Blacklister.getDefaultInstance() : blacklister_;
      } else {
        return blacklisterBuilder_.getMessage();
      }
    }
    /**
     * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
     */
    public Builder setBlacklister(com.noble.fiattokenfactory.Blacklister value) {
      if (blacklisterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blacklister_ = value;
      } else {
        blacklisterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
     */
    public Builder setBlacklister(
        com.noble.fiattokenfactory.Blacklister.Builder builderForValue) {
      if (blacklisterBuilder_ == null) {
        blacklister_ = builderForValue.build();
      } else {
        blacklisterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeBlacklister(com.noble.fiattokenfactory.Blacklister value) {
      if (blacklisterBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          blacklister_ != null &&
          blacklister_ != com.noble.fiattokenfactory.Blacklister.getDefaultInstance()) {
          getBlacklisterBuilder().mergeFrom(value);
        } else {
          blacklister_ = value;
        }
      } else {
        blacklisterBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearBlacklister() {
      bitField0_ = (bitField0_ & ~0x00000001);
      blacklister_ = null;
      if (blacklisterBuilder_ != null) {
        blacklisterBuilder_.dispose();
        blacklisterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
     */
    public com.noble.fiattokenfactory.Blacklister.Builder getBlacklisterBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBlacklisterFieldBuilder().getBuilder();
    }
    /**
     * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
     */
    public com.noble.fiattokenfactory.BlacklisterOrBuilder getBlacklisterOrBuilder() {
      if (blacklisterBuilder_ != null) {
        return blacklisterBuilder_.getMessageOrBuilder();
      } else {
        return blacklister_ == null ?
            com.noble.fiattokenfactory.Blacklister.getDefaultInstance() : blacklister_;
      }
    }
    /**
     * <code>.noble.fiattokenfactory.Blacklister blacklister = 1 [json_name = "blacklister", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.noble.fiattokenfactory.Blacklister, com.noble.fiattokenfactory.Blacklister.Builder, com.noble.fiattokenfactory.BlacklisterOrBuilder> 
        getBlacklisterFieldBuilder() {
      if (blacklisterBuilder_ == null) {
        blacklisterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.noble.fiattokenfactory.Blacklister, com.noble.fiattokenfactory.Blacklister.Builder, com.noble.fiattokenfactory.BlacklisterOrBuilder>(
                getBlacklister(),
                getParentForChildren(),
                isClean());
        blacklister_ = null;
      }
      return blacklisterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:noble.fiattokenfactory.QueryGetBlacklisterResponse)
  }

  // @@protoc_insertion_point(class_scope:noble.fiattokenfactory.QueryGetBlacklisterResponse)
  private static final com.noble.fiattokenfactory.QueryGetBlacklisterResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.noble.fiattokenfactory.QueryGetBlacklisterResponse();
  }

  public static com.noble.fiattokenfactory.QueryGetBlacklisterResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetBlacklisterResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetBlacklisterResponse>() {
    @java.lang.Override
    public QueryGetBlacklisterResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGetBlacklisterResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetBlacklisterResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.noble.fiattokenfactory.QueryGetBlacklisterResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

