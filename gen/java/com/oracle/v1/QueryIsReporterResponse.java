// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/oracle/v1/query.proto

package com.oracle.v1;

/**
 * <pre>
 * QueryIsReporterResponse is response type for the Query/Reporter RPC method.
 * </pre>
 *
 * Protobuf type {@code oracle.v1.QueryIsReporterResponse}
 */
public final class QueryIsReporterResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:oracle.v1.QueryIsReporterResponse)
    QueryIsReporterResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryIsReporterResponse.newBuilder() to construct.
  private QueryIsReporterResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryIsReporterResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryIsReporterResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryIsReporterResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryIsReporterResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.oracle.v1.QueryIsReporterResponse.class, com.oracle.v1.QueryIsReporterResponse.Builder.class);
  }

  public static final int IS_REPORTER_FIELD_NUMBER = 1;
  private boolean isReporter_ = false;
  /**
   * <pre>
   * IsReporter is true if this account has been granted by validator
   * </pre>
   *
   * <code>bool is_reporter = 1 [json_name = "isReporter"];</code>
   * @return The isReporter.
   */
  @java.lang.Override
  public boolean getIsReporter() {
    return isReporter_;
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
    if (isReporter_ != false) {
      output.writeBool(1, isReporter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isReporter_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isReporter_);
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
    if (!(obj instanceof com.oracle.v1.QueryIsReporterResponse)) {
      return super.equals(obj);
    }
    com.oracle.v1.QueryIsReporterResponse other = (com.oracle.v1.QueryIsReporterResponse) obj;

    if (getIsReporter()
        != other.getIsReporter()) return false;
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
    hash = (37 * hash) + IS_REPORTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsReporter());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.oracle.v1.QueryIsReporterResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.v1.QueryIsReporterResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.v1.QueryIsReporterResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.v1.QueryIsReporterResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.v1.QueryIsReporterResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.v1.QueryIsReporterResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.v1.QueryIsReporterResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oracle.v1.QueryIsReporterResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.oracle.v1.QueryIsReporterResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.oracle.v1.QueryIsReporterResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oracle.v1.QueryIsReporterResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oracle.v1.QueryIsReporterResponse parseFrom(
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
  public static Builder newBuilder(com.oracle.v1.QueryIsReporterResponse prototype) {
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
   * QueryIsReporterResponse is response type for the Query/Reporter RPC method.
   * </pre>
   *
   * Protobuf type {@code oracle.v1.QueryIsReporterResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:oracle.v1.QueryIsReporterResponse)
      com.oracle.v1.QueryIsReporterResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryIsReporterResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryIsReporterResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.oracle.v1.QueryIsReporterResponse.class, com.oracle.v1.QueryIsReporterResponse.Builder.class);
    }

    // Construct using com.oracle.v1.QueryIsReporterResponse.newBuilder()
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
      isReporter_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryIsReporterResponse_descriptor;
    }

    @java.lang.Override
    public com.oracle.v1.QueryIsReporterResponse getDefaultInstanceForType() {
      return com.oracle.v1.QueryIsReporterResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.oracle.v1.QueryIsReporterResponse build() {
      com.oracle.v1.QueryIsReporterResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.oracle.v1.QueryIsReporterResponse buildPartial() {
      com.oracle.v1.QueryIsReporterResponse result = new com.oracle.v1.QueryIsReporterResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.oracle.v1.QueryIsReporterResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isReporter_ = isReporter_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.oracle.v1.QueryIsReporterResponse) {
        return mergeFrom((com.oracle.v1.QueryIsReporterResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.oracle.v1.QueryIsReporterResponse other) {
      if (other == com.oracle.v1.QueryIsReporterResponse.getDefaultInstance()) return this;
      if (other.getIsReporter() != false) {
        setIsReporter(other.getIsReporter());
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
              isReporter_ = input.readBool();
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

    private boolean isReporter_ ;
    /**
     * <pre>
     * IsReporter is true if this account has been granted by validator
     * </pre>
     *
     * <code>bool is_reporter = 1 [json_name = "isReporter"];</code>
     * @return The isReporter.
     */
    @java.lang.Override
    public boolean getIsReporter() {
      return isReporter_;
    }
    /**
     * <pre>
     * IsReporter is true if this account has been granted by validator
     * </pre>
     *
     * <code>bool is_reporter = 1 [json_name = "isReporter"];</code>
     * @param value The isReporter to set.
     * @return This builder for chaining.
     */
    public Builder setIsReporter(boolean value) {

      isReporter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IsReporter is true if this account has been granted by validator
     * </pre>
     *
     * <code>bool is_reporter = 1 [json_name = "isReporter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsReporter() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isReporter_ = false;
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


    // @@protoc_insertion_point(builder_scope:oracle.v1.QueryIsReporterResponse)
  }

  // @@protoc_insertion_point(class_scope:oracle.v1.QueryIsReporterResponse)
  private static final com.oracle.v1.QueryIsReporterResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.oracle.v1.QueryIsReporterResponse();
  }

  public static com.oracle.v1.QueryIsReporterResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryIsReporterResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryIsReporterResponse>() {
    @java.lang.Override
    public QueryIsReporterResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryIsReporterResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryIsReporterResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.oracle.v1.QueryIsReporterResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

