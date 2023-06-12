// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rmintreward/query.proto

package com.stafihub.stafihub.rmintreward;

/**
 * Protobuf type {@code stafihub.stafihub.rmintreward.QueryUserActsResponse}
 */
public final class QueryUserActsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.rmintreward.QueryUserActsResponse)
    QueryUserActsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryUserActsResponse.newBuilder() to construct.
  private QueryUserActsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryUserActsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryUserActsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.rmintreward.QueryProto.internal_static_stafihub_stafihub_rmintreward_QueryUserActsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.rmintreward.QueryProto.internal_static_stafihub_stafihub_rmintreward_QueryUserActsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.rmintreward.QueryUserActsResponse.class, com.stafihub.stafihub.rmintreward.QueryUserActsResponse.Builder.class);
  }

  public static final int ACTS_FIELD_NUMBER = 1;
  private com.stafihub.stafihub.rmintreward.Acts acts_;
  /**
   * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
   * @return Whether the acts field is set.
   */
  @java.lang.Override
  public boolean hasActs() {
    return acts_ != null;
  }
  /**
   * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
   * @return The acts.
   */
  @java.lang.Override
  public com.stafihub.stafihub.rmintreward.Acts getActs() {
    return acts_ == null ? com.stafihub.stafihub.rmintreward.Acts.getDefaultInstance() : acts_;
  }
  /**
   * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
   */
  @java.lang.Override
  public com.stafihub.stafihub.rmintreward.ActsOrBuilder getActsOrBuilder() {
    return acts_ == null ? com.stafihub.stafihub.rmintreward.Acts.getDefaultInstance() : acts_;
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
    if (acts_ != null) {
      output.writeMessage(1, getActs());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (acts_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getActs());
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
    if (!(obj instanceof com.stafihub.stafihub.rmintreward.QueryUserActsResponse)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.rmintreward.QueryUserActsResponse other = (com.stafihub.stafihub.rmintreward.QueryUserActsResponse) obj;

    if (hasActs() != other.hasActs()) return false;
    if (hasActs()) {
      if (!getActs()
          .equals(other.getActs())) return false;
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
    if (hasActs()) {
      hash = (37 * hash) + ACTS_FIELD_NUMBER;
      hash = (53 * hash) + getActs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.rmintreward.QueryUserActsResponse prototype) {
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
   * Protobuf type {@code stafihub.stafihub.rmintreward.QueryUserActsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.rmintreward.QueryUserActsResponse)
      com.stafihub.stafihub.rmintreward.QueryUserActsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.rmintreward.QueryProto.internal_static_stafihub_stafihub_rmintreward_QueryUserActsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.rmintreward.QueryProto.internal_static_stafihub_stafihub_rmintreward_QueryUserActsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.rmintreward.QueryUserActsResponse.class, com.stafihub.stafihub.rmintreward.QueryUserActsResponse.Builder.class);
    }

    // Construct using com.stafihub.stafihub.rmintreward.QueryUserActsResponse.newBuilder()
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
      acts_ = null;
      if (actsBuilder_ != null) {
        actsBuilder_.dispose();
        actsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.rmintreward.QueryProto.internal_static_stafihub_stafihub_rmintreward_QueryUserActsResponse_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rmintreward.QueryUserActsResponse getDefaultInstanceForType() {
      return com.stafihub.stafihub.rmintreward.QueryUserActsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.rmintreward.QueryUserActsResponse build() {
      com.stafihub.stafihub.rmintreward.QueryUserActsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rmintreward.QueryUserActsResponse buildPartial() {
      com.stafihub.stafihub.rmintreward.QueryUserActsResponse result = new com.stafihub.stafihub.rmintreward.QueryUserActsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.rmintreward.QueryUserActsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.acts_ = actsBuilder_ == null
            ? acts_
            : actsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.rmintreward.QueryUserActsResponse) {
        return mergeFrom((com.stafihub.stafihub.rmintreward.QueryUserActsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.rmintreward.QueryUserActsResponse other) {
      if (other == com.stafihub.stafihub.rmintreward.QueryUserActsResponse.getDefaultInstance()) return this;
      if (other.hasActs()) {
        mergeActs(other.getActs());
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
                  getActsFieldBuilder().getBuilder(),
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

    private com.stafihub.stafihub.rmintreward.Acts acts_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stafihub.stafihub.rmintreward.Acts, com.stafihub.stafihub.rmintreward.Acts.Builder, com.stafihub.stafihub.rmintreward.ActsOrBuilder> actsBuilder_;
    /**
     * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
     * @return Whether the acts field is set.
     */
    public boolean hasActs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
     * @return The acts.
     */
    public com.stafihub.stafihub.rmintreward.Acts getActs() {
      if (actsBuilder_ == null) {
        return acts_ == null ? com.stafihub.stafihub.rmintreward.Acts.getDefaultInstance() : acts_;
      } else {
        return actsBuilder_.getMessage();
      }
    }
    /**
     * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
     */
    public Builder setActs(com.stafihub.stafihub.rmintreward.Acts value) {
      if (actsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        acts_ = value;
      } else {
        actsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
     */
    public Builder setActs(
        com.stafihub.stafihub.rmintreward.Acts.Builder builderForValue) {
      if (actsBuilder_ == null) {
        acts_ = builderForValue.build();
      } else {
        actsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
     */
    public Builder mergeActs(com.stafihub.stafihub.rmintreward.Acts value) {
      if (actsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          acts_ != null &&
          acts_ != com.stafihub.stafihub.rmintreward.Acts.getDefaultInstance()) {
          getActsBuilder().mergeFrom(value);
        } else {
          acts_ = value;
        }
      } else {
        actsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
     */
    public Builder clearActs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      acts_ = null;
      if (actsBuilder_ != null) {
        actsBuilder_.dispose();
        actsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
     */
    public com.stafihub.stafihub.rmintreward.Acts.Builder getActsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getActsFieldBuilder().getBuilder();
    }
    /**
     * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
     */
    public com.stafihub.stafihub.rmintreward.ActsOrBuilder getActsOrBuilder() {
      if (actsBuilder_ != null) {
        return actsBuilder_.getMessageOrBuilder();
      } else {
        return acts_ == null ?
            com.stafihub.stafihub.rmintreward.Acts.getDefaultInstance() : acts_;
      }
    }
    /**
     * <code>.stafihub.stafihub.rmintreward.Acts acts = 1 [json_name = "acts"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stafihub.stafihub.rmintreward.Acts, com.stafihub.stafihub.rmintreward.Acts.Builder, com.stafihub.stafihub.rmintreward.ActsOrBuilder> 
        getActsFieldBuilder() {
      if (actsBuilder_ == null) {
        actsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stafihub.stafihub.rmintreward.Acts, com.stafihub.stafihub.rmintreward.Acts.Builder, com.stafihub.stafihub.rmintreward.ActsOrBuilder>(
                getActs(),
                getParentForChildren(),
                isClean());
        acts_ = null;
      }
      return actsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.rmintreward.QueryUserActsResponse)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.rmintreward.QueryUserActsResponse)
  private static final com.stafihub.stafihub.rmintreward.QueryUserActsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.rmintreward.QueryUserActsResponse();
  }

  public static com.stafihub.stafihub.rmintreward.QueryUserActsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryUserActsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryUserActsResponse>() {
    @java.lang.Override
    public QueryUserActsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryUserActsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryUserActsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.rmintreward.QueryUserActsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

