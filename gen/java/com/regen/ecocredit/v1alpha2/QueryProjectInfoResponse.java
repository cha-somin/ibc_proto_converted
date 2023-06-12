// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/query.proto

package com.regen.ecocredit.v1alpha2;

/**
 * <pre>
 * QueryProjectInfoResponse is the Query/Project response type.
 * </pre>
 *
 * Protobuf type {@code regen.ecocredit.v1alpha2.QueryProjectInfoResponse}
 */
public final class QueryProjectInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.ecocredit.v1alpha2.QueryProjectInfoResponse)
    QueryProjectInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryProjectInfoResponse.newBuilder() to construct.
  private QueryProjectInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryProjectInfoResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryProjectInfoResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryProjectInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryProjectInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse.class, com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse.Builder.class);
  }

  public static final int INFO_FIELD_NUMBER = 1;
  private com.regen.ecocredit.v1alpha2.ProjectInfo info_;
  /**
   * <pre>
   * info is the ProjectInfo for the project.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <pre>
   * info is the ProjectInfo for the project.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
   * @return The info.
   */
  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.ProjectInfo getInfo() {
    return info_ == null ? com.regen.ecocredit.v1alpha2.ProjectInfo.getDefaultInstance() : info_;
  }
  /**
   * <pre>
   * info is the ProjectInfo for the project.
   * </pre>
   *
   * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
   */
  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.ProjectInfoOrBuilder getInfoOrBuilder() {
    return info_ == null ? com.regen.ecocredit.v1alpha2.ProjectInfo.getDefaultInstance() : info_;
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
    if (info_ != null) {
      output.writeMessage(1, getInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInfo());
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
    if (!(obj instanceof com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse)) {
      return super.equals(obj);
    }
    com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse other = (com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse) obj;

    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
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
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse parseFrom(
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
  public static Builder newBuilder(com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse prototype) {
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
   * QueryProjectInfoResponse is the Query/Project response type.
   * </pre>
   *
   * Protobuf type {@code regen.ecocredit.v1alpha2.QueryProjectInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.ecocredit.v1alpha2.QueryProjectInfoResponse)
      com.regen.ecocredit.v1alpha2.QueryProjectInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryProjectInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryProjectInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse.class, com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse.Builder.class);
    }

    // Construct using com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse.newBuilder()
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
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryProjectInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse getDefaultInstanceForType() {
      return com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse build() {
      com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse buildPartial() {
      com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse result = new com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.info_ = infoBuilder_ == null
            ? info_
            : infoBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse) {
        return mergeFrom((com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse other) {
      if (other == com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse.getDefaultInstance()) return this;
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
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
                  getInfoFieldBuilder().getBuilder(),
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

    private com.regen.ecocredit.v1alpha2.ProjectInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.regen.ecocredit.v1alpha2.ProjectInfo, com.regen.ecocredit.v1alpha2.ProjectInfo.Builder, com.regen.ecocredit.v1alpha2.ProjectInfoOrBuilder> infoBuilder_;
    /**
     * <pre>
     * info is the ProjectInfo for the project.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * info is the ProjectInfo for the project.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
     * @return The info.
     */
    public com.regen.ecocredit.v1alpha2.ProjectInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? com.regen.ecocredit.v1alpha2.ProjectInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * info is the ProjectInfo for the project.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
     */
    public Builder setInfo(com.regen.ecocredit.v1alpha2.ProjectInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
      } else {
        infoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * info is the ProjectInfo for the project.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
     */
    public Builder setInfo(
        com.regen.ecocredit.v1alpha2.ProjectInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * info is the ProjectInfo for the project.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
     */
    public Builder mergeInfo(com.regen.ecocredit.v1alpha2.ProjectInfo value) {
      if (infoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          info_ != null &&
          info_ != com.regen.ecocredit.v1alpha2.ProjectInfo.getDefaultInstance()) {
          getInfoBuilder().mergeFrom(value);
        } else {
          info_ = value;
        }
      } else {
        infoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * info is the ProjectInfo for the project.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
     */
    public Builder clearInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * info is the ProjectInfo for the project.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
     */
    public com.regen.ecocredit.v1alpha2.ProjectInfo.Builder getInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * info is the ProjectInfo for the project.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
     */
    public com.regen.ecocredit.v1alpha2.ProjectInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            com.regen.ecocredit.v1alpha2.ProjectInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <pre>
     * info is the ProjectInfo for the project.
     * </pre>
     *
     * <code>.regen.ecocredit.v1alpha2.ProjectInfo info = 1 [json_name = "info"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.regen.ecocredit.v1alpha2.ProjectInfo, com.regen.ecocredit.v1alpha2.ProjectInfo.Builder, com.regen.ecocredit.v1alpha2.ProjectInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.regen.ecocredit.v1alpha2.ProjectInfo, com.regen.ecocredit.v1alpha2.ProjectInfo.Builder, com.regen.ecocredit.v1alpha2.ProjectInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:regen.ecocredit.v1alpha2.QueryProjectInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:regen.ecocredit.v1alpha2.QueryProjectInfoResponse)
  private static final com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse();
  }

  public static com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryProjectInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryProjectInfoResponse>() {
    @java.lang.Override
    public QueryProjectInfoResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryProjectInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryProjectInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

