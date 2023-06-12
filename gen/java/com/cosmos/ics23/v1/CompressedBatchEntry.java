// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/ics23/v1/proofs.proto

package com.cosmos.ics23.v1;

/**
 * <pre>
 * Use BatchEntry not CommitmentProof, to avoid recursion
 * </pre>
 *
 * Protobuf type {@code cosmos.ics23.v1.CompressedBatchEntry}
 */
public final class CompressedBatchEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.ics23.v1.CompressedBatchEntry)
    CompressedBatchEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompressedBatchEntry.newBuilder() to construct.
  private CompressedBatchEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompressedBatchEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompressedBatchEntry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.ics23.v1.ProofsProto.internal_static_cosmos_ics23_v1_CompressedBatchEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.ics23.v1.ProofsProto.internal_static_cosmos_ics23_v1_CompressedBatchEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.ics23.v1.CompressedBatchEntry.class, com.cosmos.ics23.v1.CompressedBatchEntry.Builder.class);
  }

  private int proofCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object proof_;
  public enum ProofCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EXIST(1),
    NONEXIST(2),
    PROOF_NOT_SET(0);
    private final int value;
    private ProofCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ProofCase valueOf(int value) {
      return forNumber(value);
    }

    public static ProofCase forNumber(int value) {
      switch (value) {
        case 1: return EXIST;
        case 2: return NONEXIST;
        case 0: return PROOF_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ProofCase
  getProofCase() {
    return ProofCase.forNumber(
        proofCase_);
  }

  public static final int EXIST_FIELD_NUMBER = 1;
  /**
   * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
   * @return Whether the exist field is set.
   */
  @java.lang.Override
  public boolean hasExist() {
    return proofCase_ == 1;
  }
  /**
   * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
   * @return The exist.
   */
  @java.lang.Override
  public com.cosmos.ics23.v1.CompressedExistenceProof getExist() {
    if (proofCase_ == 1) {
       return (com.cosmos.ics23.v1.CompressedExistenceProof) proof_;
    }
    return com.cosmos.ics23.v1.CompressedExistenceProof.getDefaultInstance();
  }
  /**
   * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
   */
  @java.lang.Override
  public com.cosmos.ics23.v1.CompressedExistenceProofOrBuilder getExistOrBuilder() {
    if (proofCase_ == 1) {
       return (com.cosmos.ics23.v1.CompressedExistenceProof) proof_;
    }
    return com.cosmos.ics23.v1.CompressedExistenceProof.getDefaultInstance();
  }

  public static final int NONEXIST_FIELD_NUMBER = 2;
  /**
   * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
   * @return Whether the nonexist field is set.
   */
  @java.lang.Override
  public boolean hasNonexist() {
    return proofCase_ == 2;
  }
  /**
   * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
   * @return The nonexist.
   */
  @java.lang.Override
  public com.cosmos.ics23.v1.CompressedNonExistenceProof getNonexist() {
    if (proofCase_ == 2) {
       return (com.cosmos.ics23.v1.CompressedNonExistenceProof) proof_;
    }
    return com.cosmos.ics23.v1.CompressedNonExistenceProof.getDefaultInstance();
  }
  /**
   * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
   */
  @java.lang.Override
  public com.cosmos.ics23.v1.CompressedNonExistenceProofOrBuilder getNonexistOrBuilder() {
    if (proofCase_ == 2) {
       return (com.cosmos.ics23.v1.CompressedNonExistenceProof) proof_;
    }
    return com.cosmos.ics23.v1.CompressedNonExistenceProof.getDefaultInstance();
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
    if (proofCase_ == 1) {
      output.writeMessage(1, (com.cosmos.ics23.v1.CompressedExistenceProof) proof_);
    }
    if (proofCase_ == 2) {
      output.writeMessage(2, (com.cosmos.ics23.v1.CompressedNonExistenceProof) proof_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (proofCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.cosmos.ics23.v1.CompressedExistenceProof) proof_);
    }
    if (proofCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.cosmos.ics23.v1.CompressedNonExistenceProof) proof_);
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
    if (!(obj instanceof com.cosmos.ics23.v1.CompressedBatchEntry)) {
      return super.equals(obj);
    }
    com.cosmos.ics23.v1.CompressedBatchEntry other = (com.cosmos.ics23.v1.CompressedBatchEntry) obj;

    if (!getProofCase().equals(other.getProofCase())) return false;
    switch (proofCase_) {
      case 1:
        if (!getExist()
            .equals(other.getExist())) return false;
        break;
      case 2:
        if (!getNonexist()
            .equals(other.getNonexist())) return false;
        break;
      case 0:
      default:
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
    switch (proofCase_) {
      case 1:
        hash = (37 * hash) + EXIST_FIELD_NUMBER;
        hash = (53 * hash) + getExist().hashCode();
        break;
      case 2:
        hash = (37 * hash) + NONEXIST_FIELD_NUMBER;
        hash = (53 * hash) + getNonexist().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.ics23.v1.CompressedBatchEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.ics23.v1.CompressedBatchEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.CompressedBatchEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.ics23.v1.CompressedBatchEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.CompressedBatchEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.ics23.v1.CompressedBatchEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.CompressedBatchEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.ics23.v1.CompressedBatchEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.ics23.v1.CompressedBatchEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.ics23.v1.CompressedBatchEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.CompressedBatchEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.ics23.v1.CompressedBatchEntry parseFrom(
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
  public static Builder newBuilder(com.cosmos.ics23.v1.CompressedBatchEntry prototype) {
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
   * Use BatchEntry not CommitmentProof, to avoid recursion
   * </pre>
   *
   * Protobuf type {@code cosmos.ics23.v1.CompressedBatchEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.ics23.v1.CompressedBatchEntry)
      com.cosmos.ics23.v1.CompressedBatchEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.ics23.v1.ProofsProto.internal_static_cosmos_ics23_v1_CompressedBatchEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.ics23.v1.ProofsProto.internal_static_cosmos_ics23_v1_CompressedBatchEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.ics23.v1.CompressedBatchEntry.class, com.cosmos.ics23.v1.CompressedBatchEntry.Builder.class);
    }

    // Construct using com.cosmos.ics23.v1.CompressedBatchEntry.newBuilder()
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
      if (existBuilder_ != null) {
        existBuilder_.clear();
      }
      if (nonexistBuilder_ != null) {
        nonexistBuilder_.clear();
      }
      proofCase_ = 0;
      proof_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.ics23.v1.ProofsProto.internal_static_cosmos_ics23_v1_CompressedBatchEntry_descriptor;
    }

    @java.lang.Override
    public com.cosmos.ics23.v1.CompressedBatchEntry getDefaultInstanceForType() {
      return com.cosmos.ics23.v1.CompressedBatchEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.ics23.v1.CompressedBatchEntry build() {
      com.cosmos.ics23.v1.CompressedBatchEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.ics23.v1.CompressedBatchEntry buildPartial() {
      com.cosmos.ics23.v1.CompressedBatchEntry result = new com.cosmos.ics23.v1.CompressedBatchEntry(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.ics23.v1.CompressedBatchEntry result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.cosmos.ics23.v1.CompressedBatchEntry result) {
      result.proofCase_ = proofCase_;
      result.proof_ = this.proof_;
      if (proofCase_ == 1 &&
          existBuilder_ != null) {
        result.proof_ = existBuilder_.build();
      }
      if (proofCase_ == 2 &&
          nonexistBuilder_ != null) {
        result.proof_ = nonexistBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.ics23.v1.CompressedBatchEntry) {
        return mergeFrom((com.cosmos.ics23.v1.CompressedBatchEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.ics23.v1.CompressedBatchEntry other) {
      if (other == com.cosmos.ics23.v1.CompressedBatchEntry.getDefaultInstance()) return this;
      switch (other.getProofCase()) {
        case EXIST: {
          mergeExist(other.getExist());
          break;
        }
        case NONEXIST: {
          mergeNonexist(other.getNonexist());
          break;
        }
        case PROOF_NOT_SET: {
          break;
        }
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
                  getExistFieldBuilder().getBuilder(),
                  extensionRegistry);
              proofCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getNonexistFieldBuilder().getBuilder(),
                  extensionRegistry);
              proofCase_ = 2;
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
    private int proofCase_ = 0;
    private java.lang.Object proof_;
    public ProofCase
        getProofCase() {
      return ProofCase.forNumber(
          proofCase_);
    }

    public Builder clearProof() {
      proofCase_ = 0;
      proof_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.ics23.v1.CompressedExistenceProof, com.cosmos.ics23.v1.CompressedExistenceProof.Builder, com.cosmos.ics23.v1.CompressedExistenceProofOrBuilder> existBuilder_;
    /**
     * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
     * @return Whether the exist field is set.
     */
    @java.lang.Override
    public boolean hasExist() {
      return proofCase_ == 1;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
     * @return The exist.
     */
    @java.lang.Override
    public com.cosmos.ics23.v1.CompressedExistenceProof getExist() {
      if (existBuilder_ == null) {
        if (proofCase_ == 1) {
          return (com.cosmos.ics23.v1.CompressedExistenceProof) proof_;
        }
        return com.cosmos.ics23.v1.CompressedExistenceProof.getDefaultInstance();
      } else {
        if (proofCase_ == 1) {
          return existBuilder_.getMessage();
        }
        return com.cosmos.ics23.v1.CompressedExistenceProof.getDefaultInstance();
      }
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    public Builder setExist(com.cosmos.ics23.v1.CompressedExistenceProof value) {
      if (existBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proof_ = value;
        onChanged();
      } else {
        existBuilder_.setMessage(value);
      }
      proofCase_ = 1;
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    public Builder setExist(
        com.cosmos.ics23.v1.CompressedExistenceProof.Builder builderForValue) {
      if (existBuilder_ == null) {
        proof_ = builderForValue.build();
        onChanged();
      } else {
        existBuilder_.setMessage(builderForValue.build());
      }
      proofCase_ = 1;
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    public Builder mergeExist(com.cosmos.ics23.v1.CompressedExistenceProof value) {
      if (existBuilder_ == null) {
        if (proofCase_ == 1 &&
            proof_ != com.cosmos.ics23.v1.CompressedExistenceProof.getDefaultInstance()) {
          proof_ = com.cosmos.ics23.v1.CompressedExistenceProof.newBuilder((com.cosmos.ics23.v1.CompressedExistenceProof) proof_)
              .mergeFrom(value).buildPartial();
        } else {
          proof_ = value;
        }
        onChanged();
      } else {
        if (proofCase_ == 1) {
          existBuilder_.mergeFrom(value);
        } else {
          existBuilder_.setMessage(value);
        }
      }
      proofCase_ = 1;
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    public Builder clearExist() {
      if (existBuilder_ == null) {
        if (proofCase_ == 1) {
          proofCase_ = 0;
          proof_ = null;
          onChanged();
        }
      } else {
        if (proofCase_ == 1) {
          proofCase_ = 0;
          proof_ = null;
        }
        existBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    public com.cosmos.ics23.v1.CompressedExistenceProof.Builder getExistBuilder() {
      return getExistFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    @java.lang.Override
    public com.cosmos.ics23.v1.CompressedExistenceProofOrBuilder getExistOrBuilder() {
      if ((proofCase_ == 1) && (existBuilder_ != null)) {
        return existBuilder_.getMessageOrBuilder();
      } else {
        if (proofCase_ == 1) {
          return (com.cosmos.ics23.v1.CompressedExistenceProof) proof_;
        }
        return com.cosmos.ics23.v1.CompressedExistenceProof.getDefaultInstance();
      }
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.ics23.v1.CompressedExistenceProof, com.cosmos.ics23.v1.CompressedExistenceProof.Builder, com.cosmos.ics23.v1.CompressedExistenceProofOrBuilder> 
        getExistFieldBuilder() {
      if (existBuilder_ == null) {
        if (!(proofCase_ == 1)) {
          proof_ = com.cosmos.ics23.v1.CompressedExistenceProof.getDefaultInstance();
        }
        existBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.ics23.v1.CompressedExistenceProof, com.cosmos.ics23.v1.CompressedExistenceProof.Builder, com.cosmos.ics23.v1.CompressedExistenceProofOrBuilder>(
                (com.cosmos.ics23.v1.CompressedExistenceProof) proof_,
                getParentForChildren(),
                isClean());
        proof_ = null;
      }
      proofCase_ = 1;
      onChanged();
      return existBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.ics23.v1.CompressedNonExistenceProof, com.cosmos.ics23.v1.CompressedNonExistenceProof.Builder, com.cosmos.ics23.v1.CompressedNonExistenceProofOrBuilder> nonexistBuilder_;
    /**
     * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     * @return Whether the nonexist field is set.
     */
    @java.lang.Override
    public boolean hasNonexist() {
      return proofCase_ == 2;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     * @return The nonexist.
     */
    @java.lang.Override
    public com.cosmos.ics23.v1.CompressedNonExistenceProof getNonexist() {
      if (nonexistBuilder_ == null) {
        if (proofCase_ == 2) {
          return (com.cosmos.ics23.v1.CompressedNonExistenceProof) proof_;
        }
        return com.cosmos.ics23.v1.CompressedNonExistenceProof.getDefaultInstance();
      } else {
        if (proofCase_ == 2) {
          return nonexistBuilder_.getMessage();
        }
        return com.cosmos.ics23.v1.CompressedNonExistenceProof.getDefaultInstance();
      }
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    public Builder setNonexist(com.cosmos.ics23.v1.CompressedNonExistenceProof value) {
      if (nonexistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proof_ = value;
        onChanged();
      } else {
        nonexistBuilder_.setMessage(value);
      }
      proofCase_ = 2;
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    public Builder setNonexist(
        com.cosmos.ics23.v1.CompressedNonExistenceProof.Builder builderForValue) {
      if (nonexistBuilder_ == null) {
        proof_ = builderForValue.build();
        onChanged();
      } else {
        nonexistBuilder_.setMessage(builderForValue.build());
      }
      proofCase_ = 2;
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    public Builder mergeNonexist(com.cosmos.ics23.v1.CompressedNonExistenceProof value) {
      if (nonexistBuilder_ == null) {
        if (proofCase_ == 2 &&
            proof_ != com.cosmos.ics23.v1.CompressedNonExistenceProof.getDefaultInstance()) {
          proof_ = com.cosmos.ics23.v1.CompressedNonExistenceProof.newBuilder((com.cosmos.ics23.v1.CompressedNonExistenceProof) proof_)
              .mergeFrom(value).buildPartial();
        } else {
          proof_ = value;
        }
        onChanged();
      } else {
        if (proofCase_ == 2) {
          nonexistBuilder_.mergeFrom(value);
        } else {
          nonexistBuilder_.setMessage(value);
        }
      }
      proofCase_ = 2;
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    public Builder clearNonexist() {
      if (nonexistBuilder_ == null) {
        if (proofCase_ == 2) {
          proofCase_ = 0;
          proof_ = null;
          onChanged();
        }
      } else {
        if (proofCase_ == 2) {
          proofCase_ = 0;
          proof_ = null;
        }
        nonexistBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    public com.cosmos.ics23.v1.CompressedNonExistenceProof.Builder getNonexistBuilder() {
      return getNonexistFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    @java.lang.Override
    public com.cosmos.ics23.v1.CompressedNonExistenceProofOrBuilder getNonexistOrBuilder() {
      if ((proofCase_ == 2) && (nonexistBuilder_ != null)) {
        return nonexistBuilder_.getMessageOrBuilder();
      } else {
        if (proofCase_ == 2) {
          return (com.cosmos.ics23.v1.CompressedNonExistenceProof) proof_;
        }
        return com.cosmos.ics23.v1.CompressedNonExistenceProof.getDefaultInstance();
      }
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedNonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.ics23.v1.CompressedNonExistenceProof, com.cosmos.ics23.v1.CompressedNonExistenceProof.Builder, com.cosmos.ics23.v1.CompressedNonExistenceProofOrBuilder> 
        getNonexistFieldBuilder() {
      if (nonexistBuilder_ == null) {
        if (!(proofCase_ == 2)) {
          proof_ = com.cosmos.ics23.v1.CompressedNonExistenceProof.getDefaultInstance();
        }
        nonexistBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.ics23.v1.CompressedNonExistenceProof, com.cosmos.ics23.v1.CompressedNonExistenceProof.Builder, com.cosmos.ics23.v1.CompressedNonExistenceProofOrBuilder>(
                (com.cosmos.ics23.v1.CompressedNonExistenceProof) proof_,
                getParentForChildren(),
                isClean());
        proof_ = null;
      }
      proofCase_ = 2;
      onChanged();
      return nonexistBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.ics23.v1.CompressedBatchEntry)
  }

  // @@protoc_insertion_point(class_scope:cosmos.ics23.v1.CompressedBatchEntry)
  private static final com.cosmos.ics23.v1.CompressedBatchEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.ics23.v1.CompressedBatchEntry();
  }

  public static com.cosmos.ics23.v1.CompressedBatchEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompressedBatchEntry>
      PARSER = new com.google.protobuf.AbstractParser<CompressedBatchEntry>() {
    @java.lang.Override
    public CompressedBatchEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompressedBatchEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompressedBatchEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.ics23.v1.CompressedBatchEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

