// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stargaze/globalfee/v1/query.proto

package com.publicawesome.stargaze.globalfee.v1;

/**
 * Protobuf type {@code publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse}
 */
public final class QueryContractAuthorizationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse)
    QueryContractAuthorizationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryContractAuthorizationResponse.newBuilder() to construct.
  private QueryContractAuthorizationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryContractAuthorizationResponse() {
    methods_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryContractAuthorizationResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.publicawesome.stargaze.globalfee.v1.QueryProto.internal_static_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.publicawesome.stargaze.globalfee.v1.QueryProto.internal_static_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse.class, com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse.Builder.class);
  }

  public static final int METHODS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList methods_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string methods = 1 [json_name = "methods"];</code>
   * @return A list containing the methods.
   */
  public com.google.protobuf.ProtocolStringList
      getMethodsList() {
    return methods_;
  }
  /**
   * <code>repeated string methods = 1 [json_name = "methods"];</code>
   * @return The count of methods.
   */
  public int getMethodsCount() {
    return methods_.size();
  }
  /**
   * <code>repeated string methods = 1 [json_name = "methods"];</code>
   * @param index The index of the element to return.
   * @return The methods at the given index.
   */
  public java.lang.String getMethods(int index) {
    return methods_.get(index);
  }
  /**
   * <code>repeated string methods = 1 [json_name = "methods"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the methods at the given index.
   */
  public com.google.protobuf.ByteString
      getMethodsBytes(int index) {
    return methods_.getByteString(index);
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
    for (int i = 0; i < methods_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, methods_.getRaw(i));
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
      for (int i = 0; i < methods_.size(); i++) {
        dataSize += computeStringSizeNoTag(methods_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMethodsList().size();
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
    if (!(obj instanceof com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse)) {
      return super.equals(obj);
    }
    com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse other = (com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse) obj;

    if (!getMethodsList()
        .equals(other.getMethodsList())) return false;
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
    if (getMethodsCount() > 0) {
      hash = (37 * hash) + METHODS_FIELD_NUMBER;
      hash = (53 * hash) + getMethodsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse parseFrom(
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
  public static Builder newBuilder(com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse prototype) {
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
   * Protobuf type {@code publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse)
      com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.publicawesome.stargaze.globalfee.v1.QueryProto.internal_static_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.publicawesome.stargaze.globalfee.v1.QueryProto.internal_static_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse.class, com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse.Builder.class);
    }

    // Construct using com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse.newBuilder()
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
      methods_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.publicawesome.stargaze.globalfee.v1.QueryProto.internal_static_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationResponse_descriptor;
    }

    @java.lang.Override
    public com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse getDefaultInstanceForType() {
      return com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse build() {
      com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse buildPartial() {
      com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse result = new com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        methods_.makeImmutable();
        result.methods_ = methods_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse) {
        return mergeFrom((com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse other) {
      if (other == com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse.getDefaultInstance()) return this;
      if (!other.methods_.isEmpty()) {
        if (methods_.isEmpty()) {
          methods_ = other.methods_;
          bitField0_ |= 0x00000001;
        } else {
          ensureMethodsIsMutable();
          methods_.addAll(other.methods_);
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
              ensureMethodsIsMutable();
              methods_.add(s);
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

    private com.google.protobuf.LazyStringArrayList methods_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureMethodsIsMutable() {
      if (!methods_.isModifiable()) {
        methods_ = new com.google.protobuf.LazyStringArrayList(methods_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string methods = 1 [json_name = "methods"];</code>
     * @return A list containing the methods.
     */
    public com.google.protobuf.ProtocolStringList
        getMethodsList() {
      methods_.makeImmutable();
      return methods_;
    }
    /**
     * <code>repeated string methods = 1 [json_name = "methods"];</code>
     * @return The count of methods.
     */
    public int getMethodsCount() {
      return methods_.size();
    }
    /**
     * <code>repeated string methods = 1 [json_name = "methods"];</code>
     * @param index The index of the element to return.
     * @return The methods at the given index.
     */
    public java.lang.String getMethods(int index) {
      return methods_.get(index);
    }
    /**
     * <code>repeated string methods = 1 [json_name = "methods"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the methods at the given index.
     */
    public com.google.protobuf.ByteString
        getMethodsBytes(int index) {
      return methods_.getByteString(index);
    }
    /**
     * <code>repeated string methods = 1 [json_name = "methods"];</code>
     * @param index The index to set the value at.
     * @param value The methods to set.
     * @return This builder for chaining.
     */
    public Builder setMethods(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureMethodsIsMutable();
      methods_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string methods = 1 [json_name = "methods"];</code>
     * @param value The methods to add.
     * @return This builder for chaining.
     */
    public Builder addMethods(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureMethodsIsMutable();
      methods_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string methods = 1 [json_name = "methods"];</code>
     * @param values The methods to add.
     * @return This builder for chaining.
     */
    public Builder addAllMethods(
        java.lang.Iterable<java.lang.String> values) {
      ensureMethodsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, methods_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string methods = 1 [json_name = "methods"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMethods() {
      methods_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string methods = 1 [json_name = "methods"];</code>
     * @param value The bytes of the methods to add.
     * @return This builder for chaining.
     */
    public Builder addMethodsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureMethodsIsMutable();
      methods_.add(value);
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


    // @@protoc_insertion_point(builder_scope:publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse)
  }

  // @@protoc_insertion_point(class_scope:publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse)
  private static final com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse();
  }

  public static com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryContractAuthorizationResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryContractAuthorizationResponse>() {
    @java.lang.Override
    public QueryContractAuthorizationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryContractAuthorizationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryContractAuthorizationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

