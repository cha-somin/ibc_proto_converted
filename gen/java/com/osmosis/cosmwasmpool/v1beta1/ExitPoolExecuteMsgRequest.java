// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/cosmwasmpool/v1beta1/model/transmuter_msgs.proto

package com.osmosis.cosmwasmpool.v1beta1;

/**
 * <pre>
 * ===================== ExitPoolExecuteMsg
 * </pre>
 *
 * Protobuf type {@code osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest}
 */
public final class ExitPoolExecuteMsgRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest)
    ExitPoolExecuteMsgRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExitPoolExecuteMsgRequest.newBuilder() to construct.
  private ExitPoolExecuteMsgRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExitPoolExecuteMsgRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExitPoolExecuteMsgRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.cosmwasmpool.v1beta1.TransmuterMsgsProto.internal_static_osmosis_cosmwasmpool_v1beta1_ExitPoolExecuteMsgRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.cosmwasmpool.v1beta1.TransmuterMsgsProto.internal_static_osmosis_cosmwasmpool_v1beta1_ExitPoolExecuteMsgRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest.class, com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest.Builder.class);
  }

  public static final int EXIT_POOL_FIELD_NUMBER = 1;
  private com.osmosis.cosmwasmpool.v1beta1.EmptyRequest exitPool_;
  /**
   * <pre>
   * exit_pool is the structure containing all request fields of the exit pool
   * execute message.
   * </pre>
   *
   * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
   * @return Whether the exitPool field is set.
   */
  @java.lang.Override
  public boolean hasExitPool() {
    return exitPool_ != null;
  }
  /**
   * <pre>
   * exit_pool is the structure containing all request fields of the exit pool
   * execute message.
   * </pre>
   *
   * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
   * @return The exitPool.
   */
  @java.lang.Override
  public com.osmosis.cosmwasmpool.v1beta1.EmptyRequest getExitPool() {
    return exitPool_ == null ? com.osmosis.cosmwasmpool.v1beta1.EmptyRequest.getDefaultInstance() : exitPool_;
  }
  /**
   * <pre>
   * exit_pool is the structure containing all request fields of the exit pool
   * execute message.
   * </pre>
   *
   * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.osmosis.cosmwasmpool.v1beta1.EmptyRequestOrBuilder getExitPoolOrBuilder() {
    return exitPool_ == null ? com.osmosis.cosmwasmpool.v1beta1.EmptyRequest.getDefaultInstance() : exitPool_;
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
    if (exitPool_ != null) {
      output.writeMessage(1, getExitPool());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (exitPool_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getExitPool());
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
    if (!(obj instanceof com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest)) {
      return super.equals(obj);
    }
    com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest other = (com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest) obj;

    if (hasExitPool() != other.hasExitPool()) return false;
    if (hasExitPool()) {
      if (!getExitPool()
          .equals(other.getExitPool())) return false;
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
    if (hasExitPool()) {
      hash = (37 * hash) + EXIT_POOL_FIELD_NUMBER;
      hash = (53 * hash) + getExitPool().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest parseFrom(
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
  public static Builder newBuilder(com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest prototype) {
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
   * ===================== ExitPoolExecuteMsg
   * </pre>
   *
   * Protobuf type {@code osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest)
      com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.cosmwasmpool.v1beta1.TransmuterMsgsProto.internal_static_osmosis_cosmwasmpool_v1beta1_ExitPoolExecuteMsgRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.cosmwasmpool.v1beta1.TransmuterMsgsProto.internal_static_osmosis_cosmwasmpool_v1beta1_ExitPoolExecuteMsgRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest.class, com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest.Builder.class);
    }

    // Construct using com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest.newBuilder()
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
      exitPool_ = null;
      if (exitPoolBuilder_ != null) {
        exitPoolBuilder_.dispose();
        exitPoolBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.cosmwasmpool.v1beta1.TransmuterMsgsProto.internal_static_osmosis_cosmwasmpool_v1beta1_ExitPoolExecuteMsgRequest_descriptor;
    }

    @java.lang.Override
    public com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest getDefaultInstanceForType() {
      return com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest build() {
      com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest buildPartial() {
      com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest result = new com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.exitPool_ = exitPoolBuilder_ == null
            ? exitPool_
            : exitPoolBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest) {
        return mergeFrom((com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest other) {
      if (other == com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest.getDefaultInstance()) return this;
      if (other.hasExitPool()) {
        mergeExitPool(other.getExitPool());
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
                  getExitPoolFieldBuilder().getBuilder(),
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

    private com.osmosis.cosmwasmpool.v1beta1.EmptyRequest exitPool_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.osmosis.cosmwasmpool.v1beta1.EmptyRequest, com.osmosis.cosmwasmpool.v1beta1.EmptyRequest.Builder, com.osmosis.cosmwasmpool.v1beta1.EmptyRequestOrBuilder> exitPoolBuilder_;
    /**
     * <pre>
     * exit_pool is the structure containing all request fields of the exit pool
     * execute message.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
     * @return Whether the exitPool field is set.
     */
    public boolean hasExitPool() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * exit_pool is the structure containing all request fields of the exit pool
     * execute message.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
     * @return The exitPool.
     */
    public com.osmosis.cosmwasmpool.v1beta1.EmptyRequest getExitPool() {
      if (exitPoolBuilder_ == null) {
        return exitPool_ == null ? com.osmosis.cosmwasmpool.v1beta1.EmptyRequest.getDefaultInstance() : exitPool_;
      } else {
        return exitPoolBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * exit_pool is the structure containing all request fields of the exit pool
     * execute message.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
     */
    public Builder setExitPool(com.osmosis.cosmwasmpool.v1beta1.EmptyRequest value) {
      if (exitPoolBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        exitPool_ = value;
      } else {
        exitPoolBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * exit_pool is the structure containing all request fields of the exit pool
     * execute message.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
     */
    public Builder setExitPool(
        com.osmosis.cosmwasmpool.v1beta1.EmptyRequest.Builder builderForValue) {
      if (exitPoolBuilder_ == null) {
        exitPool_ = builderForValue.build();
      } else {
        exitPoolBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * exit_pool is the structure containing all request fields of the exit pool
     * execute message.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeExitPool(com.osmosis.cosmwasmpool.v1beta1.EmptyRequest value) {
      if (exitPoolBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          exitPool_ != null &&
          exitPool_ != com.osmosis.cosmwasmpool.v1beta1.EmptyRequest.getDefaultInstance()) {
          getExitPoolBuilder().mergeFrom(value);
        } else {
          exitPool_ = value;
        }
      } else {
        exitPoolBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * exit_pool is the structure containing all request fields of the exit pool
     * execute message.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearExitPool() {
      bitField0_ = (bitField0_ & ~0x00000001);
      exitPool_ = null;
      if (exitPoolBuilder_ != null) {
        exitPoolBuilder_.dispose();
        exitPoolBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * exit_pool is the structure containing all request fields of the exit pool
     * execute message.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
     */
    public com.osmosis.cosmwasmpool.v1beta1.EmptyRequest.Builder getExitPoolBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExitPoolFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * exit_pool is the structure containing all request fields of the exit pool
     * execute message.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
     */
    public com.osmosis.cosmwasmpool.v1beta1.EmptyRequestOrBuilder getExitPoolOrBuilder() {
      if (exitPoolBuilder_ != null) {
        return exitPoolBuilder_.getMessageOrBuilder();
      } else {
        return exitPool_ == null ?
            com.osmosis.cosmwasmpool.v1beta1.EmptyRequest.getDefaultInstance() : exitPool_;
      }
    }
    /**
     * <pre>
     * exit_pool is the structure containing all request fields of the exit pool
     * execute message.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyRequest exit_pool = 1 [json_name = "exitPool", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.osmosis.cosmwasmpool.v1beta1.EmptyRequest, com.osmosis.cosmwasmpool.v1beta1.EmptyRequest.Builder, com.osmosis.cosmwasmpool.v1beta1.EmptyRequestOrBuilder> 
        getExitPoolFieldBuilder() {
      if (exitPoolBuilder_ == null) {
        exitPoolBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.osmosis.cosmwasmpool.v1beta1.EmptyRequest, com.osmosis.cosmwasmpool.v1beta1.EmptyRequest.Builder, com.osmosis.cosmwasmpool.v1beta1.EmptyRequestOrBuilder>(
                getExitPool(),
                getParentForChildren(),
                isClean());
        exitPool_ = null;
      }
      return exitPoolBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest)
  }

  // @@protoc_insertion_point(class_scope:osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest)
  private static final com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest();
  }

  public static com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExitPoolExecuteMsgRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExitPoolExecuteMsgRequest>() {
    @java.lang.Override
    public ExitPoolExecuteMsgRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExitPoolExecuteMsgRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExitPoolExecuteMsgRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.cosmwasmpool.v1beta1.ExitPoolExecuteMsgRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

