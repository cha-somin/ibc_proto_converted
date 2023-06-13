// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/subspaces/v2/authz/authz.proto

package com.desmos.subspaces.v2.authz;

public final class AuthzProto {
  private AuthzProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenericSubspaceAuthorizationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:desmos.subspaces.v2.authz.GenericSubspaceAuthorization)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Ids of the subspaces inside which to grant the permission
     * </pre>
     *
     * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
     * @return A list containing the subspacesIds.
     */
    java.util.List<java.lang.Long> getSubspacesIdsList();
    /**
     * <pre>
     * Ids of the subspaces inside which to grant the permission
     * </pre>
     *
     * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
     * @return The count of subspacesIds.
     */
    int getSubspacesIdsCount();
    /**
     * <pre>
     * Ids of the subspaces inside which to grant the permission
     * </pre>
     *
     * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
     * @param index The index of the element to return.
     * @return The subspacesIds at the given index.
     */
    long getSubspacesIds(int index);

    /**
     * <pre>
     * Msg, identified by it's type URL, to grant unrestricted permissions to
     * execute within the subspace
     * </pre>
     *
     * <code>string msg = 2 [json_name = "msg"];</code>
     * @return The msg.
     */
    java.lang.String getMsg();
    /**
     * <pre>
     * Msg, identified by it's type URL, to grant unrestricted permissions to
     * execute within the subspace
     * </pre>
     *
     * <code>string msg = 2 [json_name = "msg"];</code>
     * @return The bytes for msg.
     */
    com.google.protobuf.ByteString
        getMsgBytes();
  }
  /**
   * <pre>
   * GenericSubspaceAuthorization defines an authorization to perform any
   * operation only inside a specific subspace.
   * </pre>
   *
   * Protobuf type {@code desmos.subspaces.v2.authz.GenericSubspaceAuthorization}
   */
  public static final class GenericSubspaceAuthorization extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:desmos.subspaces.v2.authz.GenericSubspaceAuthorization)
      GenericSubspaceAuthorizationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenericSubspaceAuthorization.newBuilder() to construct.
    private GenericSubspaceAuthorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenericSubspaceAuthorization() {
      subspacesIds_ = emptyLongList();
      msg_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenericSubspaceAuthorization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.subspaces.v2.authz.AuthzProto.internal_static_desmos_subspaces_v2_authz_GenericSubspaceAuthorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.subspaces.v2.authz.AuthzProto.internal_static_desmos_subspaces_v2_authz_GenericSubspaceAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization.class, com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization.Builder.class);
    }

    public static final int SUBSPACES_IDS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList subspacesIds_;
    /**
     * <pre>
     * Ids of the subspaces inside which to grant the permission
     * </pre>
     *
     * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
     * @return A list containing the subspacesIds.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getSubspacesIdsList() {
      return subspacesIds_;
    }
    /**
     * <pre>
     * Ids of the subspaces inside which to grant the permission
     * </pre>
     *
     * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
     * @return The count of subspacesIds.
     */
    public int getSubspacesIdsCount() {
      return subspacesIds_.size();
    }
    /**
     * <pre>
     * Ids of the subspaces inside which to grant the permission
     * </pre>
     *
     * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
     * @param index The index of the element to return.
     * @return The subspacesIds at the given index.
     */
    public long getSubspacesIds(int index) {
      return subspacesIds_.getLong(index);
    }
    private int subspacesIdsMemoizedSerializedSize = -1;

    public static final int MSG_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object msg_ = "";
    /**
     * <pre>
     * Msg, identified by it's type URL, to grant unrestricted permissions to
     * execute within the subspace
     * </pre>
     *
     * <code>string msg = 2 [json_name = "msg"];</code>
     * @return The msg.
     */
    @java.lang.Override
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Msg, identified by it's type URL, to grant unrestricted permissions to
     * execute within the subspace
     * </pre>
     *
     * <code>string msg = 2 [json_name = "msg"];</code>
     * @return The bytes for msg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
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
      getSerializedSize();
      if (getSubspacesIdsList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(subspacesIdsMemoizedSerializedSize);
      }
      for (int i = 0; i < subspacesIds_.size(); i++) {
        output.writeUInt64NoTag(subspacesIds_.getLong(i));
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, msg_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < subspacesIds_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(subspacesIds_.getLong(i));
        }
        size += dataSize;
        if (!getSubspacesIdsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        subspacesIdsMemoizedSerializedSize = dataSize;
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, msg_);
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
      if (!(obj instanceof com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization)) {
        return super.equals(obj);
      }
      com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization other = (com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization) obj;

      if (!getSubspacesIdsList()
          .equals(other.getSubspacesIdsList())) return false;
      if (!getMsg()
          .equals(other.getMsg())) return false;
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
      if (getSubspacesIdsCount() > 0) {
        hash = (37 * hash) + SUBSPACES_IDS_FIELD_NUMBER;
        hash = (53 * hash) + getSubspacesIdsList().hashCode();
      }
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization parseFrom(
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
    public static Builder newBuilder(com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization prototype) {
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
     * GenericSubspaceAuthorization defines an authorization to perform any
     * operation only inside a specific subspace.
     * </pre>
     *
     * Protobuf type {@code desmos.subspaces.v2.authz.GenericSubspaceAuthorization}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:desmos.subspaces.v2.authz.GenericSubspaceAuthorization)
        com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorizationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.desmos.subspaces.v2.authz.AuthzProto.internal_static_desmos_subspaces_v2_authz_GenericSubspaceAuthorization_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.desmos.subspaces.v2.authz.AuthzProto.internal_static_desmos_subspaces_v2_authz_GenericSubspaceAuthorization_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization.class, com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization.Builder.class);
      }

      // Construct using com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization.newBuilder()
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
        subspacesIds_ = emptyLongList();
        msg_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.desmos.subspaces.v2.authz.AuthzProto.internal_static_desmos_subspaces_v2_authz_GenericSubspaceAuthorization_descriptor;
      }

      @java.lang.Override
      public com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization getDefaultInstanceForType() {
        return com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization.getDefaultInstance();
      }

      @java.lang.Override
      public com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization build() {
        com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization buildPartial() {
        com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization result = new com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subspacesIds_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subspacesIds_ = subspacesIds_;
      }

      private void buildPartial0(com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.msg_ = msg_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization) {
          return mergeFrom((com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization other) {
        if (other == com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization.getDefaultInstance()) return this;
        if (!other.subspacesIds_.isEmpty()) {
          if (subspacesIds_.isEmpty()) {
            subspacesIds_ = other.subspacesIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubspacesIdsIsMutable();
            subspacesIds_.addAll(other.subspacesIds_);
          }
          onChanged();
        }
        if (!other.getMsg().isEmpty()) {
          msg_ = other.msg_;
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
              case 8: {
                long v = input.readUInt64();
                ensureSubspacesIdsIsMutable();
                subspacesIds_.addLong(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSubspacesIdsIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  subspacesIds_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 10
              case 18: {
                msg_ = input.readStringRequireUtf8();
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

      private com.google.protobuf.Internal.LongList subspacesIds_ = emptyLongList();
      private void ensureSubspacesIdsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          subspacesIds_ = mutableCopy(subspacesIds_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <pre>
       * Ids of the subspaces inside which to grant the permission
       * </pre>
       *
       * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
       * @return A list containing the subspacesIds.
       */
      public java.util.List<java.lang.Long>
          getSubspacesIdsList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(subspacesIds_) : subspacesIds_;
      }
      /**
       * <pre>
       * Ids of the subspaces inside which to grant the permission
       * </pre>
       *
       * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
       * @return The count of subspacesIds.
       */
      public int getSubspacesIdsCount() {
        return subspacesIds_.size();
      }
      /**
       * <pre>
       * Ids of the subspaces inside which to grant the permission
       * </pre>
       *
       * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
       * @param index The index of the element to return.
       * @return The subspacesIds at the given index.
       */
      public long getSubspacesIds(int index) {
        return subspacesIds_.getLong(index);
      }
      /**
       * <pre>
       * Ids of the subspaces inside which to grant the permission
       * </pre>
       *
       * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
       * @param index The index to set the value at.
       * @param value The subspacesIds to set.
       * @return This builder for chaining.
       */
      public Builder setSubspacesIds(
          int index, long value) {

        ensureSubspacesIdsIsMutable();
        subspacesIds_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Ids of the subspaces inside which to grant the permission
       * </pre>
       *
       * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
       * @param value The subspacesIds to add.
       * @return This builder for chaining.
       */
      public Builder addSubspacesIds(long value) {

        ensureSubspacesIdsIsMutable();
        subspacesIds_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Ids of the subspaces inside which to grant the permission
       * </pre>
       *
       * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
       * @param values The subspacesIds to add.
       * @return This builder for chaining.
       */
      public Builder addAllSubspacesIds(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureSubspacesIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subspacesIds_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Ids of the subspaces inside which to grant the permission
       * </pre>
       *
       * <code>repeated uint64 subspaces_ids = 1 [json_name = "subspacesIds", (.gogoproto.customname) = "SubspacesIDs"];</code>
       * @return This builder for chaining.
       */
      public Builder clearSubspacesIds() {
        subspacesIds_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.lang.Object msg_ = "";
      /**
       * <pre>
       * Msg, identified by it's type URL, to grant unrestricted permissions to
       * execute within the subspace
       * </pre>
       *
       * <code>string msg = 2 [json_name = "msg"];</code>
       * @return The msg.
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Msg, identified by it's type URL, to grant unrestricted permissions to
       * execute within the subspace
       * </pre>
       *
       * <code>string msg = 2 [json_name = "msg"];</code>
       * @return The bytes for msg.
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Msg, identified by it's type URL, to grant unrestricted permissions to
       * execute within the subspace
       * </pre>
       *
       * <code>string msg = 2 [json_name = "msg"];</code>
       * @param value The msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        msg_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Msg, identified by it's type URL, to grant unrestricted permissions to
       * execute within the subspace
       * </pre>
       *
       * <code>string msg = 2 [json_name = "msg"];</code>
       * @return This builder for chaining.
       */
      public Builder clearMsg() {
        msg_ = getDefaultInstance().getMsg();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Msg, identified by it's type URL, to grant unrestricted permissions to
       * execute within the subspace
       * </pre>
       *
       * <code>string msg = 2 [json_name = "msg"];</code>
       * @param value The bytes for msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        msg_ = value;
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


      // @@protoc_insertion_point(builder_scope:desmos.subspaces.v2.authz.GenericSubspaceAuthorization)
    }

    // @@protoc_insertion_point(class_scope:desmos.subspaces.v2.authz.GenericSubspaceAuthorization)
    private static final com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization();
    }

    public static com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenericSubspaceAuthorization>
        PARSER = new com.google.protobuf.AbstractParser<GenericSubspaceAuthorization>() {
      @java.lang.Override
      public GenericSubspaceAuthorization parsePartialFrom(
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

    public static com.google.protobuf.Parser<GenericSubspaceAuthorization> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenericSubspaceAuthorization> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.desmos.subspaces.v2.authz.AuthzProto.GenericSubspaceAuthorization getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_subspaces_v2_authz_GenericSubspaceAuthorization_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_subspaces_v2_authz_GenericSubspaceAuthorization_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%desmos/subspaces/v2/authz/authz.proto\022" +
      "\031desmos.subspaces.v2.authz\032\024gogoproto/go" +
      "go.proto\032\031cosmos_proto/cosmos.proto\"\217\001\n\034" +
      "GenericSubspaceAuthorization\0225\n\rsubspace" +
      "s_ids\030\001 \003(\004B\020\342\336\037\014SubspacesIDsR\014subspaces" +
      "Ids\022\020\n\003msg\030\002 \001(\tR\003msg:&\312\264-\"cosmos.authz." +
      "v1beta1.AuthorizationB\351\001\n\035com.desmos.sub" +
      "spaces.v2.authzB\nAuthzProtoZ6github.com/" +
      "desmos-labs/desmos/v5/x/subspaces/legacy" +
      "/v2\242\002\004DSVA\252\002\031Desmos.Subspaces.V2.Authz\312\002" +
      "\031Desmos\\Subspaces\\V2\\Authz\342\002%Desmos\\Subs" +
      "paces\\V2\\Authz\\GPBMetadata\352\002\034Desmos::Sub" +
      "spaces::V2::Authzb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_desmos_subspaces_v2_authz_GenericSubspaceAuthorization_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_desmos_subspaces_v2_authz_GenericSubspaceAuthorization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_subspaces_v2_authz_GenericSubspaceAuthorization_descriptor,
        new java.lang.String[] { "SubspacesIds", "Msg", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.customname);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
