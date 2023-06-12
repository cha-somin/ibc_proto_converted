// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/query/v1beta1/bundles.proto

package com.kyve.query.v1beta1;

/**
 * <pre>
 * QueryFinalizedBundleResponse is the response type for the Query/Staker RPC method.
 * </pre>
 *
 * Protobuf type {@code kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse}
 */
public final class QueryFinalizedBundlesByHeightResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse)
    QueryFinalizedBundlesByHeightResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryFinalizedBundlesByHeightResponse.newBuilder() to construct.
  private QueryFinalizedBundlesByHeightResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryFinalizedBundlesByHeightResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryFinalizedBundlesByHeightResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.query.v1beta1.BundlesProto.internal_static_kyve_query_v1beta1_QueryFinalizedBundlesByHeightResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.query.v1beta1.BundlesProto.internal_static_kyve_query_v1beta1_QueryFinalizedBundlesByHeightResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse.class, com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse.Builder.class);
  }

  public static final int FINALIZED_BUNDLE_FIELD_NUMBER = 1;
  private com.kyve.bundles.v1beta1.FinalizedBundle finalizedBundle_;
  /**
   * <pre>
   * finalized_bundle ...
   * </pre>
   *
   * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
   * @return Whether the finalizedBundle field is set.
   */
  @java.lang.Override
  public boolean hasFinalizedBundle() {
    return finalizedBundle_ != null;
  }
  /**
   * <pre>
   * finalized_bundle ...
   * </pre>
   *
   * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
   * @return The finalizedBundle.
   */
  @java.lang.Override
  public com.kyve.bundles.v1beta1.FinalizedBundle getFinalizedBundle() {
    return finalizedBundle_ == null ? com.kyve.bundles.v1beta1.FinalizedBundle.getDefaultInstance() : finalizedBundle_;
  }
  /**
   * <pre>
   * finalized_bundle ...
   * </pre>
   *
   * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.kyve.bundles.v1beta1.FinalizedBundleOrBuilder getFinalizedBundleOrBuilder() {
    return finalizedBundle_ == null ? com.kyve.bundles.v1beta1.FinalizedBundle.getDefaultInstance() : finalizedBundle_;
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
    if (finalizedBundle_ != null) {
      output.writeMessage(1, getFinalizedBundle());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (finalizedBundle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFinalizedBundle());
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
    if (!(obj instanceof com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse)) {
      return super.equals(obj);
    }
    com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse other = (com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse) obj;

    if (hasFinalizedBundle() != other.hasFinalizedBundle()) return false;
    if (hasFinalizedBundle()) {
      if (!getFinalizedBundle()
          .equals(other.getFinalizedBundle())) return false;
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
    if (hasFinalizedBundle()) {
      hash = (37 * hash) + FINALIZED_BUNDLE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalizedBundle().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse parseFrom(
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
  public static Builder newBuilder(com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse prototype) {
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
   * QueryFinalizedBundleResponse is the response type for the Query/Staker RPC method.
   * </pre>
   *
   * Protobuf type {@code kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse)
      com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.query.v1beta1.BundlesProto.internal_static_kyve_query_v1beta1_QueryFinalizedBundlesByHeightResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.query.v1beta1.BundlesProto.internal_static_kyve_query_v1beta1_QueryFinalizedBundlesByHeightResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse.class, com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse.Builder.class);
    }

    // Construct using com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse.newBuilder()
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
      finalizedBundle_ = null;
      if (finalizedBundleBuilder_ != null) {
        finalizedBundleBuilder_.dispose();
        finalizedBundleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.query.v1beta1.BundlesProto.internal_static_kyve_query_v1beta1_QueryFinalizedBundlesByHeightResponse_descriptor;
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse getDefaultInstanceForType() {
      return com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse build() {
      com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse buildPartial() {
      com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse result = new com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.finalizedBundle_ = finalizedBundleBuilder_ == null
            ? finalizedBundle_
            : finalizedBundleBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse) {
        return mergeFrom((com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse other) {
      if (other == com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse.getDefaultInstance()) return this;
      if (other.hasFinalizedBundle()) {
        mergeFinalizedBundle(other.getFinalizedBundle());
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
                  getFinalizedBundleFieldBuilder().getBuilder(),
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

    private com.kyve.bundles.v1beta1.FinalizedBundle finalizedBundle_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kyve.bundles.v1beta1.FinalizedBundle, com.kyve.bundles.v1beta1.FinalizedBundle.Builder, com.kyve.bundles.v1beta1.FinalizedBundleOrBuilder> finalizedBundleBuilder_;
    /**
     * <pre>
     * finalized_bundle ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
     * @return Whether the finalizedBundle field is set.
     */
    public boolean hasFinalizedBundle() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * finalized_bundle ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
     * @return The finalizedBundle.
     */
    public com.kyve.bundles.v1beta1.FinalizedBundle getFinalizedBundle() {
      if (finalizedBundleBuilder_ == null) {
        return finalizedBundle_ == null ? com.kyve.bundles.v1beta1.FinalizedBundle.getDefaultInstance() : finalizedBundle_;
      } else {
        return finalizedBundleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * finalized_bundle ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
     */
    public Builder setFinalizedBundle(com.kyve.bundles.v1beta1.FinalizedBundle value) {
      if (finalizedBundleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        finalizedBundle_ = value;
      } else {
        finalizedBundleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * finalized_bundle ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
     */
    public Builder setFinalizedBundle(
        com.kyve.bundles.v1beta1.FinalizedBundle.Builder builderForValue) {
      if (finalizedBundleBuilder_ == null) {
        finalizedBundle_ = builderForValue.build();
      } else {
        finalizedBundleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * finalized_bundle ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeFinalizedBundle(com.kyve.bundles.v1beta1.FinalizedBundle value) {
      if (finalizedBundleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          finalizedBundle_ != null &&
          finalizedBundle_ != com.kyve.bundles.v1beta1.FinalizedBundle.getDefaultInstance()) {
          getFinalizedBundleBuilder().mergeFrom(value);
        } else {
          finalizedBundle_ = value;
        }
      } else {
        finalizedBundleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * finalized_bundle ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearFinalizedBundle() {
      bitField0_ = (bitField0_ & ~0x00000001);
      finalizedBundle_ = null;
      if (finalizedBundleBuilder_ != null) {
        finalizedBundleBuilder_.dispose();
        finalizedBundleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * finalized_bundle ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
     */
    public com.kyve.bundles.v1beta1.FinalizedBundle.Builder getFinalizedBundleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFinalizedBundleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * finalized_bundle ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
     */
    public com.kyve.bundles.v1beta1.FinalizedBundleOrBuilder getFinalizedBundleOrBuilder() {
      if (finalizedBundleBuilder_ != null) {
        return finalizedBundleBuilder_.getMessageOrBuilder();
      } else {
        return finalizedBundle_ == null ?
            com.kyve.bundles.v1beta1.FinalizedBundle.getDefaultInstance() : finalizedBundle_;
      }
    }
    /**
     * <pre>
     * finalized_bundle ...
     * </pre>
     *
     * <code>.kyve.bundles.v1beta1.FinalizedBundle finalized_bundle = 1 [json_name = "finalizedBundle", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kyve.bundles.v1beta1.FinalizedBundle, com.kyve.bundles.v1beta1.FinalizedBundle.Builder, com.kyve.bundles.v1beta1.FinalizedBundleOrBuilder> 
        getFinalizedBundleFieldBuilder() {
      if (finalizedBundleBuilder_ == null) {
        finalizedBundleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kyve.bundles.v1beta1.FinalizedBundle, com.kyve.bundles.v1beta1.FinalizedBundle.Builder, com.kyve.bundles.v1beta1.FinalizedBundleOrBuilder>(
                getFinalizedBundle(),
                getParentForChildren(),
                isClean());
        finalizedBundle_ = null;
      }
      return finalizedBundleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse)
  }

  // @@protoc_insertion_point(class_scope:kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse)
  private static final com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse();
  }

  public static com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryFinalizedBundlesByHeightResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryFinalizedBundlesByHeightResponse>() {
    @java.lang.Override
    public QueryFinalizedBundlesByHeightResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryFinalizedBundlesByHeightResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryFinalizedBundlesByHeightResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

