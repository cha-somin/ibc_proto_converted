// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/oracle/v1/query.proto

package com.oracle.v1;

/**
 * <pre>
 * QueryReportersResponse is response type for the Query/Reporters RPC method.
 * </pre>
 *
 * Protobuf type {@code oracle.v1.QueryReportersResponse}
 */
public final class QueryReportersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:oracle.v1.QueryReportersResponse)
    QueryReportersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryReportersResponse.newBuilder() to construct.
  private QueryReportersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryReportersResponse() {
    reporter_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryReportersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryReportersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryReportersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.oracle.v1.QueryReportersResponse.class, com.oracle.v1.QueryReportersResponse.Builder.class);
  }

  public static final int REPORTER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList reporter_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Reporter is a list of account addresses of reporters
   * </pre>
   *
   * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
   * @return A list containing the reporter.
   */
  public com.google.protobuf.ProtocolStringList
      getReporterList() {
    return reporter_;
  }
  /**
   * <pre>
   * Reporter is a list of account addresses of reporters
   * </pre>
   *
   * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
   * @return The count of reporter.
   */
  public int getReporterCount() {
    return reporter_.size();
  }
  /**
   * <pre>
   * Reporter is a list of account addresses of reporters
   * </pre>
   *
   * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
   * @param index The index of the element to return.
   * @return The reporter at the given index.
   */
  public java.lang.String getReporter(int index) {
    return reporter_.get(index);
  }
  /**
   * <pre>
   * Reporter is a list of account addresses of reporters
   * </pre>
   *
   * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the reporter at the given index.
   */
  public com.google.protobuf.ByteString
      getReporterBytes(int index) {
    return reporter_.getByteString(index);
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
    for (int i = 0; i < reporter_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reporter_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < reporter_.size(); i++) {
        dataSize += computeStringSizeNoTag(reporter_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getReporterList().size();
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
    if (!(obj instanceof com.oracle.v1.QueryReportersResponse)) {
      return super.equals(obj);
    }
    com.oracle.v1.QueryReportersResponse other = (com.oracle.v1.QueryReportersResponse) obj;

    if (!getReporterList()
        .equals(other.getReporterList())) return false;
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
    if (getReporterCount() > 0) {
      hash = (37 * hash) + REPORTER_FIELD_NUMBER;
      hash = (53 * hash) + getReporterList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.oracle.v1.QueryReportersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.v1.QueryReportersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.v1.QueryReportersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.v1.QueryReportersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.v1.QueryReportersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.v1.QueryReportersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.v1.QueryReportersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oracle.v1.QueryReportersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.oracle.v1.QueryReportersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.oracle.v1.QueryReportersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oracle.v1.QueryReportersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oracle.v1.QueryReportersResponse parseFrom(
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
  public static Builder newBuilder(com.oracle.v1.QueryReportersResponse prototype) {
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
   * QueryReportersResponse is response type for the Query/Reporters RPC method.
   * </pre>
   *
   * Protobuf type {@code oracle.v1.QueryReportersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:oracle.v1.QueryReportersResponse)
      com.oracle.v1.QueryReportersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryReportersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryReportersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.oracle.v1.QueryReportersResponse.class, com.oracle.v1.QueryReportersResponse.Builder.class);
    }

    // Construct using com.oracle.v1.QueryReportersResponse.newBuilder()
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
      reporter_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.oracle.v1.QueryProto.internal_static_oracle_v1_QueryReportersResponse_descriptor;
    }

    @java.lang.Override
    public com.oracle.v1.QueryReportersResponse getDefaultInstanceForType() {
      return com.oracle.v1.QueryReportersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.oracle.v1.QueryReportersResponse build() {
      com.oracle.v1.QueryReportersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.oracle.v1.QueryReportersResponse buildPartial() {
      com.oracle.v1.QueryReportersResponse result = new com.oracle.v1.QueryReportersResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.oracle.v1.QueryReportersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        reporter_.makeImmutable();
        result.reporter_ = reporter_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.oracle.v1.QueryReportersResponse) {
        return mergeFrom((com.oracle.v1.QueryReportersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.oracle.v1.QueryReportersResponse other) {
      if (other == com.oracle.v1.QueryReportersResponse.getDefaultInstance()) return this;
      if (!other.reporter_.isEmpty()) {
        if (reporter_.isEmpty()) {
          reporter_ = other.reporter_;
          bitField0_ |= 0x00000001;
        } else {
          ensureReporterIsMutable();
          reporter_.addAll(other.reporter_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureReporterIsMutable();
              reporter_.add(s);
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

    private com.google.protobuf.LazyStringArrayList reporter_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureReporterIsMutable() {
      if (!reporter_.isModifiable()) {
        reporter_ = new com.google.protobuf.LazyStringArrayList(reporter_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Reporter is a list of account addresses of reporters
     * </pre>
     *
     * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
     * @return A list containing the reporter.
     */
    public com.google.protobuf.ProtocolStringList
        getReporterList() {
      reporter_.makeImmutable();
      return reporter_;
    }
    /**
     * <pre>
     * Reporter is a list of account addresses of reporters
     * </pre>
     *
     * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
     * @return The count of reporter.
     */
    public int getReporterCount() {
      return reporter_.size();
    }
    /**
     * <pre>
     * Reporter is a list of account addresses of reporters
     * </pre>
     *
     * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
     * @param index The index of the element to return.
     * @return The reporter at the given index.
     */
    public java.lang.String getReporter(int index) {
      return reporter_.get(index);
    }
    /**
     * <pre>
     * Reporter is a list of account addresses of reporters
     * </pre>
     *
     * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the reporter at the given index.
     */
    public com.google.protobuf.ByteString
        getReporterBytes(int index) {
      return reporter_.getByteString(index);
    }
    /**
     * <pre>
     * Reporter is a list of account addresses of reporters
     * </pre>
     *
     * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
     * @param index The index to set the value at.
     * @param value The reporter to set.
     * @return This builder for chaining.
     */
    public Builder setReporter(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureReporterIsMutable();
      reporter_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reporter is a list of account addresses of reporters
     * </pre>
     *
     * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
     * @param value The reporter to add.
     * @return This builder for chaining.
     */
    public Builder addReporter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureReporterIsMutable();
      reporter_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reporter is a list of account addresses of reporters
     * </pre>
     *
     * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
     * @param values The reporter to add.
     * @return This builder for chaining.
     */
    public Builder addAllReporter(
        java.lang.Iterable<java.lang.String> values) {
      ensureReporterIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, reporter_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reporter is a list of account addresses of reporters
     * </pre>
     *
     * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReporter() {
      reporter_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reporter is a list of account addresses of reporters
     * </pre>
     *
     * <code>repeated string reporter = 1 [json_name = "reporter"];</code>
     * @param value The bytes of the reporter to add.
     * @return This builder for chaining.
     */
    public Builder addReporterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureReporterIsMutable();
      reporter_.add(value);
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


    // @@protoc_insertion_point(builder_scope:oracle.v1.QueryReportersResponse)
  }

  // @@protoc_insertion_point(class_scope:oracle.v1.QueryReportersResponse)
  private static final com.oracle.v1.QueryReportersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.oracle.v1.QueryReportersResponse();
  }

  public static com.oracle.v1.QueryReportersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryReportersResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryReportersResponse>() {
    @java.lang.Override
    public QueryReportersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryReportersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryReportersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.oracle.v1.QueryReportersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

