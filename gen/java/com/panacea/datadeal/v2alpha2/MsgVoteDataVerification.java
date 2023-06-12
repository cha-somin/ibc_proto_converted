// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/datadeal/v2alpha2/tx.proto

package com.panacea.datadeal.v2alpha2;

/**
 * <pre>
 * MsgVoteDataVerification defines the Msg/VoteDataVerification request type.
 * </pre>
 *
 * Protobuf type {@code panacea.datadeal.v2alpha2.MsgVoteDataVerification}
 */
public final class MsgVoteDataVerification extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.datadeal.v2alpha2.MsgVoteDataVerification)
    MsgVoteDataVerificationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgVoteDataVerification.newBuilder() to construct.
  private MsgVoteDataVerification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgVoteDataVerification() {
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgVoteDataVerification();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.panacea.datadeal.v2alpha2.TxProto.internal_static_panacea_datadeal_v2alpha2_MsgVoteDataVerification_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.panacea.datadeal.v2alpha2.TxProto.internal_static_panacea_datadeal_v2alpha2_MsgVoteDataVerification_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.panacea.datadeal.v2alpha2.MsgVoteDataVerification.class, com.panacea.datadeal.v2alpha2.MsgVoteDataVerification.Builder.class);
  }

  public static final int DATA_VERIFICATION_VOTE_FIELD_NUMBER = 1;
  private com.panacea.datadeal.v2alpha2.DataVerificationVote dataVerificationVote_;
  /**
   * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
   * @return Whether the dataVerificationVote field is set.
   */
  @java.lang.Override
  public boolean hasDataVerificationVote() {
    return dataVerificationVote_ != null;
  }
  /**
   * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
   * @return The dataVerificationVote.
   */
  @java.lang.Override
  public com.panacea.datadeal.v2alpha2.DataVerificationVote getDataVerificationVote() {
    return dataVerificationVote_ == null ? com.panacea.datadeal.v2alpha2.DataVerificationVote.getDefaultInstance() : dataVerificationVote_;
  }
  /**
   * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
   */
  @java.lang.Override
  public com.panacea.datadeal.v2alpha2.DataVerificationVoteOrBuilder getDataVerificationVoteOrBuilder() {
    return dataVerificationVote_ == null ? com.panacea.datadeal.v2alpha2.DataVerificationVote.getDefaultInstance() : dataVerificationVote_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes signature = 2 [json_name = "signature"];</code>
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
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
    if (dataVerificationVote_ != null) {
      output.writeMessage(1, getDataVerificationVote());
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(2, signature_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataVerificationVote_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDataVerificationVote());
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, signature_);
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
    if (!(obj instanceof com.panacea.datadeal.v2alpha2.MsgVoteDataVerification)) {
      return super.equals(obj);
    }
    com.panacea.datadeal.v2alpha2.MsgVoteDataVerification other = (com.panacea.datadeal.v2alpha2.MsgVoteDataVerification) obj;

    if (hasDataVerificationVote() != other.hasDataVerificationVote()) return false;
    if (hasDataVerificationVote()) {
      if (!getDataVerificationVote()
          .equals(other.getDataVerificationVote())) return false;
    }
    if (!getSignature()
        .equals(other.getSignature())) return false;
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
    if (hasDataVerificationVote()) {
      hash = (37 * hash) + DATA_VERIFICATION_VOTE_FIELD_NUMBER;
      hash = (53 * hash) + getDataVerificationVote().hashCode();
    }
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification parseFrom(
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
  public static Builder newBuilder(com.panacea.datadeal.v2alpha2.MsgVoteDataVerification prototype) {
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
   * MsgVoteDataVerification defines the Msg/VoteDataVerification request type.
   * </pre>
   *
   * Protobuf type {@code panacea.datadeal.v2alpha2.MsgVoteDataVerification}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.datadeal.v2alpha2.MsgVoteDataVerification)
      com.panacea.datadeal.v2alpha2.MsgVoteDataVerificationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.panacea.datadeal.v2alpha2.TxProto.internal_static_panacea_datadeal_v2alpha2_MsgVoteDataVerification_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.panacea.datadeal.v2alpha2.TxProto.internal_static_panacea_datadeal_v2alpha2_MsgVoteDataVerification_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.panacea.datadeal.v2alpha2.MsgVoteDataVerification.class, com.panacea.datadeal.v2alpha2.MsgVoteDataVerification.Builder.class);
    }

    // Construct using com.panacea.datadeal.v2alpha2.MsgVoteDataVerification.newBuilder()
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
      dataVerificationVote_ = null;
      if (dataVerificationVoteBuilder_ != null) {
        dataVerificationVoteBuilder_.dispose();
        dataVerificationVoteBuilder_ = null;
      }
      signature_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.panacea.datadeal.v2alpha2.TxProto.internal_static_panacea_datadeal_v2alpha2_MsgVoteDataVerification_descriptor;
    }

    @java.lang.Override
    public com.panacea.datadeal.v2alpha2.MsgVoteDataVerification getDefaultInstanceForType() {
      return com.panacea.datadeal.v2alpha2.MsgVoteDataVerification.getDefaultInstance();
    }

    @java.lang.Override
    public com.panacea.datadeal.v2alpha2.MsgVoteDataVerification build() {
      com.panacea.datadeal.v2alpha2.MsgVoteDataVerification result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.panacea.datadeal.v2alpha2.MsgVoteDataVerification buildPartial() {
      com.panacea.datadeal.v2alpha2.MsgVoteDataVerification result = new com.panacea.datadeal.v2alpha2.MsgVoteDataVerification(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.panacea.datadeal.v2alpha2.MsgVoteDataVerification result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataVerificationVote_ = dataVerificationVoteBuilder_ == null
            ? dataVerificationVote_
            : dataVerificationVoteBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.signature_ = signature_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.panacea.datadeal.v2alpha2.MsgVoteDataVerification) {
        return mergeFrom((com.panacea.datadeal.v2alpha2.MsgVoteDataVerification)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.panacea.datadeal.v2alpha2.MsgVoteDataVerification other) {
      if (other == com.panacea.datadeal.v2alpha2.MsgVoteDataVerification.getDefaultInstance()) return this;
      if (other.hasDataVerificationVote()) {
        mergeDataVerificationVote(other.getDataVerificationVote());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
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
                  getDataVerificationVoteFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              signature_ = input.readBytes();
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

    private com.panacea.datadeal.v2alpha2.DataVerificationVote dataVerificationVote_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.panacea.datadeal.v2alpha2.DataVerificationVote, com.panacea.datadeal.v2alpha2.DataVerificationVote.Builder, com.panacea.datadeal.v2alpha2.DataVerificationVoteOrBuilder> dataVerificationVoteBuilder_;
    /**
     * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
     * @return Whether the dataVerificationVote field is set.
     */
    public boolean hasDataVerificationVote() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
     * @return The dataVerificationVote.
     */
    public com.panacea.datadeal.v2alpha2.DataVerificationVote getDataVerificationVote() {
      if (dataVerificationVoteBuilder_ == null) {
        return dataVerificationVote_ == null ? com.panacea.datadeal.v2alpha2.DataVerificationVote.getDefaultInstance() : dataVerificationVote_;
      } else {
        return dataVerificationVoteBuilder_.getMessage();
      }
    }
    /**
     * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
     */
    public Builder setDataVerificationVote(com.panacea.datadeal.v2alpha2.DataVerificationVote value) {
      if (dataVerificationVoteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataVerificationVote_ = value;
      } else {
        dataVerificationVoteBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
     */
    public Builder setDataVerificationVote(
        com.panacea.datadeal.v2alpha2.DataVerificationVote.Builder builderForValue) {
      if (dataVerificationVoteBuilder_ == null) {
        dataVerificationVote_ = builderForValue.build();
      } else {
        dataVerificationVoteBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
     */
    public Builder mergeDataVerificationVote(com.panacea.datadeal.v2alpha2.DataVerificationVote value) {
      if (dataVerificationVoteBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dataVerificationVote_ != null &&
          dataVerificationVote_ != com.panacea.datadeal.v2alpha2.DataVerificationVote.getDefaultInstance()) {
          getDataVerificationVoteBuilder().mergeFrom(value);
        } else {
          dataVerificationVote_ = value;
        }
      } else {
        dataVerificationVoteBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
     */
    public Builder clearDataVerificationVote() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataVerificationVote_ = null;
      if (dataVerificationVoteBuilder_ != null) {
        dataVerificationVoteBuilder_.dispose();
        dataVerificationVoteBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
     */
    public com.panacea.datadeal.v2alpha2.DataVerificationVote.Builder getDataVerificationVoteBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataVerificationVoteFieldBuilder().getBuilder();
    }
    /**
     * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
     */
    public com.panacea.datadeal.v2alpha2.DataVerificationVoteOrBuilder getDataVerificationVoteOrBuilder() {
      if (dataVerificationVoteBuilder_ != null) {
        return dataVerificationVoteBuilder_.getMessageOrBuilder();
      } else {
        return dataVerificationVote_ == null ?
            com.panacea.datadeal.v2alpha2.DataVerificationVote.getDefaultInstance() : dataVerificationVote_;
      }
    }
    /**
     * <code>.panacea.datadeal.v2alpha2.DataVerificationVote data_verification_vote = 1 [json_name = "dataVerificationVote"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.panacea.datadeal.v2alpha2.DataVerificationVote, com.panacea.datadeal.v2alpha2.DataVerificationVote.Builder, com.panacea.datadeal.v2alpha2.DataVerificationVoteOrBuilder> 
        getDataVerificationVoteFieldBuilder() {
      if (dataVerificationVoteBuilder_ == null) {
        dataVerificationVoteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.panacea.datadeal.v2alpha2.DataVerificationVote, com.panacea.datadeal.v2alpha2.DataVerificationVote.Builder, com.panacea.datadeal.v2alpha2.DataVerificationVoteOrBuilder>(
                getDataVerificationVote(),
                getParentForChildren(),
                isClean());
        dataVerificationVote_ = null;
      }
      return dataVerificationVoteBuilder_;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 2 [json_name = "signature"];</code>
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 2 [json_name = "signature"];</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 2 [json_name = "signature"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000002);
      signature_ = getDefaultInstance().getSignature();
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


    // @@protoc_insertion_point(builder_scope:panacea.datadeal.v2alpha2.MsgVoteDataVerification)
  }

  // @@protoc_insertion_point(class_scope:panacea.datadeal.v2alpha2.MsgVoteDataVerification)
  private static final com.panacea.datadeal.v2alpha2.MsgVoteDataVerification DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.panacea.datadeal.v2alpha2.MsgVoteDataVerification();
  }

  public static com.panacea.datadeal.v2alpha2.MsgVoteDataVerification getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgVoteDataVerification>
      PARSER = new com.google.protobuf.AbstractParser<MsgVoteDataVerification>() {
    @java.lang.Override
    public MsgVoteDataVerification parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgVoteDataVerification> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgVoteDataVerification> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.panacea.datadeal.v2alpha2.MsgVoteDataVerification getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

