// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/events.proto

package com.provenance.metadata.v1;

/**
 * <pre>
 * EventSessionDeleted is an event message indicating a session has been deleted.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.EventSessionDeleted}
 */
public final class EventSessionDeleted extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.EventSessionDeleted)
    EventSessionDeletedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventSessionDeleted.newBuilder() to construct.
  private EventSessionDeleted(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventSessionDeleted() {
    sessionAddr_ = "";
    scopeAddr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventSessionDeleted();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.EventsProto.internal_static_provenance_metadata_v1_EventSessionDeleted_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.EventsProto.internal_static_provenance_metadata_v1_EventSessionDeleted_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.EventSessionDeleted.class, com.provenance.metadata.v1.EventSessionDeleted.Builder.class);
  }

  public static final int SESSION_ADDR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sessionAddr_ = "";
  /**
   * <pre>
   * session_addr is the bech32 address string of the session id that was deleted.
   * </pre>
   *
   * <code>string session_addr = 1 [json_name = "sessionAddr"];</code>
   * @return The sessionAddr.
   */
  @java.lang.Override
  public java.lang.String getSessionAddr() {
    java.lang.Object ref = sessionAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionAddr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * session_addr is the bech32 address string of the session id that was deleted.
   * </pre>
   *
   * <code>string session_addr = 1 [json_name = "sessionAddr"];</code>
   * @return The bytes for sessionAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionAddrBytes() {
    java.lang.Object ref = sessionAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionAddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPE_ADDR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object scopeAddr_ = "";
  /**
   * <pre>
   * scope_addr is the bech32 address string of the scope id this session belongs to.
   * </pre>
   *
   * <code>string scope_addr = 2 [json_name = "scopeAddr"];</code>
   * @return The scopeAddr.
   */
  @java.lang.Override
  public java.lang.String getScopeAddr() {
    java.lang.Object ref = scopeAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scopeAddr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * scope_addr is the bech32 address string of the scope id this session belongs to.
   * </pre>
   *
   * <code>string scope_addr = 2 [json_name = "scopeAddr"];</code>
   * @return The bytes for scopeAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScopeAddrBytes() {
    java.lang.Object ref = scopeAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scopeAddr_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionAddr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionAddr_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scopeAddr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scopeAddr_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionAddr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionAddr_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scopeAddr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, scopeAddr_);
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
    if (!(obj instanceof com.provenance.metadata.v1.EventSessionDeleted)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.EventSessionDeleted other = (com.provenance.metadata.v1.EventSessionDeleted) obj;

    if (!getSessionAddr()
        .equals(other.getSessionAddr())) return false;
    if (!getScopeAddr()
        .equals(other.getScopeAddr())) return false;
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
    hash = (37 * hash) + SESSION_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getSessionAddr().hashCode();
    hash = (37 * hash) + SCOPE_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getScopeAddr().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.EventSessionDeleted parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.EventSessionDeleted parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.EventSessionDeleted parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.EventSessionDeleted parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.EventSessionDeleted parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.EventSessionDeleted parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.EventSessionDeleted parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.EventSessionDeleted parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.EventSessionDeleted parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.EventSessionDeleted parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.EventSessionDeleted parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.EventSessionDeleted parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.EventSessionDeleted prototype) {
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
   * EventSessionDeleted is an event message indicating a session has been deleted.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.EventSessionDeleted}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.EventSessionDeleted)
      com.provenance.metadata.v1.EventSessionDeletedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.EventsProto.internal_static_provenance_metadata_v1_EventSessionDeleted_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.EventsProto.internal_static_provenance_metadata_v1_EventSessionDeleted_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.EventSessionDeleted.class, com.provenance.metadata.v1.EventSessionDeleted.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.EventSessionDeleted.newBuilder()
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
      sessionAddr_ = "";
      scopeAddr_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.EventsProto.internal_static_provenance_metadata_v1_EventSessionDeleted_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.EventSessionDeleted getDefaultInstanceForType() {
      return com.provenance.metadata.v1.EventSessionDeleted.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.EventSessionDeleted build() {
      com.provenance.metadata.v1.EventSessionDeleted result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.EventSessionDeleted buildPartial() {
      com.provenance.metadata.v1.EventSessionDeleted result = new com.provenance.metadata.v1.EventSessionDeleted(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.metadata.v1.EventSessionDeleted result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sessionAddr_ = sessionAddr_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scopeAddr_ = scopeAddr_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.EventSessionDeleted) {
        return mergeFrom((com.provenance.metadata.v1.EventSessionDeleted)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.EventSessionDeleted other) {
      if (other == com.provenance.metadata.v1.EventSessionDeleted.getDefaultInstance()) return this;
      if (!other.getSessionAddr().isEmpty()) {
        sessionAddr_ = other.sessionAddr_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getScopeAddr().isEmpty()) {
        scopeAddr_ = other.scopeAddr_;
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
              sessionAddr_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              scopeAddr_ = input.readStringRequireUtf8();
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

    private java.lang.Object sessionAddr_ = "";
    /**
     * <pre>
     * session_addr is the bech32 address string of the session id that was deleted.
     * </pre>
     *
     * <code>string session_addr = 1 [json_name = "sessionAddr"];</code>
     * @return The sessionAddr.
     */
    public java.lang.String getSessionAddr() {
      java.lang.Object ref = sessionAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * session_addr is the bech32 address string of the session id that was deleted.
     * </pre>
     *
     * <code>string session_addr = 1 [json_name = "sessionAddr"];</code>
     * @return The bytes for sessionAddr.
     */
    public com.google.protobuf.ByteString
        getSessionAddrBytes() {
      java.lang.Object ref = sessionAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * session_addr is the bech32 address string of the session id that was deleted.
     * </pre>
     *
     * <code>string session_addr = 1 [json_name = "sessionAddr"];</code>
     * @param value The sessionAddr to set.
     * @return This builder for chaining.
     */
    public Builder setSessionAddr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sessionAddr_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * session_addr is the bech32 address string of the session id that was deleted.
     * </pre>
     *
     * <code>string session_addr = 1 [json_name = "sessionAddr"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionAddr() {
      sessionAddr_ = getDefaultInstance().getSessionAddr();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * session_addr is the bech32 address string of the session id that was deleted.
     * </pre>
     *
     * <code>string session_addr = 1 [json_name = "sessionAddr"];</code>
     * @param value The bytes for sessionAddr to set.
     * @return This builder for chaining.
     */
    public Builder setSessionAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sessionAddr_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object scopeAddr_ = "";
    /**
     * <pre>
     * scope_addr is the bech32 address string of the scope id this session belongs to.
     * </pre>
     *
     * <code>string scope_addr = 2 [json_name = "scopeAddr"];</code>
     * @return The scopeAddr.
     */
    public java.lang.String getScopeAddr() {
      java.lang.Object ref = scopeAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scopeAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * scope_addr is the bech32 address string of the scope id this session belongs to.
     * </pre>
     *
     * <code>string scope_addr = 2 [json_name = "scopeAddr"];</code>
     * @return The bytes for scopeAddr.
     */
    public com.google.protobuf.ByteString
        getScopeAddrBytes() {
      java.lang.Object ref = scopeAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scopeAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * scope_addr is the bech32 address string of the scope id this session belongs to.
     * </pre>
     *
     * <code>string scope_addr = 2 [json_name = "scopeAddr"];</code>
     * @param value The scopeAddr to set.
     * @return This builder for chaining.
     */
    public Builder setScopeAddr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      scopeAddr_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_addr is the bech32 address string of the scope id this session belongs to.
     * </pre>
     *
     * <code>string scope_addr = 2 [json_name = "scopeAddr"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScopeAddr() {
      scopeAddr_ = getDefaultInstance().getScopeAddr();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_addr is the bech32 address string of the scope id this session belongs to.
     * </pre>
     *
     * <code>string scope_addr = 2 [json_name = "scopeAddr"];</code>
     * @param value The bytes for scopeAddr to set.
     * @return This builder for chaining.
     */
    public Builder setScopeAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      scopeAddr_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.EventSessionDeleted)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.EventSessionDeleted)
  private static final com.provenance.metadata.v1.EventSessionDeleted DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.EventSessionDeleted();
  }

  public static com.provenance.metadata.v1.EventSessionDeleted getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventSessionDeleted>
      PARSER = new com.google.protobuf.AbstractParser<EventSessionDeleted>() {
    @java.lang.Override
    public EventSessionDeleted parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventSessionDeleted> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventSessionDeleted> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.EventSessionDeleted getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

