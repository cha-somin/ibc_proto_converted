// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/query.proto

package com.axelar.nexus.v1beta1;

/**
 * Protobuf type {@code axelar.nexus.v1beta1.FeeInfoResponse}
 */
public final class FeeInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.nexus.v1beta1.FeeInfoResponse)
    FeeInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeeInfoResponse.newBuilder() to construct.
  private FeeInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeeInfoResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeeInfoResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_FeeInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_FeeInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.nexus.v1beta1.FeeInfoResponse.class, com.axelar.nexus.v1beta1.FeeInfoResponse.Builder.class);
  }

  public static final int FEE_INFO_FIELD_NUMBER = 1;
  private com.axelar.nexus.exported.v1beta1.FeeInfo feeInfo_;
  /**
   * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
   * @return Whether the feeInfo field is set.
   */
  @java.lang.Override
  public boolean hasFeeInfo() {
    return feeInfo_ != null;
  }
  /**
   * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
   * @return The feeInfo.
   */
  @java.lang.Override
  public com.axelar.nexus.exported.v1beta1.FeeInfo getFeeInfo() {
    return feeInfo_ == null ? com.axelar.nexus.exported.v1beta1.FeeInfo.getDefaultInstance() : feeInfo_;
  }
  /**
   * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
   */
  @java.lang.Override
  public com.axelar.nexus.exported.v1beta1.FeeInfoOrBuilder getFeeInfoOrBuilder() {
    return feeInfo_ == null ? com.axelar.nexus.exported.v1beta1.FeeInfo.getDefaultInstance() : feeInfo_;
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
    if (feeInfo_ != null) {
      output.writeMessage(1, getFeeInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (feeInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFeeInfo());
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
    if (!(obj instanceof com.axelar.nexus.v1beta1.FeeInfoResponse)) {
      return super.equals(obj);
    }
    com.axelar.nexus.v1beta1.FeeInfoResponse other = (com.axelar.nexus.v1beta1.FeeInfoResponse) obj;

    if (hasFeeInfo() != other.hasFeeInfo()) return false;
    if (hasFeeInfo()) {
      if (!getFeeInfo()
          .equals(other.getFeeInfo())) return false;
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
    if (hasFeeInfo()) {
      hash = (37 * hash) + FEE_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getFeeInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoResponse parseFrom(
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
  public static Builder newBuilder(com.axelar.nexus.v1beta1.FeeInfoResponse prototype) {
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
   * Protobuf type {@code axelar.nexus.v1beta1.FeeInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.nexus.v1beta1.FeeInfoResponse)
      com.axelar.nexus.v1beta1.FeeInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_FeeInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_FeeInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.nexus.v1beta1.FeeInfoResponse.class, com.axelar.nexus.v1beta1.FeeInfoResponse.Builder.class);
    }

    // Construct using com.axelar.nexus.v1beta1.FeeInfoResponse.newBuilder()
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
      feeInfo_ = null;
      if (feeInfoBuilder_ != null) {
        feeInfoBuilder_.dispose();
        feeInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_FeeInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.FeeInfoResponse getDefaultInstanceForType() {
      return com.axelar.nexus.v1beta1.FeeInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.FeeInfoResponse build() {
      com.axelar.nexus.v1beta1.FeeInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.FeeInfoResponse buildPartial() {
      com.axelar.nexus.v1beta1.FeeInfoResponse result = new com.axelar.nexus.v1beta1.FeeInfoResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.nexus.v1beta1.FeeInfoResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.feeInfo_ = feeInfoBuilder_ == null
            ? feeInfo_
            : feeInfoBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.nexus.v1beta1.FeeInfoResponse) {
        return mergeFrom((com.axelar.nexus.v1beta1.FeeInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.nexus.v1beta1.FeeInfoResponse other) {
      if (other == com.axelar.nexus.v1beta1.FeeInfoResponse.getDefaultInstance()) return this;
      if (other.hasFeeInfo()) {
        mergeFeeInfo(other.getFeeInfo());
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
                  getFeeInfoFieldBuilder().getBuilder(),
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

    private com.axelar.nexus.exported.v1beta1.FeeInfo feeInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.axelar.nexus.exported.v1beta1.FeeInfo, com.axelar.nexus.exported.v1beta1.FeeInfo.Builder, com.axelar.nexus.exported.v1beta1.FeeInfoOrBuilder> feeInfoBuilder_;
    /**
     * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
     * @return Whether the feeInfo field is set.
     */
    public boolean hasFeeInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
     * @return The feeInfo.
     */
    public com.axelar.nexus.exported.v1beta1.FeeInfo getFeeInfo() {
      if (feeInfoBuilder_ == null) {
        return feeInfo_ == null ? com.axelar.nexus.exported.v1beta1.FeeInfo.getDefaultInstance() : feeInfo_;
      } else {
        return feeInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
     */
    public Builder setFeeInfo(com.axelar.nexus.exported.v1beta1.FeeInfo value) {
      if (feeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        feeInfo_ = value;
      } else {
        feeInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
     */
    public Builder setFeeInfo(
        com.axelar.nexus.exported.v1beta1.FeeInfo.Builder builderForValue) {
      if (feeInfoBuilder_ == null) {
        feeInfo_ = builderForValue.build();
      } else {
        feeInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
     */
    public Builder mergeFeeInfo(com.axelar.nexus.exported.v1beta1.FeeInfo value) {
      if (feeInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          feeInfo_ != null &&
          feeInfo_ != com.axelar.nexus.exported.v1beta1.FeeInfo.getDefaultInstance()) {
          getFeeInfoBuilder().mergeFrom(value);
        } else {
          feeInfo_ = value;
        }
      } else {
        feeInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
     */
    public Builder clearFeeInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      feeInfo_ = null;
      if (feeInfoBuilder_ != null) {
        feeInfoBuilder_.dispose();
        feeInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
     */
    public com.axelar.nexus.exported.v1beta1.FeeInfo.Builder getFeeInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFeeInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
     */
    public com.axelar.nexus.exported.v1beta1.FeeInfoOrBuilder getFeeInfoOrBuilder() {
      if (feeInfoBuilder_ != null) {
        return feeInfoBuilder_.getMessageOrBuilder();
      } else {
        return feeInfo_ == null ?
            com.axelar.nexus.exported.v1beta1.FeeInfo.getDefaultInstance() : feeInfo_;
      }
    }
    /**
     * <code>.axelar.nexus.exported.v1beta1.FeeInfo fee_info = 1 [json_name = "feeInfo"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.axelar.nexus.exported.v1beta1.FeeInfo, com.axelar.nexus.exported.v1beta1.FeeInfo.Builder, com.axelar.nexus.exported.v1beta1.FeeInfoOrBuilder> 
        getFeeInfoFieldBuilder() {
      if (feeInfoBuilder_ == null) {
        feeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.axelar.nexus.exported.v1beta1.FeeInfo, com.axelar.nexus.exported.v1beta1.FeeInfo.Builder, com.axelar.nexus.exported.v1beta1.FeeInfoOrBuilder>(
                getFeeInfo(),
                getParentForChildren(),
                isClean());
        feeInfo_ = null;
      }
      return feeInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:axelar.nexus.v1beta1.FeeInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:axelar.nexus.v1beta1.FeeInfoResponse)
  private static final com.axelar.nexus.v1beta1.FeeInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.nexus.v1beta1.FeeInfoResponse();
  }

  public static com.axelar.nexus.v1beta1.FeeInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeeInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<FeeInfoResponse>() {
    @java.lang.Override
    public FeeInfoResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeeInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeeInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.nexus.v1beta1.FeeInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

