// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/events.proto

package com.axelar.evm.v1beta1;

/**
 * Protobuf type {@code axelar.evm.v1beta1.PollCompleted}
 */
public final class PollCompleted extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.evm.v1beta1.PollCompleted)
    PollCompletedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PollCompleted.newBuilder() to construct.
  private PollCompleted(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PollCompleted() {
    txId_ = com.google.protobuf.ByteString.EMPTY;
    chain_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PollCompleted();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.evm.v1beta1.EventsProto.internal_static_axelar_evm_v1beta1_PollCompleted_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.evm.v1beta1.EventsProto.internal_static_axelar_evm_v1beta1_PollCompleted_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.evm.v1beta1.PollCompleted.class, com.axelar.evm.v1beta1.PollCompleted.Builder.class);
  }

  public static final int TX_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString txId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes tx_id = 1 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
   * @return The txId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTxId() {
    return txId_;
  }

  public static final int CHAIN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object chain_ = "";
  /**
   * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The chain.
   */
  @java.lang.Override
  public java.lang.String getChain() {
    java.lang.Object ref = chain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chain_ = s;
      return s;
    }
  }
  /**
   * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for chain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChainBytes() {
    java.lang.Object ref = chain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POLL_ID_FIELD_NUMBER = 3;
  private long pollId_ = 0L;
  /**
   * <code>uint64 poll_id = 3 [json_name = "pollId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/axelarnetwork/axelar-core/x/vote/exported.PollID", (.gogoproto.customname) = "PollID"];</code>
   * @return The pollId.
   */
  @java.lang.Override
  public long getPollId() {
    return pollId_;
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
    if (!txId_.isEmpty()) {
      output.writeBytes(1, txId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, chain_);
    }
    if (pollId_ != 0L) {
      output.writeUInt64(3, pollId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!txId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, txId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, chain_);
    }
    if (pollId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, pollId_);
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
    if (!(obj instanceof com.axelar.evm.v1beta1.PollCompleted)) {
      return super.equals(obj);
    }
    com.axelar.evm.v1beta1.PollCompleted other = (com.axelar.evm.v1beta1.PollCompleted) obj;

    if (!getTxId()
        .equals(other.getTxId())) return false;
    if (!getChain()
        .equals(other.getChain())) return false;
    if (getPollId()
        != other.getPollId()) return false;
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
    hash = (37 * hash) + TX_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTxId().hashCode();
    hash = (37 * hash) + CHAIN_FIELD_NUMBER;
    hash = (53 * hash) + getChain().hashCode();
    hash = (37 * hash) + POLL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPollId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.evm.v1beta1.PollCompleted parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.PollCompleted parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.PollCompleted parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.PollCompleted parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.PollCompleted parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.PollCompleted parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.PollCompleted parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.PollCompleted parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.evm.v1beta1.PollCompleted parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.evm.v1beta1.PollCompleted parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.PollCompleted parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.PollCompleted parseFrom(
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
  public static Builder newBuilder(com.axelar.evm.v1beta1.PollCompleted prototype) {
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
   * Protobuf type {@code axelar.evm.v1beta1.PollCompleted}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.evm.v1beta1.PollCompleted)
      com.axelar.evm.v1beta1.PollCompletedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.evm.v1beta1.EventsProto.internal_static_axelar_evm_v1beta1_PollCompleted_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.evm.v1beta1.EventsProto.internal_static_axelar_evm_v1beta1_PollCompleted_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.evm.v1beta1.PollCompleted.class, com.axelar.evm.v1beta1.PollCompleted.Builder.class);
    }

    // Construct using com.axelar.evm.v1beta1.PollCompleted.newBuilder()
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
      txId_ = com.google.protobuf.ByteString.EMPTY;
      chain_ = "";
      pollId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.evm.v1beta1.EventsProto.internal_static_axelar_evm_v1beta1_PollCompleted_descriptor;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.PollCompleted getDefaultInstanceForType() {
      return com.axelar.evm.v1beta1.PollCompleted.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.PollCompleted build() {
      com.axelar.evm.v1beta1.PollCompleted result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.PollCompleted buildPartial() {
      com.axelar.evm.v1beta1.PollCompleted result = new com.axelar.evm.v1beta1.PollCompleted(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.evm.v1beta1.PollCompleted result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.txId_ = txId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.chain_ = chain_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pollId_ = pollId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.evm.v1beta1.PollCompleted) {
        return mergeFrom((com.axelar.evm.v1beta1.PollCompleted)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.evm.v1beta1.PollCompleted other) {
      if (other == com.axelar.evm.v1beta1.PollCompleted.getDefaultInstance()) return this;
      if (other.getTxId() != com.google.protobuf.ByteString.EMPTY) {
        setTxId(other.getTxId());
      }
      if (!other.getChain().isEmpty()) {
        chain_ = other.chain_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getPollId() != 0L) {
        setPollId(other.getPollId());
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
              txId_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              chain_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              pollId_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.ByteString txId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes tx_id = 1 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
     * @return The txId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTxId() {
      return txId_;
    }
    /**
     * <code>bytes tx_id = 1 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
     * @param value The txId to set.
     * @return This builder for chaining.
     */
    public Builder setTxId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      txId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes tx_id = 1 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      txId_ = getDefaultInstance().getTxId();
      onChanged();
      return this;
    }

    private java.lang.Object chain_ = "";
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return The chain.
     */
    public java.lang.String getChain() {
      java.lang.Object ref = chain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return The bytes for chain.
     */
    public com.google.protobuf.ByteString
        getChainBytes() {
      java.lang.Object ref = chain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @param value The chain to set.
     * @return This builder for chaining.
     */
    public Builder setChain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      chain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChain() {
      chain_ = getDefaultInstance().getChain();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @param value The bytes for chain to set.
     * @return This builder for chaining.
     */
    public Builder setChainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      chain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long pollId_ ;
    /**
     * <code>uint64 poll_id = 3 [json_name = "pollId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/axelarnetwork/axelar-core/x/vote/exported.PollID", (.gogoproto.customname) = "PollID"];</code>
     * @return The pollId.
     */
    @java.lang.Override
    public long getPollId() {
      return pollId_;
    }
    /**
     * <code>uint64 poll_id = 3 [json_name = "pollId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/axelarnetwork/axelar-core/x/vote/exported.PollID", (.gogoproto.customname) = "PollID"];</code>
     * @param value The pollId to set.
     * @return This builder for chaining.
     */
    public Builder setPollId(long value) {

      pollId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 poll_id = 3 [json_name = "pollId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/axelarnetwork/axelar-core/x/vote/exported.PollID", (.gogoproto.customname) = "PollID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPollId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pollId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:axelar.evm.v1beta1.PollCompleted)
  }

  // @@protoc_insertion_point(class_scope:axelar.evm.v1beta1.PollCompleted)
  private static final com.axelar.evm.v1beta1.PollCompleted DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.evm.v1beta1.PollCompleted();
  }

  public static com.axelar.evm.v1beta1.PollCompleted getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PollCompleted>
      PARSER = new com.google.protobuf.AbstractParser<PollCompleted>() {
    @java.lang.Override
    public PollCompleted parsePartialFrom(
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

  public static com.google.protobuf.Parser<PollCompleted> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PollCompleted> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.evm.v1beta1.PollCompleted getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

