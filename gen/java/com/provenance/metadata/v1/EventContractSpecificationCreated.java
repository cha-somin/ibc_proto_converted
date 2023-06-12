// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/events.proto

package com.provenance.metadata.v1;

/**
 * <pre>
 * EventContractSpecificationCreated is an event message indicating a contract specification has been created.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.EventContractSpecificationCreated}
 */
public final class EventContractSpecificationCreated extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.EventContractSpecificationCreated)
    EventContractSpecificationCreatedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventContractSpecificationCreated.newBuilder() to construct.
  private EventContractSpecificationCreated(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventContractSpecificationCreated() {
    contractSpecificationAddr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventContractSpecificationCreated();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.EventsProto.internal_static_provenance_metadata_v1_EventContractSpecificationCreated_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.EventsProto.internal_static_provenance_metadata_v1_EventContractSpecificationCreated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.EventContractSpecificationCreated.class, com.provenance.metadata.v1.EventContractSpecificationCreated.Builder.class);
  }

  public static final int CONTRACT_SPECIFICATION_ADDR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contractSpecificationAddr_ = "";
  /**
   * <pre>
   * contract_specification_addr is the bech32 address string of the specification id of the contract specification that
   * was created.
   * </pre>
   *
   * <code>string contract_specification_addr = 1 [json_name = "contractSpecificationAddr"];</code>
   * @return The contractSpecificationAddr.
   */
  @java.lang.Override
  public java.lang.String getContractSpecificationAddr() {
    java.lang.Object ref = contractSpecificationAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contractSpecificationAddr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * contract_specification_addr is the bech32 address string of the specification id of the contract specification that
   * was created.
   * </pre>
   *
   * <code>string contract_specification_addr = 1 [json_name = "contractSpecificationAddr"];</code>
   * @return The bytes for contractSpecificationAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContractSpecificationAddrBytes() {
    java.lang.Object ref = contractSpecificationAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contractSpecificationAddr_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractSpecificationAddr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contractSpecificationAddr_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractSpecificationAddr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contractSpecificationAddr_);
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
    if (!(obj instanceof com.provenance.metadata.v1.EventContractSpecificationCreated)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.EventContractSpecificationCreated other = (com.provenance.metadata.v1.EventContractSpecificationCreated) obj;

    if (!getContractSpecificationAddr()
        .equals(other.getContractSpecificationAddr())) return false;
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
    hash = (37 * hash) + CONTRACT_SPECIFICATION_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getContractSpecificationAddr().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.EventContractSpecificationCreated parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.EventContractSpecificationCreated prototype) {
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
   * EventContractSpecificationCreated is an event message indicating a contract specification has been created.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.EventContractSpecificationCreated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.EventContractSpecificationCreated)
      com.provenance.metadata.v1.EventContractSpecificationCreatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.EventsProto.internal_static_provenance_metadata_v1_EventContractSpecificationCreated_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.EventsProto.internal_static_provenance_metadata_v1_EventContractSpecificationCreated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.EventContractSpecificationCreated.class, com.provenance.metadata.v1.EventContractSpecificationCreated.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.EventContractSpecificationCreated.newBuilder()
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
      contractSpecificationAddr_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.EventsProto.internal_static_provenance_metadata_v1_EventContractSpecificationCreated_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.EventContractSpecificationCreated getDefaultInstanceForType() {
      return com.provenance.metadata.v1.EventContractSpecificationCreated.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.EventContractSpecificationCreated build() {
      com.provenance.metadata.v1.EventContractSpecificationCreated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.EventContractSpecificationCreated buildPartial() {
      com.provenance.metadata.v1.EventContractSpecificationCreated result = new com.provenance.metadata.v1.EventContractSpecificationCreated(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.metadata.v1.EventContractSpecificationCreated result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contractSpecificationAddr_ = contractSpecificationAddr_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.EventContractSpecificationCreated) {
        return mergeFrom((com.provenance.metadata.v1.EventContractSpecificationCreated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.EventContractSpecificationCreated other) {
      if (other == com.provenance.metadata.v1.EventContractSpecificationCreated.getDefaultInstance()) return this;
      if (!other.getContractSpecificationAddr().isEmpty()) {
        contractSpecificationAddr_ = other.contractSpecificationAddr_;
        bitField0_ |= 0x00000001;
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
              contractSpecificationAddr_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object contractSpecificationAddr_ = "";
    /**
     * <pre>
     * contract_specification_addr is the bech32 address string of the specification id of the contract specification that
     * was created.
     * </pre>
     *
     * <code>string contract_specification_addr = 1 [json_name = "contractSpecificationAddr"];</code>
     * @return The contractSpecificationAddr.
     */
    public java.lang.String getContractSpecificationAddr() {
      java.lang.Object ref = contractSpecificationAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contractSpecificationAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * contract_specification_addr is the bech32 address string of the specification id of the contract specification that
     * was created.
     * </pre>
     *
     * <code>string contract_specification_addr = 1 [json_name = "contractSpecificationAddr"];</code>
     * @return The bytes for contractSpecificationAddr.
     */
    public com.google.protobuf.ByteString
        getContractSpecificationAddrBytes() {
      java.lang.Object ref = contractSpecificationAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contractSpecificationAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * contract_specification_addr is the bech32 address string of the specification id of the contract specification that
     * was created.
     * </pre>
     *
     * <code>string contract_specification_addr = 1 [json_name = "contractSpecificationAddr"];</code>
     * @param value The contractSpecificationAddr to set.
     * @return This builder for chaining.
     */
    public Builder setContractSpecificationAddr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contractSpecificationAddr_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_specification_addr is the bech32 address string of the specification id of the contract specification that
     * was created.
     * </pre>
     *
     * <code>string contract_specification_addr = 1 [json_name = "contractSpecificationAddr"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContractSpecificationAddr() {
      contractSpecificationAddr_ = getDefaultInstance().getContractSpecificationAddr();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_specification_addr is the bech32 address string of the specification id of the contract specification that
     * was created.
     * </pre>
     *
     * <code>string contract_specification_addr = 1 [json_name = "contractSpecificationAddr"];</code>
     * @param value The bytes for contractSpecificationAddr to set.
     * @return This builder for chaining.
     */
    public Builder setContractSpecificationAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contractSpecificationAddr_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.EventContractSpecificationCreated)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.EventContractSpecificationCreated)
  private static final com.provenance.metadata.v1.EventContractSpecificationCreated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.EventContractSpecificationCreated();
  }

  public static com.provenance.metadata.v1.EventContractSpecificationCreated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventContractSpecificationCreated>
      PARSER = new com.google.protobuf.AbstractParser<EventContractSpecificationCreated>() {
    @java.lang.Override
    public EventContractSpecificationCreated parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventContractSpecificationCreated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventContractSpecificationCreated> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.EventContractSpecificationCreated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

