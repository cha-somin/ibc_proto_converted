// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package com.ibc.lightclients.solomachine.v2;

/**
 * <pre>
 * ConsensusStateData returns the SignBytes data for consensus state
 * verification.
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.solomachine.v2.ConsensusStateData}
 */
public final class ConsensusStateData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.solomachine.v2.ConsensusStateData)
    ConsensusStateDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsensusStateData.newBuilder() to construct.
  private ConsensusStateData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsensusStateData() {
    path_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsensusStateData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_ConsensusStateData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_ConsensusStateData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.lightclients.solomachine.v2.ConsensusStateData.class, com.ibc.lightclients.solomachine.v2.ConsensusStateData.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString path_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes path = 1 [json_name = "path"];</code>
   * @return The path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPath() {
    return path_;
  }

  public static final int CONSENSUS_STATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Any consensusState_;
  /**
   * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
   * @return Whether the consensusState field is set.
   */
  @java.lang.Override
  public boolean hasConsensusState() {
    return consensusState_ != null;
  }
  /**
   * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
   * @return The consensusState.
   */
  @java.lang.Override
  public com.google.protobuf.Any getConsensusState() {
    return consensusState_ == null ? com.google.protobuf.Any.getDefaultInstance() : consensusState_;
  }
  /**
   * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getConsensusStateOrBuilder() {
    return consensusState_ == null ? com.google.protobuf.Any.getDefaultInstance() : consensusState_;
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
    if (!path_.isEmpty()) {
      output.writeBytes(1, path_);
    }
    if (consensusState_ != null) {
      output.writeMessage(2, getConsensusState());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!path_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, path_);
    }
    if (consensusState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConsensusState());
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
    if (!(obj instanceof com.ibc.lightclients.solomachine.v2.ConsensusStateData)) {
      return super.equals(obj);
    }
    com.ibc.lightclients.solomachine.v2.ConsensusStateData other = (com.ibc.lightclients.solomachine.v2.ConsensusStateData) obj;

    if (!getPath()
        .equals(other.getPath())) return false;
    if (hasConsensusState() != other.hasConsensusState()) return false;
    if (hasConsensusState()) {
      if (!getConsensusState()
          .equals(other.getConsensusState())) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    if (hasConsensusState()) {
      hash = (37 * hash) + CONSENSUS_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getConsensusState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData parseFrom(
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
  public static Builder newBuilder(com.ibc.lightclients.solomachine.v2.ConsensusStateData prototype) {
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
   * ConsensusStateData returns the SignBytes data for consensus state
   * verification.
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.solomachine.v2.ConsensusStateData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.solomachine.v2.ConsensusStateData)
      com.ibc.lightclients.solomachine.v2.ConsensusStateDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_ConsensusStateData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_ConsensusStateData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.lightclients.solomachine.v2.ConsensusStateData.class, com.ibc.lightclients.solomachine.v2.ConsensusStateData.Builder.class);
    }

    // Construct using com.ibc.lightclients.solomachine.v2.ConsensusStateData.newBuilder()
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
      path_ = com.google.protobuf.ByteString.EMPTY;
      consensusState_ = null;
      if (consensusStateBuilder_ != null) {
        consensusStateBuilder_.dispose();
        consensusStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_ConsensusStateData_descriptor;
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v2.ConsensusStateData getDefaultInstanceForType() {
      return com.ibc.lightclients.solomachine.v2.ConsensusStateData.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v2.ConsensusStateData build() {
      com.ibc.lightclients.solomachine.v2.ConsensusStateData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v2.ConsensusStateData buildPartial() {
      com.ibc.lightclients.solomachine.v2.ConsensusStateData result = new com.ibc.lightclients.solomachine.v2.ConsensusStateData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.lightclients.solomachine.v2.ConsensusStateData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.path_ = path_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.consensusState_ = consensusStateBuilder_ == null
            ? consensusState_
            : consensusStateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.lightclients.solomachine.v2.ConsensusStateData) {
        return mergeFrom((com.ibc.lightclients.solomachine.v2.ConsensusStateData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.lightclients.solomachine.v2.ConsensusStateData other) {
      if (other == com.ibc.lightclients.solomachine.v2.ConsensusStateData.getDefaultInstance()) return this;
      if (other.getPath() != com.google.protobuf.ByteString.EMPTY) {
        setPath(other.getPath());
      }
      if (other.hasConsensusState()) {
        mergeConsensusState(other.getConsensusState());
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
              path_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getConsensusStateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.protobuf.ByteString path_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes path = 1 [json_name = "path"];</code>
     * @return The path.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPath() {
      return path_;
    }
    /**
     * <code>bytes path = 1 [json_name = "path"];</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes path = 1 [json_name = "path"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      bitField0_ = (bitField0_ & ~0x00000001);
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }

    private com.google.protobuf.Any consensusState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> consensusStateBuilder_;
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
     * @return Whether the consensusState field is set.
     */
    public boolean hasConsensusState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
     * @return The consensusState.
     */
    public com.google.protobuf.Any getConsensusState() {
      if (consensusStateBuilder_ == null) {
        return consensusState_ == null ? com.google.protobuf.Any.getDefaultInstance() : consensusState_;
      } else {
        return consensusStateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
     */
    public Builder setConsensusState(com.google.protobuf.Any value) {
      if (consensusStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        consensusState_ = value;
      } else {
        consensusStateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
     */
    public Builder setConsensusState(
        com.google.protobuf.Any.Builder builderForValue) {
      if (consensusStateBuilder_ == null) {
        consensusState_ = builderForValue.build();
      } else {
        consensusStateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
     */
    public Builder mergeConsensusState(com.google.protobuf.Any value) {
      if (consensusStateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          consensusState_ != null &&
          consensusState_ != com.google.protobuf.Any.getDefaultInstance()) {
          getConsensusStateBuilder().mergeFrom(value);
        } else {
          consensusState_ = value;
        }
      } else {
        consensusStateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
     */
    public Builder clearConsensusState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      consensusState_ = null;
      if (consensusStateBuilder_ != null) {
        consensusStateBuilder_.dispose();
        consensusStateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
     */
    public com.google.protobuf.Any.Builder getConsensusStateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConsensusStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getConsensusStateOrBuilder() {
      if (consensusStateBuilder_ != null) {
        return consensusStateBuilder_.getMessageOrBuilder();
      } else {
        return consensusState_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : consensusState_;
      }
    }
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getConsensusStateFieldBuilder() {
      if (consensusStateBuilder_ == null) {
        consensusStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getConsensusState(),
                getParentForChildren(),
                isClean());
        consensusState_ = null;
      }
      return consensusStateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.solomachine.v2.ConsensusStateData)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.solomachine.v2.ConsensusStateData)
  private static final com.ibc.lightclients.solomachine.v2.ConsensusStateData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.lightclients.solomachine.v2.ConsensusStateData();
  }

  public static com.ibc.lightclients.solomachine.v2.ConsensusStateData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusStateData>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusStateData>() {
    @java.lang.Override
    public ConsensusStateData parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConsensusStateData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusStateData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.lightclients.solomachine.v2.ConsensusStateData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

