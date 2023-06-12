// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/twasm/v1beta1/proposal.proto

package com.confio.twasm.v1beta1;

/**
 * <pre>
 * PromoteToPrivilegedContractProposal gov proposal content type to add
 * "privileges" to a contract
 * </pre>
 *
 * Protobuf type {@code confio.twasm.v1beta1.PromoteToPrivilegedContractProposal}
 */
public final class PromoteToPrivilegedContractProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:confio.twasm.v1beta1.PromoteToPrivilegedContractProposal)
    PromoteToPrivilegedContractProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PromoteToPrivilegedContractProposal.newBuilder() to construct.
  private PromoteToPrivilegedContractProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PromoteToPrivilegedContractProposal() {
    title_ = "";
    description_ = "";
    contract_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PromoteToPrivilegedContractProposal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.confio.twasm.v1beta1.ProposalProto.internal_static_confio_twasm_v1beta1_PromoteToPrivilegedContractProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.confio.twasm.v1beta1.ProposalProto.internal_static_confio_twasm_v1beta1_PromoteToPrivilegedContractProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal.class, com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * Title is a short summary
   * </pre>
   *
   * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Title is a short summary
   * </pre>
   *
   * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * Description is a human readable text
   * </pre>
   *
   * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Description is a human readable text
   * </pre>
   *
   * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTRACT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contract_ = "";
  /**
   * <pre>
   * Contract is the address of the smart contract
   * </pre>
   *
   * <code>string contract = 3 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
   * @return The contract.
   */
  @java.lang.Override
  public java.lang.String getContract() {
    java.lang.Object ref = contract_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contract_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Contract is the address of the smart contract
   * </pre>
   *
   * <code>string contract = 3 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
   * @return The bytes for contract.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContractBytes() {
    java.lang.Object ref = contract_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contract_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contract_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, contract_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contract_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, contract_);
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
    if (!(obj instanceof com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal)) {
      return super.equals(obj);
    }
    com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal other = (com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getContract()
        .equals(other.getContract())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + CONTRACT_FIELD_NUMBER;
    hash = (53 * hash) + getContract().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal parseFrom(
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
  public static Builder newBuilder(com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal prototype) {
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
   * PromoteToPrivilegedContractProposal gov proposal content type to add
   * "privileges" to a contract
   * </pre>
   *
   * Protobuf type {@code confio.twasm.v1beta1.PromoteToPrivilegedContractProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:confio.twasm.v1beta1.PromoteToPrivilegedContractProposal)
      com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.confio.twasm.v1beta1.ProposalProto.internal_static_confio_twasm_v1beta1_PromoteToPrivilegedContractProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.confio.twasm.v1beta1.ProposalProto.internal_static_confio_twasm_v1beta1_PromoteToPrivilegedContractProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal.class, com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal.Builder.class);
    }

    // Construct using com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal.newBuilder()
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
      title_ = "";
      description_ = "";
      contract_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.confio.twasm.v1beta1.ProposalProto.internal_static_confio_twasm_v1beta1_PromoteToPrivilegedContractProposal_descriptor;
    }

    @java.lang.Override
    public com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal getDefaultInstanceForType() {
      return com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal build() {
      com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal buildPartial() {
      com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal result = new com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.contract_ = contract_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal) {
        return mergeFrom((com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal other) {
      if (other == com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getContract().isEmpty()) {
        contract_ = other.contract_;
        bitField0_ |= 0x00000004;
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
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              contract_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * Title is a short summary
     * </pre>
     *
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Title is a short summary
     * </pre>
     *
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Title is a short summary
     * </pre>
     *
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Title is a short summary
     * </pre>
     *
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Title is a short summary
     * </pre>
     *
     * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Description is a human readable text
     * </pre>
     *
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Description is a human readable text
     * </pre>
     *
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Description is a human readable text
     * </pre>
     *
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description is a human readable text
     * </pre>
     *
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description is a human readable text
     * </pre>
     *
     * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object contract_ = "";
    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 3 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     * @return The contract.
     */
    public java.lang.String getContract() {
      java.lang.Object ref = contract_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contract_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 3 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     * @return The bytes for contract.
     */
    public com.google.protobuf.ByteString
        getContractBytes() {
      java.lang.Object ref = contract_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contract_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 3 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     * @param value The contract to set.
     * @return This builder for chaining.
     */
    public Builder setContract(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contract_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 3 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearContract() {
      contract_ = getDefaultInstance().getContract();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 3 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     * @param value The bytes for contract to set.
     * @return This builder for chaining.
     */
    public Builder setContractBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contract_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:confio.twasm.v1beta1.PromoteToPrivilegedContractProposal)
  }

  // @@protoc_insertion_point(class_scope:confio.twasm.v1beta1.PromoteToPrivilegedContractProposal)
  private static final com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal();
  }

  public static com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PromoteToPrivilegedContractProposal>
      PARSER = new com.google.protobuf.AbstractParser<PromoteToPrivilegedContractProposal>() {
    @java.lang.Override
    public PromoteToPrivilegedContractProposal parsePartialFrom(
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

  public static com.google.protobuf.Parser<PromoteToPrivilegedContractProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PromoteToPrivilegedContractProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.confio.twasm.v1beta1.PromoteToPrivilegedContractProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

