// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/attribute/v1/tx.proto

package com.provenance.attribute.v1;

/**
 * <pre>
 * MsgSetAccountDataRequest defines a message to set an account's accountdata attribute.
 * </pre>
 *
 * Protobuf type {@code provenance.attribute.v1.MsgSetAccountDataRequest}
 */
public final class MsgSetAccountDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.attribute.v1.MsgSetAccountDataRequest)
    MsgSetAccountDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSetAccountDataRequest.newBuilder() to construct.
  private MsgSetAccountDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSetAccountDataRequest() {
    value_ = "";
    account_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSetAccountDataRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.attribute.v1.TxProto.internal_static_provenance_attribute_v1_MsgSetAccountDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.attribute.v1.TxProto.internal_static_provenance_attribute_v1_MsgSetAccountDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.attribute.v1.MsgSetAccountDataRequest.class, com.provenance.attribute.v1.MsgSetAccountDataRequest.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   * <code>string value = 1 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>string value = 1 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object account_ = "";
  /**
   * <code>string account = 2 [json_name = "account"];</code>
   * @return The account.
   */
  @java.lang.Override
  public java.lang.String getAccount() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      account_ = s;
      return s;
    }
  }
  /**
   * <code>string account = 2 [json_name = "account"];</code>
   * @return The bytes for account.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountBytes() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      account_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, value_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(account_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, account_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, value_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(account_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, account_);
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
    if (!(obj instanceof com.provenance.attribute.v1.MsgSetAccountDataRequest)) {
      return super.equals(obj);
    }
    com.provenance.attribute.v1.MsgSetAccountDataRequest other = (com.provenance.attribute.v1.MsgSetAccountDataRequest) obj;

    if (!getValue()
        .equals(other.getValue())) return false;
    if (!getAccount()
        .equals(other.getAccount())) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAccount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.attribute.v1.MsgSetAccountDataRequest parseFrom(
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
  public static Builder newBuilder(com.provenance.attribute.v1.MsgSetAccountDataRequest prototype) {
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
   * MsgSetAccountDataRequest defines a message to set an account's accountdata attribute.
   * </pre>
   *
   * Protobuf type {@code provenance.attribute.v1.MsgSetAccountDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.attribute.v1.MsgSetAccountDataRequest)
      com.provenance.attribute.v1.MsgSetAccountDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.attribute.v1.TxProto.internal_static_provenance_attribute_v1_MsgSetAccountDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.attribute.v1.TxProto.internal_static_provenance_attribute_v1_MsgSetAccountDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.attribute.v1.MsgSetAccountDataRequest.class, com.provenance.attribute.v1.MsgSetAccountDataRequest.Builder.class);
    }

    // Construct using com.provenance.attribute.v1.MsgSetAccountDataRequest.newBuilder()
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
      value_ = "";
      account_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.attribute.v1.TxProto.internal_static_provenance_attribute_v1_MsgSetAccountDataRequest_descriptor;
    }

    @java.lang.Override
    public com.provenance.attribute.v1.MsgSetAccountDataRequest getDefaultInstanceForType() {
      return com.provenance.attribute.v1.MsgSetAccountDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.attribute.v1.MsgSetAccountDataRequest build() {
      com.provenance.attribute.v1.MsgSetAccountDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.attribute.v1.MsgSetAccountDataRequest buildPartial() {
      com.provenance.attribute.v1.MsgSetAccountDataRequest result = new com.provenance.attribute.v1.MsgSetAccountDataRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.attribute.v1.MsgSetAccountDataRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.account_ = account_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.attribute.v1.MsgSetAccountDataRequest) {
        return mergeFrom((com.provenance.attribute.v1.MsgSetAccountDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.attribute.v1.MsgSetAccountDataRequest other) {
      if (other == com.provenance.attribute.v1.MsgSetAccountDataRequest.getDefaultInstance()) return this;
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
        bitField0_ |= 0x00000002;
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
              value_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              account_ = input.readStringRequireUtf8();
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

    private java.lang.Object value_ = "";
    /**
     * <code>string value = 1 [json_name = "value"];</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value = 1 [json_name = "value"];</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value = 1 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string value = 1 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string value = 1 [json_name = "value"];</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object account_ = "";
    /**
     * <code>string account = 2 [json_name = "account"];</code>
     * @return The account.
     */
    public java.lang.String getAccount() {
      java.lang.Object ref = account_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        account_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string account = 2 [json_name = "account"];</code>
     * @return The bytes for account.
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      java.lang.Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string account = 2 [json_name = "account"];</code>
     * @param value The account to set.
     * @return This builder for chaining.
     */
    public Builder setAccount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      account_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string account = 2 [json_name = "account"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccount() {
      account_ = getDefaultInstance().getAccount();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string account = 2 [json_name = "account"];</code>
     * @param value The bytes for account to set.
     * @return This builder for chaining.
     */
    public Builder setAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      account_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:provenance.attribute.v1.MsgSetAccountDataRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.attribute.v1.MsgSetAccountDataRequest)
  private static final com.provenance.attribute.v1.MsgSetAccountDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.attribute.v1.MsgSetAccountDataRequest();
  }

  public static com.provenance.attribute.v1.MsgSetAccountDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSetAccountDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgSetAccountDataRequest>() {
    @java.lang.Override
    public MsgSetAccountDataRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSetAccountDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSetAccountDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.attribute.v1.MsgSetAccountDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

