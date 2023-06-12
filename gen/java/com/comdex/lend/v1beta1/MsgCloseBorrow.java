// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/tx.proto

package com.comdex.lend.v1beta1;

/**
 * Protobuf type {@code comdex.lend.v1beta1.MsgCloseBorrow}
 */
public final class MsgCloseBorrow extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.lend.v1beta1.MsgCloseBorrow)
    MsgCloseBorrowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCloseBorrow.newBuilder() to construct.
  private MsgCloseBorrow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCloseBorrow() {
    borrower_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCloseBorrow();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.lend.v1beta1.TxProto.internal_static_comdex_lend_v1beta1_MsgCloseBorrow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.lend.v1beta1.TxProto.internal_static_comdex_lend_v1beta1_MsgCloseBorrow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.lend.v1beta1.MsgCloseBorrow.class, com.comdex.lend.v1beta1.MsgCloseBorrow.Builder.class);
  }

  public static final int BORROWER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object borrower_ = "";
  /**
   * <code>string borrower = 1 [json_name = "borrower"];</code>
   * @return The borrower.
   */
  @java.lang.Override
  public java.lang.String getBorrower() {
    java.lang.Object ref = borrower_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      borrower_ = s;
      return s;
    }
  }
  /**
   * <code>string borrower = 1 [json_name = "borrower"];</code>
   * @return The bytes for borrower.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBorrowerBytes() {
    java.lang.Object ref = borrower_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      borrower_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BORROW_ID_FIELD_NUMBER = 2;
  private long borrowId_ = 0L;
  /**
   * <code>uint64 borrow_id = 2 [json_name = "borrowId"];</code>
   * @return The borrowId.
   */
  @java.lang.Override
  public long getBorrowId() {
    return borrowId_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(borrower_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, borrower_);
    }
    if (borrowId_ != 0L) {
      output.writeUInt64(2, borrowId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(borrower_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, borrower_);
    }
    if (borrowId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, borrowId_);
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
    if (!(obj instanceof com.comdex.lend.v1beta1.MsgCloseBorrow)) {
      return super.equals(obj);
    }
    com.comdex.lend.v1beta1.MsgCloseBorrow other = (com.comdex.lend.v1beta1.MsgCloseBorrow) obj;

    if (!getBorrower()
        .equals(other.getBorrower())) return false;
    if (getBorrowId()
        != other.getBorrowId()) return false;
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
    hash = (37 * hash) + BORROWER_FIELD_NUMBER;
    hash = (53 * hash) + getBorrower().hashCode();
    hash = (37 * hash) + BORROW_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBorrowId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.MsgCloseBorrow parseFrom(
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
  public static Builder newBuilder(com.comdex.lend.v1beta1.MsgCloseBorrow prototype) {
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
   * Protobuf type {@code comdex.lend.v1beta1.MsgCloseBorrow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.lend.v1beta1.MsgCloseBorrow)
      com.comdex.lend.v1beta1.MsgCloseBorrowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.lend.v1beta1.TxProto.internal_static_comdex_lend_v1beta1_MsgCloseBorrow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.lend.v1beta1.TxProto.internal_static_comdex_lend_v1beta1_MsgCloseBorrow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.lend.v1beta1.MsgCloseBorrow.class, com.comdex.lend.v1beta1.MsgCloseBorrow.Builder.class);
    }

    // Construct using com.comdex.lend.v1beta1.MsgCloseBorrow.newBuilder()
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
      borrower_ = "";
      borrowId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.lend.v1beta1.TxProto.internal_static_comdex_lend_v1beta1_MsgCloseBorrow_descriptor;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.MsgCloseBorrow getDefaultInstanceForType() {
      return com.comdex.lend.v1beta1.MsgCloseBorrow.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.MsgCloseBorrow build() {
      com.comdex.lend.v1beta1.MsgCloseBorrow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.MsgCloseBorrow buildPartial() {
      com.comdex.lend.v1beta1.MsgCloseBorrow result = new com.comdex.lend.v1beta1.MsgCloseBorrow(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.lend.v1beta1.MsgCloseBorrow result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.borrower_ = borrower_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.borrowId_ = borrowId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.lend.v1beta1.MsgCloseBorrow) {
        return mergeFrom((com.comdex.lend.v1beta1.MsgCloseBorrow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.lend.v1beta1.MsgCloseBorrow other) {
      if (other == com.comdex.lend.v1beta1.MsgCloseBorrow.getDefaultInstance()) return this;
      if (!other.getBorrower().isEmpty()) {
        borrower_ = other.borrower_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getBorrowId() != 0L) {
        setBorrowId(other.getBorrowId());
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
              borrower_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              borrowId_ = input.readUInt64();
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

    private java.lang.Object borrower_ = "";
    /**
     * <code>string borrower = 1 [json_name = "borrower"];</code>
     * @return The borrower.
     */
    public java.lang.String getBorrower() {
      java.lang.Object ref = borrower_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        borrower_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string borrower = 1 [json_name = "borrower"];</code>
     * @return The bytes for borrower.
     */
    public com.google.protobuf.ByteString
        getBorrowerBytes() {
      java.lang.Object ref = borrower_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        borrower_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string borrower = 1 [json_name = "borrower"];</code>
     * @param value The borrower to set.
     * @return This builder for chaining.
     */
    public Builder setBorrower(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      borrower_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string borrower = 1 [json_name = "borrower"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBorrower() {
      borrower_ = getDefaultInstance().getBorrower();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string borrower = 1 [json_name = "borrower"];</code>
     * @param value The bytes for borrower to set.
     * @return This builder for chaining.
     */
    public Builder setBorrowerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      borrower_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long borrowId_ ;
    /**
     * <code>uint64 borrow_id = 2 [json_name = "borrowId"];</code>
     * @return The borrowId.
     */
    @java.lang.Override
    public long getBorrowId() {
      return borrowId_;
    }
    /**
     * <code>uint64 borrow_id = 2 [json_name = "borrowId"];</code>
     * @param value The borrowId to set.
     * @return This builder for chaining.
     */
    public Builder setBorrowId(long value) {

      borrowId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 borrow_id = 2 [json_name = "borrowId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBorrowId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      borrowId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:comdex.lend.v1beta1.MsgCloseBorrow)
  }

  // @@protoc_insertion_point(class_scope:comdex.lend.v1beta1.MsgCloseBorrow)
  private static final com.comdex.lend.v1beta1.MsgCloseBorrow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.lend.v1beta1.MsgCloseBorrow();
  }

  public static com.comdex.lend.v1beta1.MsgCloseBorrow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCloseBorrow>
      PARSER = new com.google.protobuf.AbstractParser<MsgCloseBorrow>() {
    @java.lang.Override
    public MsgCloseBorrow parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCloseBorrow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCloseBorrow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.lend.v1beta1.MsgCloseBorrow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

