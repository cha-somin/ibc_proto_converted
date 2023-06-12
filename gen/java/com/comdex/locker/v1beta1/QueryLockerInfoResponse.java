// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/locker/v1beta1/query.proto

package com.comdex.locker.v1beta1;

/**
 * Protobuf type {@code comdex.locker.v1beta1.QueryLockerInfoResponse}
 */
public final class QueryLockerInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.locker.v1beta1.QueryLockerInfoResponse)
    QueryLockerInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryLockerInfoResponse.newBuilder() to construct.
  private QueryLockerInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryLockerInfoResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryLockerInfoResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.locker.v1beta1.QueryProto.internal_static_comdex_locker_v1beta1_QueryLockerInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.locker.v1beta1.QueryProto.internal_static_comdex_locker_v1beta1_QueryLockerInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.locker.v1beta1.QueryLockerInfoResponse.class, com.comdex.locker.v1beta1.QueryLockerInfoResponse.Builder.class);
  }

  public static final int LOCKER_INFO_FIELD_NUMBER = 1;
  private com.comdex.locker.v1beta1.Locker lockerInfo_;
  /**
   * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
   * @return Whether the lockerInfo field is set.
   */
  @java.lang.Override
  public boolean hasLockerInfo() {
    return lockerInfo_ != null;
  }
  /**
   * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
   * @return The lockerInfo.
   */
  @java.lang.Override
  public com.comdex.locker.v1beta1.Locker getLockerInfo() {
    return lockerInfo_ == null ? com.comdex.locker.v1beta1.Locker.getDefaultInstance() : lockerInfo_;
  }
  /**
   * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
   */
  @java.lang.Override
  public com.comdex.locker.v1beta1.LockerOrBuilder getLockerInfoOrBuilder() {
    return lockerInfo_ == null ? com.comdex.locker.v1beta1.Locker.getDefaultInstance() : lockerInfo_;
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
    if (lockerInfo_ != null) {
      output.writeMessage(1, getLockerInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lockerInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLockerInfo());
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
    if (!(obj instanceof com.comdex.locker.v1beta1.QueryLockerInfoResponse)) {
      return super.equals(obj);
    }
    com.comdex.locker.v1beta1.QueryLockerInfoResponse other = (com.comdex.locker.v1beta1.QueryLockerInfoResponse) obj;

    if (hasLockerInfo() != other.hasLockerInfo()) return false;
    if (hasLockerInfo()) {
      if (!getLockerInfo()
          .equals(other.getLockerInfo())) return false;
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
    if (hasLockerInfo()) {
      hash = (37 * hash) + LOCKER_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getLockerInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse parseFrom(
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
  public static Builder newBuilder(com.comdex.locker.v1beta1.QueryLockerInfoResponse prototype) {
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
   * Protobuf type {@code comdex.locker.v1beta1.QueryLockerInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.locker.v1beta1.QueryLockerInfoResponse)
      com.comdex.locker.v1beta1.QueryLockerInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.locker.v1beta1.QueryProto.internal_static_comdex_locker_v1beta1_QueryLockerInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.locker.v1beta1.QueryProto.internal_static_comdex_locker_v1beta1_QueryLockerInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.locker.v1beta1.QueryLockerInfoResponse.class, com.comdex.locker.v1beta1.QueryLockerInfoResponse.Builder.class);
    }

    // Construct using com.comdex.locker.v1beta1.QueryLockerInfoResponse.newBuilder()
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
      lockerInfo_ = null;
      if (lockerInfoBuilder_ != null) {
        lockerInfoBuilder_.dispose();
        lockerInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.locker.v1beta1.QueryProto.internal_static_comdex_locker_v1beta1_QueryLockerInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.comdex.locker.v1beta1.QueryLockerInfoResponse getDefaultInstanceForType() {
      return com.comdex.locker.v1beta1.QueryLockerInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.locker.v1beta1.QueryLockerInfoResponse build() {
      com.comdex.locker.v1beta1.QueryLockerInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.locker.v1beta1.QueryLockerInfoResponse buildPartial() {
      com.comdex.locker.v1beta1.QueryLockerInfoResponse result = new com.comdex.locker.v1beta1.QueryLockerInfoResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.locker.v1beta1.QueryLockerInfoResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lockerInfo_ = lockerInfoBuilder_ == null
            ? lockerInfo_
            : lockerInfoBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.locker.v1beta1.QueryLockerInfoResponse) {
        return mergeFrom((com.comdex.locker.v1beta1.QueryLockerInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.locker.v1beta1.QueryLockerInfoResponse other) {
      if (other == com.comdex.locker.v1beta1.QueryLockerInfoResponse.getDefaultInstance()) return this;
      if (other.hasLockerInfo()) {
        mergeLockerInfo(other.getLockerInfo());
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
                  getLockerInfoFieldBuilder().getBuilder(),
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

    private com.comdex.locker.v1beta1.Locker lockerInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.comdex.locker.v1beta1.Locker, com.comdex.locker.v1beta1.Locker.Builder, com.comdex.locker.v1beta1.LockerOrBuilder> lockerInfoBuilder_;
    /**
     * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
     * @return Whether the lockerInfo field is set.
     */
    public boolean hasLockerInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
     * @return The lockerInfo.
     */
    public com.comdex.locker.v1beta1.Locker getLockerInfo() {
      if (lockerInfoBuilder_ == null) {
        return lockerInfo_ == null ? com.comdex.locker.v1beta1.Locker.getDefaultInstance() : lockerInfo_;
      } else {
        return lockerInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
     */
    public Builder setLockerInfo(com.comdex.locker.v1beta1.Locker value) {
      if (lockerInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lockerInfo_ = value;
      } else {
        lockerInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
     */
    public Builder setLockerInfo(
        com.comdex.locker.v1beta1.Locker.Builder builderForValue) {
      if (lockerInfoBuilder_ == null) {
        lockerInfo_ = builderForValue.build();
      } else {
        lockerInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
     */
    public Builder mergeLockerInfo(com.comdex.locker.v1beta1.Locker value) {
      if (lockerInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          lockerInfo_ != null &&
          lockerInfo_ != com.comdex.locker.v1beta1.Locker.getDefaultInstance()) {
          getLockerInfoBuilder().mergeFrom(value);
        } else {
          lockerInfo_ = value;
        }
      } else {
        lockerInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
     */
    public Builder clearLockerInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lockerInfo_ = null;
      if (lockerInfoBuilder_ != null) {
        lockerInfoBuilder_.dispose();
        lockerInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
     */
    public com.comdex.locker.v1beta1.Locker.Builder getLockerInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLockerInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
     */
    public com.comdex.locker.v1beta1.LockerOrBuilder getLockerInfoOrBuilder() {
      if (lockerInfoBuilder_ != null) {
        return lockerInfoBuilder_.getMessageOrBuilder();
      } else {
        return lockerInfo_ == null ?
            com.comdex.locker.v1beta1.Locker.getDefaultInstance() : lockerInfo_;
      }
    }
    /**
     * <code>.comdex.locker.v1beta1.Locker locker_info = 1 [json_name = "lockerInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locker_info&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.comdex.locker.v1beta1.Locker, com.comdex.locker.v1beta1.Locker.Builder, com.comdex.locker.v1beta1.LockerOrBuilder> 
        getLockerInfoFieldBuilder() {
      if (lockerInfoBuilder_ == null) {
        lockerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.comdex.locker.v1beta1.Locker, com.comdex.locker.v1beta1.Locker.Builder, com.comdex.locker.v1beta1.LockerOrBuilder>(
                getLockerInfo(),
                getParentForChildren(),
                isClean());
        lockerInfo_ = null;
      }
      return lockerInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:comdex.locker.v1beta1.QueryLockerInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:comdex.locker.v1beta1.QueryLockerInfoResponse)
  private static final com.comdex.locker.v1beta1.QueryLockerInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.locker.v1beta1.QueryLockerInfoResponse();
  }

  public static com.comdex.locker.v1beta1.QueryLockerInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryLockerInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryLockerInfoResponse>() {
    @java.lang.Override
    public QueryLockerInfoResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryLockerInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryLockerInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.locker.v1beta1.QueryLockerInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

