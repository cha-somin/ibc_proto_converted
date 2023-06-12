// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/burrow/payload.proto

package com.payload;

/**
 * Protobuf type {@code payload.Vote}
 */
public final class Vote extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:payload.Vote)
    VoteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Vote.newBuilder() to construct.
  private Vote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Vote() {
    address_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Vote();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.payload.PayloadProto.internal_static_payload_Vote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.payload.PayloadProto.internal_static_payload_Vote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.payload.Vote.class, com.payload.Vote.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString address_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes Address = 1 [json_name = "Address", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.Address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAddress() {
    return address_;
  }

  public static final int VOTINGWEIGHT_FIELD_NUMBER = 2;
  private long votingWeight_ = 0L;
  /**
   * <code>int64 VotingWeight = 2 [json_name = "VotingWeight"];</code>
   * @return The votingWeight.
   */
  @java.lang.Override
  public long getVotingWeight() {
    return votingWeight_;
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
    if (!address_.isEmpty()) {
      output.writeBytes(1, address_);
    }
    if (votingWeight_ != 0L) {
      output.writeInt64(2, votingWeight_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!address_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, address_);
    }
    if (votingWeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, votingWeight_);
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
    if (!(obj instanceof com.payload.Vote)) {
      return super.equals(obj);
    }
    com.payload.Vote other = (com.payload.Vote) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (getVotingWeight()
        != other.getVotingWeight()) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + VOTINGWEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVotingWeight());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.payload.Vote parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.payload.Vote parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.payload.Vote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.payload.Vote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.payload.Vote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.payload.Vote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.payload.Vote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.payload.Vote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.payload.Vote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.payload.Vote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.payload.Vote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.payload.Vote parseFrom(
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
  public static Builder newBuilder(com.payload.Vote prototype) {
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
   * Protobuf type {@code payload.Vote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:payload.Vote)
      com.payload.VoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.payload.PayloadProto.internal_static_payload_Vote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.payload.PayloadProto.internal_static_payload_Vote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.payload.Vote.class, com.payload.Vote.Builder.class);
    }

    // Construct using com.payload.Vote.newBuilder()
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
      address_ = com.google.protobuf.ByteString.EMPTY;
      votingWeight_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.payload.PayloadProto.internal_static_payload_Vote_descriptor;
    }

    @java.lang.Override
    public com.payload.Vote getDefaultInstanceForType() {
      return com.payload.Vote.getDefaultInstance();
    }

    @java.lang.Override
    public com.payload.Vote build() {
      com.payload.Vote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.payload.Vote buildPartial() {
      com.payload.Vote result = new com.payload.Vote(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.payload.Vote result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.votingWeight_ = votingWeight_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.payload.Vote) {
        return mergeFrom((com.payload.Vote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.payload.Vote other) {
      if (other == com.payload.Vote.getDefaultInstance()) return this;
      if (other.getAddress() != com.google.protobuf.ByteString.EMPTY) {
        setAddress(other.getAddress());
      }
      if (other.getVotingWeight() != 0L) {
        setVotingWeight(other.getVotingWeight());
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
              address_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              votingWeight_ = input.readInt64();
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

    private com.google.protobuf.ByteString address_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes Address = 1 [json_name = "Address", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.Address"];</code>
     * @return The address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAddress() {
      return address_;
    }
    /**
     * <code>bytes Address = 1 [json_name = "Address", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.Address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes Address = 1 [json_name = "Address", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.Address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      bitField0_ = (bitField0_ & ~0x00000001);
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }

    private long votingWeight_ ;
    /**
     * <code>int64 VotingWeight = 2 [json_name = "VotingWeight"];</code>
     * @return The votingWeight.
     */
    @java.lang.Override
    public long getVotingWeight() {
      return votingWeight_;
    }
    /**
     * <code>int64 VotingWeight = 2 [json_name = "VotingWeight"];</code>
     * @param value The votingWeight to set.
     * @return This builder for chaining.
     */
    public Builder setVotingWeight(long value) {

      votingWeight_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 VotingWeight = 2 [json_name = "VotingWeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVotingWeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      votingWeight_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:payload.Vote)
  }

  // @@protoc_insertion_point(class_scope:payload.Vote)
  private static final com.payload.Vote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.payload.Vote();
  }

  public static com.payload.Vote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Vote>
      PARSER = new com.google.protobuf.AbstractParser<Vote>() {
    @java.lang.Override
    public Vote parsePartialFrom(
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

  public static com.google.protobuf.Parser<Vote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Vote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.payload.Vote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

