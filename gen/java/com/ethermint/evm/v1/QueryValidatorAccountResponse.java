// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/evm/v1/query.proto

package com.ethermint.evm.v1;

/**
 * <pre>
 * QueryValidatorAccountResponse is the response type for the
 * Query/ValidatorAccount RPC method.
 * </pre>
 *
 * Protobuf type {@code ethermint.evm.v1.QueryValidatorAccountResponse}
 */
public final class QueryValidatorAccountResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ethermint.evm.v1.QueryValidatorAccountResponse)
    QueryValidatorAccountResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryValidatorAccountResponse.newBuilder() to construct.
  private QueryValidatorAccountResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryValidatorAccountResponse() {
    accountAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryValidatorAccountResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ethermint.evm.v1.QueryProto.internal_static_ethermint_evm_v1_QueryValidatorAccountResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ethermint.evm.v1.QueryProto.internal_static_ethermint_evm_v1_QueryValidatorAccountResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ethermint.evm.v1.QueryValidatorAccountResponse.class, com.ethermint.evm.v1.QueryValidatorAccountResponse.Builder.class);
  }

  public static final int ACCOUNT_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object accountAddress_ = "";
  /**
   * <pre>
   * account_address is the cosmos address of the account in bech32 format.
   * </pre>
   *
   * <code>string account_address = 1 [json_name = "accountAddress"];</code>
   * @return The accountAddress.
   */
  @java.lang.Override
  public java.lang.String getAccountAddress() {
    java.lang.Object ref = accountAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * account_address is the cosmos address of the account in bech32 format.
   * </pre>
   *
   * <code>string account_address = 1 [json_name = "accountAddress"];</code>
   * @return The bytes for accountAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountAddressBytes() {
    java.lang.Object ref = accountAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accountAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEQUENCE_FIELD_NUMBER = 2;
  private long sequence_ = 0L;
  /**
   * <pre>
   * sequence is the account's sequence number.
   * </pre>
   *
   * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  @java.lang.Override
  public long getSequence() {
    return sequence_;
  }

  public static final int ACCOUNT_NUMBER_FIELD_NUMBER = 3;
  private long accountNumber_ = 0L;
  /**
   * <pre>
   * account_number is the account number
   * </pre>
   *
   * <code>uint64 account_number = 3 [json_name = "accountNumber"];</code>
   * @return The accountNumber.
   */
  @java.lang.Override
  public long getAccountNumber() {
    return accountNumber_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accountAddress_);
    }
    if (sequence_ != 0L) {
      output.writeUInt64(2, sequence_);
    }
    if (accountNumber_ != 0L) {
      output.writeUInt64(3, accountNumber_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accountAddress_);
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, sequence_);
    }
    if (accountNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, accountNumber_);
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
    if (!(obj instanceof com.ethermint.evm.v1.QueryValidatorAccountResponse)) {
      return super.equals(obj);
    }
    com.ethermint.evm.v1.QueryValidatorAccountResponse other = (com.ethermint.evm.v1.QueryValidatorAccountResponse) obj;

    if (!getAccountAddress()
        .equals(other.getAccountAddress())) return false;
    if (getSequence()
        != other.getSequence()) return false;
    if (getAccountNumber()
        != other.getAccountNumber()) return false;
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
    hash = (37 * hash) + ACCOUNT_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAccountAddress().hashCode();
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (37 * hash) + ACCOUNT_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAccountNumber());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ethermint.evm.v1.QueryValidatorAccountResponse parseFrom(
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
  public static Builder newBuilder(com.ethermint.evm.v1.QueryValidatorAccountResponse prototype) {
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
   * QueryValidatorAccountResponse is the response type for the
   * Query/ValidatorAccount RPC method.
   * </pre>
   *
   * Protobuf type {@code ethermint.evm.v1.QueryValidatorAccountResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ethermint.evm.v1.QueryValidatorAccountResponse)
      com.ethermint.evm.v1.QueryValidatorAccountResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ethermint.evm.v1.QueryProto.internal_static_ethermint_evm_v1_QueryValidatorAccountResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ethermint.evm.v1.QueryProto.internal_static_ethermint_evm_v1_QueryValidatorAccountResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ethermint.evm.v1.QueryValidatorAccountResponse.class, com.ethermint.evm.v1.QueryValidatorAccountResponse.Builder.class);
    }

    // Construct using com.ethermint.evm.v1.QueryValidatorAccountResponse.newBuilder()
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
      accountAddress_ = "";
      sequence_ = 0L;
      accountNumber_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ethermint.evm.v1.QueryProto.internal_static_ethermint_evm_v1_QueryValidatorAccountResponse_descriptor;
    }

    @java.lang.Override
    public com.ethermint.evm.v1.QueryValidatorAccountResponse getDefaultInstanceForType() {
      return com.ethermint.evm.v1.QueryValidatorAccountResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ethermint.evm.v1.QueryValidatorAccountResponse build() {
      com.ethermint.evm.v1.QueryValidatorAccountResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ethermint.evm.v1.QueryValidatorAccountResponse buildPartial() {
      com.ethermint.evm.v1.QueryValidatorAccountResponse result = new com.ethermint.evm.v1.QueryValidatorAccountResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ethermint.evm.v1.QueryValidatorAccountResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accountAddress_ = accountAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sequence_ = sequence_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.accountNumber_ = accountNumber_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ethermint.evm.v1.QueryValidatorAccountResponse) {
        return mergeFrom((com.ethermint.evm.v1.QueryValidatorAccountResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ethermint.evm.v1.QueryValidatorAccountResponse other) {
      if (other == com.ethermint.evm.v1.QueryValidatorAccountResponse.getDefaultInstance()) return this;
      if (!other.getAccountAddress().isEmpty()) {
        accountAddress_ = other.accountAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
      }
      if (other.getAccountNumber() != 0L) {
        setAccountNumber(other.getAccountNumber());
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
              accountAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              sequence_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              accountNumber_ = input.readUInt64();
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

    private java.lang.Object accountAddress_ = "";
    /**
     * <pre>
     * account_address is the cosmos address of the account in bech32 format.
     * </pre>
     *
     * <code>string account_address = 1 [json_name = "accountAddress"];</code>
     * @return The accountAddress.
     */
    public java.lang.String getAccountAddress() {
      java.lang.Object ref = accountAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * account_address is the cosmos address of the account in bech32 format.
     * </pre>
     *
     * <code>string account_address = 1 [json_name = "accountAddress"];</code>
     * @return The bytes for accountAddress.
     */
    public com.google.protobuf.ByteString
        getAccountAddressBytes() {
      java.lang.Object ref = accountAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * account_address is the cosmos address of the account in bech32 format.
     * </pre>
     *
     * <code>string account_address = 1 [json_name = "accountAddress"];</code>
     * @param value The accountAddress to set.
     * @return This builder for chaining.
     */
    public Builder setAccountAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      accountAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * account_address is the cosmos address of the account in bech32 format.
     * </pre>
     *
     * <code>string account_address = 1 [json_name = "accountAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountAddress() {
      accountAddress_ = getDefaultInstance().getAccountAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * account_address is the cosmos address of the account in bech32 format.
     * </pre>
     *
     * <code>string account_address = 1 [json_name = "accountAddress"];</code>
     * @param value The bytes for accountAddress to set.
     * @return This builder for chaining.
     */
    public Builder setAccountAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      accountAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long sequence_ ;
    /**
     * <pre>
     * sequence is the account's sequence number.
     * </pre>
     *
     * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
     * @return The sequence.
     */
    @java.lang.Override
    public long getSequence() {
      return sequence_;
    }
    /**
     * <pre>
     * sequence is the account's sequence number.
     * </pre>
     *
     * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(long value) {

      sequence_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * sequence is the account's sequence number.
     * </pre>
     *
     * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sequence_ = 0L;
      onChanged();
      return this;
    }

    private long accountNumber_ ;
    /**
     * <pre>
     * account_number is the account number
     * </pre>
     *
     * <code>uint64 account_number = 3 [json_name = "accountNumber"];</code>
     * @return The accountNumber.
     */
    @java.lang.Override
    public long getAccountNumber() {
      return accountNumber_;
    }
    /**
     * <pre>
     * account_number is the account number
     * </pre>
     *
     * <code>uint64 account_number = 3 [json_name = "accountNumber"];</code>
     * @param value The accountNumber to set.
     * @return This builder for chaining.
     */
    public Builder setAccountNumber(long value) {

      accountNumber_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * account_number is the account number
     * </pre>
     *
     * <code>uint64 account_number = 3 [json_name = "accountNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountNumber() {
      bitField0_ = (bitField0_ & ~0x00000004);
      accountNumber_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ethermint.evm.v1.QueryValidatorAccountResponse)
  }

  // @@protoc_insertion_point(class_scope:ethermint.evm.v1.QueryValidatorAccountResponse)
  private static final com.ethermint.evm.v1.QueryValidatorAccountResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ethermint.evm.v1.QueryValidatorAccountResponse();
  }

  public static com.ethermint.evm.v1.QueryValidatorAccountResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryValidatorAccountResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryValidatorAccountResponse>() {
    @java.lang.Override
    public QueryValidatorAccountResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryValidatorAccountResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryValidatorAccountResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ethermint.evm.v1.QueryValidatorAccountResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

