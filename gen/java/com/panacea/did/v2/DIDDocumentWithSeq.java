// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/did.proto

package com.panacea.did.v2;

/**
 * <pre>
 * DIDDocumentWithSeq defines a message for DID Document with a sequence number for preventing replay attacks.
 * </pre>
 *
 * Protobuf type {@code panacea.did.v2.DIDDocumentWithSeq}
 */
public final class DIDDocumentWithSeq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.did.v2.DIDDocumentWithSeq)
    DIDDocumentWithSeqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DIDDocumentWithSeq.newBuilder() to construct.
  private DIDDocumentWithSeq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DIDDocumentWithSeq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DIDDocumentWithSeq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.panacea.did.v2.DidProto.internal_static_panacea_did_v2_DIDDocumentWithSeq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.panacea.did.v2.DidProto.internal_static_panacea_did_v2_DIDDocumentWithSeq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.panacea.did.v2.DIDDocumentWithSeq.class, com.panacea.did.v2.DIDDocumentWithSeq.Builder.class);
  }

  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private com.panacea.did.v2.DIDDocument document_;
  /**
   * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
   * @return Whether the document field is set.
   */
  @java.lang.Override
  public boolean hasDocument() {
    return document_ != null;
  }
  /**
   * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
   * @return The document.
   */
  @java.lang.Override
  public com.panacea.did.v2.DIDDocument getDocument() {
    return document_ == null ? com.panacea.did.v2.DIDDocument.getDefaultInstance() : document_;
  }
  /**
   * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
   */
  @java.lang.Override
  public com.panacea.did.v2.DIDDocumentOrBuilder getDocumentOrBuilder() {
    return document_ == null ? com.panacea.did.v2.DIDDocument.getDefaultInstance() : document_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 2;
  private long sequence_ = 0L;
  /**
   * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  @java.lang.Override
  public long getSequence() {
    return sequence_;
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
    if (document_ != null) {
      output.writeMessage(1, getDocument());
    }
    if (sequence_ != 0L) {
      output.writeUInt64(2, sequence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (document_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDocument());
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, sequence_);
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
    if (!(obj instanceof com.panacea.did.v2.DIDDocumentWithSeq)) {
      return super.equals(obj);
    }
    com.panacea.did.v2.DIDDocumentWithSeq other = (com.panacea.did.v2.DIDDocumentWithSeq) obj;

    if (hasDocument() != other.hasDocument()) return false;
    if (hasDocument()) {
      if (!getDocument()
          .equals(other.getDocument())) return false;
    }
    if (getSequence()
        != other.getSequence()) return false;
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
    if (hasDocument()) {
      hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDocument().hashCode();
    }
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.panacea.did.v2.DIDDocumentWithSeq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.did.v2.DIDDocumentWithSeq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.did.v2.DIDDocumentWithSeq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.did.v2.DIDDocumentWithSeq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.did.v2.DIDDocumentWithSeq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.did.v2.DIDDocumentWithSeq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.did.v2.DIDDocumentWithSeq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.did.v2.DIDDocumentWithSeq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.panacea.did.v2.DIDDocumentWithSeq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.panacea.did.v2.DIDDocumentWithSeq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.panacea.did.v2.DIDDocumentWithSeq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.did.v2.DIDDocumentWithSeq parseFrom(
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
  public static Builder newBuilder(com.panacea.did.v2.DIDDocumentWithSeq prototype) {
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
   * DIDDocumentWithSeq defines a message for DID Document with a sequence number for preventing replay attacks.
   * </pre>
   *
   * Protobuf type {@code panacea.did.v2.DIDDocumentWithSeq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.did.v2.DIDDocumentWithSeq)
      com.panacea.did.v2.DIDDocumentWithSeqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.panacea.did.v2.DidProto.internal_static_panacea_did_v2_DIDDocumentWithSeq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.panacea.did.v2.DidProto.internal_static_panacea_did_v2_DIDDocumentWithSeq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.panacea.did.v2.DIDDocumentWithSeq.class, com.panacea.did.v2.DIDDocumentWithSeq.Builder.class);
    }

    // Construct using com.panacea.did.v2.DIDDocumentWithSeq.newBuilder()
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
      document_ = null;
      if (documentBuilder_ != null) {
        documentBuilder_.dispose();
        documentBuilder_ = null;
      }
      sequence_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.panacea.did.v2.DidProto.internal_static_panacea_did_v2_DIDDocumentWithSeq_descriptor;
    }

    @java.lang.Override
    public com.panacea.did.v2.DIDDocumentWithSeq getDefaultInstanceForType() {
      return com.panacea.did.v2.DIDDocumentWithSeq.getDefaultInstance();
    }

    @java.lang.Override
    public com.panacea.did.v2.DIDDocumentWithSeq build() {
      com.panacea.did.v2.DIDDocumentWithSeq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.panacea.did.v2.DIDDocumentWithSeq buildPartial() {
      com.panacea.did.v2.DIDDocumentWithSeq result = new com.panacea.did.v2.DIDDocumentWithSeq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.panacea.did.v2.DIDDocumentWithSeq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.document_ = documentBuilder_ == null
            ? document_
            : documentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sequence_ = sequence_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.panacea.did.v2.DIDDocumentWithSeq) {
        return mergeFrom((com.panacea.did.v2.DIDDocumentWithSeq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.panacea.did.v2.DIDDocumentWithSeq other) {
      if (other == com.panacea.did.v2.DIDDocumentWithSeq.getDefaultInstance()) return this;
      if (other.hasDocument()) {
        mergeDocument(other.getDocument());
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
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
                  getDocumentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              sequence_ = input.readUInt64();
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

    private com.panacea.did.v2.DIDDocument document_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.panacea.did.v2.DIDDocument, com.panacea.did.v2.DIDDocument.Builder, com.panacea.did.v2.DIDDocumentOrBuilder> documentBuilder_;
    /**
     * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
     * @return Whether the document field is set.
     */
    public boolean hasDocument() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
     * @return The document.
     */
    public com.panacea.did.v2.DIDDocument getDocument() {
      if (documentBuilder_ == null) {
        return document_ == null ? com.panacea.did.v2.DIDDocument.getDefaultInstance() : document_;
      } else {
        return documentBuilder_.getMessage();
      }
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
     */
    public Builder setDocument(com.panacea.did.v2.DIDDocument value) {
      if (documentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        document_ = value;
      } else {
        documentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
     */
    public Builder setDocument(
        com.panacea.did.v2.DIDDocument.Builder builderForValue) {
      if (documentBuilder_ == null) {
        document_ = builderForValue.build();
      } else {
        documentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
     */
    public Builder mergeDocument(com.panacea.did.v2.DIDDocument value) {
      if (documentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          document_ != null &&
          document_ != com.panacea.did.v2.DIDDocument.getDefaultInstance()) {
          getDocumentBuilder().mergeFrom(value);
        } else {
          document_ = value;
        }
      } else {
        documentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
     */
    public Builder clearDocument() {
      bitField0_ = (bitField0_ & ~0x00000001);
      document_ = null;
      if (documentBuilder_ != null) {
        documentBuilder_.dispose();
        documentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
     */
    public com.panacea.did.v2.DIDDocument.Builder getDocumentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDocumentFieldBuilder().getBuilder();
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
     */
    public com.panacea.did.v2.DIDDocumentOrBuilder getDocumentOrBuilder() {
      if (documentBuilder_ != null) {
        return documentBuilder_.getMessageOrBuilder();
      } else {
        return document_ == null ?
            com.panacea.did.v2.DIDDocument.getDefaultInstance() : document_;
      }
    }
    /**
     * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.panacea.did.v2.DIDDocument, com.panacea.did.v2.DIDDocument.Builder, com.panacea.did.v2.DIDDocumentOrBuilder> 
        getDocumentFieldBuilder() {
      if (documentBuilder_ == null) {
        documentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.panacea.did.v2.DIDDocument, com.panacea.did.v2.DIDDocument.Builder, com.panacea.did.v2.DIDDocumentOrBuilder>(
                getDocument(),
                getParentForChildren(),
                isClean());
        document_ = null;
      }
      return documentBuilder_;
    }

    private long sequence_ ;
    /**
     * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
     * @return The sequence.
     */
    @java.lang.Override
    public long getSequence() {
      return sequence_;
    }
    /**
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
     * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sequence_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:panacea.did.v2.DIDDocumentWithSeq)
  }

  // @@protoc_insertion_point(class_scope:panacea.did.v2.DIDDocumentWithSeq)
  private static final com.panacea.did.v2.DIDDocumentWithSeq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.panacea.did.v2.DIDDocumentWithSeq();
  }

  public static com.panacea.did.v2.DIDDocumentWithSeq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DIDDocumentWithSeq>
      PARSER = new com.google.protobuf.AbstractParser<DIDDocumentWithSeq>() {
    @java.lang.Override
    public DIDDocumentWithSeq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DIDDocumentWithSeq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DIDDocumentWithSeq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.panacea.did.v2.DIDDocumentWithSeq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

