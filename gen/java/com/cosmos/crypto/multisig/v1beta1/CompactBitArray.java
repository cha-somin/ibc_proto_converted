// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crypto/multisig/v1beta1/multisig.proto

package com.cosmos.crypto.multisig.v1beta1;

/**
 * <pre>
 * CompactBitArray is an implementation of a space efficient bit array.
 * This is used to ensure that the encoded data takes up a minimal amount of
 * space after proto encoding.
 * This is not thread safe, and is not intended for concurrent usage.
 * </pre>
 *
 * Protobuf type {@code cosmos.crypto.multisig.v1beta1.CompactBitArray}
 */
public final class CompactBitArray extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.crypto.multisig.v1beta1.CompactBitArray)
    CompactBitArrayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompactBitArray.newBuilder() to construct.
  private CompactBitArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompactBitArray() {
    elems_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompactBitArray();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.crypto.multisig.v1beta1.MultisigProto.internal_static_cosmos_crypto_multisig_v1beta1_CompactBitArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.crypto.multisig.v1beta1.MultisigProto.internal_static_cosmos_crypto_multisig_v1beta1_CompactBitArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.crypto.multisig.v1beta1.CompactBitArray.class, com.cosmos.crypto.multisig.v1beta1.CompactBitArray.Builder.class);
  }

  public static final int EXTRA_BITS_STORED_FIELD_NUMBER = 1;
  private int extraBitsStored_ = 0;
  /**
   * <code>uint32 extra_bits_stored = 1 [json_name = "extraBitsStored"];</code>
   * @return The extraBitsStored.
   */
  @java.lang.Override
  public int getExtraBitsStored() {
    return extraBitsStored_;
  }

  public static final int ELEMS_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString elems_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes elems = 2 [json_name = "elems"];</code>
   * @return The elems.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getElems() {
    return elems_;
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
    if (extraBitsStored_ != 0) {
      output.writeUInt32(1, extraBitsStored_);
    }
    if (!elems_.isEmpty()) {
      output.writeBytes(2, elems_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (extraBitsStored_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, extraBitsStored_);
    }
    if (!elems_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, elems_);
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
    if (!(obj instanceof com.cosmos.crypto.multisig.v1beta1.CompactBitArray)) {
      return super.equals(obj);
    }
    com.cosmos.crypto.multisig.v1beta1.CompactBitArray other = (com.cosmos.crypto.multisig.v1beta1.CompactBitArray) obj;

    if (getExtraBitsStored()
        != other.getExtraBitsStored()) return false;
    if (!getElems()
        .equals(other.getElems())) return false;
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
    hash = (37 * hash) + EXTRA_BITS_STORED_FIELD_NUMBER;
    hash = (53 * hash) + getExtraBitsStored();
    hash = (37 * hash) + ELEMS_FIELD_NUMBER;
    hash = (53 * hash) + getElems().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray parseFrom(
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
  public static Builder newBuilder(com.cosmos.crypto.multisig.v1beta1.CompactBitArray prototype) {
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
   * CompactBitArray is an implementation of a space efficient bit array.
   * This is used to ensure that the encoded data takes up a minimal amount of
   * space after proto encoding.
   * This is not thread safe, and is not intended for concurrent usage.
   * </pre>
   *
   * Protobuf type {@code cosmos.crypto.multisig.v1beta1.CompactBitArray}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.crypto.multisig.v1beta1.CompactBitArray)
      com.cosmos.crypto.multisig.v1beta1.CompactBitArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.crypto.multisig.v1beta1.MultisigProto.internal_static_cosmos_crypto_multisig_v1beta1_CompactBitArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.crypto.multisig.v1beta1.MultisigProto.internal_static_cosmos_crypto_multisig_v1beta1_CompactBitArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.crypto.multisig.v1beta1.CompactBitArray.class, com.cosmos.crypto.multisig.v1beta1.CompactBitArray.Builder.class);
    }

    // Construct using com.cosmos.crypto.multisig.v1beta1.CompactBitArray.newBuilder()
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
      extraBitsStored_ = 0;
      elems_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.crypto.multisig.v1beta1.MultisigProto.internal_static_cosmos_crypto_multisig_v1beta1_CompactBitArray_descriptor;
    }

    @java.lang.Override
    public com.cosmos.crypto.multisig.v1beta1.CompactBitArray getDefaultInstanceForType() {
      return com.cosmos.crypto.multisig.v1beta1.CompactBitArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.crypto.multisig.v1beta1.CompactBitArray build() {
      com.cosmos.crypto.multisig.v1beta1.CompactBitArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.crypto.multisig.v1beta1.CompactBitArray buildPartial() {
      com.cosmos.crypto.multisig.v1beta1.CompactBitArray result = new com.cosmos.crypto.multisig.v1beta1.CompactBitArray(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.crypto.multisig.v1beta1.CompactBitArray result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.extraBitsStored_ = extraBitsStored_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.elems_ = elems_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.crypto.multisig.v1beta1.CompactBitArray) {
        return mergeFrom((com.cosmos.crypto.multisig.v1beta1.CompactBitArray)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.crypto.multisig.v1beta1.CompactBitArray other) {
      if (other == com.cosmos.crypto.multisig.v1beta1.CompactBitArray.getDefaultInstance()) return this;
      if (other.getExtraBitsStored() != 0) {
        setExtraBitsStored(other.getExtraBitsStored());
      }
      if (other.getElems() != com.google.protobuf.ByteString.EMPTY) {
        setElems(other.getElems());
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
              extraBitsStored_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              elems_ = input.readBytes();
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

    private int extraBitsStored_ ;
    /**
     * <code>uint32 extra_bits_stored = 1 [json_name = "extraBitsStored"];</code>
     * @return The extraBitsStored.
     */
    @java.lang.Override
    public int getExtraBitsStored() {
      return extraBitsStored_;
    }
    /**
     * <code>uint32 extra_bits_stored = 1 [json_name = "extraBitsStored"];</code>
     * @param value The extraBitsStored to set.
     * @return This builder for chaining.
     */
    public Builder setExtraBitsStored(int value) {

      extraBitsStored_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 extra_bits_stored = 1 [json_name = "extraBitsStored"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExtraBitsStored() {
      bitField0_ = (bitField0_ & ~0x00000001);
      extraBitsStored_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString elems_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes elems = 2 [json_name = "elems"];</code>
     * @return The elems.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getElems() {
      return elems_;
    }
    /**
     * <code>bytes elems = 2 [json_name = "elems"];</code>
     * @param value The elems to set.
     * @return This builder for chaining.
     */
    public Builder setElems(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      elems_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes elems = 2 [json_name = "elems"];</code>
     * @return This builder for chaining.
     */
    public Builder clearElems() {
      bitField0_ = (bitField0_ & ~0x00000002);
      elems_ = getDefaultInstance().getElems();
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


    // @@protoc_insertion_point(builder_scope:cosmos.crypto.multisig.v1beta1.CompactBitArray)
  }

  // @@protoc_insertion_point(class_scope:cosmos.crypto.multisig.v1beta1.CompactBitArray)
  private static final com.cosmos.crypto.multisig.v1beta1.CompactBitArray DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.crypto.multisig.v1beta1.CompactBitArray();
  }

  public static com.cosmos.crypto.multisig.v1beta1.CompactBitArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompactBitArray>
      PARSER = new com.google.protobuf.AbstractParser<CompactBitArray>() {
    @java.lang.Override
    public CompactBitArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompactBitArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompactBitArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.crypto.multisig.v1beta1.CompactBitArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

