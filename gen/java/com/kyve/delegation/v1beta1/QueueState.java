// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/delegation/v1beta1/delegation.proto

package com.kyve.delegation.v1beta1;

/**
 * <pre>
 * QueueState ...
 * </pre>
 *
 * Protobuf type {@code kyve.delegation.v1beta1.QueueState}
 */
public final class QueueState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.delegation.v1beta1.QueueState)
    QueueStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueueState.newBuilder() to construct.
  private QueueState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueueState() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueueState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.delegation.v1beta1.DelegationProto.internal_static_kyve_delegation_v1beta1_QueueState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.delegation.v1beta1.DelegationProto.internal_static_kyve_delegation_v1beta1_QueueState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.delegation.v1beta1.QueueState.class, com.kyve.delegation.v1beta1.QueueState.Builder.class);
  }

  public static final int LOW_INDEX_FIELD_NUMBER = 1;
  private long lowIndex_ = 0L;
  /**
   * <pre>
   * low_index ...
   * </pre>
   *
   * <code>uint64 low_index = 1 [json_name = "lowIndex"];</code>
   * @return The lowIndex.
   */
  @java.lang.Override
  public long getLowIndex() {
    return lowIndex_;
  }

  public static final int HIGH_INDEX_FIELD_NUMBER = 2;
  private long highIndex_ = 0L;
  /**
   * <pre>
   * high_index ...
   * </pre>
   *
   * <code>uint64 high_index = 2 [json_name = "highIndex"];</code>
   * @return The highIndex.
   */
  @java.lang.Override
  public long getHighIndex() {
    return highIndex_;
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
    if (lowIndex_ != 0L) {
      output.writeUInt64(1, lowIndex_);
    }
    if (highIndex_ != 0L) {
      output.writeUInt64(2, highIndex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lowIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, lowIndex_);
    }
    if (highIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, highIndex_);
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
    if (!(obj instanceof com.kyve.delegation.v1beta1.QueueState)) {
      return super.equals(obj);
    }
    com.kyve.delegation.v1beta1.QueueState other = (com.kyve.delegation.v1beta1.QueueState) obj;

    if (getLowIndex()
        != other.getLowIndex()) return false;
    if (getHighIndex()
        != other.getHighIndex()) return false;
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
    hash = (37 * hash) + LOW_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLowIndex());
    hash = (37 * hash) + HIGH_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHighIndex());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.delegation.v1beta1.QueueState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.delegation.v1beta1.QueueState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.delegation.v1beta1.QueueState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.delegation.v1beta1.QueueState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.delegation.v1beta1.QueueState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.delegation.v1beta1.QueueState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.delegation.v1beta1.QueueState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.delegation.v1beta1.QueueState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.delegation.v1beta1.QueueState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.delegation.v1beta1.QueueState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.delegation.v1beta1.QueueState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.delegation.v1beta1.QueueState parseFrom(
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
  public static Builder newBuilder(com.kyve.delegation.v1beta1.QueueState prototype) {
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
   * QueueState ...
   * </pre>
   *
   * Protobuf type {@code kyve.delegation.v1beta1.QueueState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.delegation.v1beta1.QueueState)
      com.kyve.delegation.v1beta1.QueueStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.delegation.v1beta1.DelegationProto.internal_static_kyve_delegation_v1beta1_QueueState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.delegation.v1beta1.DelegationProto.internal_static_kyve_delegation_v1beta1_QueueState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.delegation.v1beta1.QueueState.class, com.kyve.delegation.v1beta1.QueueState.Builder.class);
    }

    // Construct using com.kyve.delegation.v1beta1.QueueState.newBuilder()
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
      lowIndex_ = 0L;
      highIndex_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.delegation.v1beta1.DelegationProto.internal_static_kyve_delegation_v1beta1_QueueState_descriptor;
    }

    @java.lang.Override
    public com.kyve.delegation.v1beta1.QueueState getDefaultInstanceForType() {
      return com.kyve.delegation.v1beta1.QueueState.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.delegation.v1beta1.QueueState build() {
      com.kyve.delegation.v1beta1.QueueState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.delegation.v1beta1.QueueState buildPartial() {
      com.kyve.delegation.v1beta1.QueueState result = new com.kyve.delegation.v1beta1.QueueState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.delegation.v1beta1.QueueState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lowIndex_ = lowIndex_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.highIndex_ = highIndex_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.delegation.v1beta1.QueueState) {
        return mergeFrom((com.kyve.delegation.v1beta1.QueueState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.delegation.v1beta1.QueueState other) {
      if (other == com.kyve.delegation.v1beta1.QueueState.getDefaultInstance()) return this;
      if (other.getLowIndex() != 0L) {
        setLowIndex(other.getLowIndex());
      }
      if (other.getHighIndex() != 0L) {
        setHighIndex(other.getHighIndex());
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
              lowIndex_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              highIndex_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long lowIndex_ ;
    /**
     * <pre>
     * low_index ...
     * </pre>
     *
     * <code>uint64 low_index = 1 [json_name = "lowIndex"];</code>
     * @return The lowIndex.
     */
    @java.lang.Override
    public long getLowIndex() {
      return lowIndex_;
    }
    /**
     * <pre>
     * low_index ...
     * </pre>
     *
     * <code>uint64 low_index = 1 [json_name = "lowIndex"];</code>
     * @param value The lowIndex to set.
     * @return This builder for chaining.
     */
    public Builder setLowIndex(long value) {

      lowIndex_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * low_index ...
     * </pre>
     *
     * <code>uint64 low_index = 1 [json_name = "lowIndex"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLowIndex() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lowIndex_ = 0L;
      onChanged();
      return this;
    }

    private long highIndex_ ;
    /**
     * <pre>
     * high_index ...
     * </pre>
     *
     * <code>uint64 high_index = 2 [json_name = "highIndex"];</code>
     * @return The highIndex.
     */
    @java.lang.Override
    public long getHighIndex() {
      return highIndex_;
    }
    /**
     * <pre>
     * high_index ...
     * </pre>
     *
     * <code>uint64 high_index = 2 [json_name = "highIndex"];</code>
     * @param value The highIndex to set.
     * @return This builder for chaining.
     */
    public Builder setHighIndex(long value) {

      highIndex_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * high_index ...
     * </pre>
     *
     * <code>uint64 high_index = 2 [json_name = "highIndex"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHighIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      highIndex_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:kyve.delegation.v1beta1.QueueState)
  }

  // @@protoc_insertion_point(class_scope:kyve.delegation.v1beta1.QueueState)
  private static final com.kyve.delegation.v1beta1.QueueState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.delegation.v1beta1.QueueState();
  }

  public static com.kyve.delegation.v1beta1.QueueState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueueState>
      PARSER = new com.google.protobuf.AbstractParser<QueueState>() {
    @java.lang.Override
    public QueueState parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueueState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueueState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.delegation.v1beta1.QueueState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

